package example

import io.brunk.deeplearnjs.Environment
import io.brunk.deeplearnjs.data.InCPUMemoryShuffledInputProviderBuilder
import io.brunk.deeplearnjs.graph.Session.FeedEntry
import io.brunk.deeplearnjs.graph.{ CostReduction, Graph, Session }
import io.brunk.deeplearnjs.math.backends.Tape_util.ScopeResult
import io.brunk.deeplearnjs.math.optimizers.SGDOptimizer
import io.brunk.deeplearnjs.math.{ Array1D, Array2D, Float32, Scalar }

import scala.async.Async.{ async, await }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.scalajs.js
import scala.scalajs.js.Promise

object Intro {
  def main(args: Array[String]): Unit = {

    // This file parallels (some of) the code in the introduction tutorial.

    /**
      * 'NDArrayMath with WebGL backend' section of tutorial
      */
    def intro(): Future[Unit] = async {
      {
        val math = Environment.ENV.math

        val a: Array2D[Float32] = Array2D.`new`((2d, 2d), js.Array(1.0, 2.0, 3.0, 4.0))
        val b: Array2D[Float32] = Array2D.`new`((2d, 2d), js.Array(0.0, 2.0, 4.0, 6.0))

        // Non-blocking math calls.
        val diff        = math.sub(a, b)
        val squaredDiff = math.elementWiseMul(diff, diff)
        val sum         = math.sum(squaredDiff)
        val size        = Scalar.`new`(a.size)
        val average     = math.divide(sum, size)

        println(s"mean squared difference: ${await(average.`val`().toFuture)}")
      }

      {

        /**
          * 'Graphs and Tensors' section of tutorial
          */
        val g = new Graph()

        // Placeholders are input containers. This is the container for where we
        // will feed an input NDArray when we execute the graph.
        val inputShape  = js.Array(3d)
        val inputTensor = g.placeholder("input", inputShape)

        val labelShape  = js.Array(1d)
        val labelTensor = g.placeholder("label", labelShape)

        // Variables are containers that hold a value that can be updated from
        // training.
        // Here we initialize the multiplier variable randomly.
        val multiplier = g.variable("multiplier", Array2D.randNormal((1d, 3d)))

        // Top level graph methods take Tensors and return Tensors.
        val outputTensor = g.matmul(multiplier, inputTensor)
        val costTensor   = g.meanSquaredCost(labelTensor, outputTensor)

        // Tensors, like NDArrays, have a shape attribute.
        println(outputTensor.shape)

        /**
          * 'Session and FeedEntry' section of the tutorial.
          */
        val learningRate = .00001
        val batchSize    = 3
        val math         = Environment.ENV.math

        val session   = new Session(g, math)
        val optimizer = new SGDOptimizer(learningRate)

        val inputs: js.Array[Array1D[Float32]] =
          js.Array(Array1D.`new`(js.Array(1.0, 2.0, 3.0)),
                   Array1D.`new`(js.Array(10.0, 20.0, 30.0)),
                   Array1D.`new`(js.Array(100.0, 200.0, 300.0)))

        val labels: js.Array[Array1D[Float32]] =
          js.Array(Array1D.`new`(js.Array(4.0)),
                   Array1D.`new`(js.Array(40.0)),
                   Array1D.`new`(js.Array(400.0)))

        // Shuffles inputs and labels and keeps them mutually in sync.
        val shuffledInputProviderBuilder =
          new InCPUMemoryShuffledInputProviderBuilder(js.Array(inputs, labels))
        val inputProvider = shuffledInputProviderBuilder.getInputProviders()(0)
        val labelProvider = shuffledInputProviderBuilder.getInputProviders()(1)

        // Maps tensors to InputProviders.
        val feedEntries: js.Array[FeedEntry] = js.Array(
          js.Dynamic.literal(tensor = inputTensor, data = inputProvider),
          js.Dynamic.literal(tensor = labelTensor, data = labelProvider)
        )

        val NUM_BATCHES = 10

        var i = 0
        while (i < NUM_BATCHES) { // (i <- 0 until NUM_BATCHES) { // TODO for loop does not play well with async/await
          // Wrap session.train in a scope so the cost gets cleaned up
          // automatically.

          import scala.scalajs.js.JSConverters._

          await {
            // Wrap session.train in a scope so the cost gets cleaned up automatically.
            math
              .scope[ScopeResult] { (keep: js.Function, track: js.Function) =>
                {
                  async {
                    // Train takes a cost tensor to minimize. Trains one batch. Returns the
                    // average cost as a Scalar.
                    val cost =
                      session.train(costTensor,
                                    feedEntries,
                                    batchSize,
                                    optimizer,
                                    CostReduction.MEAN)
                    println(s"last average cost ($i): ${await(cost.`val`().toFuture)}")
                  }.toJSPromise
                }
              }
              .asInstanceOf[Promise[Unit]]
              .toFuture
          }
          i += 1
        }

        val testInput = Array1D.`new`(js.Array(0.1, 0.2, 0.3))

        // session.eval can take NDArrays as input data.
        val testFeedEntries: js.Array[FeedEntry] =
          js.Array(js.Dynamic.literal(tensor = inputTensor, data = testInput))

        val testOutput = session.eval(outputTensor, testFeedEntries)

        println("---inference output---")
        println(s"shape: ${testOutput.shape}")
        println(s"value: ${await(testOutput.`val`(0).toFuture)}")

      }
    }

    intro()

  }
}

/*
 * Copyright (c) 2017 Sören Brunk
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.brunk.deeplearnjs

import io.brunk.deeplearnjs.graph.Session.FeedEntry
import io.brunk.deeplearnjs.graph.optimizers.Optimizer
import io.brunk.deeplearnjs.graph.{ Session, Tensor }
import io.brunk.deeplearnjs.math.{ NDArray, NDArrayMath, Scalar }

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait GraphRunnerEventObserver extends js.Object {
  var batchesTrainedCallback: js.Function1[Double, Unit] = js.native
  var avgCostCallback: js.Function1[Scalar, Unit]        = js.native
  var metricCallback: js.Function1[NDArray, Unit]        = js.native
  var inferenceExamplesCallback
    : js.Function2[js.Array[js.Array[FeedEntry]], js.Array[NDArray], Unit] = js.native
  var inferenceExamplesPerSecCallback: js.Function1[Double, Unit]          = js.native
  var trainExamplesPerSecCallback: js.Function1[Double, Unit]              = js.native
  var totalTimeCallback: js.Function1[Double, Unit]                        = js.native
  var doneTrainingCallback: js.Function0[Unit]                             = js.native
}

@js.native
sealed trait MetricReduction extends js.Object {}

@js.native
@JSGlobal
object MetricReduction extends js.Object {
  var SUM: MetricReduction  = js.native
  var MEAN: MetricReduction = js.native
  @JSBracketAccess
  def apply(value: MetricReduction): String = js.native
}

@js.native
@JSGlobal
class GraphRunner protected () extends js.Object {
  def this(math: NDArrayMath, session: Session, eventObserver: GraphRunnerEventObserver) = this()
  def resetStatistics(): Unit = js.native
  def train(costTensor: Tensor,
            trainFeedEntries: js.Array[FeedEntry],
            batchSize: Double,
            optimizer: Optimizer,
            numBatches: Double = ???,
            metricTensor: Tensor = ???,
            metricFeedEntries: js.Array[FeedEntry] = ???,
            metricBatchSize: Double = ???,
            metricReduction: MetricReduction = ???,
            evalIntervalMs: Double = ???,
            costIntervalMs: Double = ???): Unit = js.native
  def stopTraining(): Unit                      = js.native
  def resumeTraining(): Unit                    = js.native
  def infer(inferenceTensor: Tensor,
            inferenceFeedEntries: js.Array[FeedEntry],
            inferenceExampleIntervalMs: Double = ???,
            inferenceExampleCount: Double = ???,
            numPasses: Double = ???): Unit                          = js.native
  def stopInferring(): Unit                                         = js.native
  def isInferenceRunning(): Boolean                                 = js.native
  def computeMetric(): Scalar                                       = js.native
  def getTotalBatchesTrained(): Double                              = js.native
  def getLastComputedMetric(): Scalar                               = js.native
  def setMath(math: NDArrayMath): Unit                              = js.native
  def setSession(session: Session): Unit                            = js.native
  def setInferenceTensor(inferenceTensor: Tensor): Unit             = js.native
  def setInferenceExampleCount(inferenceExampleCount: Double): Unit = js.native
}

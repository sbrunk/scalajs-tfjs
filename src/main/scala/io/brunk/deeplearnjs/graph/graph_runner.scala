/*
 * Copyright 2017 Sören Brunk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.brunk.deeplearnjs.graph

import io.brunk.deeplearnjs.graph.Session.FeedEntry
import io.brunk.deeplearnjs.math.optimizers.Optimizer
import io.brunk.deeplearnjs.math._

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait GraphRunnerEventObserver extends js.Object {
  var batchesTrainedCallback: js.Function1[Double, Unit]          = js.native
  var avgCostCallback: js.Function1[Scalar[DataType], Unit]       = js.native
  var metricCallback: js.Function1[NDArray[DataType, Rank], Unit] = js.native
  var inferenceExamplesCallback
    : js.Function2[js.Array[js.Array[FeedEntry]], js.Array[NDArray[DataType, Rank]], Unit] =
    js.native
  var inferenceExamplesPerSecCallback: js.Function1[Double, Unit] = js.native
  var trainExamplesPerSecCallback: js.Function1[Double, Unit]     = js.native
  var totalTimeCallback: js.Function1[Double, Unit]               = js.native
  var doneTrainingCallback: js.Function0[Unit]                    = js.native
}

@js.native
sealed trait MetricReduction extends js.Object {}

@js.native
@JSImport("deeplearn", "MetricReduction")
object MetricReduction extends js.Object {
  var SUM: MetricReduction  = js.native
  var MEAN: MetricReduction = js.native
  @JSBracketAccess
  def apply(value: MetricReduction): String = js.native
}

@js.native
@JSImport("deeplearn", "GraphRunner")
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
  def computeMetric(): Scalar[Float32]                              = js.native
  def getTotalBatchesTrained(): Double                              = js.native
  def getLastComputedMetric(): Scalar[DataType]                     = js.native
  def setMath(math: NDArrayMath): Unit                              = js.native
  def setSession(session: Session): Unit                            = js.native
  def setInferenceTensor(inferenceTensor: Tensor): Unit             = js.native
  def setInferenceExampleCount(inferenceExampleCount: Double): Unit = js.native
}

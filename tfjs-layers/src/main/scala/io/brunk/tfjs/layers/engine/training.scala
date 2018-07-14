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

package io.brunk.tfjs.layers.engine

import io.brunk.tfjs.layers.{Callback, CustomCallbackConfig, History, NamedTensorMap}
import io.brunk.tfjs.layers.Types.{LossOrMetricFn, Shape}
import io.brunk.tfjs.tf._

import scala.scalajs.js
import js.annotation._
import js.{Promise, |}
import js.JSConverters._

@js.native
sealed trait ModelLoggingVerbosity extends js.Object {}

@js.native
@JSGlobal
object ModelLoggingVerbosity extends js.Object {
  var SILENT: ModelLoggingVerbosity  = js.native
  var VERBOSE: ModelLoggingVerbosity = js.native
  @JSBracketAccess
  def apply(value: ModelLoggingVerbosity): String = js.native
}

@js.native
trait ModelEvaluateConfig extends js.Object {
  var batchSize: Double              = js.native
  var verbose: ModelLoggingVerbosity = js.native
  var sampleWeight: TensorND         = js.native
  var steps: Double                  = js.native
}

@js.native
trait ModelFitConfig extends js.Object {
  var batchSize: Double              = js.native
  var epochs: Double                 = js.native
  var verbose: ModelLoggingVerbosity = js.native
  var callbacks: js.Array[Callback] | CustomCallbackConfig | js.Array[CustomCallbackConfig] =
    js.native
  var validationSplit: Double = js.native
  var validationData
    : js.Tuple2[TensorND | js.Array[TensorND], TensorND | js.Array[TensorND]] | js.Tuple3[
      TensorND | js.Array[TensorND],
      TensorND | js.Array[TensorND],
      TensorND | js.Array[TensorND]
    ]                                         = js.native
  var shuffle: Boolean                        = js.native
  var classWeight: ModelFitConfig.ClassWeight = js.native
  var sampleWeight: TensorND                  = js.native
  var initialEpoch: Double                    = js.native
  var stepsPerEpoch: Double                   = js.native
  var validationSteps: Double                 = js.native
}

object ModelFitConfig {

  @js.native
  trait ClassWeight extends js.Object {
    @JSBracketAccess
    def apply(classIndex: String): Double = js.native
    @JSBracketAccess
    def update(classIndex: String, v: Double): Unit = js.native
  }
}

@ScalaJSDefined
class ModelCompileConfig(
    val optimizer: String | Optimizer,
    val loss: js.UndefOr[String | js.Array[String] | js.Dictionary[String] | LossOrMetricFn | js.Array[
      LossOrMetricFn
    ] | js.Dictionary[LossOrMetricFn]] = js.undefined,
    val metrics: js.UndefOr[js.Array[String] | js.Dictionary[String]] = js.undefined
) extends js.Object

object ModelCompileConfig {
  def apply(
      optimizer: String | Optimizer,
      loss: js.UndefOr[
        String | js.Array[String] | js.Dictionary[String] | LossOrMetricFn | js.Array[
          LossOrMetricFn
        ] | js.Dictionary[LossOrMetricFn]
      ] = js.undefined,
      metrics: js.UndefOr[js.Array[String] | js.Dictionary[String]] = js.undefined
  ): ModelCompileConfig =
    new ModelCompileConfig(
      optimizer = optimizer,
      loss = loss,
      metrics = metrics
    )
}

@js.native
@JSImport("@tensorflow/tfjs-layers", "Model")
class Model protected () extends Container {
  def this(config: ContainerConfig) = this()
  var optimizer: Optimizer = js.native
  var loss: String | js.Array[String] | js.Dictionary[String] | LossOrMetricFn | js.Array[
    LossOrMetricFn
  ] | js.Dictionary[LossOrMetricFn]                               = js.native
  var lossFunctions: js.Array[LossOrMetricFn]                     = js.native
  var history: History                                            = js.native
  var metrics: js.Array[String] | js.Dictionary[String]           = js.native
  var metricsNames: js.Array[String]                              = js.native
  var metricsTensors: js.Array[js.Tuple2[LossOrMetricFn, Double]] = js.native
  def summary(
    lineLength: Double = ???,
    positions: js.Array[Double] = ???,
    printFn: js.Function = ???
  ): Unit = js.native
  def compile(config: ModelCompileConfig): Unit                   = js.native
  def evaluate(
      x: TensorND | js.Array[TensorND],
      y: TensorND | js.Array[TensorND],
      config: ModelEvaluateConfig = ???
  ): Scalar | js.Array[Scalar] = js.native
  def execute(
    inputs: TensorND | js.Array[TensorND] | NamedTensorMap,
    outputs: String | js.Array[String]
  ): TensorND | js.Array[TensorND] = js.native
  def predict(
      x: TensorND | js.Array[TensorND],
      config: ModelPredictConfig = ???
  ): TensorND | js.Array[TensorND]                               = js.native
  def predictOnBatch(x: TensorND): TensorND | js.Array[TensorND] = js.native
  def standardizeUserData(
      x: TensorND | js.Array[TensorND] | js.Dictionary[TensorND],
      y: TensorND | js.Array[TensorND] | js.Dictionary[TensorND],
      checkBatchAxis: Boolean = ???,
      batchSize: Double = ???
  ): js.Tuple3[js.Array[TensorND], js.Array[TensorND], js.Array[TensorND]] = js.native
  def fit(
      x: TensorND | js.Array[TensorND] | js.Dictionary[TensorND],
      y: TensorND | js.Array[TensorND] | js.Dictionary[TensorND],
      config: ModelFitConfig = ???
  ): Promise[History]                                              = js.native
  def getNamedWeights(config: io.SaveConfig = ???): NamedTensorMap = js.native
  def save(
      handlerOrURL: io.IOHandler | String,
      config: io.SaveConfig = ???
  ): Promise[io.SaveResult] = js.native
}

@js.native
@JSImport("@tensorflow/tfjs-layers", "Model")
object Model extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobalScope
object Training extends js.Object {
  def isDataTensor(
      x: TensorND | js.Array[TensorND] | js.Dictionary[TensorND] | js.Dictionary[js.Array[TensorND]]
  ): Boolean                                                                           = js.native
  def isDataArray(x: TensorND | js.Array[TensorND] | js.Dictionary[TensorND]): Boolean = js.native
  def isDataDict(x: TensorND | js.Array[TensorND] | js.Dictionary[TensorND]): Boolean  = js.native
  def standardizeInputData(
      data: TensorND | js.Array[TensorND] | js.Dictionary[TensorND],
      names: js.Array[String],
      shapes: js.Array[Shape] = ???,
      checkBatchAxis: Boolean = ???,
      exceptionPrefix: String = ???
  ): js.Array[TensorND] = js.native
  def checkArrayLengths(
      inputs: js.Array[TensorND],
      targets: js.Array[TensorND],
      weights: js.Array[TensorND] = ???
  ): Unit                                                                               = js.native
  def makeBatches(size: Double, batchSize: Double): js.Array[js.Tuple2[Double, Double]] = js.native
  def sliceArraysByIndices(
      arrays: TensorND | js.Array[TensorND],
      indices: Tensor1D
  ): TensorND | js.Array[TensorND] = js.native
}

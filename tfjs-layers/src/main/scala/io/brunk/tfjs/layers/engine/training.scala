package io.brunk.tfjs.layers.engine

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
sealed trait ModelLoggingVerbosity extends js.Object {
}

@js.native
@JSGlobal
object ModelLoggingVerbosity extends js.Object {
  var SILENT: ModelLoggingVerbosity = js.native
  var VERBOSE: ModelLoggingVerbosity = js.native
  @JSBracketAccess
  def apply(value: ModelLoggingVerbosity): String = js.native
}

@js.native
trait ModelPredictConfig extends js.Object {
  var batchSize: Double = js.native
  var verbose: Boolean = js.native
}

@js.native
trait ModelEvaluateConfig extends js.Object {
  var batchSize: Double = js.native
  var verbose: ModelLoggingVerbosity = js.native
  var sampleWeight: Tensor = js.native
  var steps: Double = js.native
}

@js.native
trait ModelFitConfig extends js.Object {
  var batchSize: Double = js.native
  var epochs: Double = js.native
  var verbose: ModelLoggingVerbosity = js.native
  var callbacks: js.Array[Callback] | CustomCallbackConfig | js.Array[CustomCallbackConfig] = js.native
  var validationSplit: Double = js.native
  var validationData: js.Tuple2[Tensor | js.Array[Tensor], Tensor | js.Array[Tensor]] | js.Tuple3[Tensor | js.Array[Tensor], Tensor | js.Array[Tensor], Tensor | js.Array[Tensor]] = js.native
  var shuffle: Boolean = js.native
  var classWeight: ModelFitConfig.ClassWeight = js.native
  var sampleWeight: Tensor = js.native
  var initialEpoch: Double = js.native
  var stepsPerEpoch: Double = js.native
  var validationSteps: Double = js.native
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

@js.native
trait ModelCompileConfig extends js.Object {
  var optimizer: String | Optimizer = js.native
  var loss: String | js.Array[String] | js.Dictionary[String] | LossOrMetricFn | js.Array[LossOrMetricFn] | js.Dictionary[LossOrMetricFn] = js.native
  var metrics: js.Array[String] | js.Dictionary[String] = js.native
}

@js.native
@JSGlobal
class Model protected () extends Container {
  def this(config: ContainerConfig) = this()
  var optimizer: Optimizer = js.native
  var loss: String | js.Array[String] | js.Dictionary[String] | LossOrMetricFn | js.Array[LossOrMetricFn] | js.Dictionary[LossOrMetricFn] = js.native
  var lossFunctions: js.Array[LossOrMetricFn] = js.native
  var history: History = js.native
  var metrics: js.Array[String] | js.Dictionary[String] = js.native
  var metricsNames: js.Array[String] = js.native
  var metricsTensors: js.Array[js.Tuple2[LossOrMetricFn, Double]] = js.native
  def compile(config: ModelCompileConfig): Unit = js.native
  def evaluate(x: Tensor | js.Array[Tensor], y: Tensor | js.Array[Tensor], config: ModelEvaluateConfig = ???): Scalar | js.Array[Scalar] = js.native
  def predict(x: Tensor | js.Array[Tensor], config: ModelPredictConfig = ???): Tensor | js.Array[Tensor] = js.native
  def predictOnBatch(x: Tensor): Tensor | js.Array[Tensor] = js.native
  def standardizeUserData(x: Tensor | js.Array[Tensor] | js.Dictionary[Tensor], y: Tensor | js.Array[Tensor] | js.Dictionary[Tensor], checkBatchAxis: Boolean = ???, batchSize: Double = ???): js.Tuple3[js.Array[Tensor], js.Array[Tensor], js.Array[Tensor]] = js.native
  def fit(x: Tensor | js.Array[Tensor] | js.Dictionary[Tensor], y: Tensor | js.Array[Tensor] | js.Dictionary[Tensor], config: ModelFitConfig = ???): Promise[History] = js.native
  def getNamedWeights(config: io.SaveConfig = ???): NamedTensorMap = js.native
  def save(handlerOrURL: io.IOHandler | String, config: io.SaveConfig = ???): Promise[io.SaveResult] = js.native
}

@js.native
@JSGlobal
object Model extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobalScope
object Training extends js.Object {
  def isDataTensor(x: Tensor | js.Array[Tensor] | js.Dictionary[Tensor] | js.Dictionary[js.Array[Tensor]]): Boolean = js.native
  def isDataArray(x: Tensor | js.Array[Tensor] | js.Dictionary[Tensor]): Boolean = js.native
  def isDataDict(x: Tensor | js.Array[Tensor] | js.Dictionary[Tensor]): Boolean = js.native
  def standardizeInputData(data: Tensor | js.Array[Tensor] | js.Dictionary[Tensor], names: js.Array[String], shapes: js.Array[Shape] = ???, checkBatchAxis: Boolean = ???, exceptionPrefix: String = ???): js.Array[Tensor] = js.native
  def checkArrayLengths(inputs: js.Array[Tensor], targets: js.Array[Tensor], weights: js.Array[Tensor] = ???): Unit = js.native
  def makeBatches(size: Double, batchSize: Double): js.Array[js.Tuple2[Double, Double]] = js.native
  def sliceArraysByIndices(arrays: Tensor | js.Array[Tensor], indices: Tensor1D): Tensor | js.Array[Tensor] = js.native
}

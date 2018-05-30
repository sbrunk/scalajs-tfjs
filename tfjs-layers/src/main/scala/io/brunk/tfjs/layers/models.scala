package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait ModelAndWeightsConfig extends js.Object {
  var modelTopology: JsonDict = js.native
  var weightsManifest: io.WeightsManifestConfig = js.native
  var pathPrefix: String = js.native
}

@js.native
trait SequentialConfig extends js.Object {
  var layers: js.Array[Layer] = js.native
  var name: String = js.native
}

@js.native
@JSGlobal
class Sequential protected () extends Model {
  def this(config: SequentialConfig = ???) = this()
  def add(layer: Layer): Unit = js.native
  def pop(): Unit = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def build(inputShape: Shape = ???): Unit = js.native
  def setWeights(weights: js.Array[Tensor]): Unit = js.native
  var updatable: Boolean = js.native
  def evaluate(x: Tensor | js.Array[Tensor], y: Tensor | js.Array[Tensor], config: ModelEvaluateConfig = ???): Scalar | js.Array[Scalar] = js.native
  def predict(x: Tensor | js.Array[Tensor], config: ModelPredictConfig = ???): Tensor | js.Array[Tensor] = js.native
  def predictOnBatch(x: Tensor): Tensor | js.Array[Tensor] = js.native
  def compile(config: ModelCompileConfig): Unit = js.native
  def fit(x: Tensor | js.Array[Tensor] | js.Dictionary[Tensor], y: Tensor | js.Array[Tensor] | js.Dictionary[Tensor], config: ModelFitConfig = ???): Promise[History] = js.native
  def getConfig(): js.Dynamic = js.native
}

@js.native
@JSGlobal
object Sequential extends js.Object {
  var className: String = js.native
  def fromConfig[T <: serialization.Serializable](cls: serialization.SerializableConstructor[T], config: serialization.ConfigDict): T = js.native
}

@js.native
@JSGlobalScope
object Models extends js.Object {
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: serialization.ConfigDict = ???): Promise[Model] = js.native
  def loadModelInternal(pathOrIOHandler: String | io.IOHandler): Promise[Model] = js.native
  def loadModelFromIOHandler(handler: io.IOHandler, customObjects: serialization.ConfigDict = ???): Promise[Model] = js.native
  def loadModelFromPath(modelConfigPath: String): Promise[Model] = js.native
}

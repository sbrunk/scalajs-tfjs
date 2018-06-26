package io.brunk.tfjs.converter.executor

import scala.scalajs.js
import js.annotation._
import js.|

package frozen_model {

@js.native
@JSGlobal
class FrozenModel protected () extends tfc.InferenceModel {
  def this(modelUrl: String, weightManifestUrl: String, requestOption: RequestInit = ???) = this()
  def modelVersion: String = js.native
  def inputNodes: js.Array[String] = js.native
  def outputNodes: js.Array[String] = js.native
  def inputs: js.Array[TensorInfo] = js.native
  def outputs: js.Array[TensorInfo] = js.native
  def getPathPrefix(): String = js.native
  def load(): Promise[Boolean] = js.native
  def predict(inputs: tfc.Tensor | js.Array[tfc.Tensor] | tfc.NamedTensorMap, config: tfc.ModelPredictConfig = ???): tfc.Tensor | js.Array[tfc.Tensor] | tfc.NamedTensorMap = js.native
  def execute(inputs: tfc.Tensor | js.Array[tfc.Tensor] | tfc.NamedTensorMap, outputs: String | js.Array[String] = ???): tfc.Tensor | js.Array[tfc.Tensor] = js.native
  def executeAsync(inputs: tfc.Tensor | js.Array[tfc.Tensor] | tfc.NamedTensorMap, outputs: String | js.Array[String] = ???): Promise[tfc.Tensor | js.Array[tfc.Tensor]] = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobalScope
object Frozen_model extends js.Object {
  def loadFrozenModel(modelUrl: String, weightsManifestUrl: String, requestOption: RequestInit = ???): Promise[FrozenModel] = js.native
}

}

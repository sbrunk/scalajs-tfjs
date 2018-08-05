package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

package model_types {

@js.native
trait ModelPredictConfig extends js.Object {
  var batchSize: Double = js.native
  var verbose: Boolean = js.native
}

@js.native
trait InferenceModel extends js.Object {
  def inputs: js.Array[TensorInfo] = js.native
  def outputs: js.Array[TensorInfo] = js.native
  def predict(inputs: Tensor | js.Array[Tensor] | NamedTensorMap, config: ModelPredictConfig): Tensor | js.Array[Tensor] | NamedTensorMap = js.native
  def execute(inputs: Tensor | js.Array[Tensor] | NamedTensorMap, outputs: String | js.Array[String]): Tensor | js.Array[Tensor] = js.native
}

}

package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

package tensor_util_env {

@js.native
@JSGlobalScope
object Tensor_util_env extends js.Object {
  def convertToTensor[T <: Tensor](x: T | TensorLike, argName: String, functionName: String, dtype: DataType = ???): T = js.native
  def convertToTensorArray[T <: Tensor](arg: js.Array[T] | js.Array[TensorLike], argName: String, functionName: String): js.Array[T] = js.native
}

}

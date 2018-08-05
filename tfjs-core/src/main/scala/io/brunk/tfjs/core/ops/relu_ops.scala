package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package relu_ops {

@js.native
@JSGlobalScope
object Relu_ops extends js.Object {
  def relu_[T <: Tensor](x: T | TensorLike): T = js.native
  def elu_[T <: Tensor](x: T | TensorLike): T = js.native
  def selu_[T <: Tensor](x: T | TensorLike): T = js.native
  def leakyRelu_[T <: Tensor](x: T | TensorLike, alpha: Double = ???): T = js.native
  def prelu_[T <: Tensor](x: T | TensorLike, alpha: T | TensorLike): T = js.native
  val elu: elu_.type = js.native
  val leakyRelu: leakyRelu_.type = js.native
  val prelu: prelu_.type = js.native
  val relu: relu_.type = js.native
  val selu: selu_.type = js.native
}

}

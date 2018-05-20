package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class ReverseOps extends js.Object {
}

@js.native
@JSGlobal
object ReverseOps extends js.Object {
  def reverse1d(x: Tensor1D): Tensor1D = js.native
  def reverse2d(x: Tensor2D, axis: Double | js.Array[Double] = ???): Tensor2D = js.native
  def reverse3d(x: Tensor3D, axis: Double | js.Array[Double] = ???): Tensor3D = js.native
  def reverse4d(x: Tensor4D, axis: Double | js.Array[Double] = ???): Tensor4D = js.native
  def reverse[T <: Tensor](x: T, axis: Double | js.Array[Double] = ???): T = js.native
}

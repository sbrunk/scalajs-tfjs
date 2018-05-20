package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package concat {

@js.native
@JSGlobal
class ConcatOps extends js.Object {
}

@js.native
@JSGlobal
object ConcatOps extends js.Object {
  def concat1d(tensors: js.Array[Tensor1D]): Tensor1D = js.native
  def concat2d(tensors: js.Array[Tensor2D], axis: Double): Tensor2D = js.native
  def concat3d(tensors: js.Array[Tensor3D], axis: Double): Tensor3D = js.native
  def concat4d(tensors: js.Array[Tensor4D], axis: Double): Tensor4D = js.native
  def concat[T <: Tensor](tensors: js.Array[T], axis: Double = ???): T = js.native
}

}

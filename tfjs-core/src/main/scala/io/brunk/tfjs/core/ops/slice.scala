package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package slice {

@js.native
@JSGlobal
class SliceOps extends js.Object {
}

@js.native
@JSGlobal
object SliceOps extends js.Object {
  def slice1d(x: Tensor1D, begin: Double, size: Double): Tensor1D = js.native
  def slice2d(x: Tensor2D, begin: js.Tuple2[Double, Double], size: js.Tuple2[Double, Double]): Tensor2D = js.native
  def slice3d(x: Tensor3D, begin: js.Tuple3[Double, Double, Double], size: js.Tuple3[Double, Double, Double]): Tensor3D = js.native
  def slice4d(x: Tensor4D, begin: js.Tuple4[Double, Double, Double, Double], size: js.Tuple4[Double, Double, Double, Double]): Tensor4D = js.native
  def slice[R <: Rank, T <: Tensor[R]](x: T, begin: Double | js.Array[Double], size: Double | js.Array[Double] = ???): T = js.native
}

}

package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package image_ops {

@js.native
@JSGlobal
class ImageOps extends js.Object {
}

@js.native
@JSGlobal
object ImageOps extends js.Object {
  def resizeBilinear[T <: Tensor3D | Tensor4D](images: T, size: js.Tuple2[Double, Double], alignCorners: Boolean = ???): T = js.native
  def resizeNearestNeighbor[T <: Tensor3D | Tensor4D](images: T, size: js.Tuple2[Double, Double], alignCorners: Boolean = ???): T = js.native
}

}

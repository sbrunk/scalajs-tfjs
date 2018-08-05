package io.brunk.tfjs.core.kernels

import scala.scalajs.js
import js.annotation._
import js.|

package topk_impl {

@js.native
@JSGlobalScope
object Topk_impl extends js.Object {
  def topkImpl[T <: Tensor](x: TypedArray, xShape: js.Array[Double], xDtype: DataType, k: Double, sorted: Boolean): js.Tuple2[T, T] = js.native
}

}

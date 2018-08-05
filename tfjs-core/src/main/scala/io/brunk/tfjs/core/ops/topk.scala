package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package topk {

@js.native
@JSGlobalScope
object Topk extends js.Object {
  def topk_[T <: Tensor](x: T | TensorLike, k: Double = ???, sorted: Boolean = ???): js.Any = js.native
  val topk: topk_.type = js.native
}

}

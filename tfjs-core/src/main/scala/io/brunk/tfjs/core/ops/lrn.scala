package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class LRNOps extends js.Object {
}

@js.native
@JSGlobal
object LRNOps extends js.Object {
  def localResponseNormalization[T <: Tensor3D | Tensor4D](x: T, radius: Double = ???, bias: Double = ???, alpha: Double = ???, beta: Double = ???): T = js.native
}

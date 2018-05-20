package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class TransposeOps extends js.Object {
}

@js.native
@JSGlobal
object TransposeOps extends js.Object {
  def transpose[T <: Tensor](x: T, perm: js.Array[Double] = ???): T = js.native
}

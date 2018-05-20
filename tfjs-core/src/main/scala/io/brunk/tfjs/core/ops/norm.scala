package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class NormOps extends js.Object {
}

@js.native
@JSGlobal
object NormOps extends js.Object {
  def norm(x: Tensor, ord: Double | String = ???, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): Tensor = js.native
}

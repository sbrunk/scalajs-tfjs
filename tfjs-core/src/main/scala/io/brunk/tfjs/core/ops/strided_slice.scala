package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class StridedSliceOps extends js.Object {
}

@js.native
@JSGlobal
object StridedSliceOps extends js.Object {
  def stridedSlice[T <: Tensor](x: T, begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double], beginMask: Double = ???, endMask: Double = ???): T = js.native
}

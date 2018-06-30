package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package segment_ops {

@js.native
@JSGlobal
class SegmentOps extends js.Object {
}

@js.native
@JSGlobal
object SegmentOps extends js.Object {
  def unsortedSegmentSum[T <: Tensor](x: T, segmentIds: Tensor1D, numSegments: Double): T = js.native
}

}

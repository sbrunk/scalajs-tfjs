package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

  @js.native
  trait SegmentOps extends js.Object {
    def unsortedSegmentSum[T <: TensorND](x: T, segmentIds: Tensor1D, numSegments: Double): T =
      js.native
  }


package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

  @js.native
  trait SegOpInfo extends js.Object {
    var windowSize: Double  = js.native
    var batchSize: Double   = js.native
    var inSize: Double      = js.native
    var numSegments: Double = js.native
  }

  @js.native
  @JSGlobalScope
  object Segment_util extends js.Object {
    def segOpComputeOptimalWindowSize(inSize: Double, numSegments: Double): Double = js.native
    def computeOutShape(
        aShape: js.Array[Double],
        axis: Double,
        numSegments: Double
    ): js.Array[Double] = js.native
  }

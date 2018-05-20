package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Slice_util extends js.Object {
  def assertParamsValid(input: Tensor, begin: js.Array[Double], size: js.Array[Double]): Unit = js.native
  def getStridedSlicedInfo(shape: js.Array[Double], begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double], beginMask: Double = ???, endMask: Double = ???): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  def startForAxis(beginMask: Double, startIndices: js.Array[Double], strides: js.Array[Double], inputShape: js.Array[Double], axis: Double): Double = js.native
  def stopForAxis(endMask: Double, stopIndices: js.Array[Double], strides: js.Array[Double], inputShape: js.Array[Double], axis: Double): Double = js.native
}

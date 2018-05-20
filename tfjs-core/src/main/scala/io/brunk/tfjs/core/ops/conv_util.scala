package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Conv_util extends js.Object {
  type PadInfo = js.Any
  type Conv2DInfo = js.Any
  def computePool2DInfo(inShape: js.Tuple4[Double, Double, Double, Double], filterSize: js.Tuple2[Double, Double] | Double, strides: Double | js.Tuple2[Double, Double], pad: String | Double, roundingMode: String = ???, dataFormat: String = ???): Conv2DInfo = js.native
  def computeConv2DInfo(inShape: js.Tuple4[Double, Double, Double, Double], filterShape: js.Tuple4[Double, Double, Double, Double], strides: Double | js.Tuple2[Double, Double], dilations: Double | js.Tuple2[Double, Double], pad: String | Double, roundingMode: String = ???, depthwise: Boolean = ???, dataFormat: String = ???): Conv2DInfo = js.native
  def computeDefaultPad(inputShape: js.Tuple3[Double, Double, Double], fieldSize: Double, stride: Double, dilation: Double = ???): Double = js.native
}

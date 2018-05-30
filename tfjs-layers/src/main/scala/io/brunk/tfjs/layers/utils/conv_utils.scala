package io.brunk.tfjs.layers.utils

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Conv_utils extends js.Object {
  def normalizeArray(value: Double | js.Array[Double], n: Double, name: String): js.Array[Double] = js.native
  def convOutputLength(inputLength: Double, fliterSize: Double, padding: PaddingMode, stride: Double, dilation: Double = ???): Double = js.native
  def deconvLength(dimSize: Double, strideSize: Double, kernelSize: Double, padding: PaddingMode): Double = js.native
}

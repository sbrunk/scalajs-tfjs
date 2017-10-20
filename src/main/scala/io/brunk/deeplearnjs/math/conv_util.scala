/*
 * Copyright (c) 2017 Sören Brunk
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.brunk.deeplearnjs.math

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Conv_util extends js.Object {
  type ConvInfo = js.Any
  def computeConvInfo(inShape: js.Tuple3[Double, Double, Double],
                      filterHeight: Double,
                      filterWidth: Double,
                      outDepth: Double,
                      strideHeight: Double,
                      strideWidth: Double,
                      pad: String | Double): ConvInfo = js.native
  def computeOutputShape3D(inShape: js.Tuple3[Double, Double, Double],
                           fieldSize: Double,
                           outDepth: Double,
                           stride: Double,
                           zeroPad: Double = ???): js.Tuple3[Double, Double, Double] = js.native
  def computeDefaultPad(inputShape: js.Tuple3[Double, Double, Double],
                        fieldSize: Double,
                        stride: Double): Double = js.native
  def computeTexShapeFrom3D(
      shapeRowColDepth: js.Tuple3[Double, Double, Double]
  ): js.Tuple2[Double, Double] = js.native
  def computeWeightsShape4D(inputDepth: Double,
                            outputDepth: Double,
                            filterHeight: Double,
                            filterWidth: Double): js.Tuple4[Double, Double, Double, Double] =
    js.native
  def computeDilatedRC(rc: js.Tuple2[Double, Double],
                       origStride: Double): js.Tuple2[Double, Double] = js.native
}
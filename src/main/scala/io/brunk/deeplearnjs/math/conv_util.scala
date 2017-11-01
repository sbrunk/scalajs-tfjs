/*
 * Copyright 2017 Sören Brunk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.brunk.deeplearnjs.math

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
@JSImport("deeplearn", "conv_util")
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

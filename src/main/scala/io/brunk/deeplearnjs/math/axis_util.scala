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
@JSGlobalScope
object Axis_util extends js.Object {
  def axesAreInnerMostDims(axes: js.Array[Double], rank: Double): Boolean = js.native
  def combineLocations(outputLoc: js.Array[Double],
                       reduceLoc: js.Array[Double],
                       axes: js.Array[Double]): js.Array[Double] = js.native
  def computeOutAndReduceShapes(
      aShape: js.Array[Double],
      axes: js.Array[Double]
  ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  def expandShapeToKeepDim(shape: js.Array[Double], axes: js.Array[Double]): js.Array[Double] =
    js.native
  def parseAxisParam(axis: Double | js.Array[Double], shape: js.Array[Double]): js.Array[Double] =
    js.native
  def assertAxesAreInnerMostDims(msg: String, axes: js.Array[Double], rank: Double): Unit =
    js.native
}

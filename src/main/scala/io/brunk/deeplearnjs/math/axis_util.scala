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

package axis_util {

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

}

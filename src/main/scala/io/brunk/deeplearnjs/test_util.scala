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

package io.brunk.deeplearnjs

import scala.scalajs.js
import js.annotation._
import js.|
import scala.scalajs.js.typedarray.Float32Array

@js.native
@JSGlobalScope
object Test_util extends js.Object {
  def expectArraysClose(actual: Float32Array, expected: Float32Array, epsilon: Double = ???): Unit =
    js.native
  def randomArrayInRange(n: Double, minValue: Double, maxValue: Double): Float32Array = js.native
  def makeIdentity(n: Double): Float32Array                                           = js.native
  def setValue(m: Float32Array,
               mNumRows: Double,
               mNumCols: Double,
               v: Double,
               row: Double,
               column: Double): Unit = js.native
  def cpuMultiplyMatrix(a: Float32Array,
                        aRow: Double,
                        aCol: Double,
                        b: Float32Array,
                        bRow: Double,
                        bCol: Double): Float32Array           = js.native
  def cpuDotProduct(a: Float32Array, b: Float32Array): Double = js.native
}

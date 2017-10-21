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
import js.{ Promise, | }
import scala.scalajs.js.typedarray.{
  Float32Array,
  Float64Array,
  Int16Array,
  Int32Array,
  Int8Array,
  Uint32Array
}

@js.native
@JSGlobalScope
object Util extends js.Object {
  type Vector = js.Array[Double] | Float64Array | Float32Array | Int32Array | Int8Array | Int16Array
  def shuffle(array: js.Array[js.Any] | Uint32Array | Int32Array | Float32Array): Unit = js.native
  def clamp(min: Double, x: Double, max: Double): Double                               = js.native
  def randUniform(a: Double, b: Double): Double                                        = js.native
  def randGauss(mean: Double = ???, stdDev: Double = ???, truncated: Boolean = ???): Double =
    js.native
  def distSquared(a: Vector, b: Vector): Double = js.native
  def assert(expr: Boolean, msg: String): Unit  = js.native
  def assertShapesMatch(shapeA: js.Array[Double],
                        shapeB: js.Array[Double],
                        errorMessagePrefix: String = ???): Unit                     = js.native
  def flatten(arr: js.Array[js.Any], ret: js.Array[Double] = ???): js.Array[Double] = js.native
  type ArrayData = Float32Array | Double | js.Array[Double] | js.Array[js.Array[Double]] | js.Array[
    js.Array[js.Array[Double]]
  ] | js.Array[js.Array[js.Array[js.Array[Double]]]]
  def inferShape(arr: ArrayData): js.Array[Double]    = js.native
  def sizeFromShape(shape: js.Array[Double]): Double  = js.native
  def isScalarShape(shape: js.Array[Double]): Boolean = js.native
  def arraysEqual(n1: js.Array[js.Any] | Float32Array,
                  n2: js.Array[js.Any] | Float32Array): Boolean    = js.native
  def isInt(a: Double): Boolean                                    = js.native
  def tanh(x: Double): Double                                      = js.native
  def sizeToSquarishShape(size: Double): js.Tuple2[Double, Double] = js.native
  def createShuffledIndices(n: Double): Uint32Array                = js.native
  def assertAndGetBroadcastedShape(shapeA: js.Array[Double],
                                   shapeB: js.Array[Double]): js.Array[Double] = js.native
  def rightPad(a: String, size: Double): String                                = js.native
  def repeatedTry(checkFn: js.Function0[Boolean],
                  delayFn: js.Function1[Double, Double] = ???,
                  maxCounter: Double = ???): Promise[Unit]                            = js.native
  def getQueryParams(queryString: String): js.Dictionary[String]                      = js.native
  def inferFromImplicitShape(shape: js.Array[Double], size: Double): js.Array[Double] = js.native
}

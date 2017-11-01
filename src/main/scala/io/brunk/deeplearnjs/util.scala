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

package io.brunk.deeplearnjs

import scala.scalajs.js
import js.annotation._
import js.{ Promise, | }
import scala.scalajs.js.typedarray.{ Float32Array, Int32Array, Uint32Array, Uint8Array }

@js.native
@JSImport("deeplearn", "util")
object Util extends js.Object {
  type TypedArray = Float32Array | Int32Array | Uint8Array
  type FlatVector = js.Array[Boolean] | js.Array[Double] | TypedArray
  type RegularArray[T] =
    js.Array[T] | js.Array[js.Array[T]] | js.Array[js.Array[js.Array[T]]] | js.Array[
      js.Array[js.Array[js.Array[T]]]
    ]
  type ArrayData = TypedArray | RegularArray[Double] | RegularArray[Boolean]
  def shuffle(array: js.Array[js.Any] | Uint32Array | Int32Array | Float32Array): Unit = js.native
  def clamp(min: Double, x: Double, max: Double): Double                               = js.native
  def randUniform(a: Double, b: Double): Double                                        = js.native
  def randGauss(mean: Double = ???, stdDev: Double = ???, truncated: Boolean = ???): Double =
    js.native
  def distSquared(a: FlatVector, b: FlatVector): Double = js.native
  def assert(expr: Boolean, msg: String): Unit          = js.native
  def assertShapesMatch(shapeA: js.Array[Double],
                        shapeB: js.Array[Double],
                        errorMessagePrefix: String = ???): Unit = js.native
  def flatten(arr: Double | Boolean | RegularArray[Double] | RegularArray[Boolean],
              ret: js.Array[Double | Boolean] = ???): js.Array[Double | Boolean] = js.native
  def inferShape(
      arr: Double | Boolean | RegularArray[Double] | RegularArray[Boolean]
  ): js.Array[Double]                                              = js.native
  def sizeFromShape(shape: js.Array[Double]): Double               = js.native
  def isScalarShape(shape: js.Array[Double]): Boolean              = js.native
  def arraysEqual(n1: FlatVector, n2: FlatVector): Boolean         = js.native
  def isInt(a: Double): Boolean                                    = js.native
  def tanh(x: Double): Double                                      = js.native
  def sizeToSquarishShape(size: Double): js.Tuple2[Double, Double] = js.native
  def createShuffledIndices(n: Double): Uint32Array                = js.native
  def rightPad(a: String, size: Double): String                    = js.native
  def repeatedTry(checkFn: js.Function0[Boolean],
                  delayFn: js.Function1[Double, Double] = ???,
                  maxCounter: Double = ???): Promise[Unit]                            = js.native
  def getQueryParams(queryString: String): js.Dictionary[String]                      = js.native
  def inferFromImplicitShape(shape: js.Array[Double], size: Double): js.Array[Double] = js.native
  type DType = String
  val NAN_INT32: Double                              = js.native
  val NAN_BOOL: Double                               = js.native
  val NAN_FLOAT32: Double                            = js.native
  def getNaN(dtype: DType): Double                   = js.native
  def isValNaN(`val`: Double, dtype: DType): Boolean = js.native
}

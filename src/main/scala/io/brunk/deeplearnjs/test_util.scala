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

import io.brunk.deeplearnjs.Util.{ DType, TypedArray }
import io.brunk.deeplearnjs.math.NDArrayMath

import scala.scalajs.js
import js.annotation._
import js.{ Promise, | }
import scala.scalajs.js.typedarray.Float32Array

@js.native
@JSImport("deeplearn", "test_util")
object Test_util extends js.Object {
  val TEST_EPSILON: js.Any = js.native
  def expectArraysClose(actual: TypedArray | js.Array[Double],
                        expected: TypedArray | js.Array[Double],
                        epsilon: Double = ???): Unit                                  = js.native
  def expectNumbersClose(a: Double, e: Double, epsilon: Double = ???): Unit           = js.native
  def randomArrayInRange(n: Double, minValue: Double, maxValue: Double): Float32Array = js.native
  def makeIdentity(n: Double): Float32Array                                           = js.native
  def cpuMultiplyMatrix(a: Float32Array,
                        aRow: Double,
                        aCol: Double,
                        b: Float32Array,
                        bRow: Double,
                        bCol: Double): Float32Array           = js.native
  def cpuDotProduct(a: Float32Array, b: Float32Array): Double = js.native
  type MathTests = js.Function1[js.Function2[String, js.Function1[NDArrayMath, Unit], Unit], Unit]
  type Tests     = js.Function1[js.Function2[String, js.Function0[Unit], Unit], Unit]
  def describeMathCPU(name: String,
                      tests: js.Array[MathTests],
                      featuresList: js.Array[Features] = ???): Unit = js.native
  def describeMathGPU(name: String,
                      tests: js.Array[MathTests],
                      featuresList: js.Array[Features] = ???): Unit = js.native
  def describeCustom(name: String,
                     tests: Tests,
                     featuresList: js.Array[Features] = ???,
                     customBeforeEach: js.Function0[Unit] = ???,
                     customAfterEach: js.Function0[Unit] = ???): Unit = js.native
  def executeMathTests(testName: String,
                       tests: js.Array[MathTests],
                       mathFactory: js.Function0[NDArrayMath],
                       features: Features = ???): Unit = js.native
  def executeTests(
      testName: String,
      tests: js.Array[Tests],
      features: Features = ???,
      customBeforeEach: js.Function0[Unit] = ???,
      customAfterEach: js.Function0[Unit] = ???,
      customIt: js.Function2[String, js.Function0[Unit] | Promise[Unit], Unit] = ???
  ): Unit                                            = js.native
  def assertIsNan(`val`: Double, dtype: DType): Unit = js.native
}

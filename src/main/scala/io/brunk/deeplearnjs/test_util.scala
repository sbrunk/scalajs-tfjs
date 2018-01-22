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

import io.brunk.deeplearnjs.Util.{ DType, TypedArray }
import io.brunk.deeplearnjs.math.NDArrayMath

import scala.scalajs.js
import js.annotation._
import js.{ Promise, | }
import scala.scalajs.js.typedarray.Float32Array

@js.native
@JSImport("deeplearn", "test_util")
object Test_util extends js.Object {
  type MathIt    = js.Function2[String, js.Function1[NDArrayMath, Unit], Unit]
  type It        = js.Function2[String, js.Function0[Unit] | Promise[Unit], Unit]
  type MathTests = js.Function3[MathIt, MathIt, MathIt, Unit]
  type Tests     = js.Function3[It, It, It, Unit]
  val TEST_EPSILON: js.Any = js.native
  def mean(values: TypedArray | js.Array[Double]): Double                            = js.native
  def standardDeviation(values: TypedArray | js.Array[Double], mean: Double): Double = js.native
  def kurtosis(values: TypedArray | js.Array[Double]): Double                        = js.native
  def skewness(values: TypedArray | js.Array[Double]): Double                        = js.native
  def jarqueBeraNormalityTest(a: NDArray | TypedArray | js.Array[Double]): Unit      = js.native
  def expectArrayInMeanStdRange(actual: NDArray | TypedArray | js.Array[Double],
                                expectedMean: Double,
                                expectedStdDev: Double,
                                epsilon: Double = ???): Unit = js.native
  def expectArraysClose(actual: NDArray | TypedArray | js.Array[Double],
                        expected: NDArray | TypedArray | js.Array[Double] | js.Array[Boolean],
                        epsilon: Double = ???): Unit
  def expectArraysEqual(
                         actual: NDArray | TypedArray | js.Array[Double],
                         expected: NDArray | TypedArray | js.Array[Double] | js.Array[Boolean]
                       ): Unit      = js.native
  def expectNumbersClose(a: Double, e: Double, epsilon: Double = ???): Unit           = js.native
  def expectValuesInRange(actual: NDArray | TypedArray | js.Array[Double],
                          low: Double,
                          high: Double): Unit
  def randomArrayInRange(n: Double, minValue: Double, maxValue: Double): Float32Array = js.native
  def makeIdentity(n: Double): Float32Array                                           = js.native
  def cpuMultiplyMatrix(a: Float32Array,
                        aRow: Double,
                        aCol: Double,
                        b: Float32Array,
                        bRow: Double,
                        bCol: Double): Float32Array           = js.native
  def cpuDotProduct(a: Float32Array, b: Float32Array): Double = js.native
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
  def assertIsNan(`val`: Double, dtype: DType): Unit = js.native
}

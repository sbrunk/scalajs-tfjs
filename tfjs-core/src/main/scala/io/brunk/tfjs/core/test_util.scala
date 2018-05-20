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

package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.{Promise, |}

@js.native
@JSGlobal
object ALL_ENVS extends js.Object {}

@js.native
trait DoneFn extends js.Object {
  def apply(): Unit                            = js.native
  var fail: js.Function1[Error | String, Unit] = js.native
}

@js.native
@JSGlobalScope
object Test_util extends js.Object {
  val WEBGL_ENVS: Features = js.native
  val CPU_ENVS: Features   = js.native
  val TEST_EPSILON: Double = js.native
  def expectArraysClose(
      actual: Tensor | TypedArray | js.Array[Double],
      expected: Tensor | TypedArray | js.Array[Double] | js.Array[Boolean],
      epsilon: Double = ???
  ): Unit                                                                        = js.native
  def expectPromiseToFail(fn: js.Function0[Promise[js.Any]], done: DoneFn): Unit = js.native
  def expectArraysEqual(
      actual: Tensor | TypedArray | js.Array[Double],
      expected: Tensor | TypedArray | js.Array[Double] | js.Array[Boolean]
  ): Unit                                                                   = js.native
  def expectNumbersClose(a: Double, e: Double, epsilon: Double = ???): Unit = js.native
  def expectValuesInRange(
      actual: Tensor | TypedArray | js.Array[Double],
      low: Double,
      high: Double
  ): Unit = js.native
}

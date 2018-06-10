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

package io.brunk.tfjs.layers.utils

import scala.scalajs.js
import js.annotation._
import js.|
import scala.scalajs.js.typedarray.{Float32Array, Int32Array, Uint8Array}

@js.native
@JSGlobalScope
object Math_utils extends js.Object {
  type ArrayTypes = Uint8Array | Int32Array | Float32Array
  def isInteger(x: Double): Boolean = js.native
  def arrayProd(array: js.Array[Double] | ArrayTypes, begin: Double = ???, end: Double = ???): Double = js.native
  def min(array: js.Array[Double] | Float32Array): Double = js.native
  def max(array: js.Array[Double] | Float32Array): Double = js.native
  def sum(array: js.Array[Double] | Float32Array): Double = js.native
  def mean(array: js.Array[Double] | Float32Array): Double = js.native
  def variance(array: js.Array[Double] | Float32Array): Double = js.native
  def median(array: js.Array[Double] | Float32Array): Double = js.native
  def range(begin: Double, end: Double): js.Array[Double] = js.native
}

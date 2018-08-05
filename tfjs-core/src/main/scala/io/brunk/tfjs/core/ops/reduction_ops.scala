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

package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package reduction_ops {

@js.native
@JSGlobalScope
object Reduction_ops extends js.Object {
  def logSumExp_[T <: Tensor](x: Tensor | TensorLike, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def sum_[T <: Tensor](x: Tensor | TensorLike, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def mean_[T <: Tensor](x: Tensor | TensorLike, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def min_[T <: Tensor](x: Tensor | TensorLike, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def max_[T <: Tensor](x: Tensor | TensorLike, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def argMin_[T <: Tensor](x: Tensor | TensorLike, axis: Double = ???): T = js.native
  def argMax_[T <: Tensor](x: Tensor | TensorLike, axis: Double = ???): T = js.native
  def all_[T <: Tensor](x: Tensor | TensorLike, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def any_[T <: Tensor](x: Tensor | TensorLike, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def moments_(x: Tensor | TensorLike, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): js.Any = js.native
  val all: all_.type = js.native
  val any: any_.type = js.native
  val argMax: argMax_.type = js.native
  val argMin: argMin_.type = js.native
  val logSumExp: logSumExp_.type = js.native
  val max: max_.type = js.native
  val mean: mean_.type = js.native
  val min: min_.type = js.native
  val moments: moments_.type = js.native
  val sum: sum_.type = js.native
}

}

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

import io.brunk.tfjs.core.TensorModule.{Tensor1D, TensorND}
import io.brunk.tfjs.core.Types.TensorLike

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait ReductionOps extends js.Object {
  def logSumExp[T <: TensorND](
      x: TensorND | TensorLike,
      axis: Double | js.Array[Double] = ???,
      keepDims: Boolean = ???
  ): T = js.native
  def sum[T <: TensorND](
      x: TensorND | TensorLike,
      axis: Double | js.Array[Double] = ???,
      keepDims: Boolean = ???
  ): T = js.native
  def mean[T <: TensorND](
      x: TensorND | TensorLike,
      axis: Double | js.Array[Double] = ???,
      keepDims: Boolean = ???
  ): T = js.native
  def min[T <: TensorND](
      x: TensorND | TensorLike,
      axis: Double | js.Array[Double] = ???,
      keepDims: Boolean = ???
  ): T = js.native
  def max[T <: TensorND](
      x: TensorND | TensorLike,
      axis: Double | js.Array[Double] = ???,
      keepDims: Boolean = ???
  ): T                                                          = js.native
  def argMin[T <: TensorND](x: TensorND | TensorLike, axis: Double = ???): T = js.native
  def argMax[T <: TensorND](x: TensorND | TensorLike, axis: Double = ???): T = js.native
  def all[T <: TensorND](
      x: TensorND | TensorLike,
      axis: Double | js.Array[Double] = ???,
      keepDims: Boolean = ???
  ): T = js.native
  def any[T <: TensorND](
    x: TensorND | TensorLike,
    axis: Double | js.Array[Double] = ???,
    keepDims: Boolean = ???
  ): T = js.native
  def moments(x: TensorND | TensorLike, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): js.Any =
    js.native
}

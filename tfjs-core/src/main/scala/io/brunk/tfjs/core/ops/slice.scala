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

package slice {

  @js.native
  @JSGlobalScope
  object Slice extends js.Object {
    def slice1d_(x: Tensor1D | TensorLike, begin: Double, size: Double): Tensor1D = js.native
    def slice2d_(
        x: Tensor2D | TensorLike,
        begin: js.Tuple2[Double, Double],
        size: js.Tuple2[Double, Double]
    ): Tensor2D = js.native
    def slice3d_(
        x: Tensor3D | TensorLike,
        begin: js.Tuple3[Double, Double, Double],
        size: js.Tuple3[Double, Double, Double]
    ): Tensor3D = js.native
    def slice4d_(
        x: Tensor4D | TensorLike,
        begin: js.Tuple4[Double, Double, Double, Double],
        size: js.Tuple4[Double, Double, Double, Double]
    ): Tensor4D = js.native
    def slice_[R <: Rank, T <: Tensor[R]](
        x: T | TensorLike,
        begin: Double | js.Array[Double],
        size: Double | js.Array[Double] = ???
    ): T                       = js.native
    val slice: slice_.type     = js.native
    val slice1d: slice1d_.type = js.native
    val slice2d: slice2d_.type = js.native
    val slice3d: slice3d_.type = js.native
    val slice4d: slice4d_.type = js.native
  }

}

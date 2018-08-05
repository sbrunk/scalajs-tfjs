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

package batchnorm {

  @js.native
  @JSGlobalScope
  object Batchnorm extends js.Object {
    def batchNormalization2d_(
        x: Tensor2D | TensorLike,
        mean: Tensor2D | Tensor1D | TensorLike,
        variance: Tensor2D | Tensor1D | TensorLike,
        varianceEpsilon: Double = ???,
        scale: Tensor2D | Tensor1D | TensorLike = ???,
        offset: Tensor2D | Tensor1D | TensorLike = ???
    ): Tensor2D = js.native
    def batchNormalization3d_(
        x: Tensor3D | TensorLike,
        mean: Tensor3D | Tensor1D | TensorLike,
        variance: Tensor3D | Tensor1D | TensorLike,
        varianceEpsilon: Double = ???,
        scale: Tensor3D | Tensor1D | TensorLike = ???,
        offset: Tensor3D | Tensor1D | TensorLike = ???
    ): Tensor3D = js.native
    def batchNormalization4d_(
        x: Tensor4D | TensorLike,
        mean: Tensor4D | Tensor1D | TensorLike,
        variance: Tensor4D | Tensor1D | TensorLike,
        varianceEpsilon: Double = ???,
        scale: Tensor4D | Tensor1D | TensorLike = ???,
        offset: Tensor4D | Tensor1D | TensorLike = ???
    ): Tensor4D = js.native
    def batchNormalization_[R <: Rank](
        x: Tensor[R] | Tensor1D | TensorLike,
        mean: Tensor[R] | Tensor1D | TensorLike,
        variance: Tensor[R] | Tensor1D | TensorLike,
        varianceEpsilon: Double = ???,
        scale: Tensor[R] | Tensor1D | TensorLike = ???,
        offset: Tensor[R] | Tensor1D | TensorLike = ???
    ): Tensor[R]                                         = js.native
    val batchNormalization2d: batchNormalization2d_.type = js.native
    val batchNormalization3d: batchNormalization3d_.type = js.native
    val batchNormalization4d: batchNormalization4d_.type = js.native
    val batchNormalization: batchNormalization_.type     = js.native
  }

}

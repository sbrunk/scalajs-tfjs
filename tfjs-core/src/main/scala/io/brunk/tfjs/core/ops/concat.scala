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

package concat {

  @js.native
  @JSGlobalScope
  object Concat extends js.Object {
    def concat1d_(tensors: js.Array[Tensor1D] | js.Array[TensorLike]): Tensor1D = js.native
    def concat2d_(tensors: js.Array[Tensor2D] | js.Array[TensorLike], axis: Double): Tensor2D =
      js.native
    def concat3d_(tensors: js.Array[Tensor3D] | js.Array[TensorLike], axis: Double): Tensor3D =
      js.native
    def concat4d_(tensors: js.Array[Tensor4D] | js.Array[TensorLike], axis: Double): Tensor4D =
      js.native
    def concat_[T <: Tensor](tensors: js.Array[T] | js.Array[TensorLike], axis: Double = ???): T =
      js.native
    val concat: concat_.type     = js.native
    val concat1d: concat1d_.type = js.native
    val concat2d: concat2d_.type = js.native
    val concat3d: concat3d_.type = js.native
    val concat4d: concat4d_.type = js.native
  }

}

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

package reverse {

  @js.native
  @JSGlobalScope
  object Reverse extends js.Object {
    def reverse1d_(x: Tensor1D | TensorLike): Tensor1D = js.native
    def reverse2d_(x: Tensor2D | TensorLike, axis: Double | js.Array[Double] = ???): Tensor2D =
      js.native
    def reverse3d_(x: Tensor3D | TensorLike, axis: Double | js.Array[Double] = ???): Tensor3D =
      js.native
    def reverse4d_(x: Tensor4D | TensorLike, axis: Double | js.Array[Double] = ???): Tensor4D =
      js.native
    def reverse_[T <: Tensor](x: T | TensorLike, axis: Double | js.Array[Double] = ???): T =
      js.native
    val reverse: reverse_.type     = js.native
    val reverse1d: reverse1d_.type = js.native
    val reverse2d: reverse2d_.type = js.native
    val reverse3d: reverse3d_.type = js.native
    val reverse4d: reverse4d_.type = js.native
  }

}

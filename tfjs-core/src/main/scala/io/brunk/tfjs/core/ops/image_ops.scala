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

package image_ops {

  @js.native
  @JSGlobalScope
  object Image_ops extends js.Object {
    def resizeBilinear_[T <: Tensor3D | Tensor4D](
        images: T | TensorLike,
        size: js.Tuple2[Double, Double],
        alignCorners: Boolean = ???
    ): T = js.native
    def resizeNearestNeighbor_[T <: Tensor3D | Tensor4D](
        images: T | TensorLike,
        size: js.Tuple2[Double, Double],
        alignCorners: Boolean = ???
    ): T = js.native
    def nonMaxSuppression_(
        boxes: Tensor2D | TensorLike,
        scores: Tensor1D | TensorLike,
        maxOutputSize: Double,
        iouThreshold: Double = ???,
        scoreThreshold: Double = ???
    ): Tensor1D = js.native
    def nonMaxSuppressionAsync_(
        boxes: Tensor2D | TensorLike,
        scores: Tensor1D | TensorLike,
        maxOutputSize: Double,
        iouThreshold: Double = ???,
        scoreThreshold: Double = ???
    ): Promise[Tensor1D]                                     = js.native
    val resizeBilinear: resizeBilinear_.type                 = js.native
    val resizeNearestNeighbor: resizeNearestNeighbor_.type   = js.native
    val nonMaxSuppression: nonMaxSuppression_.type           = js.native
    val nonMaxSuppressionAsync: nonMaxSuppressionAsync_.type = js.native
  }

}

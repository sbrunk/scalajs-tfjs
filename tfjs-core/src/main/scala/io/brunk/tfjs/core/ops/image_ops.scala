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

import io.brunk.tfjs.core.TensorModule.{Tensor1D, Tensor2D, Tensor3D, Tensor4D}
import io.brunk.tfjs.core.Types.TensorLike

import scala.scalajs.js
import js.annotation._
import js.{Promise, |}

@js.native
trait ImageOps extends js.Object {
  def resizeBilinear[T <: Tensor3D | Tensor4D](
      images: T | TensorLike,
      size: js.Tuple2[Double, Double],
      alignCorners: Boolean = ???
  ): T = js.native
  def resizeNearestNeighbor[T <: Tensor3D | Tensor4D](
      images: T | TensorLike,
      size: js.Tuple2[Double, Double],
      alignCorners: Boolean = ???
  ): T = js.native
  def nonMaxSuppression(
    boxes: Tensor2D | TensorLike,
    scores: Tensor1D | TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double = ???,
    scoreThreshold: Double = ???
  ): Tensor1D = js.native
  def nonMaxSuppressionAsync(
    boxes: Tensor2D | TensorLike,
    scores: Tensor1D | TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double = ???,
    scoreThreshold: Double = ???
  ): Promise[Tensor1D]
}

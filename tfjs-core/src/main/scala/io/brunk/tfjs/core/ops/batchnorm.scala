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

import io.brunk.tfjs.core.{Rank, Tensor}
import io.brunk.tfjs.core.TensorModule.{Tensor1D, Tensor2D, Tensor3D, Tensor4D}

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait BatchNormOps extends js.Object {
  def batchNormalization2d(
      x: Tensor2D,
      mean: Tensor2D | Tensor1D,
      variance: Tensor2D | Tensor1D,
      varianceEpsilon: Double = ???,
      scale: Tensor2D | Tensor1D = ???,
      offset: Tensor2D | Tensor1D = ???
  ): Tensor2D = js.native
  def batchNormalization3d(
      x: Tensor3D,
      mean: Tensor3D | Tensor1D,
      variance: Tensor3D | Tensor1D,
      varianceEpsilon: Double = ???,
      scale: Tensor3D | Tensor1D = ???,
      offset: Tensor3D | Tensor1D = ???
  ): Tensor3D = js.native
  def batchNormalization4d(
      x: Tensor4D,
      mean: Tensor4D | Tensor1D,
      variance: Tensor4D | Tensor1D,
      varianceEpsilon: Double = ???,
      scale: Tensor4D | Tensor1D = ???,
      offset: Tensor4D | Tensor1D = ???
  ): Tensor4D = js.native
  def batchNormalization[R <: Rank](
      x: Tensor[R],
      mean: Tensor[R] | Tensor1D,
      variance: Tensor[R] | Tensor1D,
      varianceEpsilon: Double = ???,
      scale: Tensor[R] | Tensor1D = ???,
      offset: Tensor[R] | Tensor1D = ???
  ): Tensor[R] = js.native
}

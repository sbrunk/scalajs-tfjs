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

import io.brunk.tfjs.core.Tensor
import io.brunk.tfjs.core.TensorModule._

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait ConcatOps extends js.Object {
  def concat1d(tensors: js.Array[Tensor1D]): Tensor1D                    = js.native
  def concat2d(tensors: js.Array[Tensor2D], axis: Double): Tensor2D      = js.native
  def concat3d(tensors: js.Array[Tensor3D], axis: Double): Tensor3D      = js.native
  def concat4d(tensors: js.Array[Tensor4D], axis: Double): Tensor4D      = js.native
  def concat[T <: TensorND](tensors: js.Array[T], axis: Double = ???): T = js.native
}

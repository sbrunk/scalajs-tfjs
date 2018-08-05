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

package logical_ops {

@js.native
@JSGlobalScope
object Logical_ops extends js.Object {
  def logicalNot_[T <: Tensor](x: T | TensorLike): T = js.native
  def logicalAnd_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def logicalOr_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def logicalXor_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def where_[T <: Tensor](condition: Tensor | TensorLike, a: T | TensorLike, b: T | TensorLike): T = js.native
  def whereAsync_(condition: Tensor | TensorLike): Promise[Tensor2D] = js.native
  val logicalAnd: logicalAnd_.type = js.native
  val logicalNot: logicalNot_.type = js.native
  val logicalOr: logicalOr_.type = js.native
  val logicalXor: logicalXor_.type = js.native
  val where: where_.type = js.native
  val whereAsync: whereAsync_.type = js.native
}

}

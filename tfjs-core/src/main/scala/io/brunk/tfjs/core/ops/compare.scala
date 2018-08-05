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

package compare {

@js.native
@JSGlobalScope
object Compare extends js.Object {
  def notEqual_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def notEqualStrict_[T <: Tensor](a: T | TensorLike, b: T | TensorLike): T = js.native
  def less_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def lessStrict_[T <: Tensor](a: T | TensorLike, b: T | TensorLike): T = js.native
  def equal_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def equalStrict_[T <: Tensor](a: T | TensorLike, b: T | TensorLike): T = js.native
  def lessEqual_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def lessEqualStrict_[T <: Tensor](a: T | TensorLike, b: T | TensorLike): T = js.native
  def greater_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def greaterStrict_[T <: Tensor](a: T | TensorLike, b: T | TensorLike): T = js.native
  def greaterEqual_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def greaterEqualStrict_[T <: Tensor](a: T | TensorLike, b: T | TensorLike): T = js.native
  val equal: equal_.type = js.native
  val equalStrict: equalStrict_.type = js.native
  val greater: greater_.type = js.native
  val greaterEqual: greaterEqual_.type = js.native
  val greaterEqualStrict: greaterEqualStrict_.type = js.native
  val greaterStrict: greaterStrict_.type = js.native
  val less: less_.type = js.native
  val lessEqual: lessEqual_.type = js.native
  val lessEqualStrict: lessEqualStrict_.type = js.native
  val lessStrict: lessStrict_.type = js.native
  val notEqual: notEqual_.type = js.native
  val notEqualStrict: notEqualStrict_.type = js.native
}

}

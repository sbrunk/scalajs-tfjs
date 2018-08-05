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

package binary_ops {

@js.native
@JSGlobalScope
object Binary_ops extends js.Object {
  def add_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def addN_[T <: Tensor](tensors: js.Array[T | TensorLike]): T = js.native
  def addStrict_[T <: Tensor](a: T, b: T): T = js.native
  def sub_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def subStrict_[T <: Tensor](a: T, b: T): T = js.native
  def pow_[T <: Tensor](base: T | TensorLike, exp: Tensor | TensorLike): T = js.native
  def powStrict_[T <: Tensor](base: T, exp: Tensor): T = js.native
  def mul_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def mulStrict_[T <: Tensor](a: T, b: T): T = js.native
  def div_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def floorDiv_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def divStrict_[T <: Tensor](a: T, b: T): T = js.native
  def mod_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def modStrict_[T <: Tensor](a: T, b: T): T = js.native
  def minimum_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def minimumStrict_[T <: Tensor](a: T, b: T): T = js.native
  def maximum_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def maximumStrict_[T <: Tensor](a: T, b: T): T = js.native
  def squaredDifference_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  def squaredDifferenceStrict_[T <: Tensor](a: T, b: T): T = js.native
  def atan2_[T <: Tensor](a: Tensor | TensorLike, b: Tensor | TensorLike): T = js.native
  val add: add_.type = js.native
  val addN: addN_.type = js.native
  val addStrict: addStrict_.type = js.native
  val atan2: atan2_.type = js.native
  val div: div_.type = js.native
  val divStrict: divStrict_.type = js.native
  val floorDiv: floorDiv_.type = js.native
  val maximum: maximum_.type = js.native
  val maximumStrict: maximumStrict_.type = js.native
  val minimum: minimum_.type = js.native
  val minimumStrict: minimumStrict_.type = js.native
  val mod: mod_.type = js.native
  val modStrict: modStrict_.type = js.native
  val mul: mul_.type = js.native
  val mulStrict: mulStrict_.type = js.native
  val pow: pow_.type = js.native
  val powStrict: powStrict_.type = js.native
  val squaredDifference: squaredDifference_.type = js.native
  val squaredDifferenceStrict: squaredDifferenceStrict_.type = js.native
  val sub: sub_.type = js.native
  val subStrict: subStrict_.type = js.native
}

}

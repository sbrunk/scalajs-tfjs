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

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class BinaryOps extends js.Object {}

@js.native
@JSGlobal
object BinaryOps extends js.Object {
  def add[T <: Tensor](a: Tensor, b: Tensor): T               = js.native
  def addStrict[T <: Tensor](a: T, b: T): T                   = js.native
  def sub[T <: Tensor](a: Tensor, b: Tensor): T               = js.native
  def subStrict[T <: Tensor](a: T, b: T): T                   = js.native
  def pow[T <: Tensor](base: T, exp: Tensor): T               = js.native
  def powStrict[T <: Tensor](base: T, exp: Tensor): T         = js.native
  def mul[T <: Tensor](a: Tensor, b: Tensor): T               = js.native
  def mulStrict[T <: Tensor](a: T, b: T): T                   = js.native
  def div[T <: Tensor](a: Tensor, b: Tensor): T               = js.native
  def divStrict[T <: Tensor](a: T, b: T): T                   = js.native
  def mod[T <: Tensor](a: Tensor, b: Tensor): T               = js.native
  def modStrict[T <: Tensor](a: T, b: T): T                   = js.native
  def minimum[T <: Tensor](a: Tensor, b: Tensor): T           = js.native
  def minimumStrict[T <: Tensor](a: T, b: T): T               = js.native
  def maximum[T <: Tensor](a: Tensor, b: Tensor): T           = js.native
  def maximumStrict[T <: Tensor](a: T, b: T): T               = js.native
  def squaredDifference[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def squaredDifferenceStrict[T <: Tensor](a: T, b: T): T     = js.native
  def atan2[T <: Tensor](a: Tensor, b: Tensor): T             = js.native
}

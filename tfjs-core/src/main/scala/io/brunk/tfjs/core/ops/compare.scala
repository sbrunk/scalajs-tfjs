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
class CompareOps extends js.Object {}

@js.native
@JSGlobal
object CompareOps extends js.Object {
  def notEqual[T <: Tensor](a: Tensor, b: Tensor): T     = js.native
  def notEqualStrict[T <: Tensor](a: T, b: T): T         = js.native
  def less[T <: Tensor](a: Tensor, b: Tensor): T         = js.native
  def lessStrict[T <: Tensor](a: T, b: T): T             = js.native
  def equal[T <: Tensor](a: Tensor, b: Tensor): T        = js.native
  def equalStrict[T <: Tensor](a: T, b: T): T            = js.native
  def lessEqual[T <: Tensor](a: Tensor, b: Tensor): T    = js.native
  def lessEqualStrict[T <: Tensor](a: T, b: T): T        = js.native
  def greater[T <: Tensor](a: Tensor, b: Tensor): T      = js.native
  def greaterStrict[T <: Tensor](a: T, b: T): T          = js.native
  def greaterEqual[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def greaterEqualStrict[T <: Tensor](a: T, b: T): T     = js.native
}

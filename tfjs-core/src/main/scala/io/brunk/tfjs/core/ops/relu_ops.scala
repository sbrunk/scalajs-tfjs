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
import io.brunk.tfjs.core.TensorModule.TensorND
import io.brunk.tfjs.core.Types.TensorLike

@js.native
trait ReluOps extends js.Object {
  def relu[T <: TensorND](x: T | TensorLike): T                           = js.native
  def elu[T <: TensorND](x: T | TensorLike): T                            = js.native
  def selu[T <: TensorND](x: T | TensorLike): T                           = js.native
  def leakyRelu[T <: TensorND](x: T | TensorLike, alpha: Double = ???): T = js.native
  def prelu[T <: TensorND](x: T | TensorLike, alpha: T | TensorLike): T   = js.native
}

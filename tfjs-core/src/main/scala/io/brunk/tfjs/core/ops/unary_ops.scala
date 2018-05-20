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
class UnaryOps extends js.Object {}

@js.native
@JSGlobal
object UnaryOps extends js.Object {
  def neg[T <: Tensor](x: T): T                                                     = js.native
  def ceil[T <: Tensor](x: T): T                                                    = js.native
  def floor[T <: Tensor](x: T): T                                                   = js.native
  def sign[T <: Tensor](x: T): T                                                    = js.native
  def round[T <: Tensor](x: T): T                                                   = js.native
  def exp[T <: Tensor](x: T): T                                                     = js.native
  def expm1[T <: Tensor](x: T): T                                                   = js.native
  def log[T <: Tensor](x: T): T                                                     = js.native
  def log1p[T <: Tensor](x: T): T                                                   = js.native
  def sqrt[T <: Tensor](x: T): T                                                    = js.native
  def rsqrt[T <: Tensor](x: T): T                                                   = js.native
  def square[T <: Tensor](x: T): T                                                  = js.native
  def reciprocal[T <: Tensor](x: T): T                                              = js.native
  def abs[T <: Tensor](x: T): T                                                     = js.native
  def clipByValue[T <: Tensor](x: T, clipValueMin: Double, clipValueMax: Double): T = js.native
  def relu[T <: Tensor](x: T): T                                                    = js.native
  def elu[T <: Tensor](x: T): T                                                     = js.native
  def selu[T <: Tensor](x: T): T                                                    = js.native
  def leakyRelu[T <: Tensor](x: T, alpha: Double = ???): T                          = js.native
  def prelu[T <: Tensor](x: T, alpha: T): T                                         = js.native
  def sigmoid[T <: Tensor](x: T): T                                                 = js.native
  def logSigmoid[T <: Tensor](x: T): T                                              = js.native
  def softplus[T <: Tensor](x: T): T                                                = js.native
  def sin[T <: Tensor](x: T): T                                                     = js.native
  def cos[T <: Tensor](x: T): T                                                     = js.native
  def tan[T <: Tensor](x: T): T                                                     = js.native
  def asin[T <: Tensor](x: T): T                                                    = js.native
  def acos[T <: Tensor](x: T): T                                                    = js.native
  def atan[T <: Tensor](x: T): T                                                    = js.native
  def sinh[T <: Tensor](x: T): T                                                    = js.native
  def cosh[T <: Tensor](x: T): T                                                    = js.native
  def tanh[T <: Tensor](x: T): T                                                    = js.native
  def asinh[T <: Tensor](x: T): T                                                   = js.native
  def acosh[T <: Tensor](x: T): T                                                   = js.native
  def atanh[T <: Tensor](x: T): T                                                   = js.native
  def erf[T <: Tensor](x: T): T                                                     = js.native
  def step[T <: Tensor](x: T, alpha: Double = ???): T                               = js.native
}

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

import io.brunk.tfjs.core.TensorModule.TensorND

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait UnaryOps extends js.Object {
  def neg[T <: TensorND](x: T): T                                                     = js.native
  def ceil[T <: TensorND](x: T): T                                                    = js.native
  def floor[T <: TensorND](x: T): T                                                   = js.native
  def sign[T <: TensorND](x: T): T                                                    = js.native
  def round[T <: TensorND](x: T): T                                                   = js.native
  def exp[T <: TensorND](x: T): T                                                     = js.native
  def expm1[T <: TensorND](x: T): T                                                   = js.native
  def log[T <: TensorND](x: T): T                                                     = js.native
  def log1p[T <: TensorND](x: T): T                                                   = js.native
  def sqrt[T <: TensorND](x: T): T                                                    = js.native
  def rsqrt[T <: TensorND](x: T): T                                                   = js.native
  def square[T <: TensorND](x: T): T                                                  = js.native
  def reciprocal[T <: TensorND](x: T): T                                              = js.native
  def abs[T <: TensorND](x: T): T                                                     = js.native
  def clipByValue[T <: TensorND](x: T, clipValueMin: Double, clipValueMax: Double): T = js.native
  def relu[T <: TensorND](x: T): T                                                    = js.native
  def elu[T <: TensorND](x: T): T                                                     = js.native
  def selu[T <: TensorND](x: T): T                                                    = js.native
  def leakyRelu[T <: TensorND](x: T, alpha: Double = ???): T                          = js.native
  def prelu[T <: TensorND](x: T, alpha: T): T                                         = js.native
  def sigmoid[T <: TensorND](x: T): T                                                 = js.native
  def logSigmoid[T <: TensorND](x: T): T                                              = js.native
  def softplus[T <: TensorND](x: T): T                                                = js.native
  def sin[T <: TensorND](x: T): T                                                     = js.native
  def cos[T <: TensorND](x: T): T                                                     = js.native
  def tan[T <: TensorND](x: T): T                                                     = js.native
  def asin[T <: TensorND](x: T): T                                                    = js.native
  def acos[T <: TensorND](x: T): T                                                    = js.native
  def atan[T <: TensorND](x: T): T                                                    = js.native
  def sinh[T <: TensorND](x: T): T                                                    = js.native
  def cosh[T <: TensorND](x: T): T                                                    = js.native
  def tanh[T <: TensorND](x: T): T                                                    = js.native
  def asinh[T <: TensorND](x: T): T                                                   = js.native
  def acosh[T <: TensorND](x: T): T                                                   = js.native
  def atanh[T <: TensorND](x: T): T                                                   = js.native
  def erf[T <: TensorND](x: T): T                                                     = js.native
  def step[T <: TensorND](x: T, alpha: Double = ???): T                               = js.native
}

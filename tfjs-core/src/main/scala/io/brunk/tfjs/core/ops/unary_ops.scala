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

package unary_ops {

@js.native
@JSGlobalScope
object Unary_ops extends js.Object {
  def neg_[T <: Tensor](x: T | TensorLike): T = js.native
  def ceil_[T <: Tensor](x: T | TensorLike): T = js.native
  def floor_[T <: Tensor](x: T | TensorLike): T = js.native
  def sign_[T <: Tensor](x: T | TensorLike): T = js.native
  def round_[T <: Tensor](x: T | TensorLike): T = js.native
  def exp_[T <: Tensor](x: T | TensorLike): T = js.native
  def expm1_[T <: Tensor](x: T | TensorLike): T = js.native
  def log_[T <: Tensor](x: T | TensorLike): T = js.native
  def log1p_[T <: Tensor](x: T | TensorLike): T = js.native
  def sqrt_[T <: Tensor](x: T | TensorLike): T = js.native
  def rsqrt_[T <: Tensor](x: T | TensorLike): T = js.native
  def square_[T <: Tensor](x: T | TensorLike): T = js.native
  def reciprocal_[T <: Tensor](x: T | TensorLike): T = js.native
  def abs_[T <: Tensor](x: T | TensorLike): T = js.native
  def clipByValue_[T <: Tensor](x: T | TensorLike, clipValueMin: Double, clipValueMax: Double): T = js.native
  def sigmoid_[T <: Tensor](x: T | TensorLike): T = js.native
  def logSigmoid_[T <: Tensor](x: T | TensorLike): T = js.native
  def softplus_[T <: Tensor](x: T | TensorLike): T = js.native
  def sin_[T <: Tensor](x: T | TensorLike): T = js.native
  def cos_[T <: Tensor](x: T | TensorLike): T = js.native
  def tan_[T <: Tensor](x: T | TensorLike): T = js.native
  def asin_[T <: Tensor](x: T | TensorLike): T = js.native
  def acos_[T <: Tensor](x: T | TensorLike): T = js.native
  def atan_[T <: Tensor](x: T | TensorLike): T = js.native
  def sinh_[T <: Tensor](x: T | TensorLike): T = js.native
  def cosh_[T <: Tensor](x: T | TensorLike): T = js.native
  def tanh_[T <: Tensor](x: T | TensorLike): T = js.native
  def asinh_[T <: Tensor](x: T | TensorLike): T = js.native
  def acosh_[T <: Tensor](x: T | TensorLike): T = js.native
  def atanh_[T <: Tensor](x: T | TensorLike): T = js.native
  def erf_[T <: Tensor](x: T | TensorLike): T = js.native
  def step_[T <: Tensor](x: T | TensorLike, alpha: Double = ???): T = js.native
  val abs: abs_.type = js.native
  val acos: acos_.type = js.native
  val acosh: acosh_.type = js.native
  val asin: asin_.type = js.native
  val asinh: asinh_.type = js.native
  val atan: atan_.type = js.native
  val atanh: atanh_.type = js.native
  val ceil: ceil_.type = js.native
  val clipByValue: clipByValue_.type = js.native
  val cos: cos_.type = js.native
  val cosh: cosh_.type = js.native
  val erf: erf_.type = js.native
  val exp: exp_.type = js.native
  val expm1: expm1_.type = js.native
  val floor: floor_.type = js.native
  val log: log_.type = js.native
  val log1p: log1p_.type = js.native
  val logSigmoid: logSigmoid_.type = js.native
  val neg: neg_.type = js.native
  val reciprocal: reciprocal_.type = js.native
  val round: round_.type = js.native
  val rsqrt: rsqrt_.type = js.native
  val sigmoid: sigmoid_.type = js.native
  val sign: sign_.type = js.native
  val sin: sin_.type = js.native
  val sinh: sinh_.type = js.native
  val softplus: softplus_.type = js.native
  val sqrt: sqrt_.type = js.native
  val square: square_.type = js.native
  val step: step_.type = js.native
  val tan: tan_.type = js.native
  val tanh: tanh_.type = js.native
}

}

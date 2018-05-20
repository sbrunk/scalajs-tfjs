package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class UnaryOps extends js.Object {
}

@js.native
@JSGlobal
object UnaryOps extends js.Object {
  def neg[T <: Tensor](x: T): T = js.native
  def ceil[T <: Tensor](x: T): T = js.native
  def floor[T <: Tensor](x: T): T = js.native
  def sign[T <: Tensor](x: T): T = js.native
  def round[T <: Tensor](x: T): T = js.native
  def exp[T <: Tensor](x: T): T = js.native
  def expm1[T <: Tensor](x: T): T = js.native
  def log[T <: Tensor](x: T): T = js.native
  def log1p[T <: Tensor](x: T): T = js.native
  def sqrt[T <: Tensor](x: T): T = js.native
  def rsqrt[T <: Tensor](x: T): T = js.native
  def square[T <: Tensor](x: T): T = js.native
  def reciprocal[T <: Tensor](x: T): T = js.native
  def abs[T <: Tensor](x: T): T = js.native
  def clipByValue[T <: Tensor](x: T, clipValueMin: Double, clipValueMax: Double): T = js.native
  def relu[T <: Tensor](x: T): T = js.native
  def elu[T <: Tensor](x: T): T = js.native
  def selu[T <: Tensor](x: T): T = js.native
  def leakyRelu[T <: Tensor](x: T, alpha: Double = ???): T = js.native
  def prelu[T <: Tensor](x: T, alpha: T): T = js.native
  def sigmoid[T <: Tensor](x: T): T = js.native
  def logSigmoid[T <: Tensor](x: T): T = js.native
  def softplus[T <: Tensor](x: T): T = js.native
  def sin[T <: Tensor](x: T): T = js.native
  def cos[T <: Tensor](x: T): T = js.native
  def tan[T <: Tensor](x: T): T = js.native
  def asin[T <: Tensor](x: T): T = js.native
  def acos[T <: Tensor](x: T): T = js.native
  def atan[T <: Tensor](x: T): T = js.native
  def sinh[T <: Tensor](x: T): T = js.native
  def cosh[T <: Tensor](x: T): T = js.native
  def tanh[T <: Tensor](x: T): T = js.native
  def asinh[T <: Tensor](x: T): T = js.native
  def acosh[T <: Tensor](x: T): T = js.native
  def atanh[T <: Tensor](x: T): T = js.native
  def erf[T <: Tensor](x: T): T = js.native
  def step[T <: Tensor](x: T, alpha: Double = ???): T = js.native
}

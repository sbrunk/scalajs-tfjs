package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class Gradients extends js.Object {
}

@js.native
@JSGlobal
object Gradients extends js.Object {
  def gradScope[T <: TensorContainer](nameOrScopeFn: String | ScopeFn[T], scopeFn: ScopeFn[T] = ???): T = js.native
  def grad[I <: Tensor, O <: Tensor](f: js.Function1[I, O]): js.Function2[I, O, I] = js.native
  def grads[O <: Tensor](f: js.Function): js.Function2[js.Array[Tensor], O, js.Array[Tensor]] = js.native
  def valueAndGrad[I <: Tensor, O <: Tensor](f: js.Function1[I, O]): js.Function2[I, O, js.Any] = js.native
  def valueAndGrads[O <: Tensor](f: js.Function): js.Function2[js.Array[Tensor], O, js.Any] = js.native
  def variableGrads(f: js.Function0[Scalar], varList: js.Array[Variable] = ???): js.Any = js.native
  def customGrad[T <: Tensor](f: CustomGradientFunc[T]): js.Function = js.native
}

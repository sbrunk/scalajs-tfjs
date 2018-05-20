package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class Tracking extends js.Object {
}

@js.native
@JSGlobal
object Tracking extends js.Object {
  def tidy[T <: TensorContainer](nameOrFn: String | ScopeFn[T], fn: ScopeFn[T] = ???, gradMode: Boolean = ???): T = js.native
  def dispose(container: js.Any): Unit = js.native
  def keep[T <: Tensor](result: T): T = js.native
  def time(f: js.Function0[Unit]): Promise[TimingInfo] = js.native
}

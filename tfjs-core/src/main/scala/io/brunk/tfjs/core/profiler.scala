package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

package profiler {

@js.native
@JSGlobal
class Profiler protected () extends js.Object {
  def this(backendTimer: BackendTimer, logger: Logger = ???) = this()
  def profileKernel[T <: Tensor](name: String, f: js.Function0[T]): T = js.native
}

@js.native
@JSGlobal
class Logger extends js.Object {
  def logKernelProfile(name: String, result: Tensor, vals: TypedArray, timeMs: Double): Unit = js.native
}

}

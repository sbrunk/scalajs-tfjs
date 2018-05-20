package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Index extends js.Object {
  val setBackend: environment.Environment.setBackend.type = js.native
  val getBackend: environment.Environment.getBackend.type = js.native
  val disposeVariables: environment.Environment.disposeVariables.type = js.native
  val memory: environment.Environment.memory.type = js.native
  val nextFrame: BrowserUtil.nextFrame.type = js.native
}

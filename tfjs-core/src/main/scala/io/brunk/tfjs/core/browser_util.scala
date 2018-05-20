package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class BrowserUtil extends js.Object {
}

@js.native
@JSGlobal
object BrowserUtil extends js.Object {
  def nextFrame(): Promise[Unit] = js.native
}

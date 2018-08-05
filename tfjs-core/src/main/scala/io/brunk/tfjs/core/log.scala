package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

package log {

@js.native
@JSGlobalScope
object Log extends js.Object {
  def warn(msg: js.Any*): Unit = js.native
  def log(msg: js.Any*): Unit = js.native
}

}

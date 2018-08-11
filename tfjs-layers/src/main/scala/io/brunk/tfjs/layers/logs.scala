package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|


@js.native
@JSGlobalScope
object Logs extends js.Object {
  type UnresolvedLogs = js.Dictionary[Double | Scalar]
  def resolveScalarsInLogs(logs: UnresolvedLogs): Promise[Unit] = js.native
  def disposeTensorsInLogs(logs: UnresolvedLogs): Unit = js.native
  type Logs = js.Dictionary[Double]
}


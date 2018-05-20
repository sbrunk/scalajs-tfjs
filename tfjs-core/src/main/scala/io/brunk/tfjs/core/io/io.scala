package io.brunk.tfjs.core.io

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Io extends js.Object {
  val registerSaveRouter: IORouterRegistry.registerSaveRouter.type = js.native
  val registerLoadRouter: IORouterRegistry.registerLoadRouter.type = js.native
  val getSaveHandlers: IORouterRegistry.getSaveHandlers.type = js.native
  val getLoadHandlers: IORouterRegistry.getLoadHandlers.type = js.native
}

package io.brunk.tfjs.core.io

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class IORouterRegistry extends js.Object {
}

@js.native
@JSGlobal
object IORouterRegistry extends js.Object {
  def registerSaveRouter(saveRouter: IORouter): Unit = js.native
  def registerLoadRouter(loadRouter: IORouter): Unit = js.native
  def getSaveHandlers(url: String): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: String): js.Array[IOHandler] = js.native
}

@js.native
@JSGlobalScope
object Router_registry extends js.Object {
  type IORouter = js.Function1[String, IOHandler]
}

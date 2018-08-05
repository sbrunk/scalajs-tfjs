/*
 * Copyright 2017 Sören Brunk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.brunk.tfjs.core.io

import scala.scalajs.js
import js.annotation._
import js.|

package router_registry {

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

}

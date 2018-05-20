package io.brunk.tfjs.core.io

import scala.scalajs.js
import js.annotation._
import js.|

package browser_http {

@js.native
@JSGlobal
class BrowserHTTPRequest protected () extends IOHandler {
  def this(path: String, requestInit: RequestInit = ???) = this()
  protected def path: String = js.native
  protected def requestInit: RequestInit = js.native
  def DEFAULT_METHOD: String = js.native
  def save(modelArtifacts: ModelArtifacts): Promise[SaveResult] = js.native
}

@js.native
@JSGlobal
object BrowserHTTPRequest extends js.Object {
  def URL_SCHEMES: js.Array[String] = js.native
}

@js.native
@JSGlobalScope
object Browser_http extends js.Object {
  val httpRequestRouter: IORouter = js.native
  def browserHTTPRequest(path: String, requestInit: RequestInit = ???): IOHandler = js.native
}

}

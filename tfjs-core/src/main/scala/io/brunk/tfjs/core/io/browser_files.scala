package io.brunk.tfjs.core.io

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class BrowserDownloads protected () extends IOHandler {
  def this(fileNamePrefix: String = ???) = this()
  def save(modelArtifacts: ModelArtifacts): Promise[SaveResult] = js.native
}

@js.native
@JSGlobal
object BrowserDownloads extends js.Object {
  def URL_SCHEME: String = js.native
}

@js.native
@JSGlobalScope
object Browser_files extends js.Object {
  val browserDownloadsRouter: IORouter = js.native
  def browserDownloads(fileNamePrefix: String = ???): IOHandler = js.native
  def browserFiles(files: js.Array[File]): IOHandler = js.native
}

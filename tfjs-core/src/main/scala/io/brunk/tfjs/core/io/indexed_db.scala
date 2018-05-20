package io.brunk.tfjs.core.io

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class BrowserIndexedDB protected () extends IOHandler {
  def this(modelPath: String) = this()
  protected def indexedDB: IDBFactory = js.native
  protected def modelPath: String = js.native
  def save(modelArtifacts: ModelArtifacts): Promise[SaveResult] = js.native
  def load(): Promise[ModelArtifacts] = js.native
}

@js.native
@JSGlobal
object BrowserIndexedDB extends js.Object {
  def URL_SCHEME: String = js.native
}

@js.native
@JSGlobal
class BrowserIndexedDBManager extends ModelStoreManager {
  def listModels(): Promise[js.Dictionary[ModelArtifactsInfo]] = js.native
  def removeModel(path: String): Promise[ModelArtifactsInfo] = js.native
}

@js.native
@JSGlobalScope
object Indexed_db extends js.Object {
  def deleteDatabase(): Promise[Unit] = js.native
  val indexedDBRouter: IORouter = js.native
  def browserIndexedDB(modelPath: String): IOHandler = js.native
}

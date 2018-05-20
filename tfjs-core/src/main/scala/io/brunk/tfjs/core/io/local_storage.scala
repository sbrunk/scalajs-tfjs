package io.brunk.tfjs.core.io

import scala.scalajs.js
import js.annotation._
import js.|

package local_storage {

@js.native
@JSGlobal
class BrowserLocalStorage protected () extends IOHandler {
  def this(modelPath: String) = this()
  protected def LS: Storage = js.native
  protected def modelPath: String = js.native
  protected def keys: BrowserLocalStorage.Keys = js.native
  def save(modelArtifacts: ModelArtifacts): Promise[SaveResult] = js.native
  def load(): Promise[ModelArtifacts] = js.native
}

object BrowserLocalStorage {

@js.native
trait Keys extends js.Object {
  @JSBracketAccess
  def apply(key: String): String = js.native
  @JSBracketAccess
  def update(key: String, v: String): Unit = js.native
}
  def URL_SCHEME: String = js.native
}

@js.native
@JSGlobal
class BrowserLocalStorageManager extends ModelStoreManager {
  def listModels(): Promise[js.Dictionary[ModelArtifactsInfo]] = js.native
  def removeModel(path: String): Promise[ModelArtifactsInfo] = js.native
}

@js.native
@JSGlobalScope
object Local_storage extends js.Object {
  def purgeLocalStorageArtifacts(): js.Array[String] = js.native
  val localStorageRouter: IORouter = js.native
  def browserLocalStorage(modelPath: String): IOHandler = js.native
}

}

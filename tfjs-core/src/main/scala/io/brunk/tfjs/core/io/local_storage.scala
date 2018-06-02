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

import io.brunk.tfjs.core.io.Router_registry.IORouter
import org.scalajs.dom.Storage

import scala.scalajs.js
import js.annotation._
import js.{Promise, |}

@js.native
@JSGlobal
class BrowserLocalStorage protected () extends IOHandler {
  def this(modelPath: String) = this()
  protected def LS: Storage                                     = js.native
  protected def modelPath: String                               = js.native
  protected def keys: BrowserLocalStorage.Keys                  = js.native
  //def save(modelArtifacts: ModelArtifacts): Promise[SaveResult] = js.native
  //def load(): Promise[ModelArtifacts]                           = js.native
}

@js.native
@JSGlobal
object BrowserLocalStorage extends js.Object {

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
  def removeModel(path: String): Promise[ModelArtifactsInfo]   = js.native
}

@js.native
@JSGlobalScope
object Local_storage extends js.Object {
  def purgeLocalStorageArtifacts(): js.Array[String]    = js.native
  val localStorageRouter: IORouter                      = js.native
  def browserLocalStorage(modelPath: String): IOHandler = js.native
}

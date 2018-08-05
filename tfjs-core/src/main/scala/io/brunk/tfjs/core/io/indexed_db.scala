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

package indexed_db {

  @js.native
  @JSGlobal
  class BrowserIndexedDB protected () extends IOHandler {
    def this(modelPath: String) = this()
    protected def indexedDB: IDBFactory                           = js.native
    protected def modelPath: String                               = js.native
    def save(modelArtifacts: ModelArtifacts): Promise[SaveResult] = js.native
    def load(): Promise[ModelArtifacts]                           = js.native
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
    def removeModel(path: String): Promise[ModelArtifactsInfo]   = js.native
  }

  @js.native
  @JSGlobalScope
  object Indexed_db extends js.Object {
    def deleteDatabase(): Promise[Unit]                = js.native
    val indexedDBRouter: IORouter                      = js.native
    def browserIndexedDB(modelPath: String): IOHandler = js.native
  }

}

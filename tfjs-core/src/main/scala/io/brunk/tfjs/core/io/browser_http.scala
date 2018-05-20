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
import org.scalajs.dom.experimental.RequestInit

import scala.scalajs.js
import js.annotation._
import js.{ Promise, | }

@js.native
@JSGlobal
class BrowserHTTPRequest protected () extends IOHandler {
  def this(path: String, requestInit: RequestInit = ???) = this()
  protected def path: String                                    = js.native
  protected def requestInit: RequestInit                        = js.native
  def DEFAULT_METHOD: String                                    = js.native
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
  val httpRequestRouter: IORouter                                                 = js.native
  def browserHTTPRequest(path: String, requestInit: RequestInit = ???): IOHandler = js.native
}

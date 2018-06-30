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

package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|
import Engine.MemoryInfo
import kernels.KernelBackend

@js.native
sealed trait Type extends js.Object {}

@js.native
@JSGlobal
object Type extends js.Object {
  var NUMBER: Type  = js.native
  var BOOLEAN: Type = js.native
  var STRING: Type  = js.native
  @JSBracketAccess
  def apply(value: Type): String = js.native
}

@js.native
trait Features extends js.Object {
  var DEBUG: Boolean                                             = js.native
  var IS_BROWSER: Boolean                                        = js.native
  var IS_NODE: Boolean                                           = js.native
  var WEBGL_DISJOINT_QUERY_TIMER_EXTENSION_VERSION: Double       = js.native
  var WEBGL_DISJOINT_QUERY_TIMER_EXTENSION_RELIABLE: Boolean     = js.native
  var WEBGL_VERSION: Double                                      = js.native
  var WEBGL_RENDER_FLOAT32_ENABLED: Boolean                      = js.native
  var WEBGL_DOWNLOAD_FLOAT_ENABLED: Boolean                      = js.native
  var WEBGL_GET_BUFFER_SUB_DATA_ASYNC_EXTENSION_ENABLED: Boolean = js.native
  var BACKEND: String                                            = js.native
  var TEST_EPSILON: Double                                       = js.native
  var IS_CHROME: Boolean                                         = js.native
}

@js.native
trait URLProperty extends js.Object {
  var name: String = js.native
  var `type`: Type = js.native
}

@js.native
@JSGlobal
class Environment protected () extends js.Object {
  def this(features: Features = ???) = this()
  def get[K <: String](feature: K): js.Any              = js.native
  def getFeatures(): Features                           = js.native
  def set[K <: String](feature: K, value: js.Any): Unit = js.native
  def getBestBackendType(): String                      = js.native
  def setFeatures(features: Features): Unit             = js.native
  def reset(): Unit                                     = js.native
  def findBackend(name: String): KernelBackend          = js.native
  def registerBackend(
      name: String,
      factory: js.Function0[KernelBackend],
      priority: Double = ???
  ): Boolean                            = js.native
  def removeBackend(name: String): Unit = js.native
  def engine: Engine                    = js.native
}

@js.native
trait EnvironmentCompanion extends js.Object {
  def setBackend(backendType: String, safeMode: Boolean = ???): Unit = js.native
  def getBackend(): String                                           = js.native
  def disposeVariables(): Unit                                       = js.native
  def memory(): MemoryInfo                                           = js.native
}

@js.native
@JSImport("@tensorflow/tfjs-core", JSImport.Namespace)
object EnvironmentModule extends js.Object {
  val URL_PROPERTIES: js.Array[URLProperty] = js.native
  def ENV: Environment                      = js.native
  type Environment = _root_.io.brunk.tfjs.core.Environment
  type Type        = _root_.io.brunk.tfjs.core.Type
}

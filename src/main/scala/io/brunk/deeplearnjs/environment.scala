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

package io.brunk.deeplearnjs

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
sealed trait Type extends js.Object {}

@js.native
@JSGlobal
object Type extends js.Object {
  var NUMBER: Type  = js.native
  var BOOLEAN: Type = js.native
  @JSBracketAccess
  def apply(value: Type): String = js.native
}

@js.native
trait Features extends js.Object {
  var WEBGL_DISJOINT_QUERY_TIMER_EXTENSION_ENABLED: Boolean
  var WEBGL_DISJOINT_QUERY_TIMER_EXTENSION_RELIABLE: Boolean
  var WEBGL_VERSION: Double
  var WEBGL_FLOAT_TEXTURE_ENABLED: Boolean
}

@js.native
trait URLProperty extends js.Object {
  var name: String
  var `type`: Type
}

@js.native
@JSImport("deeplearn", "Environment")
class Environment protected () extends js.Object {
  def this(features: Features = ???) = this()
  def get[K <: String](feature: K): Boolean | Double = js.native
}

@js.native
@JSImport("deeplearn", "environment")
object Environment extends js.Object {
  val URL_PROPERTIES: js.Array[URLProperty]          = js.native
  def ENV: Environment                               = js.native
  def setEnvironment(environment: Environment): Unit = js.native
}

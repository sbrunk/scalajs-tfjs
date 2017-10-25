/*
 * Copyright (c) 2017 Sören Brunk
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
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
  var WEBGL_DISJOINT_QUERY_TIMER_EXTENSION_ENABLED: Boolean  = js.native
  var WEBGL_DISJOINT_QUERY_TIMER_EXTENSION_RELIABLE: Boolean = js.native
  var WEBGL_VERSION: Double                                  = js.native
  var WEBGL_FLOAT_TEXTURE_ENABLED: Boolean                   = js.native
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
  def get[K <: String](feature: K): Boolean | Double = js.native
}

@js.native
@JSGlobalScope
object Environment extends js.Object {
  val URL_PROPERTIES: js.Array[URLProperty]          = js.native
  def ENV: Environment                               = js.native
  def setEnvironment(environment: Environment): Unit = js.native
}

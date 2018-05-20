package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

package environment {

@js.native
sealed trait Type extends js.Object {
}

@js.native
@JSGlobal
object Type extends js.Object {
  var NUMBER: Type = js.native
  var BOOLEAN: Type = js.native
  var STRING: Type = js.native
  @JSBracketAccess
  def apply(value: Type): String = js.native
}

@js.native
trait Features extends js.Object {
  var DEBUG: Boolean = js.native
  var IS_BROWSER: Boolean = js.native
  var WEBGL_DISJOINT_QUERY_TIMER_EXTENSION_VERSION: Double = js.native
  var WEBGL_DISJOINT_QUERY_TIMER_EXTENSION_RELIABLE: Boolean = js.native
  var WEBGL_VERSION: Double = js.native
  var WEBGL_FLOAT_TEXTURE_ENABLED: Boolean = js.native
  var WEBGL_GET_BUFFER_SUB_DATA_ASYNC_EXTENSION_ENABLED: Boolean = js.native
  var BACKEND: String = js.native
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
  def get[K <: String](feature: K): js.Any = js.native
  def set[K <: String](feature: K, value: js.Any): Unit = js.native
  def getBestBackendType(): String = js.native
  def setFeatures(features: Features): Unit = js.native
  def reset(): Unit = js.native
  def findBackend(name: String): KernelBackend = js.native
  def registerBackend(name: String, factory: js.Function0[KernelBackend], priority: Double = ???): Boolean = js.native
  def removeBackend(name: String): Unit = js.native
  def engine: Engine = js.native
}

@js.native
@JSGlobal
object Environment extends js.Object {
  def setBackend(backendType: String, safeMode: Boolean = ???): Unit = js.native
  def getBackend(): String = js.native
  def disposeVariables(): Unit = js.native
  def memory(): MemoryInfo = js.native
}

@js.native
@JSGlobalScope
object Environment extends js.Object {
  val URL_PROPERTIES: js.Array[URLProperty] = js.native
  def ENV: Environment = js.native
}

}

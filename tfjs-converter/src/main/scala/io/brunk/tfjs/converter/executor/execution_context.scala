package io.brunk.tfjs.converter.executor

import scala.scalajs.js
import js.annotation._
import js.|

package execution_context {

@js.native
trait ExecutionContextInfo extends js.Object {
  var id: Double = js.native
  var frameName: String = js.native
  var iterationId: Double = js.native
}

@js.native
@JSGlobal
class ExecutionContext protected () extends js.Object {
  def this(weightMap: NamedTensorsMap) = this()
  var weightMap: NamedTensorsMap = js.native
  var currentContext: js.Array[ExecutionContextInfo] = js.native
  def currentContextId: String = js.native
  def currentContextIds: js.Array[String] = js.native
  def enterFrame(frameId: String): Unit = js.native
  def exitFrame(): Unit = js.native
  def nextIteration(): Unit = js.native
  def getWeight(name: String): js.Array[Tensor] = js.native
}

}

package io.brunk.tfjs.converter.executor

import scala.scalajs.js
import js.annotation._
import js.|

package graph_executor {

@js.native
@JSGlobal
class GraphExecutor protected () extends js.Object {
  def this(graph: Graph) = this()
  var weightMap: NamedTensorsMap = js.native
  def inputs: js.Array[TensorInfo] = js.native
  def outputs: js.Array[TensorInfo] = js.native
  def inputNodes: js.Array[String] = js.native
  def outputNodes: js.Array[String] = js.native
  def isControlFlowModel: Boolean = js.native
  def execute(inputs: NamedTensorsMap, outputs: String | js.Array[String] = ???): NamedTensorMap = js.native
  def executeAsync(inputs: NamedTensorsMap, outputs: String | js.Array[String] = ???): Promise[NamedTensorMap] = js.native
  def dispose(): Unit = js.native
}

}

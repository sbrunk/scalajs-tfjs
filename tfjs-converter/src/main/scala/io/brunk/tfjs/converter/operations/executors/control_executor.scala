package io.brunk.tfjs.converter.operations.executors

import scala.scalajs.js
import js.annotation._
import js.|

package control_executor {

@js.native
@JSGlobalScope
object Control_executor extends js.Object {
  def executeOp(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): Promise[js.Array[tfc.Tensor]] = js.native
  val CATEGORY: String = js.native
}

}

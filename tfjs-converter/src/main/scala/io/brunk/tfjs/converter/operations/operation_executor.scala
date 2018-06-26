package io.brunk.tfjs.converter.operations

import scala.scalajs.js
import js.annotation._
import js.|

package operation_executor {

@js.native
@JSGlobalScope
object Operation_executor extends js.Object {
  def executeOp(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): js.Array[tfc.Tensor] | Promise[js.Array[tfc.Tensor]] = js.native
}

}

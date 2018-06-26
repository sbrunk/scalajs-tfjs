package io.brunk.tfjs.converter.operations.executors

import scala.scalajs.js
import js.annotation._
import js.|

package types {

@js.native
trait OpExecutor extends js.Object {
  def apply(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): js.Array[tfc.Tensor] | Promise[js.Array[tfc.Tensor]] = js.native
}

}

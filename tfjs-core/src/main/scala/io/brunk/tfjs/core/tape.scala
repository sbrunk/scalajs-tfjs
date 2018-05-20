package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

package tape {

@js.native
trait TapeNode extends js.Object {
  var id: Double = js.native
  var name: String = js.native
  var output: Tensor = js.native
  var inputs: NamedTensorMap = js.native
  var gradient: js.Function1[Tensor | NamedTensorMap, NamedGradientMap] = js.native
}

@js.native
@JSGlobalScope
object Tape extends js.Object {
  type NamedGradientMap = js.Dictionary[js.Function0[Tensor]]
  def getFilteredNodesXToY(tape: js.Array[TapeNode], xs: js.Array[Tensor], y: Tensor): js.Array[TapeNode] = js.native
  def backpropagateGradients(tensorAccumulatedGradientMap: js.Any, filteredTape: js.Array[TapeNode]): Unit = js.native
}

}

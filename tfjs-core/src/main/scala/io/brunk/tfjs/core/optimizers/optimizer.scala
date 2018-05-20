package io.brunk.tfjs.core.optimizers

import scala.scalajs.js
import js.annotation._
import js.|

package optimizer {

@js.native
@JSGlobal
abstract class Optimizer extends Serializable {
  def minimize(f: js.Function0[Scalar], returnCost: Boolean = ???, varList: js.Array[Variable] = ???): Scalar | Null = js.native
  def computeGradients(f: js.Function0[Scalar], varList: js.Array[Variable] = ???): js.Any = js.native
  def applyGradients(variableGradients: NamedTensorMap): Unit
}

}

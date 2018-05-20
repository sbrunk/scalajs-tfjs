package io.brunk.tfjs.core.optimizers

import scala.scalajs.js
import js.annotation._
import js.|

package rmsprop_optimizer {

@js.native
@JSGlobal
class RMSPropOptimizer protected () extends Optimizer {
  def this(learningRate: Double, decay: Double = ???, momentum: Double = ???, epsilon: Double = ???, centered: Boolean = ???) = this()
  protected var learningRate: Double = js.native
  protected var decay: Double = js.native
  protected var momentum: Double = js.native
  protected var epsilon: Double = js.native
  def applyGradients(variableGradients: NamedVariableMap): Unit = js.native
  def dispose(): Unit = js.native
  def getConfig(): ConfigDict = js.native
}

@js.native
@JSGlobal
object RMSPropOptimizer extends js.Object {
  var className: String = js.native
  def fromConfig[T <: Serializable](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

}

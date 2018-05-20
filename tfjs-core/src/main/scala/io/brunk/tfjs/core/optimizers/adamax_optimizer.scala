package io.brunk.tfjs.core.optimizers

import scala.scalajs.js
import js.annotation._
import js.|

package adamax_optimizer {

@js.native
@JSGlobal
class AdamaxOptimizer protected () extends Optimizer {
  def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double = ???, decay: Double = ???) = this()
  protected var learningRate: Double = js.native
  protected var beta1: Double = js.native
  protected var beta2: Double = js.native
  protected var epsilon: Double = js.native
  protected var decay: Double = js.native
  def applyGradients(variableGradients: NamedVariableMap): Unit = js.native
  def dispose(): Unit = js.native
  def getConfig(): ConfigDict = js.native
}

@js.native
@JSGlobal
object AdamaxOptimizer extends js.Object {
  var className: String = js.native
  def fromConfig[T <: Serializable](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

}

package io.brunk.tfjs.core.optimizers

import scala.scalajs.js
import js.annotation._
import js.|

package momentum_optimizer {

@js.native
@JSGlobal
class MomentumOptimizer protected () extends SGDOptimizer {
  def this(learningRate: Double, momentum: Double, useNesterov: Boolean = ???) = this()
  protected var learningRate: Double = js.native
  def applyGradients(variableGradients: NamedVariableMap): Unit = js.native
  def dispose(): Unit = js.native
  def setMomentum(momentum: Double): Unit = js.native
  def getConfig(): ConfigDict = js.native
}

@js.native
@JSGlobal
object MomentumOptimizer extends js.Object {
  var className: String = js.native
  def fromConfig[T <: Serializable](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

}

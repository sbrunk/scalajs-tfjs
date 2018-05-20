package io.brunk.tfjs.core.optimizers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class AdadeltaOptimizer protected () extends Optimizer {
  def this(learningRate: Double, rho: Double, epsilon: Double = ???) = this()
  protected var learningRate: Double = js.native
  protected var rho: Double = js.native
  protected var epsilon: Double = js.native
  def applyGradients(variableGradients: NamedVariableMap): Unit = js.native
  def dispose(): Unit = js.native
  def getConfig(): ConfigDict = js.native
}

@js.native
@JSGlobal
object AdadeltaOptimizer extends js.Object {
  var className: String = js.native
  def fromConfig[T <: Serializable](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

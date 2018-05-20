package io.brunk.tfjs.core.optimizers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class SGDOptimizer protected () extends Optimizer {
  def this(learningRate: Double) = this()
  protected var learningRate: Double = js.native
  protected var c: Scalar = js.native
  def applyGradients(variableGradients: NamedTensorMap): Unit = js.native
  def setLearningRate(learningRate: Double): Unit = js.native
  def dispose(): Unit = js.native
  def getConfig(): ConfigDict = js.native
}

@js.native
@JSGlobal
object SGDOptimizer extends js.Object {
  var className: String = js.native
  def fromConfig[T <: Serializable](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

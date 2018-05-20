package io.brunk.tfjs.core.optimizers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class OptimizerConstructors extends js.Object {
}

@js.native
@JSGlobal
object OptimizerConstructors extends js.Object {
  def sgd(learningRate: Double): SGDOptimizer = js.native
  def momentum(learningRate: Double, momentum: Double, useNesterov: Boolean = ???): MomentumOptimizer = js.native
  def rmsprop(learningRate: Double, decay: Double = ???, momentum: Double = ???, epsilon: Double = ???, centered: Boolean = ???): RMSPropOptimizer = js.native
  def adam(learningRate: Double = ???, beta1: Double = ???, beta2: Double = ???, epsilon: Double = ???): AdamOptimizer = js.native
  def adadelta(learningRate: Double = ???, rho: Double = ???, epsilon: Double = ???): AdadeltaOptimizer = js.native
  def adamax(learningRate: Double = ???, beta1: Double = ???, beta2: Double = ???, epsilon: Double = ???, decay: Double = ???): AdamaxOptimizer = js.native
  def adagrad(learningRate: Double, initialAccumulatorValue: Double = ???): AdagradOptimizer = js.native
}

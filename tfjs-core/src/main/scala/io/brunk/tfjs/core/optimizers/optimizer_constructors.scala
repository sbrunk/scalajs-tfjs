/*
 * Copyright 2017 Sören Brunk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.brunk.tfjs.core.optimizers

import scala.scalajs.js
import js.annotation._
import js.|

package optimizer_constructors {

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

}

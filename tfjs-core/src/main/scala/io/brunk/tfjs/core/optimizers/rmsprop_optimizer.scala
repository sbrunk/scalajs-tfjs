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

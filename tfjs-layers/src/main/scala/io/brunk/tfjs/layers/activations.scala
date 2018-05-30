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

package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
abstract class Activation extends serialization.Serializable {
  @JSName("apply")
  def apply(tensor: Tensor, axis: Double = ???): Tensor
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
class Elu extends Activation {
  @JSName("apply")
  def apply(x: Tensor, alpha: Double = ???): Tensor = js.native
}

@js.native
@JSGlobal
object Elu extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Selu extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Selu extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Relu extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Relu extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Relu6 extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Relu6 extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Linear extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Linear extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Sigmoid extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Sigmoid extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class HardSigmoid extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object HardSigmoid extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Softplus extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Softplus extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Softsign extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Softsign extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Tanh extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Tanh extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Softmax extends Activation {
  @JSName("apply")
  def apply(x: Tensor, axis: Double = ???): Tensor = js.native
}

@js.native
@JSGlobal
object Softmax extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobalScope
object Activations extends js.Object {
  type ActivationIdentifier = String
  def serializeActivation(activation: Activation): String = js.native
  def deserializeActivation(config: serialization.ConfigDict, customObjects: serialization.ConfigDict = ???): Activation = js.native
  def getActivation(identifier: ActivationIdentifier | serialization.ConfigDict | Activation): Activation = js.native
}

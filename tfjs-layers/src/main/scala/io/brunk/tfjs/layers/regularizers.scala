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

import io.brunk.tfjs.core.serialization
import io.brunk.tfjs.core.TensorModule.{ Scalar, TensorND }

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
abstract class Regularizer extends serialization.Serializable {
  @JSName("apply")
  def apply(x: TensorND): Scalar
}

@js.native
trait L1L2Config extends js.Object {
  var l1: Double = js.native
  var l2: Double = js.native
}

@js.native
trait L1Config extends js.Object {
  var l1: Double = js.native
}

@js.native
trait L2Config extends js.Object {
  var l2: Double = js.native
}

@js.native
@JSGlobal
class L1L2 protected () extends Regularizer {
  def this(config: L1L2Config = ???) = this()
  @JSName("apply")
  def apply(x: TensorND): Scalar            = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object L1L2 extends js.Object {
  var className: String = js.native
  def fromConfig[T <: serialization.Serializable](
      cls: serialization.SerializableConstructor[T],
      config: serialization.ConfigDict
  ): T = js.native
}

@js.native
@JSGlobalScope
object Regularizers extends js.Object {
  def l1(config: L1Config = ???): L1L2 = js.native
  def l2(config: L2Config): L1L2       = js.native
  type RegularizerIdentifier = String
  def serializeRegularizer(constraint: Regularizer): serialization.ConfigDictValue = js.native
  def deserializeRegularizer(
      config: serialization.ConfigDict,
      customObjects: serialization.ConfigDict = ???
  ): Regularizer = js.native
  def getRegularizer(
      identifier: RegularizerIdentifier | serialization.ConfigDict | Regularizer
  ): Regularizer = js.native
}

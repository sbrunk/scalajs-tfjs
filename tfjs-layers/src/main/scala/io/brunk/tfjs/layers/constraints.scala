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

import scala.scalajs.js
import js.annotation._
import js.|
import io.brunk.tfjs.tf.TensorND

@js.native
@JSGlobal
abstract class Constraint extends serialization.Serializable {
  @JSName("apply")
  def apply(w: TensorND): TensorND
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
trait MaxNormConfig extends js.Object {
  var maxValue: Double = js.native
  var axis: Double     = js.native
}

@js.native
@JSGlobal
class MaxNorm protected () extends Constraint {
  def this(config: MaxNormConfig) = this()
  @JSName("apply")
  def apply(w: TensorND): TensorND                   = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object MaxNorm extends js.Object {
  def className: String = js.native
}

@js.native
trait UnitNormConfig extends js.Object {
  var axis: Double = js.native
}

@js.native
@JSGlobal
class UnitNorm protected () extends Constraint {
  def this(config: UnitNormConfig) = this()
  @JSName("apply")
  def apply(w: TensorND): TensorND                   = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object UnitNorm extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class NonNeg extends Constraint {
  @JSName("apply")
  def apply(w: TensorND): TensorND = js.native
}

@js.native
@JSGlobal
object NonNeg extends js.Object {
  def className: String = js.native
}

@js.native
trait MinMaxNormConfig extends js.Object {
  var minValue: Double = js.native
  var maxValue: Double = js.native
  var axis: Double     = js.native
  var rate: Double     = js.native
}

@js.native
@JSGlobal
class MinMaxNorm protected () extends Constraint {
  def this(config: MinMaxNormConfig) = this()
  @JSName("apply")
  def apply(w: TensorND): TensorND                   = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object MinMaxNorm extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobalScope
object Constraints extends js.Object {
  type ConstraintIdentifier = String
  def serializeConstraint(constraint: Constraint): serialization.ConfigDictValue = js.native
  def deserializeConstraint(
      config: serialization.ConfigDict,
      customObjects: serialization.ConfigDict = ???
  ): Constraint = js.native
  def getConstraint(
      identifier: ConstraintIdentifier | serialization.ConfigDict | Constraint
  ): Constraint = js.native
}

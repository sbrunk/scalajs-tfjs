package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
abstract class Constraint extends serialization.Serializable {
  @JSName("apply")
  def apply(w: Tensor): Tensor
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
trait MaxNormConfig extends js.Object {
  var maxValue: Double = js.native
  var axis: Double = js.native
}

@js.native
@JSGlobal
class MaxNorm protected () extends Constraint {
  def this(config: MaxNormConfig) = this()
  @JSName("apply")
  def apply(w: Tensor): Tensor = js.native
  def getConfig(): serialization.ConfigDict = js.native
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
  def apply(w: Tensor): Tensor = js.native
  def getConfig(): serialization.ConfigDict = js.native
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
  def apply(w: Tensor): Tensor = js.native
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
  var axis: Double = js.native
  var rate: Double = js.native
}

@js.native
@JSGlobal
class MinMaxNorm protected () extends Constraint {
  def this(config: MinMaxNormConfig) = this()
  @JSName("apply")
  def apply(w: Tensor): Tensor = js.native
  def getConfig(): serialization.ConfigDict = js.native
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
  def deserializeConstraint(config: serialization.ConfigDict, customObjects: serialization.ConfigDict = ???): Constraint = js.native
  def getConstraint(identifier: ConstraintIdentifier | serialization.ConfigDict | Constraint): Constraint = js.native
}

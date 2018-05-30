package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
abstract class Regularizer extends serialization.Serializable {
  @JSName("apply")
  def apply(x: Tensor): Scalar
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
  def apply(x: Tensor): Scalar = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object L1L2 extends js.Object {
  var className: String = js.native
  def fromConfig[T <: serialization.Serializable](cls: serialization.SerializableConstructor[T], config: serialization.ConfigDict): T = js.native
}

@js.native
@JSGlobalScope
object Regularizers extends js.Object {
  def l1(config: L1Config = ???): L1L2 = js.native
  def l2(config: L2Config): L1L2 = js.native
  type RegularizerIdentifier = String
  def serializeRegularizer(constraint: Regularizer): serialization.ConfigDictValue = js.native
  def deserializeRegularizer(config: serialization.ConfigDict, customObjects: serialization.ConfigDict = ???): Regularizer = js.native
  def getRegularizer(identifier: RegularizerIdentifier | serialization.ConfigDict | Regularizer): Regularizer = js.native
}

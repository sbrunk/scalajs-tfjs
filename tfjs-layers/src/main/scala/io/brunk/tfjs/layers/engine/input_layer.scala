package io.brunk.tfjs.layers.engine

import scala.scalajs.js
import js.annotation._
import js.|


@js.native
trait InputLayerConfig extends js.Object {
  var inputShape: Shape = js.native
  var batchSize: Double = js.native
  var batchInputShape: Shape = js.native
  var dtype: DataType = js.native
  var sparse: Boolean = js.native
  var name: String = js.native
}

@js.native
@JSGlobal
class InputLayer protected () extends Layer {
  def this(config: InputLayerConfig) = this()
  var sparse: Boolean = js.native
  @JSName("apply")
  def apply(inputs: Tensor | js.Array[Tensor] | SymbolicTensor | js.Array[SymbolicTensor], kwargs: Kwargs = ???): Tensor | js.Array[Tensor] | SymbolicTensor = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object InputLayer extends js.Object {
  def className: String = js.native
}

@js.native
trait InputConfig extends js.Object {
  var shape: Shape = js.native
  var batchShape: Shape = js.native
  var name: String = js.native
  var dtype: DataType = js.native
  var sparse: Boolean = js.native
}

@js.native
@JSGlobalScope
object Input_layer extends js.Object {
  def Input(config: InputConfig): SymbolicTensor = js.native
}


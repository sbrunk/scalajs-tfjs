package io.brunk.tfjs.layers.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
abstract class Merge protected () extends Layer {
  def this(config: LayerConfig = ???) = this()
  protected var reshapeRequired: Boolean = js.native
  def mergeFunction(inputs: js.Array[Tensor]): Tensor = js.native
  def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
}

@js.native
@JSGlobal
class Add protected () extends Merge {
  def this(config: LayerConfig = ???) = this()
  def mergeFunction(inputs: js.Array[Tensor]): Tensor = js.native
}

@js.native
@JSGlobal
object Add extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class Multiply protected () extends Merge {
  def this(config: LayerConfig = ???) = this()
  def mergeFunction(inputs: js.Array[Tensor]): Tensor = js.native
}

@js.native
@JSGlobal
object Multiply extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class Average protected () extends Merge {
  def this(config: LayerConfig = ???) = this()
  def mergeFunction(inputs: js.Array[Tensor]): Tensor = js.native
}

@js.native
@JSGlobal
object Average extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class Maximum protected () extends Merge {
  def this(config: LayerConfig = ???) = this()
  def mergeFunction(inputs: js.Array[Tensor]): Tensor = js.native
}

@js.native
@JSGlobal
object Maximum extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class Minimum protected () extends Merge {
  def this(config: LayerConfig = ???) = this()
  def mergeFunction(inputs: js.Array[Tensor]): Tensor = js.native
}

@js.native
@JSGlobal
object Minimum extends js.Object {
  var className: String = js.native
}

@js.native
trait ConcatenateLayerConfig extends LayerConfig {
  var axis: Double = js.native
}

@js.native
@JSGlobal
class Concatenate protected () extends Merge {
  def this(config: ConcatenateLayerConfig = ???) = this()
  def DEFAULT_AXIS: Double = js.native
  def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  def mergeFunction(inputs: js.Array[Tensor]): Tensor = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
}

@js.native
@JSGlobal
object Concatenate extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobalScope
object Merge extends js.Object {
  def add(config: js.Array[SymbolicTensor] | js.Array[Tensor] | LayerConfig = ???): Layer | SymbolicTensor | Tensor = js.native
  def multiply(config: js.Array[SymbolicTensor] | js.Array[Tensor] | LayerConfig = ???): Layer | SymbolicTensor | Tensor = js.native
  def average(config: js.Array[SymbolicTensor] | js.Array[Tensor] | LayerConfig = ???): Layer | SymbolicTensor | Tensor = js.native
  def maximum(config: js.Array[SymbolicTensor] | js.Array[Tensor] | LayerConfig = ???): Layer | SymbolicTensor | Tensor = js.native
  def minimum(config: js.Array[SymbolicTensor] | js.Array[Tensor] | LayerConfig = ???): Layer | SymbolicTensor | Tensor = js.native
  def concatenate(config: js.Array[SymbolicTensor] | js.Array[Tensor] | ConcatenateLayerConfig = ???): Layer | SymbolicTensor | Tensor = js.native
}

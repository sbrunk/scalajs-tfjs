package io.brunk.tfjs.layers.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait LeakyReLULayerConfig extends LayerConfig {
  var alpha: Double = js.native
}

@js.native
@JSGlobal
class LeakyReLU protected () extends Layer {
  def this(config: LeakyReLULayerConfig = ???) = this()
  def alpha: Double = js.native
  def DEFAULT_ALPHA: Double = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object LeakyReLU extends js.Object {
  var className: String = js.native
}

@js.native
trait ELULayerConfig extends LayerConfig {
  var alpha: Double = js.native
}

@js.native
@JSGlobal
class ELU protected () extends Layer {
  def this(config: ELULayerConfig = ???) = this()
  def alpha: Double = js.native
  def DEFAULT_ALPHA: Double = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object ELU extends js.Object {
  var className: String = js.native
}

@js.native
trait ThresholdedReLULayerConfig extends LayerConfig {
  var theta: Double = js.native
}

@js.native
@JSGlobal
class ThresholdedReLU protected () extends Layer {
  def this(config: ThresholdedReLULayerConfig = ???) = this()
  def theta: Double = js.native
  def DEFAULT_THETA: Double = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object ThresholdedReLU extends js.Object {
  var className: String = js.native
}

@js.native
trait SoftmaxLayerConfig extends LayerConfig {
  var axis: Double = js.native
}

@js.native
@JSGlobal
class Softmax protected () extends Layer {
  def this(config: SoftmaxLayerConfig = ???) = this()
  def axis: Double = js.native
  def softmax: js.Function2[Tensor, Double, Tensor] = js.native
  def DEFAULT_AXIS: Double = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Softmax extends js.Object {
  var className: String = js.native
}

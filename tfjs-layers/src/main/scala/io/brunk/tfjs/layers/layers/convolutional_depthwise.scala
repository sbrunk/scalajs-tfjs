package io.brunk.tfjs.layers.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait DepthwiseConv2DLayerConfig extends BaseConvLayerConfig {
  var kernelSize: Double | js.Tuple2[Double, Double] = js.native
  var depthMultiplier: Double = js.native
  var depthwiseInitializer: InitializerIdentifier | Initializer = js.native
  var depthwiseConstraint: ConstraintIdentifier | Constraint = js.native
  var depthwiseRegularizer: RegularizerIdentifier | Regularizer = js.native
}

@js.native
@JSGlobal
class DepthwiseConv2D protected () extends Conv2D {
  def this(config: DepthwiseConv2DLayerConfig) = this()
  def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
}

@js.native
@JSGlobal
object DepthwiseConv2D extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobalScope
object Convolutional_depthwise extends js.Object {
  def depthwiseConv2d(x: Tensor, depthwiseKernel: Tensor, strides: js.Tuple2[Double, Double] = ???, padding: String = ???, dataFormat: DataFormat = ???, dilationRate: js.Tuple2[Double, Double] = ???): Tensor = js.native
}

package io.brunk.tfjs.layers.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait BaseConvLayerConfig extends LayerConfig {
  var kernelSize: Double | js.Array[Double] = js.native
  var strides: Double | js.Array[Double] = js.native
  var padding: PaddingMode = js.native
  var dataFormat: DataFormat = js.native
  var dilationRate: Double | js.Tuple1[Double] | js.Tuple2[Double, Double] = js.native
  var activation: String = js.native
  var useBias: Boolean = js.native
  var kernelInitializer: InitializerIdentifier | Initializer = js.native
  var biasInitializer: InitializerIdentifier | Initializer = js.native
  var kernelConstraint: ConstraintIdentifier | Constraint = js.native
  var biasConstraint: ConstraintIdentifier | Constraint = js.native
  var kernelRegularizer: RegularizerIdentifier | Regularizer = js.native
  var biasRegularizer: RegularizerIdentifier | Regularizer = js.native
  var activityRegularizer: RegularizerIdentifier | Regularizer = js.native
}

@js.native
trait ConvLayerConfig extends BaseConvLayerConfig {
  var filters: Double = js.native
}

@js.native
@JSGlobal
abstract class Conv protected () extends Layer {
  def this(rank: Double, config: ConvLayerConfig) = this()
  protected def rank: Double = js.native
  protected def filters: Double = js.native
  protected def kernelSize: js.Array[Double] = js.native
  protected def strides: js.Array[Double] = js.native
  protected def padding: PaddingMode = js.native
  protected def dataFormat: DataFormat = js.native
  protected def dilationRate: Double | js.Tuple1[Double] | js.Tuple2[Double, Double] = js.native
  protected def activation: Activation = js.native
  protected def useBias: Boolean = js.native
  protected def kernelInitializer: Initializer = js.native
  protected def biasInitializer: Initializer = js.native
  protected def kernelConstraint: Constraint = js.native
  protected def biasConstraint: Constraint = js.native
  protected def kernelRegularizer: Regularizer = js.native
  protected def biasRegularizer: Regularizer = js.native
  protected var kernel: LayerVariable = js.native
  protected var bias: LayerVariable = js.native
  def DEFAULT_KERNEL_INITIALIZER: InitializerIdentifier = js.native
  def DEFAULT_BIAS_INITIALIZER: InitializerIdentifier = js.native
  def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
class Conv2D protected () extends Conv {
  def this(config: ConvLayerConfig) = this()
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Conv2D extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class Conv2DTranspose protected () extends Conv2D {
  def this(config: ConvLayerConfig) = this()
  var inputSpec: js.Array[InputSpec] = js.native
  def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Conv2DTranspose extends js.Object {
  var className: String = js.native
}

@js.native
trait SeparableConvLayerConfig extends ConvLayerConfig {
  var depthMultiplier: Double = js.native
  var depthwiseInitializer: InitializerIdentifier | Initializer = js.native
  var pointwiseInitializer: InitializerIdentifier | Initializer = js.native
  var depthwiseRegularizer: RegularizerIdentifier | Regularizer = js.native
  var pointwiseRegularizer: RegularizerIdentifier | Regularizer = js.native
  var depthwiseConstraint: ConstraintIdentifier | Constraint = js.native
  var pointwiseConstraint: ConstraintIdentifier | Constraint = js.native
}

@js.native
@JSGlobal
class SeparableConv protected () extends Conv {
  def this(rank: Double, config: SeparableConvLayerConfig = ???) = this()
  def depthMultiplier: Double = js.native
  protected def depthwiseInitializer: Initializer = js.native
  protected def depthwiseRegularizer: Regularizer = js.native
  protected def depthwiseConstraint: Constraint = js.native
  protected def pointwiseInitializer: Initializer = js.native
  protected def pointwiseRegularizer: Regularizer = js.native
  protected def pointwiseConstraint: Constraint = js.native
  def DEFAULT_DEPTHWISE_INITIALIZER: InitializerIdentifier = js.native
  def DEFAULT_POINTWISE_INITIALIZER: InitializerIdentifier = js.native
  protected var depthwiseKernel: LayerVariable = js.native
  protected var pointwiseKernel: LayerVariable = js.native
  def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object SeparableConv extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class SeparableConv2D protected () extends SeparableConv {
  def this(config: SeparableConvLayerConfig = ???) = this()
}

@js.native
@JSGlobal
object SeparableConv2D extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class Conv1D protected () extends Conv {
  def this(config: ConvLayerConfig) = this()
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Conv1D extends js.Object {
  var className: String = js.native
}

@js.native
trait Cropping2DLayerConfig extends LayerConfig {
  var cropping: Double | js.Tuple2[Double, Double] | js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  var dataFormat: DataFormat = js.native
}

@js.native
@JSGlobal
class Cropping2D protected () extends Layer {
  def this(config: Cropping2DLayerConfig) = this()
  protected def cropping: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  protected def dataFormat: DataFormat = js.native
  def computeOutputShape(inputShape: Shape): Shape = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Cropping2D extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobalScope
object Convolutional extends js.Object {
  def preprocessConv2DInput(x: Tensor, dataFormat: DataFormat): Tensor = js.native
  def conv1dWithBias(x: Tensor, kernel: Tensor, bias: Tensor, strides: Double = ???, padding: String = ???, dataFormat: DataFormat = ???, dilationRate: Double = ???): Tensor = js.native
  def conv1d(x: Tensor, kernel: Tensor, strides: Double = ???, padding: String = ???, dataFormat: DataFormat = ???, dilationRate: Double = ???): Tensor = js.native
  def conv2d(x: Tensor, kernel: Tensor, strides: js.Array[Double] = ???, padding: String = ???, dataFormat: DataFormat = ???, dilationRate: js.Tuple2[Double, Double] = ???): Tensor = js.native
  def conv2dWithBias(x: Tensor, kernel: Tensor, bias: Tensor, strides: js.Array[Double] = ???, padding: String = ???, dataFormat: DataFormat = ???, dilationRate: js.Tuple2[Double, Double] = ???): Tensor = js.native
}

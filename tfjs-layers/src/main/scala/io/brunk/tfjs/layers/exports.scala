package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class ModelExports extends js.Object {
}

@js.native
@JSGlobal
object ModelExports extends js.Object {
  def model(config: ContainerConfig): Model = js.native
  def sequential(config: SequentialConfig = ???): Sequential = js.native
  def loadModel(pathOrIOHandler: String | io.IOHandler): Promise[Model] = js.native
  def input(config: InputConfig): SymbolicTensor = js.native
}

@js.native
@JSGlobal
class LayerExports extends js.Object {
}

@js.native
@JSGlobal
object LayerExports extends js.Object {
  var Layer: Layer.type = js.native
  var RNN: RNN.type = js.native
  var RNNCell: RNNCell.type = js.native
  def inputLayer(config: InputLayerConfig): Layer = js.native
  var input: ModelExports.input.type = js.native
  def elu(config: ELULayerConfig = ???): Layer = js.native
  def leakyReLU(config: LeakyReLULayerConfig = ???): Layer = js.native
  def softmax(config: SoftmaxLayerConfig = ???): Layer = js.native
  def thresholdedReLU(config: ThresholdedReLULayerConfig = ???): Layer = js.native
  def conv1d(config: ConvLayerConfig): Layer = js.native
  def conv2d(config: ConvLayerConfig): Layer = js.native
  def conv2dTranspose(config: ConvLayerConfig): Layer = js.native
  def separableConv2d(config: SeparableConvLayerConfig): Layer = js.native
  def cropping2D(config: Cropping2DLayerConfig): Layer = js.native
  def depthwiseConv2d(config: DepthwiseConv2DLayerConfig): Layer = js.native
  def activation(config: ActivationLayerConfig): Layer = js.native
  def dense(config: DenseLayerConfig): Layer = js.native
  def dropout(config: DropoutLayerConfig): Layer = js.native
  def flatten(config: LayerConfig = ???): Layer = js.native
  def repeatVector(config: RepeatVectorLayerConfig): Layer = js.native
  def reshape(config: ReshapeLayerConfig): Layer = js.native
  def embedding(config: EmbeddingLayerConfig): Layer = js.native
  def add(config: LayerConfig = ???): Layer = js.native
  def average(config: LayerConfig = ???): Layer = js.native
  def concatenate(config: ConcatenateLayerConfig = ???): Layer = js.native
  def maximum(config: LayerConfig = ???): Layer = js.native
  def minimum(config: LayerConfig = ???): Layer = js.native
  def multiply(config: LayerConfig = ???): Layer = js.native
  def batchNormalization(config: BatchNormalizationLayerConfig): Layer = js.native
  def zeroPadding2d(config: ZeroPadding2DLayerConfig = ???): Layer = js.native
  def averagePooling1d(config: Pooling1DLayerConfig): Layer = js.native
  def avgPool1d(config: Pooling1DLayerConfig): Layer = js.native
  def avgPooling1d(config: Pooling1DLayerConfig): Layer = js.native
  def averagePooling2d(config: Pooling2DLayerConfig): Layer = js.native
  def avgPool2d(config: Pooling2DLayerConfig): Layer = js.native
  def avgPooling2d(config: Pooling2DLayerConfig): Layer = js.native
  def globalAveragePooling1d(config: LayerConfig): Layer = js.native
  def globalAveragePooling2d(config: GlobalPooling2DLayerConfig): Layer = js.native
  def globalMaxPooling1d(config: LayerConfig): Layer = js.native
  def globalMaxPooling2d(config: GlobalPooling2DLayerConfig): Layer = js.native
  def maxPooling1d(config: Pooling1DLayerConfig): Layer = js.native
  def maxPooling2d(config: Pooling2DLayerConfig): Layer = js.native
  def gru(config: GRULayerConfig): Layer = js.native
  def gruCell(config: GRUCellLayerConfig): RNNCell = js.native
  def lstm(config: LSTMLayerConfig): Layer = js.native
  def lstmCell(config: LSTMCellLayerConfig): RNNCell = js.native
  def simpleRNN(config: SimpleRNNLayerConfig): Layer = js.native
  def simpleRNNCell(config: SimpleRNNCellLayerConfig): RNNCell = js.native
  def rnn(config: RNNLayerConfig): Layer = js.native
  def stackedRNNCells(config: StackedRNNCellsConfig): RNNCell = js.native
  def bidirectional(config: BidirectionalLayerConfig): Wrapper = js.native
  def timeDistributed(config: WrapperLayerConfig): Layer = js.native
}

@js.native
@JSGlobal
class ConstraintExports extends js.Object {
}

@js.native
@JSGlobal
object ConstraintExports extends js.Object {
  def maxNorm(config: MaxNormConfig): Constraint = js.native
  def unitNorm(config: UnitNormConfig): Constraint = js.native
  def nonNeg(): Constraint = js.native
  def minMaxNorm(config: MinMaxNormConfig): Constraint = js.native
}

@js.native
@JSGlobal
class InitializerExports extends js.Object {
}

@js.native
@JSGlobal
object InitializerExports extends js.Object {
  def zeros(): Zeros = js.native
  def ones(): Initializer = js.native
  def constant(config: ConstantConfig): Initializer = js.native
  def randomUniform(config: RandomUniformConfig): Initializer = js.native
  def randomNormal(config: RandomNormalConfig): Initializer = js.native
  def truncatedNormal(config: TruncatedNormalConfig): Initializer = js.native
  def identity(config: IdentityConfig): Initializer = js.native
  def varianceScaling(config: VarianceScalingConfig): Initializer = js.native
  def glorotUniform(config: SeedOnlyInitializerConfig): Initializer = js.native
  def glorotNormal(config: SeedOnlyInitializerConfig): Initializer = js.native
  def heNormal(config: SeedOnlyInitializerConfig): Initializer = js.native
  def leCunNormal(config: SeedOnlyInitializerConfig): Initializer = js.native
  def orthogonal(config: OrthogonalConfig): Initializer = js.native
}

@js.native
@JSGlobal
class MetricExports extends js.Object {
  def meanAbsoluteError(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def meanAbsolutePercentageError(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def MAPE(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def mape(yTrue: Tensor, yPred: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object MetricExports extends js.Object {
  def binaryAccuracy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def binaryCrossentropy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def categoricalAccuracy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def categoricalCrossentropy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def cosineProximity(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def meanSquaredError(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def MSE(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def mse(yTrue: Tensor, yPred: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
class RegularizerExports extends js.Object {
}

@js.native
@JSGlobal
object RegularizerExports extends js.Object {
  def l1l2(config: L1L2Config = ???): Regularizer = js.native
  def l1(config: L1Config = ???): Regularizer = js.native
  def l2(config: L2Config = ???): Regularizer = js.native
}

package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|


@js.native
@JSGlobalScope
object Exports_layers extends js.Object {
  def inputLayer(config: InputLayerConfig): Layer = js.native
  def elu(config: ELULayerConfig = ???): Layer = js.native
  def leakyReLU(config: LeakyReLULayerConfig = ???): Layer = js.native
  def softmax(config: SoftmaxLayerConfig = ???): Layer = js.native
  def thresholdedReLU(config: ThresholdedReLULayerConfig = ???): Layer = js.native
  def conv1d(config: ConvLayerConfig): Layer = js.native
  def conv2d(config: ConvLayerConfig): Layer = js.native
  def conv2dTranspose(config: ConvLayerConfig): Layer = js.native
  def separableConv2d(config: SeparableConvLayerConfig): Layer = js.native
  def cropping2D(config: Cropping2DLayerConfig): Layer = js.native
  def upSampling2d(config: UpSampling2DLayerConfig): Layer = js.native
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
  val globalMaxPool1d: globalMaxPooling1d.type = js.native
  val globalMaxPool2d: globalMaxPooling2d.type = js.native
  val maxPool1d: maxPooling1d.type = js.native
  val maxPool2d: maxPooling2d.type = js.native
}

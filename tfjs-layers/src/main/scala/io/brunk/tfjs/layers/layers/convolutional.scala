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

package io.brunk.tfjs.layers.layers

import io.brunk.tfjs.core.serialization
import io.brunk.tfjs.layers.Common.{ DataFormat, PaddingMode }
import io.brunk.tfjs.layers.Constraints.ConstraintIdentifier
import io.brunk.tfjs.layers.{ Constraint, Initializer, LayerVariable, Regularizer }
import io.brunk.tfjs.layers.Initializers.InitializerIdentifier
import io.brunk.tfjs.layers.Regularizers.RegularizerIdentifier
import io.brunk.tfjs.layers.Types.{ Kwargs, Shape }
import io.brunk.tfjs.layers.engine.{ InputSpec, Layer, LayerConfig }

import scala.scalajs.js
import js.annotation._
import js.|
import io.brunk.tfjs.tf.TensorND

@js.native
trait BaseConvLayerConfig extends LayerConfig {
  var kernelSize: Double | js.Array[Double]                             = js.native
  var strides: Double | js.Array[Double]                                = js.native
  var padding: PaddingMode                                              = js.native
  var dataFormat: DataFormat                                            = js.native
  var dilationRate: Double | Tuple1[Double] | js.Tuple2[Double, Double] = js.native
  var activation: String                                                = js.native
  var useBias: Boolean                                                  = js.native
  var kernelInitializer: InitializerIdentifier | Initializer            = js.native
  var biasInitializer: InitializerIdentifier | Initializer              = js.native
  var kernelConstraint: ConstraintIdentifier | Constraint               = js.native
  var biasConstraint: ConstraintIdentifier | Constraint                 = js.native
  var kernelRegularizer: RegularizerIdentifier | Regularizer            = js.native
  var biasRegularizer: RegularizerIdentifier | Regularizer              = js.native
  var activityRegularizer: RegularizerIdentifier | Regularizer          = js.native
}

@js.native
trait ConvLayerConfig extends BaseConvLayerConfig {
  var filters: Double = js.native
}

@js.native
@JSGlobal
abstract class BaseConv protected () extends Layer {
  def this(rank: Double, config: BaseConvLayerConfig) = this()
  protected def rank: Double                                                      = js.native
  protected def kernelSize: js.Array[Double]                                      = js.native
  protected def strides: js.Array[Double]                                         = js.native
  protected def padding: PaddingMode                                              = js.native
  protected def dataFormat: DataFormat                                            = js.native
  protected def activation: Activation                                            = js.native
  protected def useBias: Boolean                                                  = js.native
  protected def dilationRate: Double | Tuple1[Double] | js.Tuple2[Double, Double] = js.native
  protected def biasInitializer: Initializer                                      = js.native
  protected def biasConstraint: Constraint                                        = js.native
  protected def biasRegularizer: Regularizer                                      = js.native
  protected var bias: LayerVariable                                               = js.native
  def DEFAULT_KERNEL_INITIALIZER: InitializerIdentifier                           = js.native
  def DEFAULT_BIAS_INITIALIZER: InitializerIdentifier                             = js.native
  override def getConfig(): serialization.ConfigDict             = js.native
}

@js.native
@JSGlobal
object BaseConv extends js.Object {
  def verifyConfig(config: BaseConvLayerConfig): Unit = js.native
}

@js.native
@JSGlobal
abstract class Conv protected () extends BaseConv {
  def this(rank: Double, config: ConvLayerConfig) = this()
  protected def filters: Double                                                          = js.native
  protected var kernel: LayerVariable                                                    = js.native
  protected def kernelInitializer: Initializer                                           = js.native
  protected def kernelConstraint: Constraint                                             = js.native
  protected def kernelRegularizer: Regularizer                                           = js.native
  override def build(inputShape: Shape | js.Array[Shape]): Unit                                   = js.native
  override def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape]   = js.native
  override def getConfig(): serialization.ConfigDict                                              = js.native
}

@js.native
@JSGlobal
object Conv extends js.Object {
  def verifyConfig(config: ConvLayerConfig): Unit = js.native
}

@js.native
@JSGlobal
class Conv2D protected () extends Conv {
  def this(config: ConvLayerConfig) = this()
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Conv2D extends js.Object {
  var className: String                           = js.native
  def verifyConfig(config: ConvLayerConfig): Unit = js.native
}

@js.native
@JSGlobal
class Conv2DTranspose protected () extends Conv2D {
  def this(config: ConvLayerConfig) = this()
  // cannot override a mutable variable
  //override var inputSpec: js.Array[InputSpec] = js.native
  override def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND] = js.native
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] =
    js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Conv2DTranspose extends js.Object {
  var className: String = js.native
}

@js.native
trait SeparableConvLayerConfig extends ConvLayerConfig {
  var depthMultiplier: Double                                   = js.native
  var depthwiseInitializer: InitializerIdentifier | Initializer = js.native
  var pointwiseInitializer: InitializerIdentifier | Initializer = js.native
  var depthwiseRegularizer: RegularizerIdentifier | Regularizer = js.native
  var pointwiseRegularizer: RegularizerIdentifier | Regularizer = js.native
  var depthwiseConstraint: ConstraintIdentifier | Constraint    = js.native
  var pointwiseConstraint: ConstraintIdentifier | Constraint    = js.native
}

@js.native
@JSGlobal
class SeparableConv protected () extends Conv {
  def this(rank: Double, config: SeparableConvLayerConfig = ???) = this()
  def depthMultiplier: Double                                   = js.native
  protected def depthwiseInitializer: Initializer               = js.native
  protected def depthwiseRegularizer: Regularizer               = js.native
  protected def depthwiseConstraint: Constraint                 = js.native
  protected def pointwiseInitializer: Initializer               = js.native
  protected def pointwiseRegularizer: Regularizer               = js.native
  protected def pointwiseConstraint: Constraint                 = js.native
  def DEFAULT_DEPTHWISE_INITIALIZER: InitializerIdentifier      = js.native
  def DEFAULT_POINTWISE_INITIALIZER: InitializerIdentifier      = js.native
  protected var depthwiseKernel: LayerVariable                  = js.native
  protected var pointwiseKernel: LayerVariable                  = js.native
  override def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                   = js.native
  override def getConfig(): serialization.ConfigDict = js.native
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
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Conv1D extends js.Object {
  var className: String                           = js.native
  def verifyConfig(config: ConvLayerConfig): Unit = js.native
}

@js.native
trait Cropping2DLayerConfig extends LayerConfig {
  var cropping: Double | js.Tuple2[Double, Double] | js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[
    Double,
    Double
  ]]                         = js.native
  var dataFormat: DataFormat = js.native
}

@js.native
@JSGlobal
class Cropping2D protected () extends Layer {
  def this(config: Cropping2DLayerConfig) = this()
  protected def cropping: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] =
    js.native
  protected def dataFormat: DataFormat             = js.native
  def computeOutputShape(inputShape: Shape): Shape = js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                   = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Cropping2D extends js.Object {
  var className: String = js.native
}

@js.native
trait UpSampling2DLayerConfig extends LayerConfig {
  var size: js.Array[Double] = js.native
  var dataFormat: DataFormat = js.native
}

@js.native
@JSGlobal
class UpSampling2D protected () extends Layer {
  def this(config: UpSampling2DLayerConfig) = this()
  protected def DEFAULT_SIZE: js.Array[Double]                                           = js.native
  protected def size: js.Array[Double]                                                   = js.native
  protected def dataFormat: DataFormat                                                   = js.native
  def computeOutputShape(inputShape: Shape): Shape                                       = js.native
  override def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  override def getConfig(): serialization.ConfigDict                                              = js.native
}

@js.native
@JSGlobal
object UpSampling2D extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobalScope
object Convolutional extends js.Object {
  def preprocessConv2DInput(x: TensorND, dataFormat: DataFormat): TensorND = js.native
  def conv1dWithBias(
      x: TensorND,
      kernel: TensorND,
      bias: TensorND,
      strides: Double = ???,
      padding: String = ???,
      dataFormat: DataFormat = ???,
      dilationRate: Double = ???
  ): TensorND = js.native
  def conv1d(
      x: TensorND,
      kernel: TensorND,
      strides: Double = ???,
      padding: String = ???,
      dataFormat: DataFormat = ???,
      dilationRate: Double = ???
  ): TensorND = js.native
  def conv2d(
      x: TensorND,
      kernel: TensorND,
      strides: js.Array[Double] = ???,
      padding: String = ???,
      dataFormat: DataFormat = ???,
      dilationRate: js.Tuple2[Double, Double] = ???
  ): TensorND = js.native
  def conv2dWithBias(
      x: TensorND,
      kernel: TensorND,
      bias: TensorND,
      strides: js.Array[Double] = ???,
      padding: String = ???,
      dataFormat: DataFormat = ???,
      dilationRate: js.Tuple2[Double, Double] = ???
  ): TensorND = js.native
}

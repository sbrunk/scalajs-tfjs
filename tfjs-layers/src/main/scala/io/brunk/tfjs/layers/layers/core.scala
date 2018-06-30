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

import io.brunk.tfjs.layers.Activations.ActivationIdentifier
import io.brunk.tfjs.layers.Constraints.ConstraintIdentifier
import io.brunk.tfjs.layers.{ Constraint, Initializer, Regularizer }
import io.brunk.tfjs.layers.Initializers.InitializerIdentifier
import io.brunk.tfjs.layers.Regularizers.RegularizerIdentifier
import io.brunk.tfjs.layers.Types.{ Kwargs, Shape }
import io.brunk.tfjs.layers.engine.{ Layer, LayerConfig }
import io.brunk.tfjs.layers.{ Activation => ActivationFn }

import scala.scalajs.js
import js.annotation._
import js.{ UndefOr, | }
import io.brunk.tfjs.tf._

@js.native
trait DropoutLayerConfig extends LayerConfig {
  var rate: Double                 = js.native
  var noiseShape: js.Array[Double] = js.native
  var seed: Double                 = js.native
}

@js.native
@JSGlobal
class Dropout protected () extends Layer {
  def this(config: DropoutLayerConfig) = this()
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                   = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Dropout extends js.Object {
  var className: String = js.native
}

@ScalaJSDefined
class DenseLayerConfig(
    val units: Double,
    val activation: UndefOr[ActivationIdentifier] = js.undefined,
    val useBias: UndefOr[Boolean] = js.undefined,
    val kernelInitializer: UndefOr[InitializerIdentifier | Initializer] = js.undefined,
    val biasInitializer: UndefOr[InitializerIdentifier | Initializer] = js.undefined,
    val inputDim: UndefOr[Double] = js.undefined,
    val kernelConstraint: UndefOr[ConstraintIdentifier | Constraint] = js.undefined,
    val biasConstraint: UndefOr[ConstraintIdentifier | Constraint] = js.undefined,
    val kernelRegularizer: UndefOr[RegularizerIdentifier | Regularizer] = js.undefined,
    val biasRegularizer: UndefOr[RegularizerIdentifier | Regularizer] = js.undefined,
    val activityRegularizer: UndefOr[RegularizerIdentifier | Regularizer] = js.undefined,
    override val inputShape: UndefOr[Shape] = js.undefined,
    override val batchInputShape: UndefOr[Shape] = js.undefined,
    override val batchSize: UndefOr[Double] = js.undefined,
    override val dtype: UndefOr[DataType] = js.undefined,
    override val name: UndefOr[String] = js.undefined,
    override val trainable: UndefOr[Boolean] = js.undefined,
    override val updatable: UndefOr[Boolean] = js.undefined,
    override val weights: UndefOr[js.Array[TensorND]] = js.undefined,
    override val inputDType: UndefOr[DataType] = js.undefined
) extends LayerConfig

object DenseLayerConfig {
  def apply(
      units: Double,
      activation: UndefOr[ActivationIdentifier] = js.undefined,
      useBias: UndefOr[Boolean] = js.undefined,
      kernelInitializer: UndefOr[InitializerIdentifier | Initializer] = js.undefined,
      biasInitializer: UndefOr[InitializerIdentifier | Initializer] = js.undefined,
      inputDim: UndefOr[Double] = js.undefined,
      kernelConstraint: UndefOr[ConstraintIdentifier | Constraint] = js.undefined,
      biasConstraint: UndefOr[ConstraintIdentifier | Constraint] = js.undefined,
      kernelRegularizer: UndefOr[RegularizerIdentifier | Regularizer] = js.undefined,
      biasRegularizer: UndefOr[RegularizerIdentifier | Regularizer] = js.undefined,
      activityRegularizer: UndefOr[RegularizerIdentifier | Regularizer] = js.undefined,
      // LayerConfig
      inputShape: UndefOr[Shape] = js.undefined,
      batchInputShape: UndefOr[Shape] = js.undefined,
      batchSize: UndefOr[Double] = js.undefined,
      dtype: UndefOr[DataType] = js.undefined,
      name: UndefOr[String] = js.undefined,
      trainable: UndefOr[Boolean] = js.undefined,
      updatable: UndefOr[Boolean] = js.undefined,
      weights: UndefOr[js.Array[TensorND]] = js.undefined,
      inputDType: UndefOr[DataType] = js.undefined
  ): DenseLayerConfig =
    new DenseLayerConfig(
      units = units,
      activation = activation,
      useBias = useBias,
      kernelInitializer = kernelInitializer,
      biasInitializer = biasInitializer,
      inputDim = inputDim,
      kernelConstraint = kernelConstraint,
      biasConstraint = biasConstraint,
      kernelRegularizer = kernelRegularizer,
      biasRegularizer = biasRegularizer,
      activityRegularizer = activityRegularizer,
      // LayerConfig
      inputShape = inputShape,
      batchInputShape = batchInputShape,
      batchSize = batchSize,
      dtype = dtype,
      name = name,
      trainable = trainable,
      updatable = updatable,
      weights = weights,
      inputDType = inputDType
    )
}

@js.native
@JSGlobal
class Dense protected () extends Layer {
  def this(config: DenseLayerConfig) = this()
  def DEFAULT_KERNEL_INITIALIZER: InitializerIdentifier         = js.native
  def DEFAULT_BIAS_INITIALIZER: InitializerIdentifier           = js.native
  override def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] =
    js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                   = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Dense extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class Flatten protected () extends Layer {
  def this(config: LayerConfig = ???) = this()
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] =
    js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND] = js.native
}

@js.native
@JSGlobal
object Flatten extends js.Object {
  var className: String = js.native
}

@js.native
trait ActivationLayerConfig extends LayerConfig {
  var activation: ActivationIdentifier = js.native
}

@js.native
@JSGlobal
class Activation protected () extends Layer {
  def this(config: ActivationLayerConfig) = this()
  var activation: ActivationFn = js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                   = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Activation extends js.Object {
  var className: String = js.native
}

@js.native
trait ReshapeLayerConfig extends LayerConfig {
  var targetShape: Shape = js.native
}

@js.native
trait RepeatVectorLayerConfig extends LayerConfig {
  var n: Double = js.native
}

@js.native
@JSGlobal
class RepeatVector protected () extends Layer {
  def this(config: RepeatVectorLayerConfig) = this()
  def n: Double                                    = js.native
  def computeOutputShape(inputShape: Shape): Shape = js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                   = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object RepeatVector extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class Reshape protected () extends Layer {
  def this(config: ReshapeLayerConfig) = this()
  def computeOutputShape(inputShape: Shape): Shape = js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                   = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Reshape extends js.Object {
  var className: String = js.native
}

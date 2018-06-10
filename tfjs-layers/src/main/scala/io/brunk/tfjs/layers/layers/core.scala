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
import io.brunk.tfjs.layers.{Constraint, Initializer, Regularizer}
import io.brunk.tfjs.layers.Initializers.InitializerIdentifier
import io.brunk.tfjs.layers.Regularizers.RegularizerIdentifier
import io.brunk.tfjs.layers.Types.{Kwargs, Shape}
import io.brunk.tfjs.layers.engine.{Layer, LayerConfig}
import io.brunk.tfjs.layers.{Activation => ActivationFn}

import scala.scalajs.js
import js.annotation._
import js.|
import io.brunk.tfjs.tf._


@js.native
trait DropoutLayerConfig extends LayerConfig {
  var rate: Double = js.native
  var noiseShape: js.Array[Double] = js.native
  var seed: Double = js.native
}

@js.native
@JSGlobal
class Dropout protected () extends Layer {
  def this(config: DropoutLayerConfig) = this()
  def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Dropout extends js.Object {
  var className: String = js.native
}

@js.native
trait DenseLayerConfig extends LayerConfig {
  var units: Double = js.native
  var activation: ActivationIdentifier = js.native
  var useBias: Boolean = js.native
  var kernelInitializer: InitializerIdentifier | Initializer = js.native
  var biasInitializer: InitializerIdentifier | Initializer = js.native
  var inputDim: Double = js.native
  var kernelConstraint: ConstraintIdentifier | Constraint = js.native
  var biasConstraint: ConstraintIdentifier | Constraint = js.native
  var kernelRegularizer: RegularizerIdentifier | Regularizer = js.native
  var biasRegularizer: RegularizerIdentifier | Regularizer = js.native
  var activityRegularizer: RegularizerIdentifier | Regularizer = js.native
}

@js.native
@JSGlobal
class Dense protected () extends Layer {
  def this(config: DenseLayerConfig) = this()
  def DEFAULT_KERNEL_INITIALIZER: InitializerIdentifier = js.native
  def DEFAULT_BIAS_INITIALIZER: InitializerIdentifier = js.native
  def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  def getConfig(): serialization.ConfigDict = js.native
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
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
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
  def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  def getConfig(): serialization.ConfigDict = js.native
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
  def n: Double = js.native
  def computeOutputShape(inputShape: Shape): Shape = js.native
  def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  def getConfig(): serialization.ConfigDict = js.native
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
  def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Reshape extends js.Object {
  var className: String = js.native
}

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
import io.brunk.tfjs.layers.Activations.ActivationIdentifier
import io.brunk.tfjs.layers.Constraints.ConstraintIdentifier
import io.brunk.tfjs.layers.Initializers.InitializerIdentifier
import io.brunk.tfjs.layers.Regularizers.RegularizerIdentifier
import io.brunk.tfjs.layers._
import io.brunk.tfjs.layers.Types.{Kwargs, RnnStepFunction, Shape}
import io.brunk.tfjs.layers.engine.{InputSpec, Layer, LayerConfig, SymbolicTensor}

import scala.scalajs.js
import js.annotation._
import js.|
import io.brunk.tfjs.tf.TensorND

@js.native
trait BaseRNNLayerConfig extends LayerConfig {
  var cell: RNNCell | js.Array[RNNCell] = js.native
  var returnSequences: Boolean          = js.native
  var returnState: Boolean              = js.native
  var goBackwards: Boolean              = js.native
  var stateful: Boolean                 = js.native
  var unroll: Boolean                   = js.native
  var inputDim: Double                  = js.native
  var inputLength: Double               = js.native
}

@js.native
trait RNNLayerConfig extends BaseRNNLayerConfig {
  // cannot override a mutable variable
  //override var cell: RNNCell | js.Array[RNNCell] = js.native
}

@js.native
@JSImport("@tensorflow/tfjs-layers", "RNN")
class RNN protected () extends Layer {
  def this(config: RNNLayerConfig) = this()
  def cell: RNNCell                               = js.native
  def returnSequences: Boolean                    = js.native
  def returnState: Boolean                        = js.native
  def goBackwards: Boolean                        = js.native
  def unroll: Boolean                             = js.native
  var stateSpec: js.Array[InputSpec]              = js.native
  var states: js.Array[TensorND]                  = js.native
  def getStates(): js.Array[TensorND]             = js.native
  def setStates(states: js.Array[TensorND]): Unit = js.native
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] =
    js.native
  // TODO until we have real union types aka dotty, we have to stick with the wider type of the base class
  //override def computeMask(inputs: TensorND | js.Array[TensorND], mask: TensorND | js.Array[TensorND] = ???): TensorND = js.native
  override def build(inputShape: Shape | js.Array[Shape]): Unit      = js.native
  def resetStates(states: TensorND | js.Array[TensorND] = ???): Unit = js.native
  @JSName("apply")
  override def apply(
      inputs: TensorND | js.Array[TensorND] | SymbolicTensor | js.Array[SymbolicTensor],
      kwargs: Kwargs = ???
  ): TensorND | js.Array[TensorND] | SymbolicTensor | js.Array[SymbolicTensor] = js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                          = js.native
  def getInitialState(inputs: TensorND): js.Array[TensorND] = js.native
  // TODO This is a var in the base class. Unlike TS Scala does not allow to override a var with a def or val in subclasses
  // def trainableWeights: js.Array[LayerVariable] = js.native
  // def nonTrainableWeights: js.Array[LayerVariable] = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSImport("@tensorflow/tfjs-layers", "RNN")
object RNN extends js.Object {
  var className: String = js.native
}

@js.native
@JSImport("@tensorflow/tfjs-layers", "layers.RNNCell")
abstract class RNNCell extends Layer {
  var stateSize: Double | js.Array[Double] = js.native
}

@js.native
trait SimpleRNNCellLayerConfig extends LayerConfig {
  var units: Double                                             = js.native
  var activation: ActivationIdentifier                          = js.native
  var useBias: Boolean                                          = js.native
  var kernelInitializer: InitializerIdentifier | Initializer    = js.native
  var recurrentInitializer: InitializerIdentifier | Initializer = js.native
  var biasInitializer: InitializerIdentifier | Initializer      = js.native
  var kernelRegularizer: RegularizerIdentifier | Regularizer    = js.native
  var recurrentRegularizer: RegularizerIdentifier | Regularizer = js.native
  var biasRegularizer: RegularizerIdentifier | Regularizer      = js.native
  var kernelConstraint: ConstraintIdentifier | Constraint       = js.native
  var recurrentConstraint: ConstraintIdentifier | Constraint    = js.native
  var biasConstraint: ConstraintIdentifier | Constraint         = js.native
  var dropout: Double                                           = js.native
  var recurrentDropout: Double                                  = js.native
}

@js.native
@JSGlobal
class SimpleRNNCell protected () extends RNNCell {
  def this(config: SimpleRNNCellLayerConfig) = this()
  def units: Double                     = js.native
  def activation: Activation            = js.native
  def useBias: Boolean                  = js.native
  def kernelInitializer: Initializer    = js.native
  def recurrentInitializer: Initializer = js.native
  def biasInitializer: Initializer      = js.native
  def kernelConstraint: Constraint      = js.native
  def recurrentConstraint: Constraint   = js.native
  def biasConstraint: Constraint        = js.native
  def kernelRegularizer: Regularizer    = js.native
  def recurrentRegularizer: Regularizer = js.native
  def biasRegularizer: Regularizer      = js.native
  def dropout: Double                   = js.native
  def recurrentDropout: Double          = js.native
  // method stateSize cannot override a mutable variable
  // def stateSize: Double = js.native
  var kernel: LayerVariable                                     = js.native
  var recurrentKernel: LayerVariable                            = js.native
  var bias: LayerVariable                                       = js.native
  def DEFAULT_ACTIVATION: String                                = js.native
  def DEFAULT_KERNEL_INITIALIZER: String                        = js.native
  def DEFAULT_RECURRENT_INITIALIZER: String                     = js.native
  def DEFAULT_BIAS_INITIALIZER: InitializerIdentifier           = js.native
  override def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                   = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object SimpleRNNCell extends js.Object {
  var className: String = js.native
}

@js.native
trait SimpleRNNLayerConfig extends BaseRNNLayerConfig {
  var units: Double                                             = js.native
  var activation: ActivationIdentifier                          = js.native
  var useBias: Boolean                                          = js.native
  var kernelInitializer: InitializerIdentifier | Initializer    = js.native
  var recurrentInitializer: InitializerIdentifier | Initializer = js.native
  var biasInitializer: InitializerIdentifier | Initializer      = js.native
  var kernelRegularizer: RegularizerIdentifier | Regularizer    = js.native
  var recurrentRegularizer: RegularizerIdentifier | Regularizer = js.native
  var biasRegularizer: RegularizerIdentifier | Regularizer      = js.native
  var kernelConstraint: ConstraintIdentifier | Constraint       = js.native
  var recurrentConstraint: ConstraintIdentifier | Constraint    = js.native
  var biasConstraint: ConstraintIdentifier | Constraint         = js.native
  var dropout: Double                                           = js.native
  var recurrentDropout: Double                                  = js.native
}

@js.native
@JSGlobal
class SimpleRNN protected () extends RNN {
  def this(config: SimpleRNNLayerConfig) = this()
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                   = js.native
  def units: Double                                  = js.native
  def activation: Activation                         = js.native
  def useBias: Boolean                               = js.native
  def kernelInitializer: Initializer                 = js.native
  def recurrentInitializer: Initializer              = js.native
  def biasInitializer: Initializer                   = js.native
  def kernelRegularizer: Regularizer                 = js.native
  def recurrentRegularizer: Regularizer              = js.native
  def biasRegularizer: Regularizer                   = js.native
  def kernelConstraint: Constraint                   = js.native
  def recurrentConstraint: Constraint                = js.native
  def biasConstraint: Constraint                     = js.native
  def dropout: Double                                = js.native
  def recurrentDropout: Double                       = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object SimpleRNN extends js.Object {
  var className: String = js.native
}

@js.native
trait GRUCellLayerConfig extends SimpleRNNCellLayerConfig {
  var recurrentActivation: String = js.native
  var implementation: Double      = js.native
}

@js.native
@JSGlobal
class GRUCell protected () extends RNNCell {
  def this(config: GRUCellLayerConfig) = this()
  def units: Double                     = js.native
  def activation: Activation            = js.native
  def recurrentActivation: Activation   = js.native
  def useBias: Boolean                  = js.native
  def kernelInitializer: Initializer    = js.native
  def recurrentInitializer: Initializer = js.native
  def biasInitializer: Initializer      = js.native
  def kernelRegularizer: Regularizer    = js.native
  def recurrentRegularizer: Regularizer = js.native
  def biasRegularizer: Regularizer      = js.native
  def kernelConstraint: Constraint      = js.native
  def recurrentConstraint: Constraint   = js.native
  def biasConstraint: Constraint        = js.native
  def dropout: Double                   = js.native
  def recurrentDropout: Double          = js.native
  // method stateSize cannot override a mutable variable
  // override def stateSize: Double = js.native
  def implementation: Double                                    = js.native
  def DEFAULT_ACTIVATION: String                                = js.native
  def DEFAULT_RECURRENT_ACTIVATION: String                      = js.native
  def DEFAULT_KERNEL_INITIALIZER: String                        = js.native
  def DEFAULT_RECURRENT_INITIALIZER: String                     = js.native
  def DEFAULT_BIAS_INITIALIZER: InitializerIdentifier           = js.native
  var kernel: LayerVariable                                     = js.native
  var recurrentKernel: LayerVariable                            = js.native
  var bias: LayerVariable                                       = js.native
  override def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                   = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object GRUCell extends js.Object {
  var className: String = js.native
}

@js.native
trait GRULayerConfig extends SimpleRNNLayerConfig {
  var implementation: Double = js.native
}

@js.native
@JSGlobal
class GRU protected () extends RNN {
  def this(config: GRULayerConfig) = this()
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                   = js.native
  def units: Double                                  = js.native
  def activation: Activation                         = js.native
  def useBias: Boolean                               = js.native
  def kernelInitializer: Initializer                 = js.native
  def recurrentInitializer: Initializer              = js.native
  def biasInitializer: Initializer                   = js.native
  def kernelRegularizer: Regularizer                 = js.native
  def recurrentRegularizer: Regularizer              = js.native
  def biasRegularizer: Regularizer                   = js.native
  def kernelConstraint: Constraint                   = js.native
  def recurrentConstraint: Constraint                = js.native
  def biasConstraint: Constraint                     = js.native
  def dropout: Double                                = js.native
  def recurrentDropout: Double                       = js.native
  def implementation: Double                         = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object GRU extends js.Object {
  var className: String = js.native
  def fromConfig[T <: serialization.Serializable](
      cls: serialization.SerializableConstructor[T],
      config: serialization.ConfigDict
  ): T = js.native
}

@js.native
trait LSTMCellLayerConfig extends SimpleRNNCellLayerConfig {
  var recurrentActivation: ActivationIdentifier = js.native
  var unitForgetBias: Boolean                   = js.native
  var implementation: Int                       = js.native
}

@js.native
@JSGlobal
class LSTMCell protected () extends RNNCell {
  def this(config: LSTMCellLayerConfig) = this()
  def units: Double                     = js.native
  def activation: Activation            = js.native
  def recurrentActivation: Activation   = js.native
  def useBias: Boolean                  = js.native
  def kernelInitializer: Initializer    = js.native
  def recurrentInitializer: Initializer = js.native
  def biasInitializer: Initializer      = js.native
  def unitForgetBias: Boolean           = js.native
  def kernelConstraint: Constraint      = js.native
  def recurrentConstraint: Constraint   = js.native
  def biasConstraint: Constraint        = js.native
  def kernelRegularizer: Regularizer    = js.native
  def recurrentRegularizer: Regularizer = js.native
  def biasRegularizer: Regularizer      = js.native
  def dropout: Double                   = js.native
  def recurrentDropout: Double          = js.native
  //method stateSize cannot override a mutable variable
  //override def stateSize: js.Array[Double] = js.native
  def implementation: Double                                    = js.native
  def DEFAULT_ACTIVATION: String                                = js.native
  def DEFAULT_RECURRENT_ACTIVATION: String                      = js.native
  def DEFAULT_KERNEL_INITIALIZER: String                        = js.native
  def DEFAULT_RECURRENT_INITIALIZER: String                     = js.native
  def DEFAULT_BIAS_INITIALIZER: String                          = js.native
  var kernel: LayerVariable                                     = js.native
  var recurrentKernel: LayerVariable                            = js.native
  var bias: LayerVariable                                       = js.native
  override def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                   = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object LSTMCell extends js.Object {
  var className: String = js.native
}

@js.native
trait LSTMLayerConfig extends SimpleRNNLayerConfig {
  var unitForgetBias: Boolean = js.native
  var implementation: Int     = js.native
}

@js.native
@JSGlobal
class LSTM protected () extends RNN {
  def this(config: LSTMLayerConfig) = this()
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                   = js.native
  def units: Double                                  = js.native
  def activation: Activation                         = js.native
  def useBias: Boolean                               = js.native
  def kernelInitializer: Initializer                 = js.native
  def recurrentInitializer: Initializer              = js.native
  def biasInitializer: Initializer                   = js.native
  def unitForgetBias: Boolean                        = js.native
  def kernelRegularizer: Regularizer                 = js.native
  def recurrentRegularizer: Regularizer              = js.native
  def biasRegularizer: Regularizer                   = js.native
  def kernelConstraint: Constraint                   = js.native
  def recurrentConstraint: Constraint                = js.native
  def biasConstraint: Constraint                     = js.native
  def dropout: Double                                = js.native
  def recurrentDropout: Double                       = js.native
  def implementation: Double                         = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object LSTM extends js.Object {
  var className: String = js.native
  def fromConfig[T <: serialization.Serializable](
      cls: serialization.SerializableConstructor[T],
      config: serialization.ConfigDict
  ): T = js.native
}

@js.native
trait StackedRNNCellsConfig extends LayerConfig {
  var cells: js.Array[RNNCell] = js.native
}

@js.native
@JSGlobal
class StackedRNNCells protected () extends RNNCell {
  def this(config: StackedRNNCellsConfig) = this()
  protected var cells: js.Array[RNNCell] = js.native
  // method stateSize cannot override a mutable variable
  // override def stateSize: js.Array[Double] = js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                              = js.native
  override def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  override def getConfig(): serialization.ConfigDict            = js.native
  // TODO This is a var in the base class. Unlike TS Scala does not allow to override a var with a def or val in subclasses
  // def trainableWeights: js.Array[LayerVariable] = js.native
  // def nonTrainableWeights: js.Array[LayerVariable] = js.native
  def getWeights(): js.Array[TensorND]                       = js.native
  override def setWeights(weights: js.Array[TensorND]): Unit = js.native
}

@js.native
@JSGlobal
object StackedRNNCells extends js.Object {
  var className: String = js.native
  def fromConfig[T <: serialization.Serializable](
      cls: serialization.SerializableConstructor[T],
      config: serialization.ConfigDict,
      customObjects: serialization.ConfigDict = ???
  ): T = js.native
}

@js.native
@JSGlobalScope
object Recurrent extends js.Object {
  def rnn(
      stepFunction: RnnStepFunction,
      inputs: TensorND,
      initialStates: js.Array[TensorND],
      goBackwards: Boolean = ???,
      mask: TensorND = ???,
      constants: js.Array[TensorND] = ???,
      unroll: Boolean = ???,
      inputLength: Double = ???
  ): js.Tuple3[TensorND, TensorND, js.Array[TensorND]] = js.native
}

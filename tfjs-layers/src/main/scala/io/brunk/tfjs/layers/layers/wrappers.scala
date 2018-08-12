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

import io.brunk.tfjs.layers.{ LayerVariable, SymbolicTensor }
import io.brunk.tfjs.layers.Types.{ Kwargs, RegularizerFn, Shape }
import io.brunk.tfjs.layers.engine.{ Layer, LayerConfig }
import io.brunk.tfjs.layers.layers.Wrappers.BidirectionalMergeMode

import scala.scalajs.js
import js.annotation._
import js.|
import io.brunk.tfjs.tf._
@js.native
trait WrapperLayerConfig extends LayerConfig {
  var layer: Layer = js.native
}

@js.native
@JSGlobal
abstract class Wrapper protected () extends Layer {
  def this(config: WrapperLayerConfig) = this()
  def layer: Layer                                              = js.native
  override def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  // cannot override a mutable variable
  //override var trainable: Boolean = js.native
  // TODO This is a var in the base class. Unlike TS Scala does not allow to override a var with a def or val in subclasses
  //def trainableWeights: js.Array[LayerVariable] = js.native
  //def nonTrainableWeights: js.Array[LayerVariable] = js.native
  override def updates: js.Array[TensorND]                   = js.native
  override def losses: js.Array[RegularizerFn]               = js.native
  def getWeights(): js.Array[TensorND]                       = js.native
  override def setWeights(weights: js.Array[TensorND]): Unit = js.native
  override def getConfig(): serialization.ConfigDict         = js.native
}

@js.native
@JSGlobal
object Wrapper extends js.Object {
  def fromConfig[T <: serialization.Serializable](
      cls: serialization.SerializableConstructor[T],
      config: serialization.ConfigDict,
      customObjects: serialization.ConfigDict = ???
  ): T = js.native
}

@js.native
@JSGlobal
class TimeDistributed protected () extends Wrapper {
  def this(config: WrapperLayerConfig) = this()
  override def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] =
    js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND] = js.native
}

@js.native
@JSGlobal
object TimeDistributed extends js.Object {
  var className: String = js.native
}

@js.native
trait BidirectionalLayerConfig extends WrapperLayerConfig {
  // variable layer cannot override a mutable variable
  //override var layer: RNN = js.native
  var mergeMode: BidirectionalMergeMode = js.native
}

@js.native
@JSGlobal
class Bidirectional protected () extends Wrapper {
  def this(config: BidirectionalLayerConfig) = this()
  // cannot override a mutable variable
  //override var trainable: Boolean = js.native
  override def getWeights(): js.Array[TensorND]              = js.native
  override def setWeights(weights: js.Array[TensorND]): Unit = js.native
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] =
    js.native
  @JSName("apply")
  override def apply(
      inputs: TensorND | js.Array[TensorND] | SymbolicTensor | js.Array[SymbolicTensor],
      kwargs: Kwargs = ???
  ): TensorND | js.Array[TensorND] | SymbolicTensor | js.Array[SymbolicTensor] = js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                                   = js.native
  def resetStates(states: TensorND | js.Array[TensorND] = ???): Unit = js.native
  override def build(inputShape: Shape | js.Array[Shape]): Unit      = js.native
  // TODO This is a var in the base class. Unlike TS Scala does not allow to override a var with a def or val in subclasses
  // override def trainableWeights: js.Array[LayerVariable] = js.native
  // override def nonTrainableWeights: js.Array[LayerVariable] = js.native
}

@js.native
@JSGlobal
object Bidirectional extends js.Object {
  var className: String = js.native
  def fromConfig[T <: serialization.Serializable](
    cls: serialization.SerializableConstructor[T],
    config: serialization.ConfigDict
  ): T = js.native
}

@js.native
@JSGlobalScope
object Wrappers extends js.Object {
  type BidirectionalMergeMode = String
  val VALID_BIDIRECTIONAL_MERGE_MODES: js.Array[String]      = js.native
  def checkBidirectionalMergeMode(value: String = ???): Unit = js.native
}

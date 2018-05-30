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

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait WrapperLayerConfig extends LayerConfig {
  var layer: Layer = js.native
}

@js.native
@JSGlobal
abstract class Wrapper protected () extends Layer {
  def this(config: WrapperLayerConfig) = this()
  def layer: Layer = js.native
  def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  var trainable: Boolean = js.native
  def trainableWeights: js.Array[LayerVariable] = js.native
  def nonTrainableWeights: js.Array[LayerVariable] = js.native
  def updates: js.Array[Tensor] = js.native
  def losses: js.Array[RegularizerFn] = js.native
  def getWeights(): js.Array[Tensor] = js.native
  def setWeights(weights: js.Array[Tensor]): Unit = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Wrapper extends js.Object {
  def fromConfig[T <: serialization.Serializable](cls: serialization.SerializableConstructor[T], config: serialization.ConfigDict, customObjects: tfc.serialization.ConfigDict = ???): T = js.native
}

@js.native
@JSGlobal
class TimeDistributed protected () extends Wrapper {
  def this(config: WrapperLayerConfig) = this()
  def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
}

@js.native
@JSGlobal
object TimeDistributed extends js.Object {
  var className: String = js.native
}

@js.native
trait BidirectionalLayerConfig extends WrapperLayerConfig {
  var layer: RNN = js.native
  var mergeMode: BidirectionalMergeMode = js.native
}

@js.native
@JSGlobal
class Bidirectional protected () extends Wrapper {
  def this(config: BidirectionalLayerConfig) = this()
  var trainable: Boolean = js.native
  def getWeights(): js.Array[Tensor] = js.native
  def setWeights(weights: js.Array[Tensor]): Unit = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  @JSName("apply")
  def apply(inputs: Tensor | js.Array[Tensor] | SymbolicTensor | js.Array[SymbolicTensor], kwargs: Kwargs = ???): Tensor | js.Array[Tensor] | SymbolicTensor | js.Array[SymbolicTensor] = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def resetStates(states: Tensor | js.Array[Tensor] = ???): Unit = js.native
  def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  def trainableWeights: js.Array[LayerVariable] = js.native
  def nonTrainableWeights: js.Array[LayerVariable] = js.native
}

@js.native
@JSGlobal
object Bidirectional extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobalScope
object Wrappers extends js.Object {
  type BidirectionalMergeMode = String
  val VALID_BIDIRECTIONAL_MERGE_MODES: js.Array[String] = js.native
  def checkBidirectionalMergeMode(value: String = ???): Unit = js.native
}

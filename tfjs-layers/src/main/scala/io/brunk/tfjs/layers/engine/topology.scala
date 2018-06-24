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

package io.brunk.tfjs.layers.engine

import io.brunk.tfjs.layers.Types.{Kwargs, RegularizerFn, Shape}
import io.brunk.tfjs.layers._
import io.brunk.tfjs.layers.engine.Topology.CallHook
import io.brunk.tfjs.tf._

import scala.scalajs.js
import js.annotation._
import js.{UndefOr, |}

@js.native
trait InputSpecConfig extends js.Object {
  var dtype: DataType = js.native
  var shape: Shape = js.native
  var ndim: Double = js.native
  var maxNDim: Double = js.native
  var minNDim: Double = js.native
  var axes: InputSpecConfig.Axes = js.native
}

object InputSpecConfig {

@js.native
trait Axes extends js.Object {
  @JSBracketAccess
  def apply(axis: Double): Double = js.native
  @JSBracketAccess
  def update(axis: Double, v: Double): Unit = js.native
}
}

@js.native
@JSGlobal
class InputSpec protected () extends js.Object {
  def this(config: InputSpecConfig) = this()
  var dtype: DataType = js.native
  var shape: Shape = js.native
  var ndim: Double = js.native
  var maxNDim: Double = js.native
  var minNDim: Double = js.native
  var axes: InputSpec.Axes = js.native
}

object InputSpec {

@js.native
trait Axes extends js.Object {
  @JSBracketAccess
  def apply(axis: Double): Double = js.native
  @JSBracketAccess
  def update(axis: Double, v: Double): Unit = js.native
}
}

@js.native
trait NodeConfig extends js.Object {
  var outboundLayer: Layer = js.native
  var inboundLayers: js.Array[Layer] = js.native
  var nodeIndices: js.Array[Double] = js.native
  var tensorIndices: js.Array[Double] = js.native
  var inputTensors: js.Array[SymbolicTensor] = js.native
  var outputTensors: js.Array[SymbolicTensor] = js.native
  var inputMasks: js.Array[TensorND] = js.native
  var outputMasks: js.Array[TensorND] = js.native
  var inputShapes: Shape | js.Array[Shape] = js.native
  var outputShapes: Shape | js.Array[Shape] = js.native
}

@js.native
@JSGlobal
class Node protected () extends js.Object {
  def this(config: NodeConfig, callArgs: Kwargs = ???) = this()
  var callArgs: Kwargs = js.native
  var outboundLayer: Layer = js.native
  var inboundLayers: js.Array[Layer] = js.native
  var nodeIndices: js.Array[Double] = js.native
  var tensorIndices: js.Array[Double] = js.native
  var inputTensors: js.Array[SymbolicTensor] = js.native
  var outputTensors: js.Array[SymbolicTensor] = js.native
  var inputMasks: js.Array[TensorND] = js.native
  var outputMasks: js.Array[TensorND] = js.native
  var inputShapes: Shape | js.Array[Shape] = js.native
  var outputShapes: Shape | js.Array[Shape] = js.native
  def id: Double = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@ScalaJSDefined
trait LayerConfig extends js.Object {
  val inputShape: UndefOr[Shape]  = js.undefined
  val batchInputShape: UndefOr[Shape]  = js.undefined
  val batchSize: UndefOr[Double]  = js.undefined
  val dtype: UndefOr[DataType]  = js.undefined
  val name: UndefOr[String]  = js.undefined
  val trainable: UndefOr[Boolean]  = js.undefined
  val updatable: UndefOr[Boolean]  = js.undefined
  val weights: UndefOr[js.Array[TensorND]]  = js.undefined
  val inputDType: UndefOr[DataType]  = js.undefined
}

@js.native
@JSImport("@tensorflow/tfjs-layers", "layers.Layer")
abstract class Layer protected () extends serialization.Serializable {
  def this(config: LayerConfig) = this()
  var name: String = js.native
  var inputSpec: js.Array[InputSpec] = js.native
  var supportsMasking: Boolean = js.native
  var trainable: Boolean = js.native
  var updatable: Boolean = js.native
  var batchInputShape: Shape = js.native
  var dtype: DataType = js.native
  var initialWeights: js.Array[TensorND] = js.native
  var inboundNodes: js.Array[Node] = js.native
  var outboundNodes: js.Array[Node] = js.native
  var activityRegularizer: Regularizer = js.native
  protected var _trainableWeights: js.Array[LayerVariable] = js.native
  def id: Double = js.native
  protected var _stateful: Boolean = js.native
  def getInputAt(nodeIndex: Double): SymbolicTensor | js.Array[SymbolicTensor] = js.native
  def getOutputAt(nodeIndex: Double): SymbolicTensor | js.Array[SymbolicTensor] = js.native
  def input: SymbolicTensor | js.Array[SymbolicTensor] = js.native
  def output: SymbolicTensor | js.Array[SymbolicTensor] = js.native
  def losses: js.Array[RegularizerFn] = js.native
  def calculateLosses(): js.Array[Scalar] = js.native
  def updates: js.Array[TensorND] = js.native
  var built: Boolean = js.native
  var trainableWeights: js.Array[LayerVariable] = js.native
  var nonTrainableWeights: js.Array[LayerVariable] = js.native
  def weights: js.Array[LayerVariable] = js.native
  def stateful: Boolean = js.native
  def assertInputCompatibility(inputs: TensorND | js.Array[TensorND] | SymbolicTensor | js.Array[SymbolicTensor]): Unit = js.native
  def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  def invokeCallHook(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): Unit = js.native
  def setCallHook(callHook: CallHook): Unit = js.native
  def clearCallHook(): Unit = js.native
  @JSName("apply")
  def apply(inputs: TensorND | js.Array[TensorND] | SymbolicTensor | js.Array[SymbolicTensor], kwargs: Kwargs = ???): TensorND | js.Array[TensorND] | SymbolicTensor | js.Array[SymbolicTensor] = js.native
  def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  def getWeights(trainableOnly: Boolean = ???): js.Array[TensorND] = js.native
  def setWeights(weights: js.Array[TensorND]): Unit = js.native
  def addWeight(name: String, shape: Shape, dtype: DataType = ???, initializer: Initializer = ???, regularizer: Regularizer = ???, trainable: Boolean = ???, constraint: Constraint = ???): LayerVariable = js.native
  def addLoss(losses: RegularizerFn | js.Array[RegularizerFn]): Unit = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def computeMask(inputs: TensorND | js.Array[TensorND], mask: TensorND | js.Array[TensorND] = ???): TensorND | js.Array[TensorND] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSImport("@tensorflow/tfjs-layers", "layers.Layer")
object Layer extends js.Object {
  def nodeKey(layer: Layer, nodeIndex: Double): String = js.native
}

@js.native
trait InputLayerConfig extends js.Object {
  var inputShape: Shape = js.native
  var batchSize: Double = js.native
  var batchInputShape: Shape = js.native
  var dtype: DataType = js.native
  var sparse: Boolean = js.native
  var name: String = js.native
}

@js.native
@JSGlobal
class InputLayer protected () extends Layer {
  def this(config: InputLayerConfig) = this()
  var sparse: Boolean = js.native
  // TODO until we have real union types aka dotty, we have to stick with the wider type of the base class
  // @JSName("apply")
  //override def apply(inputs: TensorND | js.Array[TensorND] | SymbolicTensor | js.Array[SymbolicTensor], kwargs: Kwargs = ???): TensorND | js.Array[TensorND] | SymbolicTensor = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object InputLayer extends js.Object {
  def className: String = js.native
}

@js.native
trait InputConfig extends js.Object {
  var shape: Shape = js.native
  var batchShape: Shape = js.native
  var name: String = js.native
  var dtype: DataType = js.native
  var sparse: Boolean = js.native
}

@js.native
trait ContainerConfig extends js.Object {
  var inputs: SymbolicTensor | js.Array[SymbolicTensor] = js.native
  var outputs: SymbolicTensor | js.Array[SymbolicTensor] = js.native
  var name: String = js.native
}

@js.native
@JSGlobal
abstract class Container protected () extends Layer {
  def this(config: ContainerConfig) = this()
  var inputs: js.Array[SymbolicTensor] = js.native
  var outputs: js.Array[SymbolicTensor] = js.native
  var inputLayers: js.Array[Layer] = js.native
  var inputLayersNodeIndices: js.Array[Double] = js.native
  var inputLayersTensorIndices: js.Array[Double] = js.native
  var outputLayers: js.Array[Layer] = js.native
  var outputLayersNodeIndices: js.Array[Double] = js.native
  var outputLayersTensorIndices: js.Array[Double] = js.native
  var layers: js.Array[Layer] = js.native
  var layersByDepth: Container.LayersByDepth = js.native
  var nodesByDepth: Container.NodesByDepth = js.native
  var containerNodes: Set[String] = js.native
  var inputNames: js.Array[String] = js.native
  var outputNames: js.Array[String] = js.native
  var feedInputShapes: js.Array[Shape] = js.native
  protected var internalInputShapes: js.Array[Shape] = js.native
  protected var internalOutputShapes: js.Array[Shape] = js.native
  protected var feedInputNames: js.Array[String] = js.native
  protected var feedOutputNames: js.Array[String] = js.native
  // TODO This is a var in the base class. Unlike TS Scala does not allow to override a var with a def or val in subclasses
  //def trainableWeights: js.Array[LayerVariable] = js.native
  //def nonTrainableWeights: js.Array[LayerVariable] = js.native
  override def weights: js.Array[LayerVariable] = js.native
  def loadWeights(weightsJSON: JsonDict | NamedTensorMap, skipMismatch: Boolean = ???, isNamedTensorMap: Boolean = ???): Unit = js.native
  def toJSON(unused: js.Any = ???, returnString: Boolean = ???): String | JsonDict = js.native
  override def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  override def computeMask(inputs: TensorND | js.Array[TensorND], mask: TensorND | js.Array[TensorND] = ???): TensorND | js.Array[TensorND] = js.native
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def runInternalGraph(inputs: js.Array[TensorND], masks: js.Array[TensorND] = ???): js.Tuple3[js.Array[TensorND], js.Array[TensorND], js.Array[Shape]] = js.native
  def getLayer(name: String = ???, index: Double = ???): Layer = js.native
  override def calculateLosses(): js.Array[Scalar] = js.native
  override def getConfig(): serialization.ConfigDict = js.native
  override def stateful: Boolean = js.native
}

@js.native
@JSGlobal
object Container extends js.Object {

@js.native
trait LayersByDepth extends js.Object {
  @JSBracketAccess
  def apply(depth: String): js.Array[Layer] = js.native
  @JSBracketAccess
  def update(depth: String, v: js.Array[Layer]): Unit = js.native
}

@js.native
trait NodesByDepth extends js.Object {
  @JSBracketAccess
  def apply(depth: String): js.Array[Node] = js.native
  @JSBracketAccess
  def update(depth: String, v: js.Array[Node]): Unit = js.native
}
  def fromConfig[T <: serialization.Serializable](cls: serialization.SerializableConstructor[T], config: serialization.ConfigDict): T = js.native
}

@js.native
@JSGlobalScope
object Topology extends js.Object {
  type Op = js.Function1[LayerVariable, LayerVariable]
  type CallHook = js.Function2[TensorND | js.Array[TensorND], Kwargs, Unit]
  def Input(config: InputConfig): SymbolicTensor = js.native
  def getSourceInputs(tensor: SymbolicTensor, layer: Layer = ???, nodeIndex: Double = ???): js.Array[SymbolicTensor] = js.native
  def loadWeightsFromNamedTensorMap(weights: NamedTensorMap, layers: js.Array[Layer]): Unit = js.native
  def loadWeightsFromJson(weightsJSON: JsonDict, layers: js.Array[Layer], skipMismatch: Boolean = ???): Unit = js.native
}

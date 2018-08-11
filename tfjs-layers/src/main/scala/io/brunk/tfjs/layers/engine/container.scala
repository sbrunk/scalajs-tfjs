package io.brunk.tfjs.layers.engine

import scala.scalajs.js
import js.annotation._
import js.|


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
  def trainableWeights: js.Array[LayerVariable] = js.native
  def nonTrainableWeights: js.Array[LayerVariable] = js.native
  def weights: js.Array[LayerVariable] = js.native
  def loadWeights(weightsJSON: JsonDict | NamedTensorMap, skipMismatch: Boolean = ???, isNamedTensorMap: Boolean = ???): Unit = js.native
  def toJSON(unused: js.Any = ???, returnString: Boolean = ???): String | JsonDict = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def computeMask(inputs: Tensor | js.Array[Tensor], mask: Tensor | js.Array[Tensor] = ???): Tensor | js.Array[Tensor] = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def runInternalGraph(inputs: js.Array[Tensor], masks: js.Array[Tensor] = ???): js.Tuple3[js.Array[Tensor], js.Array[Tensor], js.Array[Shape]] = js.native
  def getLayer(name: String = ???, index: Double = ???): Layer = js.native
  def calculateLosses(): js.Array[Scalar] = js.native
  def getConfig(): serialization.ConfigDict = js.native
  def stateful: Boolean = js.native
}

object Container {

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
object Container extends js.Object {
  def loadWeightsFromJson(weightsJSON: JsonDict, layers: js.Array[Layer], skipMismatch: Boolean = ???): Unit = js.native
  def loadWeightsFromNamedTensorMap(weights: NamedTensorMap, layers: js.Array[Layer]): Unit = js.native
}


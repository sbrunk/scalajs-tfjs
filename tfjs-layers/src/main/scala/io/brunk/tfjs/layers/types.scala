package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class SymbolicTensor protected () extends js.Object {
  def this(dtype: DataType, shape: Shape, sourceLayer: Layer, inputs: js.Array[SymbolicTensor], callArgs: Kwargs, name: String = ???, outputTensorIndex: Double = ???) = this()
  def dtype: DataType = js.native
  def shape: Shape = js.native
  var sourceLayer: Layer = js.native
  def inputs: js.Array[SymbolicTensor] = js.native
  def callArgs: Kwargs = js.native
  def outputTensorIndex: Double = js.native
  def id: Double = js.native
  def name: String = js.native
  def originalName: String = js.native
  var nodeIndex: Double = js.native
  var tensorIndex: Double = js.native
}

@js.native
trait JsonDict extends js.Object {
  @JSBracketAccess
  def apply(key: String): JsonValue = js.native
  @JSBracketAccess
  def update(key: String, v: JsonValue): Unit = js.native
}

@js.native
trait JsonArray extends js.Array[JsonValue] {
}

@js.native
@JSGlobalScope
object Types extends js.Object {
  type Shape = js.Array[Double]
  def getNextUniqueTensorId(): Double = js.native
  type LossOrMetricFn = js.Function2[Tensor, Tensor, Tensor]
  type RegularizerFn = js.Function0[Scalar]
  type RnnStepFunction = js.Function2[Tensor, js.Array[Tensor], js.Tuple2[Tensor, js.Array[Tensor]]]
  type NamedTensorMap = js.Dictionary[Tensor]
  type JsonValue = Boolean | Double | String | Null | JsonArray | JsonDict
  type Kwargs = js.Dictionary[js.Any]
}

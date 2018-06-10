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

package io.brunk.tfjs.layers

import io.brunk.tfjs.layers.Types.{JsonValue, Kwargs, Shape}
import io.brunk.tfjs.layers.engine.Layer
import io.brunk.tfjs.tf._

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
trait NamedTensorMap extends js.Object {
  type T <: TensorND
  @JSBracketAccess
  def apply(name: String): T = js.native
  @JSBracketAccess
  def update(name: String, v: T): Unit = js.native
}

@js.native
@JSGlobalScope
object Types extends js.Object {
  type Shape = js.Array[Double]
  def getNextUniqueTensorId(): Double = js.native
  type LossOrMetricFn = js.Function2[TensorND, TensorND, TensorND]
  type RegularizerFn = js.Function0[Scalar]
  type RnnStepFunction = js.Function2[TensorND, js.Array[TensorND], js.Tuple2[TensorND, js.Array[TensorND]]]
  //type NamedTensorMap = js.Dictionary[TensorND]
  type JsonValue = Boolean | Double | String | Null | JsonArray | JsonDict
  type Kwargs = js.Dictionary[js.Any]
}

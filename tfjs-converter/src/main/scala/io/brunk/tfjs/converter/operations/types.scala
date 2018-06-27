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

package io.brunk.tfjs.converter.operations

import scala.scalajs.js
import js.annotation._
import js.|

object types {

  import io.brunk.tfjs.converter.operations.types.Types.{Category, ParamTypes, ValueType}

  @js.native
trait ParamMapper extends js.Object {
  var tfParamName: String = js.native
  var tfParamNameDeprecated: String = js.native
  var tfInputIndex: Double = js.native
  var tfInputParamLength: Double = js.native
  var dlParamName: String = js.native
  var `type`: ParamTypes = js.native
  var converter: String = js.native
  var defaultValue: String | js.Array[String] | Double | js.Array[Double] | Boolean | js.Array[Boolean] = js.native
  var notSupported: Boolean = js.native
}

@js.native
trait OpMapper extends js.Object {
  var tfOpName: String = js.native
  var dlOpName: String = js.native
  var category: Category = js.native
  var params: js.Array[ParamMapper] = js.native
  var unsupportedParams: js.Array[String] = js.native
}

@js.native
trait Node extends js.Object {
  var name: String = js.native
  var op: String = js.native
  var category: Category = js.native
  var inputNames: js.Array[String] = js.native
  var inputs: js.Array[Node] = js.native
  var params: Node.Params = js.native
  var children: js.Array[Node] = js.native
}

object Node {

@js.native
trait Params extends js.Object {
  @JSBracketAccess
  def apply(key: String): ParamValue = js.native
  @JSBracketAccess
  def update(key: String, v: ParamValue): Unit = js.native
}
}

@js.native
trait Graph extends js.Object {
  var nodes: Graph.Nodes = js.native
  var placeholders: js.Array[Node] = js.native
  var inputs: js.Array[Node] = js.native
  var outputs: js.Array[Node] = js.native
  var withControlFlow: Boolean = js.native
}

object Graph {

@js.native
trait Nodes extends js.Object {
  @JSBracketAccess
  def apply(key: String): Node = js.native
  @JSBracketAccess
  def update(key: String, v: Node): Unit = js.native
}
}

@js.native
trait ParamValue extends js.Object {
  var value: ValueType = js.native
  var inputIndex: Double = js.native
  var inputParamLength: Double = js.native
  var `type`: ParamTypes = js.native
}

@js.native
@JSGlobalScope
object Types extends js.Object {
  type ParamTypes = String
  type Category = String
  type ValueType = String | js.Array[String] | Double | js.Array[Double] | Boolean | js.Array[Boolean] | Tensor | js.Array[Tensor]
}

}

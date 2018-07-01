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

package io.brunk.tfjs.converter.operations.executors

import io.brunk.tfjs.converter.data.types.Types.NamedTensorsMap
import io.brunk.tfjs.converter.executor.ExecutionContext
import io.brunk.tfjs.converter.operations.types.Node
import io.brunk.tfjs.converter.operations.types.Types.ValueType

import scala.scalajs.js
import js.annotation._
import js.|
import io.brunk.tfjs.{tf => tfc}


@js.native
@JSGlobalScope
object Utils extends js.Object {
  def getParamValue(paramName: String, node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): ValueType = js.native
  def getTensor(name: String, tensorsMap: NamedTensorsMap, context: ExecutionContext): tfc.TensorND = js.native
  def getNodeNameAndIndex(inputName: String, context: ExecutionContext = ???): js.Tuple2[String, Double] = js.native
  def parseNodeName(name: String): js.Tuple2[String, Double] = js.native
  def split(arr: js.Array[Double], size: Double): js.Array[js.Array[Double]] = js.native
}


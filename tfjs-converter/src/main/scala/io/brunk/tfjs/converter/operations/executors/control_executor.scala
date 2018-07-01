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

import scala.scalajs.js
import js.annotation._
import js.{Promise, |}

import io.brunk.tfjs.core.TensorModule.TensorND


@js.native
@JSGlobalScope
object Control_executor extends js.Object {
  def executeOp(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): Promise[js.Array[TensorND]] = js.native
  val CATEGORY: String = js.native
}


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

package io.brunk.tfjs.converter.executor

import scala.scalajs.js
import js.annotation._
import js.|

package graph_executor {

  import io.brunk.tfjs.converter.data.compiled_api.tensorflow.TensorInfo
  import io.brunk.tfjs.converter.data.types.Types.NamedTensorsMap
  import io.brunk.tfjs.converter.operations.types.Graph
  import io.brunk.tfjs.core.NamedTensorMap

  import scala.scalajs.js.Promise

  @js.native
  @JSGlobal
  class GraphExecutor protected () extends js.Object {
    def this(graph: Graph) = this()
    var weightMap: NamedTensorsMap    = js.native
    def inputs: js.Array[TensorInfo]  = js.native
    def outputs: js.Array[TensorInfo] = js.native
    def inputNodes: js.Array[String]  = js.native
    def outputNodes: js.Array[String] = js.native
    def isControlFlowModel: Boolean   = js.native
    def execute(inputs: NamedTensorsMap, outputs: String | js.Array[String] = ???): NamedTensorMap =
      js.native
    def executeAsync(
        inputs: NamedTensorsMap,
        outputs: String | js.Array[String] = ???
    ): Promise[NamedTensorMap] = js.native
    def dispose(): Unit        = js.native
  }

}

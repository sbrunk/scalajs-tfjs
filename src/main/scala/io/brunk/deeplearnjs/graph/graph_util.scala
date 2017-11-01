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

package io.brunk.deeplearnjs.graph

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobalScope
object Graph_util extends js.Object {
  def getUnorderedEvaluationSet(nodes: js.Array[Node],
                                terminatingNodes: js.Array[Node]): js.Array[Node]     = js.native
  def getOrderedEvaluationSet(unorderedEvaluationSet: js.Array[Node]): js.Array[Node] = js.native
  def isInputNode(node: Node): Boolean                                                = js.native
  def shouldBackProp(t: Tensor): Boolean                                              = js.native
  def isPassthroughNode(node: Node, map: TensorArrayMap): Boolean                     = js.native
}

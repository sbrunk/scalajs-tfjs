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

import io.brunk.deeplearnjs.graph.ops.Operation
import io.brunk.deeplearnjs.math.NDArrayMath

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobalScope
object Session_util extends js.Object {
  def getTerminatingNodesFromFeedDictionary(feedDictionary: FeedDictionary): js.Array[Node] =
    js.native
  def getOrderedEvaluationSetFromEvalTensor(evalTensors: js.Array[Tensor],
                                            feedDictionary: FeedDictionary): js.Array[Node] =
    js.native
  def addPersistentArraysToTensorArrayMap(evaluationSet: js.Array[Node],
                                          tensorArrayMap: TensorArrayMap): Unit = js.native
  def getVariableNodesFromEvaluationSet(evaluationSet: js.Array[Node]): js.Array[VariableNode] =
    js.native
  def throwIfFeedDictionaryContainsNDArrays(feedDictionary: FeedDictionary): Unit = js.native
  def loadInputsFromFeedDictionaryToTensorArrayMap(batchFeed: FeedDictionary,
                                                   activations: TensorArrayMap,
                                                   math: NDArrayMath): Unit = js.native
  def releaseFeedDictionaryInputsFromTensorArrayMap(batchFeed: FeedDictionary,
                                                    activations: TensorArrayMap,
                                                    math: NDArrayMath): Unit = js.native
  def removeFeedDictionaryNodesFromEvaluationSet(feedDictionary: FeedDictionary,
                                                 evaluationSet: js.Array[Node]): Unit = js.native
  def disposeAndInitializeOperationOutputs(evaluationSet: js.Array[Node],
                                           tensorArrayMap: TensorArrayMap): Unit = js.native
  def disposeAndInitializeOperationInputGradients(evaluationSet: js.Array[Node],
                                                  gradients: SummedTensorArrayMap): Unit =
    js.native
  def disposeTransientOperationArrays(operations: js.Array[Operation],
                                      activations: TensorArrayMap,
                                      gradients: SummedTensorArrayMap): Unit = js.native
  def throwErrorIfEvaluationSetContainsPlaceholderNodes(evaluationSet: js.Array[Node]): Unit =
    js.native
}

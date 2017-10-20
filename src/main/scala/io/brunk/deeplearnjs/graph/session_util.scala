/*
 * Copyright (c) 2017 Sören Brunk
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.brunk.deeplearnjs.graph

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

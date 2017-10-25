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
@JSGlobal
class FeedDictionary protected () extends js.Object {
  def this(feedEntries: js.Array[FeedEntry] = ???) = this()
  var dict: js.Any = js.native
}

@js.native
sealed trait CostReduction extends js.Object {}

@js.native
@JSGlobal
object CostReduction extends js.Object {
  var NONE: CostReduction = js.native
  var SUM: CostReduction  = js.native
  var MEAN: CostReduction = js.native
  @JSBracketAccess
  def apply(value: CostReduction): String = js.native
}

@js.native
@JSGlobal
class Session protected () extends js.Object {
  def this(graph: Graph, math: NDArrayMath) = this()
  def dispose(): Unit = js.native
  def evalAll(tensors: js.Array[Tensor], feedEntries: js.Array[FeedEntry]): js.Array[NDArray] =
    js.native
  def eval(tensor: Tensor, feedEntries: js.Array[FeedEntry]): NDArray = js.native
  def train(costTensor: Tensor,
            feedEntries: js.Array[FeedEntry],
            batchSize: Double,
            optimizer: Optimizer,
            costReduction: CostReduction = ???): Scalar = js.native
  var activationArrayMap: TensorArrayMap                = js.native
  var gradientArrayMap: SummedTensorArrayMap            = js.native
}

@js.native
@JSGlobalScope
object Session extends js.Object {
  type FeedEntry      = js.Any
  type SessionRuntime = js.Any
}

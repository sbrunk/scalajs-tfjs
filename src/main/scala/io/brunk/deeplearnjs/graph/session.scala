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

import io.brunk.deeplearnjs.graph.Session.FeedEntry
import io.brunk.deeplearnjs.graph.optimizers.Optimizer
import io.brunk.deeplearnjs.math.{ NDArray, NDArrayMath, Scalar }

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
@JSImport("deeplearn", "CostReduction")
object CostReduction extends js.Object {
  var NONE: CostReduction = js.native
  var SUM: CostReduction  = js.native
  var MEAN: CostReduction = js.native
  @JSBracketAccess
  def apply(value: CostReduction): String = js.native
}

@js.native
@JSImport("deeplearn", "Session")
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
@JSImport("deeplearn", "session")
object Session extends js.Object {
  type FeedEntry      = js.Any
  type SessionRuntime = js.Any
}

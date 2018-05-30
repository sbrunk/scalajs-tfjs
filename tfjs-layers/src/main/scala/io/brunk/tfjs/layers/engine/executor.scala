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

package io.brunk.tfjs.layers.engine

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait Feed extends js.Object {
  var key: SymbolicTensor = js.native
  var value: Tensor = js.native
}

@js.native
@JSGlobal
class FeedDict protected () extends js.Object {
  def this(feeds: js.Array[Feed] | FeedDict = ???) = this()
  def add(key: SymbolicTensor, value: Tensor): FeedDict = js.native
  def addFeed(feed: Feed): Unit = js.native
  def hasKey(key: SymbolicTensor): Boolean = js.native
  def getValue(key: SymbolicTensor): Tensor = js.native
}

@js.native
@JSGlobalScope
object Executor extends js.Object {
  def execute(fetches: SymbolicTensor | js.Array[SymbolicTensor], feedDict: FeedDict, kwargs: Kwargs = ???): Tensor | js.Array[Tensor] | js.Tuple1[Tensor | js.Array[Tensor]] = js.native
}

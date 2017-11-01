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

import io.brunk.deeplearnjs.graph.Priority_queue.{ Comparator, IndexObserver }

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
class PriorityQueue[T] protected () extends js.Object {
  def this(comparator: Comparator[T], indexObserver: IndexObserver[T] = ???) = this()
  def enqueue(t: T): Unit                  = js.native
  def dequeue(): T                         = js.native
  def update(newT: T, index: Double): Unit = js.native
  def empty(): Boolean                     = js.native
}

@js.native
@JSGlobalScope
object Priority_queue extends js.Object {
  def defaultCompare[T](a: T, b: T): Double = js.native
  type Comparator[T]    = js.Function2[T, T, Double]
  type IndexObserver[T] = js.Function2[T, Double, Unit]
}

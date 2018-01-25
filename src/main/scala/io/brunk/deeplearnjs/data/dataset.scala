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

package io.brunk.deeplearnjs.data

import io.brunk.deeplearnjs.math.{ DataType, NDArray, Rank }

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.{ Promise, | }

@js.native
trait DataStats extends js.Object {
  var exampleCount: Double
  var inputMin: Double
  var inputMax: Double
  var shape: js.Array[Double]
}

@js.native
@JSImport("deeplearn", "InMemoryDataset")
abstract class InMemoryDataset protected () extends js.Object {
  def this(dataShapes: js.Array[js.Array[Double]]) = this()
  protected var dataShapes: js.Array[js.Array[Double]]                      = js.native
  protected var dataset: js.Array[js.Array[NDArray[DataType, Rank]]] | Null = js.native
  def getDataShape(dataIndex: Double): js.Array[Double]                     = js.native
  def fetchData(): Promise[Unit]
  def getData(): js.Array[js.Array[NDArray[DataType, Rank]]] | Null = js.native
  def getStats(): js.Array[DataStats]                               = js.native
  def normalizeWithinBounds(dataIndex: Double, lowerBound: Double, upperBound: Double): Unit =
    js.native
  def removeNormalization(dataIndex: Double): Unit = js.native
  def unnormalizeExamples(examples: js.Array[NDArray[DataType, Rank]],
                          dataIndex: Double): js.Array[NDArray[DataType, Rank]] =
    js.native
  def dispose(): Unit = js.native
}

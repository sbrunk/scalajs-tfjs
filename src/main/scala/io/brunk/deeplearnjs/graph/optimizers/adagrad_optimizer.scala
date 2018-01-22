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

package io.brunk.deeplearnjs.graph.optimizers

import io.brunk.deeplearnjs.graph.{Node, SummedTensorArrayMap, TensorArrayMap}
import io.brunk.deeplearnjs.graph.Session.SessionRuntime
import io.brunk.deeplearnjs.math.NDArrayMath
import io.brunk.deeplearnjs.math.optimizers.Optimizer

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSImport("deeplearn", "AdagradOptimizer")
class AdagradOptimizer protected () extends Optimizer {
  def this(learningRate: Double, specifiedVariableList: js.Array[Node] = ???) = this()
  //protected var learningRate: Double = js.native
  def applyGradients(variableGradients: NamedVariableMap): Unit = js.native
  override def beforeBatch(math: NDArrayMath,
                           batchSize: Double,
                           runtime: SessionRuntime,
                           activationArrayMap: TensorArrayMap,
                           gradientArrayMap: SummedTensorArrayMap): Unit = js.native
  def afterBatch(math: NDArrayMath,
                 batchSize: Double,
                 runtime: SessionRuntime,
                 activationArrayMap: TensorArrayMap,
                 gradientArrayMap: SummedTensorArrayMap): Unit = js.native
  override def dispose(): Unit                                 = js.native
}

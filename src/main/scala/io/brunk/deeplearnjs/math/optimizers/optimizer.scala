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

package io.brunk.deeplearnjs.math.optimizers

import io.brunk.deeplearnjs.graph.Session.SessionRuntime
import io.brunk.deeplearnjs.graph.{Node, SummedTensorArrayMap, TensorArrayMap, VariableNode}
import io.brunk.deeplearnjs.math.{NDArrayMath, Scalar}

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
@JSImport("deeplearn", "Optimizer")
abstract class Optimizer protected () extends js.Object {
  def this(learningRate: Double, specifiedVariableList: js.Array[Node] = ???) = this()
  protected var learningRate: Double                                  = js.native
  protected var variableNodes: js.Array[VariableNode]                 = js.native
  protected var specifiedVariableNodes: js.Array[VariableNode] | Null = js.native
  def minimize[D <: DataType](f: js.Function0[Scalar[D]],
                              returnCost: Boolean = ???): Scalar[D] | Null = js.native
  def computeGradients[D <: DataType](f: js.Function0[Scalar[D]]): js.Any  = js.native
  def applyGradients(variableGradients: NamedVariableMap): Unit
  def beforeBatch(math: NDArrayMath,
                  batchSize: Double,
                  runtime: SessionRuntime,
                  activationArrayMap: TensorArrayMap,
                  gradientArrayMap: SummedTensorArrayMap): Unit = js.native
  def afterExample(math: NDArrayMath,
                   runtime: SessionRuntime,
                   activationArrayMap: TensorArrayMap,
                   gradientArrayMap: SummedTensorArrayMap): Unit = js.native
  def afterBatch(math: NDArrayMath,
                 batchSize: Double,
                 runtime: SessionRuntime,
                 activationArrayMap: TensorArrayMap,
                 gradientArrayMap: SummedTensorArrayMap): Unit
  def dispose(): Unit                             = js.native
  protected var variableGradients: TensorArrayMap = js.native
  protected var prevBatchSize: Double             = js.native
  protected var one: Scalar                       = js.native
  protected var cGraph: Scalar                    = js.native
}

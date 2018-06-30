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

package io.brunk.tfjs.layers

import io.brunk.tfjs.core.{ DataType, Variable }
import io.brunk.tfjs.layers.Types.Shape
import io.brunk.tfjs.core.TensorModule.{ TensorND, VariableND }

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class LayerVariable protected () extends js.Object {
  def this(
      `val`: TensorND,
      dtype: DataType = ???,
      name: String = ???,
      trainable: Boolean = ???,
      constraint: Constraint = ???
  ) = this()
  def dtype: DataType                    = js.native
  def shape: Shape                       = js.native
  def id: Double                         = js.native
  def name: String                       = js.native
  def originalName: String               = js.native
  def trainable: Boolean                 = js.native
  protected def `val`: VariableND        = js.native
  def constraint: Constraint             = js.native
  def read(): TensorND                   = js.native
  def write(newVal: TensorND): this.type = js.native
}

@js.native
@JSGlobalScope
object Variables extends js.Object {
  def variable(
      x: TensorND,
      dtype: DataType = ???,
      name: String = ???,
      constraint: Constraint = ???
  ): LayerVariable = js.native
  def zerosVariable(shape: Shape, dtype: DataType = ???, name: String = ???): LayerVariable =
    js.native
  def zerosLike(x: TensorND, dtype: DataType = ???, name: String = ???): LayerVariable = js.native
  def onesVariable(shape: Shape, dtype: DataType = ???, name: String = ???): LayerVariable =
    js.native
  def onesLike(x: TensorND, dtype: DataType = ???, name: String = ???): LayerVariable = js.native
  def eyeVariable(size: Double, dtype: DataType = ???, name: String = ???): LayerVariable =
    js.native
  def randomUniformVariable(
      shape: Shape,
      minval: Double,
      maxval: Double,
      dtype: DataType = ???,
      seed: Double = ???,
      name: String = ???
  ): LayerVariable = js.native
  def truncatedNormalVariable(
      shape: Shape,
      mean: Double = ???,
      stddev: Double = ???,
      dtype: DataType = ???,
      seed: Double = ???,
      name: String = ???
  ): LayerVariable = js.native
  def randomNormalVariable(
      shape: Shape,
      mean: Double = ???,
      stddev: Double = ???,
      dtype: DataType = ???,
      seed: Double = ???,
      name: String = ???
  ): LayerVariable                                                    = js.native
  def update(x: LayerVariable, xNew: TensorND): LayerVariable         = js.native
  def updateAdd(x: LayerVariable, increment: TensorND): LayerVariable = js.native
  def updateSub(x: LayerVariable, decrement: TensorND): LayerVariable = js.native
  def batchGetValue(xs: js.Array[LayerVariable]): js.Array[TensorND]  = js.native
  def batchSetValue(variablesAndValues: js.Array[js.Tuple2[LayerVariable, TensorND]]): Unit =
    js.native
}

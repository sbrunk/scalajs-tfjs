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

package io.brunk.tfjs.core.ops

import io.brunk.tfjs.core.TensorModule.TensorND

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
sealed trait Reduction extends js.Object {}

@js.native
@JSGlobal
object Reduction extends js.Object {
  var NONE: Reduction                   = js.native
  var MEAN: Reduction                   = js.native
  var SUM: Reduction                    = js.native
  var SUM_BY_NONZERO_WEIGHTS: Reduction = js.native
  @JSBracketAccess
  def apply(value: Reduction): String = js.native
}

@js.native
trait LossOps extends js.Object {
  def computeWeightedLoss[T <: TensorND, O <: TensorND](
      losses: T,
      weights: TensorND = ???,
      reduction: Reduction = ???
  ): O = js.native
  def absoluteDifference[T <: TensorND, O <: TensorND](
      labels: T,
      predictions: T,
      weights: TensorND = ???,
      reduction: Reduction = ???
  ): O = js.native
  def meanSquaredError[T <: TensorND, O <: TensorND](
      labels: T,
      predictions: T,
      weights: TensorND = ???,
      reduction: Reduction = ???
  ): O = js.native
  def cosineDistance[T <: TensorND, O <: TensorND](
      labels: T,
      predictions: T,
      axis: Double,
      weights: TensorND = ???,
      reduction: Reduction = ???
  ): O = js.native
  def hingeLoss[T <: TensorND, O <: TensorND](
      labels: T,
      predictions: T,
      weights: TensorND = ???,
      reduction: Reduction = ???
  ): O = js.native
  def logLoss[T <: TensorND, O <: TensorND](
      labels: T,
      predictions: T,
      weights: TensorND = ???,
      epsilon: Double = ???,
      reduction: Reduction = ???
  ): O = js.native
  def huberLoss[T <: TensorND, O <: TensorND](
      labels: T,
      predictions: T,
      weights: TensorND = ???,
      delta: Double = ???,
      reduction: Reduction = ???
  ): O = js.native
}

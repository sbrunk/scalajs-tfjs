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

import scala.scalajs.js
import js.annotation._
import js.|

package loss_ops {

@js.native
sealed trait Reduction extends js.Object {
}

@js.native
@JSGlobal
object Reduction extends js.Object {
  var NONE: Reduction = js.native
  var MEAN: Reduction = js.native
  var SUM: Reduction = js.native
  var SUM_BY_NONZERO_WEIGHTS: Reduction = js.native
  @JSBracketAccess
  def apply(value: Reduction): String = js.native
}

@js.native
@JSGlobalScope
object Loss_ops extends js.Object {
  def computeWeightedLoss_[T <: Tensor, O <: Tensor](losses: T | TensorLike, weights: Tensor | TensorLike = ???, reduction: Reduction = ???): O = js.native
  def absoluteDifference_[T <: Tensor, O <: Tensor](labels: T | TensorLike, predictions: T | TensorLike, weights: Tensor | TensorLike = ???, reduction: Reduction = ???): O = js.native
  def meanSquaredError_[T <: Tensor, O <: Tensor](labels: T | TensorLike, predictions: T | TensorLike, weights: Tensor | TensorLike = ???, reduction: Reduction = ???): O = js.native
  def cosineDistance_[T <: Tensor, O <: Tensor](labels: T | TensorLike, predictions: T | TensorLike, axis: Double, weights: Tensor | TensorLike = ???, reduction: Reduction = ???): O = js.native
  def hingeLoss_[T <: Tensor, O <: Tensor](labels: T | TensorLike, predictions: T | TensorLike, weights: Tensor | TensorLike = ???, reduction: Reduction = ???): O = js.native
  def logLoss_[T <: Tensor, O <: Tensor](labels: T | TensorLike, predictions: T | TensorLike, weights: Tensor | TensorLike = ???, epsilon: Double = ???, reduction: Reduction = ???): O = js.native
  def sigmoidCrossEntropy_[T <: Tensor, O <: Tensor](multiClassLabels: T | TensorLike, logits: T | TensorLike, weights: Tensor | TensorLike = ???, labelSmoothing: Double = ???, reduction: Reduction = ???): O = js.native
  def huberLoss_[T <: Tensor, O <: Tensor](labels: T | TensorLike, predictions: T | TensorLike, weights: Tensor | TensorLike = ???, delta: Double = ???, reduction: Reduction = ???): O = js.native
  def softmaxCrossEntropy_[T <: Tensor, O <: Tensor](onehotLabels: T | TensorLike, logits: T | TensorLike, weights: Tensor | TensorLike = ???, labelSmoothing: Double = ???, reduction: Reduction = ???): O = js.native
  val absoluteDifference: absoluteDifference_.type = js.native
  val computeWeightedLoss: computeWeightedLoss_.type = js.native
  val cosineDistance: cosineDistance_.type = js.native
  val hingeLoss: hingeLoss_.type = js.native
  val huberLoss: huberLoss_.type = js.native
  val logLoss: logLoss_.type = js.native
  val meanSquaredError: meanSquaredError_.type = js.native
  val sigmoidCrossEntropy: sigmoidCrossEntropy_.type = js.native
  val softmaxCrossEntropy: softmaxCrossEntropy_.type = js.native
}

}

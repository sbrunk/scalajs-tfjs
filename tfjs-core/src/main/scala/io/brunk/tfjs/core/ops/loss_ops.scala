package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

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
@JSGlobal
class LossOps extends js.Object {
}

@js.native
@JSGlobal
object LossOps extends js.Object {
  def computeWeightedLoss[T <: Tensor, O <: Tensor](losses: T, weights: Tensor = ???, reduction: Reduction = ???): O = js.native
  def absoluteDifference[T <: Tensor, O <: Tensor](labels: T, predictions: T, weights: Tensor = ???, reduction: Reduction = ???): O = js.native
  def meanSquaredError[T <: Tensor, O <: Tensor](labels: T, predictions: T, weights: Tensor = ???, reduction: Reduction = ???): O = js.native
  def cosineDistance[T <: Tensor, O <: Tensor](labels: T, predictions: T, axis: Double, weights: Tensor = ???, reduction: Reduction = ???): O = js.native
  def hingeLoss[T <: Tensor, O <: Tensor](labels: T, predictions: T, weights: Tensor = ???, reduction: Reduction = ???): O = js.native
  def logLoss[T <: Tensor, O <: Tensor](labels: T, predictions: T, weights: Tensor = ???, epsilon: Double = ???, reduction: Reduction = ???): O = js.native
}

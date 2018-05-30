package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Losses extends js.Object {
  def meanSquaredError(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def meanAbsoluteError(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def meanAbsolutePercentageError(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def meanSquaredLogarithmicError(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def squaredHinge(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def hinge(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def categoricalHinge(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def logcosh(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def categoricalCrossentropy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def sparseCategoricalCrossentropy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def binaryCrossentropy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def kullbackLeiblerDivergence(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def poisson(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def cosineProximity(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  val mse: meanSquaredError.type = js.native
  val MSE: meanSquaredError.type = js.native
  val mae: meanAbsoluteError.type = js.native
  val MAE: meanAbsoluteError.type = js.native
  val mape: meanAbsolutePercentageError.type = js.native
  val MAPE: meanAbsolutePercentageError.type = js.native
  val msle: meanSquaredLogarithmicError.type = js.native
  val MSLE: meanSquaredLogarithmicError.type = js.native
  val kld: kullbackLeiblerDivergence.type = js.native
  val KLD: kullbackLeiblerDivergence.type = js.native
  val cosine: cosineProximity.type = js.native
  def get(identifierOrFn: String | LossOrMetricFn): LossOrMetricFn = js.native
}

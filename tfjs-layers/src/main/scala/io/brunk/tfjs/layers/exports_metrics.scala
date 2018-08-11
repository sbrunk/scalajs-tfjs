package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|


@js.native
@JSGlobalScope
object Exports_metrics extends js.Object {
  def binaryAccuracy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def binaryCrossentropy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def categoricalAccuracy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def categoricalCrossentropy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def cosineProximity(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def meanAbsoluteError(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def meanAbsolutePercentageError(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def MAPE(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def mape(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def meanSquaredError(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def MSE(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def mse(yTrue: Tensor, yPred: Tensor): Tensor = js.native
}


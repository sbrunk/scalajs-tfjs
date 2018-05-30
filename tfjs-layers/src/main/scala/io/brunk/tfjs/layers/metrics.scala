package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Metrics extends js.Object {
  def binaryAccuracy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def categoricalAccuracy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def binaryCrossentropy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def sparseCategoricalAccuracy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def topKCategoricalAccuracy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def sparseTopKCategoricalAccuracy(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  val mse: meanSquaredError.type = js.native
  val MSE: meanSquaredError.type = js.native
  val mae: meanAbsoluteError.type = js.native
  val MAE: meanAbsoluteError.type = js.native
  val mape: meanAbsolutePercentageError.type = js.native
  val MAPE: meanAbsolutePercentageError.type = js.native
  val categoricalCrossentropy: categoricalCrossentropyLoss.type = js.native
  val cosine: cosineProximity.type = js.native
  val sparseCategoricalCrossentropy: sparseCategoricalCrossentropyLoss.type = js.native
  def get(identifier: String | LossOrMetricFn): LossOrMetricFn = js.native
}

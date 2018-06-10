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
import io.brunk.tfjs.tf._

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Losses extends js.Object {
  def meanSquaredError(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def meanAbsoluteError(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def meanAbsolutePercentageError(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def meanSquaredLogarithmicError(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def squaredHinge(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def hinge(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def categoricalHinge(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def logcosh(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def categoricalCrossentropy(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def sparseCategoricalCrossentropy(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def binaryCrossentropy(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def kullbackLeiblerDivergence(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def poisson(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def cosineProximity(yTrue: TensorND, yPred: TensorND): TensorND = js.native
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

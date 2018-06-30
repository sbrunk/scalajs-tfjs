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

import io.brunk.tfjs.layers.Types.LossOrMetricFn
import io.brunk.tfjs.tf.TensorND

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Metrics extends js.Object {
  def binaryAccuracy(yTrue: TensorND, yPred: TensorND): TensorND                = js.native
  def categoricalAccuracy(yTrue: TensorND, yPred: TensorND): TensorND           = js.native
  def binaryCrossentropy(yTrue: TensorND, yPred: TensorND): TensorND            = js.native
  def sparseCategoricalAccuracy(yTrue: TensorND, yPred: TensorND): TensorND     = js.native
  def topKCategoricalAccuracy(yTrue: TensorND, yPred: TensorND): TensorND       = js.native
  def sparseTopKCategoricalAccuracy(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  // aliases
  def mse(yTrue: TensorND, yPred: TensorND): TensorND                           = js.native // meanSquaredError
  def MSE(yTrue: TensorND, yPred: TensorND): TensorND                           = js.native // meanSquaredError
  def mae(yTrue: TensorND, yPred: TensorND): TensorND                           = js.native // meanAbsoluteError
  def MAE(yTrue: TensorND, yPred: TensorND): TensorND                           = js.native // meanAbsoluteError
  def mape(yTrue: TensorND, yPred: TensorND): TensorND                          = js.native //meanAbsolutePercentageError
  def MAPE(yTrue: TensorND, yPred: TensorND): TensorND                          = js.native //meanAbsolutePercentageError
  def categoricalCrossentropy(yTrue: TensorND, yPred: TensorND): TensorND       = js.native
  def cosine(yTrue: TensorND, yPred: TensorND): TensorND                        = js.native //cosineProximity
  def sparseCategoricalCrossentropy(yTrue: TensorND, yPred: TensorND): TensorND = js.native
  def get(identifier: String | LossOrMetricFn): LossOrMetricFn                  = js.native
}

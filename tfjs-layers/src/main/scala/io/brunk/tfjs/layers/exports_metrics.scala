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

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Exports_metrics extends js.Object {
  def binaryAccuracy(yTrue: Tensor, yPred: Tensor): Tensor              = js.native
  def binaryCrossentropy(yTrue: Tensor, yPred: Tensor): Tensor          = js.native
  def categoricalAccuracy(yTrue: Tensor, yPred: Tensor): Tensor         = js.native
  def categoricalCrossentropy(yTrue: Tensor, yPred: Tensor): Tensor     = js.native
  def cosineProximity(yTrue: Tensor, yPred: Tensor): Tensor             = js.native
  def meanAbsoluteError(yTrue: Tensor, yPred: Tensor): Tensor           = js.native
  def meanAbsolutePercentageError(yTrue: Tensor, yPred: Tensor): Tensor = js.native
  def MAPE(yTrue: Tensor, yPred: Tensor): Tensor                        = js.native
  def mape(yTrue: Tensor, yPred: Tensor): Tensor                        = js.native
  def meanSquaredError(yTrue: Tensor, yPred: Tensor): Tensor            = js.native
  def MSE(yTrue: Tensor, yPred: Tensor): Tensor                         = js.native
  def mse(yTrue: Tensor, yPred: Tensor): Tensor                         = js.native
}

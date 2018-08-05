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

package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

package model_types {

@js.native
trait ModelPredictConfig extends js.Object {
  var batchSize: Double = js.native
  var verbose: Boolean = js.native
}

@js.native
trait InferenceModel extends js.Object {
  def inputs: js.Array[TensorInfo] = js.native
  def outputs: js.Array[TensorInfo] = js.native
  def predict(inputs: Tensor | js.Array[Tensor] | NamedTensorMap, config: ModelPredictConfig): Tensor | js.Array[Tensor] | NamedTensorMap = js.native
  def execute(inputs: Tensor | js.Array[Tensor] | NamedTensorMap, outputs: String | js.Array[String]): Tensor | js.Array[Tensor] = js.native
}

}

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

package io.brunk.tfjs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("@tensorflow/tfjs-layers", JSImport.Namespace)
object tfl {
  // callbacks
  type Callback = layers.Callback
  type CallbackList = layers.CallbackList
  type CustomCallback = layers.CustomCallback
  type CustomCallbackConfig = layers.CustomCallbackConfig
  type Logs = layers.Callbacks.Logs
  // engine/training
  type Model = layers.engine.Model
  type ModelCompileConfig = layers.engine.ModelCompileConfig
  type ModelEvaluateConfig = layers.engine.ModelEvaluateConfig
  type ModelFitConfig = layers.engine.ModelFitConfig
  type ModelPredictConfig = layers.engine.ModelPredictConfig
  // layers/recurrent

}

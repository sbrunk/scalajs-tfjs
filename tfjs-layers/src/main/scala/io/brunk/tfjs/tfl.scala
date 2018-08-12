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
import io.brunk.tfjs.{layers => tflayers}

@js.native
@JSImport("@tensorflow/tfjs-layers", JSImport.Namespace)
object tfl extends tflayers.ModelExportsCompanion {
  // base_callbacks
  type CallbackList         = tflayers.CallbackList
  type CustomCallback       = tflayers.CustomCallback
  type CustomCallbackConfig = tflayers.CustomCallbackConfig
  // callbacks
  type Callback             = tflayers.Callback
  // engine/topology
  type SymbolicTensor = tflayers.engine.SymbolicTensor
  // engine/training
  type Model               = tflayers.engine.Model
  type ModelCompileConfig  = tflayers.engine.ModelCompileConfig
  type ModelEvaluateConfig = tflayers.engine.ModelEvaluateConfig
  type ModelFitConfig      = tflayers.engine.ModelFitConfig
  // layers/recurrent
  type GRUCellLayerConfig  = tflayers.layers.GRUCellLayerConfig
  type GRULayerConfig      = tflayers.layers.GRULayerConfig
  type LSTMCellLayerConfig = tflayers.layers.LSTMCellLayerConfig
  type LSTMLayerConfig     = tflayers.layers.LSTMLayerConfig
  type RNN                 = tflayers.layers.RNN
  val RNN: tflayers.layers.RNN.type = js.native
  type RNNLayerConfig           = tflayers.layers.RNNLayerConfig
  type SimpleRNNCellLayerConfig = tflayers.layers.SimpleRNNCellLayerConfig
  type SimpleRNNLayerConfig     = tflayers.layers.SimpleRNNLayerConfig
  // layers/logs
  val Logs: tflayers.Logs.type = js.native
  // models
  type ModelAndWeightsConfig = tflayers.ModelAndWeightsConfig
  type Sequential            = tflayers.Sequential
  val Sequential: tflayers.Sequential.type = js.native
  type SequentialConfig = tflayers.SequentialConfig
  // types
  type Shape          = tflayers.Types.Shape
  // variables
  type LayerVariable = tflayers.LayerVariable
  // version
  val version_layers: String = js.native
  // second level exports
  val constraints: tflayers.ConstraintExports.type   = js.native
  val initializers: tflayers.InitializerExports.type = js.native
  val layers: tflayers.LayerExports.type             = js.native
  type metrics = tflayers.MetricExports
  val metrics: tflayers.MetricExports.type           = js.native
  val regularizers: tflayers.RegularizerExports.type = js.native
}

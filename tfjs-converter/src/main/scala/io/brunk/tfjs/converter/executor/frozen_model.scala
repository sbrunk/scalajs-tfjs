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

package io.brunk.tfjs.converter.executor

import io.brunk.tfjs.core.TensorInfo

import scala.scalajs.js
import js.annotation._
import js.|
import io.brunk.tfjs.{tf => tfc}
import org.scalajs.dom.experimental.RequestInit

import scala.scalajs.js.Promise

@js.native
@JSGlobal
class FrozenModel protected () extends tfc.InferenceModel {
  def this(modelUrl: String, weightManifestUrl: String, requestOption: RequestInit = ???) = this()
  def modelVersion: String          = js.native
  def inputNodes: js.Array[String]  = js.native
  def outputNodes: js.Array[String] = js.native
  override def inputs: js.Array[TensorInfo]  = js.native
  override def outputs: js.Array[TensorInfo] = js.native
  def getPathPrefix(): String       = js.native
  def load(): Promise[Boolean]      = js.native
  override def predict(
      inputs: tfc.TensorND | js.Array[tfc.TensorND] | tfc.NamedTensorMap,
      config: tfc.ModelPredictConfig = ???
  ): tfc.TensorND | js.Array[tfc.TensorND] | tfc.NamedTensorMap = js.native
  override def execute(
      inputs: tfc.TensorND | js.Array[tfc.TensorND] | tfc.NamedTensorMap,
      outputs: String | js.Array[String] = ???
  ): tfc.TensorND | js.Array[tfc.TensorND] = js.native
  def executeAsync(
      inputs: tfc.TensorND | js.Array[tfc.TensorND] | tfc.NamedTensorMap,
      outputs: String | js.Array[String] = ???
  ): Promise[tfc.TensorND | js.Array[tfc.TensorND]] = js.native
  def dispose(): Unit                               = js.native
}

@js.native
trait FrozenModelModule extends js.Object {
  def loadFrozenModel(
    modelUrl: String,
    weightsManifestUrl: String,
    requestOption: RequestInit = ???
  ): Promise[FrozenModel] = js.native
}


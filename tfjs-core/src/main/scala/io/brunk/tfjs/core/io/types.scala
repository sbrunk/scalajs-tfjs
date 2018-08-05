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

package io.brunk.tfjs.core.io

import scala.scalajs.js
import js.annotation._
import js.|

package types {

@js.native
@JSGlobal
object DTYPE_VALUE_SIZE_MAP extends js.Object {
  @JSBracketAccess
  def apply(dtype: String): Double = js.native
  @JSBracketAccess
  def update(dtype: String, v: Double): Unit = js.native
}

@js.native
trait WeightsManifestGroupConfig extends js.Object {
  var paths: js.Array[String] = js.native
  var weights: js.Array[WeightsManifestEntry] = js.native
}

@js.native
trait WeightsManifestEntry extends js.Object {
  var name: String = js.native
  var shape: js.Array[Double] = js.native
  var dtype: String = js.native
  var quantization: WeightsManifestEntry.Quantization = js.native
}

object WeightsManifestEntry {

@js.native
trait Quantization extends js.Object {
  var scale: Double = js.native
  var min: Double = js.native
  var dtype: String = js.native
}
}

@js.native
trait SaveConfig extends js.Object {
  var trainableOnly: Boolean = js.native
}

@js.native
trait SaveResult extends js.Object {
  var modelArtifactsInfo: ModelArtifactsInfo = js.native
  var responses: js.Array[Response] = js.native
  var errors: js.Array[js.Any | String] = js.native
}

@js.native
trait ModelArtifactsInfo extends js.Object {
  var dateSaved: Date = js.native
  var modelTopologyType: String = js.native
  var modelTopologyBytes: Double = js.native
  var weightSpecsBytes: Double = js.native
  var weightDataBytes: Double = js.native
}

@js.native
trait ModelArtifacts extends js.Object {
  var modelTopology: js.Any | ArrayBuffer = js.native
  var weightSpecs: js.Array[WeightsManifestEntry] = js.native
  var weightData: ArrayBuffer = js.native
}

@js.native
trait IOHandler extends js.Object {
  var save: SaveHandler = js.native
  var load: LoadHandler = js.native
}

@js.native
trait ModelStoreManager extends js.Object {
  def listModels(): Promise[js.Dictionary[ModelArtifactsInfo]] = js.native
  def removeModel(path: String): Promise[ModelArtifactsInfo] = js.native
}

@js.native
@JSGlobalScope
object Types extends js.Object {
  type WeightsManifestConfig = js.Array[WeightsManifestGroupConfig]
  type LoadHandler = js.Function0[Promise[ModelArtifacts]]
  type SaveHandler = js.Function1[ModelArtifacts, Promise[SaveResult]]
}

}

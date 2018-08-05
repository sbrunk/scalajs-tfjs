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

package io_utils {

@js.native
@JSGlobalScope
object Io_utils extends js.Object {
  def encodeWeights(tensors: NamedTensorMap): Promise[js.Any] = js.native
  def decodeWeights(buffer: ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = js.native
  def concatenateTypedArrays(xs: js.Array[TypedArray]): ArrayBuffer = js.native
  def stringByteLength(str: String): Double = js.native
  def arrayBufferToBase64String(buffer: ArrayBuffer): String = js.native
  def base64StringToArrayBuffer(str: String): ArrayBuffer = js.native
  def concatenateArrayBuffers(buffers: js.Array[ArrayBuffer]): ArrayBuffer = js.native
  def basename(path: String): String = js.native
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = js.native
}

}

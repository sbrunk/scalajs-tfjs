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

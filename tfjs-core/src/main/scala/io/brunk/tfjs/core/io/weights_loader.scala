package io.brunk.tfjs.core.io

import scala.scalajs.js
import js.annotation._
import js.|

package weights_loader {

@js.native
@JSGlobalScope
object Weights_loader extends js.Object {
  def loadWeightsAsArrayBuffer(fetchURLs: js.Array[String], requestOptions: RequestInit = ???): Promise[js.Array[ArrayBuffer]] = js.native
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String = ???, weightNames: js.Array[String] = ???, requestOptions: RequestInit = ???): Promise[NamedTensorMap] = js.native
}

}

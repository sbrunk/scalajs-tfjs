package io.brunk.tfjs.core.io

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Weights_loader extends js.Object {
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String = ???, weightNames: js.Array[String] = ???, requestOptions: RequestInit = ???): Promise[NamedTensorMap] = js.native
}

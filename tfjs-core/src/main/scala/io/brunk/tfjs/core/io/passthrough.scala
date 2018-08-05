package io.brunk.tfjs.core.io

import scala.scalajs.js
import js.annotation._
import js.|

package passthrough {

@js.native
@JSGlobalScope
object Passthrough extends js.Object {
  def fromMemory(modelTopology: js.Any, weightSpecs: js.Array[WeightsManifestEntry] = ???, weightData: ArrayBuffer = ???): IOHandler = js.native
  def withSaveHandler(saveHandler: js.Function1[ModelArtifacts, SaveResult]): IOHandler = js.native
}

}

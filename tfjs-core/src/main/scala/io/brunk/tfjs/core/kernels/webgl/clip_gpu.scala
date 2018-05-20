package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package clip_gpu {

@js.native
@JSGlobal
class ClipProgram protected () extends GPGPUProgram {
  def this(aShape: js.Array[Double], min: Double, max: Double) = this()
  var variableNames: js.Array[String] = js.native
  var userCode: String = js.native
  var outputShape: js.Array[Double] = js.native
}

}

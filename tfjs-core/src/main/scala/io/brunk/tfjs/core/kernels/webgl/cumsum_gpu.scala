package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package cumsum_gpu {

@js.native
@JSGlobal
class CumSumProgram protected () extends GPGPUProgram {
  def this(shape: js.Array[Double], exclusive: Boolean, reverse: Boolean) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
}

}

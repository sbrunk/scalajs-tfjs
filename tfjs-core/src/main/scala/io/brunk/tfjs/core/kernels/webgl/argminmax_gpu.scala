package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package argminmax_gpu {

@js.native
@JSGlobal
class ArgMinMaxProgram protected () extends GPGPUProgram {
  def this(reduceInfo: ReduceInfo, op: String, firstPass: Boolean) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
}

}

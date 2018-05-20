package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package concat_gpu {

@js.native
@JSGlobal
class ConcatProgram protected () extends GPGPUProgram {
  def this(aShape: js.Tuple2[Double, Double], bShape: js.Tuple2[Double, Double]) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
}

}

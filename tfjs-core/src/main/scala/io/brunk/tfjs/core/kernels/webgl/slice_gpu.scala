package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package slice_gpu {

@js.native
@JSGlobal
class SliceProgram protected () extends GPGPUProgram {
  def this(destSize: js.Array[Double]) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
  var rank: Double = js.native
  var startLoc: WebGLUniformLocation = js.native
  def getCustomSetupFunc(start: js.Array[Double]): js.Function2[GPGPUContext, WebGLProgram, Unit] = js.native
}

}

package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package onehot_gpu {

@js.native
@JSGlobal
class OneHotProgram protected () extends GPGPUProgram {
  def this(numIndices: Double, depth: Double, onValue: Double, offValue: Double) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
  var seedLoc: WebGLUniformLocation = js.native
}

}

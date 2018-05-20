package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package lrn_gpu {

@js.native
@JSGlobal
class LRNProgram protected () extends GPGPUProgram {
  def this(xShape: js.Array[Double], radius: Double, bias: Double, alpha: Double, beta: Double) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
}

}

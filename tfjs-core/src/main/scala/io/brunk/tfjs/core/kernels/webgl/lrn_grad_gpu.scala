package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package lrn_grad_gpu {

@js.native
@JSGlobal
class LRNGradProgram protected () extends GPGPUProgram {
  def this(inputShape: js.Array[Double], depthRadius: Double, bias: Double, alpha: Double, beta: Double) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
  var depthRadius: Double = js.native
  var bias: Double = js.native
  var alpha: Double = js.native
  var beta: Double = js.native
  var depth: Double = js.native
}

}

package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package max_pool_backprop_gpu {

@js.native
@JSGlobal
class MaxPool2DBackpropProgram protected () extends GPGPUProgram {
  def this(convInfo: Conv2DInfo) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
}

}

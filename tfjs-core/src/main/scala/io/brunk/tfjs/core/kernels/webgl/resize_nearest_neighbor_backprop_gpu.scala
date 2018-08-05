package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package resize_nearest_neighbor_backprop_gpu {

@js.native
@JSGlobal
class ResizeNearestNeigborBackpropProgram protected () extends GPGPUProgram {
  def this(dy: Tensor4D, x: Tensor4D, alignCorners: Boolean) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
}

}

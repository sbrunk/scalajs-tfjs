package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package strided_slice_gpu {

@js.native
@JSGlobal
class StridedSliceProgram protected () extends GPGPUProgram {
  def this(begin: js.Array[Double], strides: js.Array[Double], shape: js.Array[Double]) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
  var rank: Double = js.native
}

}

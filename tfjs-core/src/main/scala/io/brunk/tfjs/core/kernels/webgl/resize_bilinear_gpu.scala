package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package resize_bilinear_gpu {

@js.native
@JSGlobal
class ResizeBilinearProgram protected () extends GPGPUProgram {
  def this(inputShape: js.Tuple4[Double, Double, Double, Double], newHeight: Double, newWidth: Double, alignCorners: Boolean) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
}

}

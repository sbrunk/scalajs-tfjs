package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package from_pixels_gpu {

@js.native
@JSGlobal
class FromPixelsProgram protected () extends GPGPUProgram {
  def this(outputShape: js.Array[Double]) = this()
  var variableNames: js.Array[String] = js.native
  var userCode: String = js.native
  var outputShape: js.Array[Double] = js.native
}

}

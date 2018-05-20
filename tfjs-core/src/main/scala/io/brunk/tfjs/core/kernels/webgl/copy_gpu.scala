package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package copy_gpu {

@js.native
@JSGlobal
class Copy2DProgram protected () extends GPGPUProgram {
  def this(srcNumCols: Double, destNumCols: Double) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
  def getCustomSetupFunc(sourceStart: js.Tuple2[Double, Double], destStart: js.Tuple2[Double, Double], destSize: js.Tuple2[Double, Double]): js.Function2[GPGPUContext, WebGLProgram, Unit] = js.native
}

}

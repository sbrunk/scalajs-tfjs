package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class BatchNormProgram protected () extends GPGPUProgram {
  def this(xShape: js.Array[Double], meanShape: js.Array[Double], varianceShape: js.Array[Double], offsetShape: js.Array[Double] | Null, scaleShape: js.Array[Double] | Null, varianceEpsilon: Double) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
  var supportsBroadcasting: Boolean = js.native
}

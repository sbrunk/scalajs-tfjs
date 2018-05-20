package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class MatMulProgram protected () extends GPGPUProgram {
  def this(aShape: js.Tuple2[Double, Double], bShape: js.Tuple2[Double, Double], transposeA: Boolean = ???, transposeB: Boolean = ???) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
}

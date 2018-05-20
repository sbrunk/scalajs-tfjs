package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class TileProgram protected () extends GPGPUProgram {
  def this(aShape: js.Array[Double], reps: js.Array[Double]) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
  var rank: Double = js.native
}

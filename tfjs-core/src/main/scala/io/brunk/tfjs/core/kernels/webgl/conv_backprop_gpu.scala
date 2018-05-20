package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class Conv2DDerFilterProgram protected () extends GPGPUProgram {
  def this(convInfo: Conv2DInfo) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
}

@js.native
@JSGlobal
class Conv2DDerInputProgram protected () extends GPGPUProgram {
  def this(convInfo: Conv2DInfo) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
}

package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Shader_compiler extends js.Object {
  type ShapeInfo = js.Any
  type InputInfo = js.Any
  def makeShader(inputsInfo: js.Array[InputInfo], outputShape: ShapeInfo, userCode: String, broadcast: Boolean): String = js.native
  def getCoordsDataType(rank: Double): String = js.native
}

package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
sealed trait MatrixOrientation extends js.Object {
}

@js.native
@JSGlobal
object MatrixOrientation extends js.Object {
  var REGULAR: MatrixOrientation = js.native
  var TRANSPOSED: MatrixOrientation = js.native
  @JSBracketAccess
  def apply(value: MatrixOrientation): String = js.native
}

@js.native
@JSGlobalScope
object Mulmat_packed_gpu extends js.Object {
  def getFragmentShaderSource(sharedDimension: Double, aOrientation: MatrixOrientation, bOrientation: MatrixOrientation): String = js.native
  def multiplyMatrixPacked(gpgpu: GPGPUContext, multiplyProgram: WebGLProgram, a: WebGLTexture, b: WebGLTexture, result: WebGLTexture, resultShapeRowCol: js.Tuple2[Double, Double]): Unit = js.native
  def uploadMultiplyMatrixPackedDownload(a: Float32Array, aShapeRowCol: js.Tuple2[Double, Double], b: Float32Array, bShapeRowCol: js.Tuple2[Double, Double], aOrientation: MatrixOrientation = ???, bOrientation: MatrixOrientation = ???): Float32Array = js.native
}

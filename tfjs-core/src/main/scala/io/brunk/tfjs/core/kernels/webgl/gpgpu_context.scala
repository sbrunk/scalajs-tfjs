package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package gpgpu_context {

@js.native
@JSGlobal
class GPGPUContext protected () extends js.Object {
  def this(gl: WebGLRenderingContext = ???) = this()
  var gl: WebGLRenderingContext = js.native
  var loseContextExtension: WebGLLoseContextExtension = js.native
  var disjointQueryTimerExtension: WebGL2DisjointQueryTimerExtension | WebGL1DisjointQueryTimerExtension = js.native
  var vertexBuffer: WebGLBuffer = js.native
  var indexBuffer: WebGLBuffer = js.native
  var framebuffer: WebGLFramebuffer = js.native
  var outputTexture: WebGLTexture | Null = js.native
  var program: WebGLProgram | Null = js.native
  def dispose(): Unit = js.native
  def enableAutomaticDebugValidation(enabled: Boolean): Unit = js.native
  def createMatrixTexture(rows: Double, columns: Double): WebGLTexture = js.native
  def uploadPixelDataToTexture(texture: WebGLTexture, pixels: ImageData | HTMLImageElement | HTMLCanvasElement): Unit = js.native
  def createPackedMatrixTexture(rows: Double, columns: Double): WebGLTexture = js.native
  def deleteMatrixTexture(texture: WebGLTexture): Unit = js.native
  def uploadMatrixToTexture(texture: WebGLTexture, rows: Double, columns: Double, matrix: Float32Array): Unit = js.native
  def uploadMatrixToPackedTexture(texture: WebGLTexture, rows: Double, columns: Double, matrix: Float32Array): Unit = js.native
  def downloadMatrixFromTexture(texture: WebGLTexture, rows: Double, columns: Double): Float32Array = js.native
  def downloadMatrixFromTextureAsync(texture: WebGLTexture, rows: Double, columns: Double): Promise[Float32Array] = js.native
  def downloadMatrixFromRGBAColorTexture(texture: WebGLTexture, rows: Double, columns: Double, channels: Double): Float32Array = js.native
  def downloadMatrixFromPackedTexture(texture: WebGLTexture, rows: Double, columns: Double): Float32Array = js.native
  def createProgram(fragmentShaderSource: String): WebGLProgram = js.native
  def deleteProgram(program: WebGLProgram): Unit = js.native
  def setProgram(program: WebGLProgram | Null): Unit = js.native
  def getUniformLocation(program: WebGLProgram, uniformName: String, shouldThrow: Boolean = ???): WebGLUniformLocation = js.native
  def getAttributeLocation(program: WebGLProgram, attribute: String): Double = js.native
  def getUniformLocationNoThrow(program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
  def setInputMatrixTexture(inputMatrixTexture: WebGLTexture, uniformLocation: WebGLUniformLocation, textureUnit: Double): Unit = js.native
  def setOutputMatrixTexture(outputMatrixTexture: WebGLTexture, rows: Double, columns: Double): Unit = js.native
  def setOutputPackedMatrixTexture(outputPackedMatrixTexture: WebGLTexture, rows: Double, columns: Double): Unit = js.native
  def setOutputMatrixWriteRegion(startRow: Double, numRows: Double, startColumn: Double, numColumns: Double): Unit = js.native
  def setOutputPackedMatrixWriteRegion(startRow: Double, numRows: Double, startColumn: Double, numColumns: Double): Unit = js.native
  def debugValidate(): Unit = js.native
  def executeProgram(): Unit = js.native
  def blockUntilAllProgramsCompleted(): Unit = js.native
  def runQuery(queryFn: js.Function0[Unit]): Promise[Double] = js.native
  def beginQuery(): WebGLQuery = js.native
  def endQuery(): Unit = js.native
  def pollQueryTime(query: WebGLQuery): Promise[Double] = js.native
}

}

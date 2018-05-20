package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package gpgpu_util {

@js.native
@JSGlobalScope
object Gpgpu_util extends js.Object {
  def getWebGLContextAttributes(): WebGLContextAttributes = js.native
  def createWebGLContext(canvas: HTMLCanvasElement = ???): WebGLRenderingContext = js.native
  def createVertexShader(gl: WebGLRenderingContext): WebGLShader = js.native
  def createVertexBuffer(gl: WebGLRenderingContext): WebGLBuffer = js.native
  def createIndexBuffer(gl: WebGLRenderingContext): WebGLBuffer = js.native
  def createMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double): WebGLTexture = js.native
  def createColorMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double): WebGLTexture = js.native
  def createPackedMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double): WebGLTexture = js.native
  def bindVertexProgramAttributeStreams(gl: WebGLRenderingContext, program: WebGLProgram, vertexBuffer: WebGLBuffer): Boolean = js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement): Unit = js.native
  def uploadMatrixToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, rows: Double, columns: Double, matrix: Float32Array, numChannels: Double): Unit = js.native
  def uploadMatrixToPackedTexture(gl: WebGLRenderingContext, texture: WebGLTexture, rows: Double, columns: Double, matrix: Float32Array): Unit = js.native
  def downloadMatrixFromOutputTextureAsync(gl: WebGLRenderingContext, getBufferSubDataAsyncExtension: js.Any, rows: Double, columns: Double): Promise[Float32Array] = js.native
  def downloadMatrixFromOutputTexture(gl: WebGLRenderingContext, rows: Double, columns: Double): Float32Array = js.native
  def downloadMatrixFromRGBAColorTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, channels: Double): Float32Array = js.native
  def downloadMatrixFromPackedOutputTexture(gl: WebGLRenderingContext, rows: Double, columns: Double): Float32Array = js.native
}

}

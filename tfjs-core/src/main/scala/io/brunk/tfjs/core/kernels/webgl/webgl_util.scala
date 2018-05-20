package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package webgl_util {

@js.native
@JSGlobalScope
object Webgl_util extends js.Object {
  def createWebGLRenderingContext(attributes: WebGLContextAttributes): WebGLRenderingContext = js.native
  def createWebGLRenderingContextFromCanvas(canvas: HTMLCanvasElement, attributes: WebGLContextAttributes): WebGLRenderingContext = js.native
  def callAndCheck[T](gl: WebGLRenderingContext, func: js.Function0[T]): T = js.native
  def enableDebugWebGLErrorChecking(enabled: Boolean): Unit = js.native
  def checkWebGLError(gl: WebGLRenderingContext): Unit = js.native
  def getWebGLErrorMessage(gl: WebGLRenderingContext, status: Double): String = js.native
  def getExtensionOrThrow(gl: WebGLRenderingContext, extensionName: String): js.Any = js.native
  def createVertexShader(gl: WebGLRenderingContext, vertexShaderSource: String): WebGLShader = js.native
  def createFragmentShader(gl: WebGLRenderingContext, fragmentShaderSource: String): WebGLShader = js.native
  def createProgram(gl: WebGLRenderingContext): WebGLProgram = js.native
  def linkProgram(gl: WebGLRenderingContext, program: WebGLProgram): Unit = js.native
  def validateProgram(gl: WebGLRenderingContext, program: WebGLProgram): Unit = js.native
  def createStaticVertexBuffer(gl: WebGLRenderingContext, data: Float32Array): WebGLBuffer = js.native
  def createStaticIndexBuffer(gl: WebGLRenderingContext, data: Uint16Array): WebGLBuffer = js.native
  def queryMaxTextureSize(gl: WebGLRenderingContext): Double = js.native
  def getChannelsPerTexture(): Double = js.native
  def createTexture(gl: WebGLRenderingContext): WebGLTexture = js.native
  def validateTextureSize(gl: WebGLRenderingContext, width: Double, height: Double): Unit = js.native
  def createFramebuffer(gl: WebGLRenderingContext): WebGLFramebuffer = js.native
  def bindVertexBufferToProgramAttribute(gl: WebGLRenderingContext, program: WebGLProgram, attribute: String, buffer: WebGLBuffer, arrayEntriesPerItem: Double, itemStrideInBytes: Double, itemOffsetInBytes: Double): Boolean = js.native
  def bindTextureUnit(gl: WebGLRenderingContext, texture: WebGLTexture, textureUnit: Double): Unit = js.native
  def unbindTextureUnit(gl: WebGLRenderingContext, textureUnit: Double): Unit = js.native
  def getProgramUniformLocationOrThrow(gl: WebGLRenderingContext, program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
  def getProgramUniformLocation(gl: WebGLRenderingContext, program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
  def bindTextureToProgramUniformSampler(gl: WebGLRenderingContext, program: WebGLProgram, texture: WebGLTexture, uniformSamplerLocation: WebGLUniformLocation, textureUnit: Double): Unit = js.native
  def bindCanvasToFramebuffer(gl: WebGLRenderingContext): Unit = js.native
  def bindColorTextureToFramebuffer(gl: WebGLRenderingContext, texture: WebGLTexture, framebuffer: WebGLFramebuffer): Unit = js.native
  def unbindColorTextureFromFramebuffer(gl: WebGLRenderingContext, framebuffer: WebGLFramebuffer): Unit = js.native
  def validateFramebuffer(gl: WebGLRenderingContext): Unit = js.native
  def getFramebufferErrorMessage(gl: WebGLRenderingContext, status: Double): String = js.native
  def getTextureShapeFromLogicalShape(gl: WebGLRenderingContext, logShape: js.Array[Double]): js.Tuple2[Double, Double] = js.native
}

}

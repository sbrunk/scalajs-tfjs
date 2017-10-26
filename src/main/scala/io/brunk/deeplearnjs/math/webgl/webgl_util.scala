/*
 * Copyright (c) 2017 Sören Brunk
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.brunk.deeplearnjs.math.webgl

import org.scalajs.dom.raw._

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ Float32Array, Uint16Array }

@js.native
trait WebGLContextAttributes extends js.Object {
  var alpha: Boolean                        = js.native
  var antialias: Boolean                    = js.native
  var premultipliedAlpha: Boolean           = js.native
  var preserveDrawingBuffer: Boolean        = js.native
  var depth: Boolean                        = js.native
  var stencil: Boolean                      = js.native
  var failIfMajorPerformanceCaveat: Boolean = js.native
}

@js.native
trait WebGLLoseContextExtension extends js.Object {
  def loseContext(): Unit = js.native
}

@js.native
@JSGlobalScope
object Webgl_util extends js.Object {
  def createWebGLRenderingContext(attributes: WebGLContextAttributes): WebGLRenderingContext =
    js.native
  def createWebGLRenderingContextFromCanvas(
      canvas: HTMLCanvasElement,
      attributes: WebGLContextAttributes
  ): WebGLRenderingContext                                                          = js.native
  def callAndCheck[T](gl: WebGLRenderingContext, func: js.Function0[T]): T          = js.native
  def enableDebugWebGLErrorChecking(enabled: Boolean): Unit                         = js.native
  def checkWebGLError(gl: WebGLRenderingContext): Unit                              = js.native
  def getWebGLErrorMessage(gl: WebGLRenderingContext, status: Double): String       = js.native
  def getExtensionOrThrow(gl: WebGLRenderingContext, extensionName: String): js.Any = js.native
  def createVertexShader(gl: WebGLRenderingContext, vertexShaderSource: String): WebGLShader =
    js.native
  def createFragmentShader(gl: WebGLRenderingContext, fragmentShaderSource: String): WebGLShader =
    js.native
  def createProgram(gl: WebGLRenderingContext): WebGLProgram                  = js.native
  def linkProgram(gl: WebGLRenderingContext, program: WebGLProgram): Unit     = js.native
  def validateProgram(gl: WebGLRenderingContext, program: WebGLProgram): Unit = js.native
  def createStaticVertexBuffer(gl: WebGLRenderingContext, data: Float32Array): WebGLBuffer =
    js.native
  def createStaticIndexBuffer(gl: WebGLRenderingContext, data: Uint16Array): WebGLBuffer =
    js.native
  def queryMaxTextureSize(gl: WebGLRenderingContext): Double = js.native
  def getChannelsPerTexture(): Double                        = js.native
  def createTexture(gl: WebGLRenderingContext): WebGLTexture = js.native
  def validateTextureSize(gl: WebGLRenderingContext, width: Double, height: Double): Unit =
    js.native
  def createFramebuffer(gl: WebGLRenderingContext): WebGLFramebuffer = js.native
  def bindVertexBufferToProgramAttribute(gl: WebGLRenderingContext,
                                         program: WebGLProgram,
                                         attribute: String,
                                         buffer: WebGLBuffer,
                                         arrayEntriesPerItem: Double,
                                         itemStrideInBytes: Double,
                                         itemOffsetInBytes: Double,
                                         attribLocations: js.Dictionary[Double] = ???): Unit =
    js.native
  def bindTextureUnit(gl: WebGLRenderingContext, texture: WebGLTexture, textureUnit: Double): Unit =
    js.native
  def unbindTextureUnit(gl: WebGLRenderingContext, textureUnit: Double): Unit = js.native
  def getProgramUniformLocationOrThrow(gl: WebGLRenderingContext,
                                       program: WebGLProgram,
                                       uniformName: String): WebGLUniformLocation = js.native
  def bindTextureToProgramUniformSampler(gl: WebGLRenderingContext,
                                         program: WebGLProgram,
                                         texture: WebGLTexture,
                                         uniformSamplerLocation: WebGLUniformLocation,
                                         textureUnit: Double): Unit = js.native
  def bindCanvasToFramebuffer(gl: WebGLRenderingContext): Unit      = js.native
  def bindColorTextureToFramebuffer(gl: WebGLRenderingContext,
                                    texture: WebGLTexture,
                                    framebuffer: WebGLFramebuffer): Unit = js.native
  def unbindColorTextureFromFramebuffer(gl: WebGLRenderingContext,
                                        framebuffer: WebGLFramebuffer): Unit        = js.native
  def validateFramebuffer(gl: WebGLRenderingContext): Unit                          = js.native
  def getFramebufferErrorMessage(gl: WebGLRenderingContext, status: Double): String = js.native
  def getTextureShapeFromLogicalShape(
      gl: WebGLRenderingContext,
      logShape: js.Array[Double],
      preferredTexShape: js.Tuple2[Double, Double] = ???
  ): js.Tuple2[Double, Double] = js.native
}

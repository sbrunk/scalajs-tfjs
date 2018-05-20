/*
 * Copyright 2017 Sören Brunk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|
import org.scalajs.dom.webgl
import org.scalajs.dom.html

import scala.scalajs.js.typedarray.{Float32Array, Uint16Array}


@js.native
@JSGlobalScope
object Webgl_util extends js.Object {
  def createWebGLRenderingContext(attributes: WebGLContextAttributes): WebGLRenderingContext =
    js.native
  def createWebGLRenderingContextFromCanvas(
      canvas: html.Canvas,
      attributes: webgl.ContextAttributes
  ): webgl.RenderingContext                                                          = js.native
  def callAndCheck[T](gl: webgl.RenderingContext, func: js.Function0[T]): T          = js.native
  def enableDebugWebGLErrorChecking(enabled: Boolean): Unit                         = js.native
  def checkWebGLError(gl: webgl.RenderingContext): Unit                              = js.native
  def getWebGLErrorMessage(gl: webgl.RenderingContext, status: Double): String       = js.native
  def getExtensionOrThrow(gl: webgl.RenderingContext, extensionName: String): js.Any = js.native
  def createVertexShader(gl: webgl.RenderingContext, vertexShaderSource: String): webgl.Shader =
    js.native
  def createFragmentShader(gl: webgl.RenderingContext, fragmentShaderSource: String): webgl.Shader =
    js.native
  def createProgram(gl: webgl.RenderingContext): webgl.Program                  = js.native
  def linkProgram(gl: webgl.RenderingContext, program: webgl.Program): Unit     = js.native
  def validateProgram(gl: webgl.RenderingContext, program: webgl.Program): Unit = js.native
  def createStaticVertexBuffer(gl: webgl.RenderingContext, data: Float32Array): webgl.Buffer =
    js.native
  def createStaticIndexBuffer(gl: webgl.RenderingContext, data: Uint16Array): webgl.Buffer = js.native
  def queryMaxTextureSize(gl: webgl.RenderingContext): Double                             = js.native
  def getChannelsPerTexture(): Double                                                    = js.native
  def createTexture(gl: webgl.RenderingContext): webgl.Texture                             = js.native
  def validateTextureSize(gl: webgl.RenderingContext, width: Double, height: Double): Unit =
    js.native
  def createFramebuffer(gl: webgl.RenderingContext): webgl.Framebuffer = js.native
  def bindVertexBufferToProgramAttribute(
      gl: webgl.RenderingContext,
      program: webgl.Program,
      attribute: String,
      buffer: webgl.Buffer,
      arrayEntriesPerItem: Double,
      itemStrideInBytes: Double,
      itemOffsetInBytes: Double
  ): Boolean = js.native
  def bindTextureUnit(gl: webgl.RenderingContext, texture: webgl.Texture, textureUnit: Double): Unit =
    js.native
  def unbindTextureUnit(gl: webgl.RenderingContext, textureUnit: Double): Unit = js.native
  def getProgramUniformLocationOrThrow(
      gl: webgl.RenderingContext,
      program: webgl.Program,
      uniformName: String
  ): webgl.UniformLocation = js.native
  def getProgramUniformLocation(
      gl: webgl.RenderingContext,
      program: webgl.Program,
      uniformName: String
  ): webgl.UniformLocation = js.native
  def bindTextureToProgramUniformSampler(
      gl: webgl.RenderingContext,
      program: webgl.Program,
      texture: webgl.Texture,
      uniformSamplerLocation: webgl.UniformLocation,
      textureUnit: Double
  ): Unit                                                      = js.native
  def bindCanvasToFramebuffer(gl: webgl.RenderingContext): Unit = js.native
  def bindColorTextureToFramebuffer(
      gl: webgl.RenderingContext,
      texture: webgl.Texture,
      framebuffer: webgl.Framebuffer
  ): Unit = js.native
  def unbindColorTextureFromFramebuffer(
      gl: webgl.RenderingContext,
      framebuffer: webgl.Framebuffer
  ): Unit                                                                           = js.native
  def validateFramebuffer(gl: webgl.RenderingContext): Unit                          = js.native
  def getFramebufferErrorMessage(gl: webgl.RenderingContext, status: Double): String = js.native
  def getTextureShapeFromLogicalShape(
      gl: webgl.RenderingContext,
      logShape: js.Array[Double]
  ): js.Tuple2[Double, Double] =
    js.native
}

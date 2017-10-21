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

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.Float32Array
import scala.scalajs.js.|

@js.native
@JSGlobalScope
object Gpgpu_util extends js.Object {
  def getWebGLContextAttributes(): WebGLContextAttributes                        = js.native
  def createWebGLContext(canvas: HTMLCanvasElement = ???): WebGLRenderingContext = js.native
  def createVertexShader(gl: WebGLRenderingContext): WebGLShader                 = js.native
  def createVertexBuffer(gl: WebGLRenderingContext): WebGLBuffer                 = js.native
  def createIndexBuffer(gl: WebGLRenderingContext): WebGLBuffer                  = js.native
  def createMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double): WebGLTexture =
    js.native
  def createColorMatrixTexture(gl: WebGLRenderingContext,
                               rows: Double,
                               columns: Double): WebGLTexture = js.native
  def createPackedMatrixTexture(gl: WebGLRenderingContext,
                                rows: Double,
                                columns: Double): WebGLTexture = js.native
  def bindVertexProgramAttributeStreams(gl: WebGLRenderingContext,
                                        program: WebGLProgram,
                                        vertexBuffer: WebGLBuffer,
                                        attribLocations: js.Dictionary[Double] = ???): Unit =
    js.native
  def uploadPixelDataToTexture(
      gl: WebGLRenderingContext,
      texture: WebGLTexture,
      pixels: ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement
  ): Unit = js.native
  def uploadMatrixToTexture(gl: WebGLRenderingContext,
                            texture: WebGLTexture,
                            rows: Double,
                            columns: Double,
                            matrix: Float32Array,
                            numChannels: Double): Unit = js.native
  def uploadMatrixToPackedTexture(gl: WebGLRenderingContext,
                                  texture: WebGLTexture,
                                  rows: Double,
                                  columns: Double,
                                  matrix: Float32Array): Unit = js.native
  def downloadMatrixFromOutputTexture(gl: WebGLRenderingContext,
                                      rows: Double,
                                      columns: Double): Float32Array = js.native
  def downloadMatrixFromPackedOutputTexture(gl: WebGLRenderingContext,
                                            rows: Double,
                                            columns: Double): Float32Array = js.native
}

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

package io.brunk.deeplearnjs.math.backends.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package gpgpu_util {

  @js.native
  @JSGlobalScope
  object Gpgpu_util extends js.Object {
    def getWebGLContextAttributes(): WebGLContextAttributes                        = js.native
    def createWebGLContext(canvas: HTMLCanvasElement = ???): WebGLRenderingContext = js.native
    def createVertexShader(gl: WebGLRenderingContext): WebGLShader                 = js.native
    def createVertexBuffer(gl: WebGLRenderingContext): WebGLBuffer                 = js.native
    def createIndexBuffer(gl: WebGLRenderingContext): WebGLBuffer                  = js.native
    def createMatrixTexture(gl: WebGLRenderingContext,
                            rows: Double,
                            columns: Double): WebGLTexture = js.native
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
    def downloadMatrixFromOutputTextureAsync(gl: WebGLRenderingContext,
                                             getBufferSubDataAsyncExtension: js.Any,
                                             rows: Double,
                                             columns: Double): Promise[Float32Array] = js.native
    def downloadMatrixFromOutputTexture(gl: WebGLRenderingContext,
                                        rows: Double,
                                        columns: Double): Float32Array = js.native
    def downloadMatrixFromRGBAColorTexture(gl: WebGLRenderingContext,
                                           rows: Double,
                                           columns: Double,
                                           channels: Double): Float32Array = js.native
    def downloadMatrixFromPackedOutputTexture(gl: WebGLRenderingContext,
                                              rows: Double,
                                              columns: Double): Float32Array = js.native
  }

}

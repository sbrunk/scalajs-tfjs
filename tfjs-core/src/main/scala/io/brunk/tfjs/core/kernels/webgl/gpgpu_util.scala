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

package gpgpu_util {

@js.native
trait TextureConfig extends js.Object {
  var internalFormatFloat: Double = js.native
  var textureFormatFloat: Double = js.native
  var internalFormatHalfFloat: Double = js.native
  var internalFormatPackedFloat: Double = js.native
  var downloadTextureFormat: Double = js.native
  var downloadUnpackNumChannels: Double = js.native
  var defaultNumChannels: Double = js.native
  var textureTypeHalfFloat: Double = js.native
}

@js.native
@JSGlobalScope
object Gpgpu_util extends js.Object {
  def getWebGLContextAttributes(): WebGLContextAttributes = js.native
  def createWebGLContext(canvas: HTMLCanvasElement = ???): WebGLRenderingContext = js.native
  def createVertexShader(gl: WebGLRenderingContext): WebGLShader = js.native
  def createVertexBuffer(gl: WebGLRenderingContext): WebGLBuffer = js.native
  def createIndexBuffer(gl: WebGLRenderingContext): WebGLBuffer = js.native
  def getTextureConfig(gl: WebGLRenderingContext, textureHalfFloatExtension: js.Any = ???): TextureConfig = js.native
  def createFloat32MatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = js.native
  def createFloat16MatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = js.native
  def createUnsignedBytesMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = js.native
  def createPackedMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = js.native
  def bindVertexProgramAttributeStreams(gl: WebGLRenderingContext, program: WebGLProgram, vertexBuffer: WebGLBuffer): Boolean = js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement): Unit = js.native
  def uploadMatrixToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, rows: Double, columns: Double, matrix: Float32Array, numChannels: Double, textureConfig: TextureConfig): Unit = js.native
  def uploadMatrixToPackedTexture(gl: WebGLRenderingContext, texture: WebGLTexture, rows: Double, columns: Double, matrix: Float32Array, textureConfig: TextureConfig): Unit = js.native
  def maybeCreateBufferFromOutputTexture(gl: WebGLRenderingContext, texture: WebGLTexture, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLBuffer | WebGLTexture = js.native
  def downloadFloat32MatrixFromBuffer(gl: WebGLRenderingContext, buffer: WebGLBuffer, rows: Double, columns: Double, textureConfig: TextureConfig): Float32Array = js.native
  def downloadFloat32MatrixFromOutputTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): Float32Array = js.native
  def downloadByteEncodedFloatMatrixFromOutputTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): Float32Array = js.native
  def downloadMatrixFromPackedOutputTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): Float32Array = js.native
}

}

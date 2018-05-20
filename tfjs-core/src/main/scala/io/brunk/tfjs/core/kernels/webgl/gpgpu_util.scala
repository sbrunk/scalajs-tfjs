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
import js.{Promise, |}
import org.scalajs.dom.webgl
import org.scalajs.dom.html
import org.scalajs.dom

import scala.scalajs.js.typedarray.Float32Array

@js.native
@JSGlobalScope
object Gpgpu_util extends js.Object {
  def getWebGLContextAttributes(): webgl.ContextAttributes                        = js.native
  def createWebGLContext(canvas: HTMLCanvasElement = ???): webgl.RenderingContext = js.native
  def createVertexShader(gl: webgl.RenderingContext): webgl.Shader                 = js.native
  def createVertexBuffer(gl: webgl.RenderingContext): webgl.Buffer                 = js.native
  def createIndexBuffer(gl: webgl.RenderingContext): webgl.Buffer                  = js.native
  def createMatrixTexture(gl: webgl.RenderingContext, rows: Double, columns: Double): webgl.Texture =
    js.native
  def createColorMatrixTexture(
      gl: webgl.RenderingContext,
      rows: Double,
      columns: Double
  ): webgl.Texture = js.native
  def createPackedMatrixTexture(
      gl: webgl.RenderingContext,
      rows: Double,
      columns: Double
  ): webgl.Texture = js.native
  def bindVertexProgramAttributeStreams(
      gl: webgl.RenderingContext,
      program: webgl.Program,
      vertexBuffer: webgl.Buffer
  ): Boolean = js.native
  def uploadPixelDataToTexture(
      gl: webgl.RenderingContext,
      texture: webgl.Texture,
      pixels: dom.ImageData | html.Image | html.Canvas | html.Video
  ): Unit = js.native
  def uploadMatrixToTexture(
      gl: webgl.RenderingContext,
      texture: webgl.Texture,
      rows: Double,
      columns: Double,
      matrix: Float32Array,
      numChannels: Double
  ): Unit = js.native
  def uploadMatrixToPackedTexture(
      gl: webgl.RenderingContext,
      texture: webgl.Texture,
      rows: Double,
      columns: Double,
      matrix: Float32Array
  ): Unit = js.native
  def downloadMatrixFromOutputTextureAsync(
      gl: webgl.RenderingContext,
      getBufferSubDataAsyncExtension: js.Any,
      rows: Double,
      columns: Double
  ): Promise[Float32Array] = js.native
  def downloadMatrixFromOutputTexture(
      gl: webgl.RenderingContext,
      rows: Double,
      columns: Double
  ): Float32Array = js.native
  def downloadMatrixFromRGBAColorTexture(
      gl: webgl.RenderingContext,
      rows: Double,
      columns: Double,
      channels: Double
  ): Float32Array = js.native
  def downloadMatrixFromPackedOutputTexture(
      gl: webgl.RenderingContext,
      rows: Double,
      columns: Double
  ): Float32Array = js.native
}

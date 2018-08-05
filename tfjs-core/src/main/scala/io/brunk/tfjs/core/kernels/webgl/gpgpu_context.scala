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
import js.{ Promise, | }
import org.scalajs.dom.webgl
import org.scalajs.dom.html
import org.scalajs.dom

import scala.scalajs.js.typedarray.Float32Array
@js.native
@JSGlobal
class GPGPUContext protected () extends js.Object {
  def this(gl: webgl.RenderingContext = ???) = this()
  var gl: webgl.RenderingContext                      = js.native
  var loseContextExtension: WebGLLoseContextExtension = js.native
  var disjointQueryTimerExtension
    : WebGL2DisjointQueryTimerExtension | WebGL1DisjointQueryTimerExtension          = js.native
  var vertexBuffer: webgl.Buffer                                                     = js.native
  var indexBuffer: webgl.Buffer                                                      = js.native
  var framebuffer: webgl.Framebuffer                                                 = js.native
  var outputTexture: webgl.Texture | Null                                            = js.native
  var program: webgl.Program | Null                                                  = js.native
  def dispose(): Unit                                                                = js.native
  def enableAutomaticDebugValidation(enabled: Boolean): Unit                         = js.native
  def createFloat32MatrixTexture(rows: Double, columns: Double): webgl.Texture       = js.native
  def createFloat16MatrixTexture(rows: Double, columns: Double): webgl.Texture       = js.native
  def createUnsignedBytesMatrixTexture(rows: Double, columns: Double): webgl.Texture = js.native
  def uploadPixelDataToTexture(
      texture: webgl.Texture,
      pixels: dom.ImageData | html.Image | html.Canvas
  ): Unit =
    js.native
  def createPackedMatrixTexture(rows: Double, columns: Double): webgl.Texture = js.native
  def deleteMatrixTexture(texture: webgl.Texture): Unit                       = js.native
  def uploadMatrixToTexture(
      texture: webgl.Texture,
      rows: Double,
      columns: Double,
      matrix: Float32Array
  ): Unit = js.native
  def uploadMatrixToPackedTexture(
      texture: webgl.Texture,
      rows: Double,
      columns: Double,
      matrix: Float32Array
  ): Unit = js.native
  def downloadFloat32MatrixFromOutputTexture(
      texture: webgl.Texture,
      rows: Double,
      columns: Double
  ): Float32Array = js.native
  def downloadByteEncodedFloatMatrixFromOutputTexture(
      texture: webgl.Texture,
      rows: Double,
      columns: Double
  ): Float32Array = js.native
  def downloadMatrixFromTextureAsync(
      texture: webgl.Texture,
      rows: Double,
      columns: Double
  ): Promise[Float32Array] = js.native
  def downloadMatrixFromPackedTexture(
      texture: webgl.Texture,
      rows: Double,
      columns: Double
  ): Float32Array                                                = js.native
  def createProgram(fragmentShaderSource: String): webgl.Program = js.native
  def deleteProgram(program: webgl.Program): Unit                = js.native
  def setProgram(program: webgl.Program | Null): Unit            = js.native
  def getUniformLocation(
      program: webgl.Program,
      uniformName: String,
      shouldThrow: Boolean = ???
  ): webgl.UniformLocation                                                    = js.native
  def getAttributeLocation(program: webgl.Program, attribute: String): Double = js.native
  def getUniformLocationNoThrow(
      program: webgl.Program,
      uniformName: String
  ): webgl.UniformLocation =
    js.native
  def setInputMatrixTexture(
      inputMatrixTexture: webgl.Texture,
      uniformLocation: webgl.UniformLocation,
      textureUnit: Double
  ): Unit = js.native
  def setOutputMatrixTexture(
      outputMatrixTexture: webgl.Texture,
      rows: Double,
      columns: Double
  ): Unit = js.native
  def setOutputPackedMatrixTexture(
      outputPackedMatrixTexture: webgl.Texture,
      rows: Double,
      columns: Double
  ): Unit = js.native
  def setOutputMatrixWriteRegion(
      startRow: Double,
      numRows: Double,
      startColumn: Double,
      numColumns: Double
  ): Unit = js.native
  def setOutputPackedMatrixWriteRegion(
      startRow: Double,
      numRows: Double,
      startColumn: Double,
      numColumns: Double
  ): Unit                                                    = js.native
  def debugValidate(): Unit                                  = js.native
  def executeProgram(): Unit                                 = js.native
  def blockUntilAllProgramsCompleted(): Unit                 = js.native
  def runQuery(queryFn: js.Function0[Unit]): Promise[Double] = js.native
  def beginQuery(): WebGLQuery                               = js.native
  def endQuery(): Unit                                       = js.native
  def pollQueryTime(query: WebGLQuery): Promise[Double]      = js.native
  def pollItems(): Unit                                      = js.native
}

@js.native
@JSGlobalScope
object Gpgpu_context extends js.Object {
  def binSearchLastTrue(arr: js.Array[js.Function0[Boolean]]): Double = js.native
}

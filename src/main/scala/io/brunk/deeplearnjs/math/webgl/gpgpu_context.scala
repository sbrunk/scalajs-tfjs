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
import scala.scalajs.js.|

@js.native
  @JSGlobal
  class GPGPUContext protected () extends js.Object {
    def this(gl: WebGLRenderingContext = ???) = this()
    var gl: WebGLRenderingContext                                        = js.native
    var loseContextExtension: WebGLLoseContextExtension                  = js.native
    var vertexBuffer: WebGLBuffer                                        = js.native
    var indexBuffer: WebGLBuffer                                         = js.native
    var framebuffer: WebGLFramebuffer                                    = js.native
    var outputTexture: WebGLTexture | Null                               = js.native
    var program: WebGLProgram | Null                                     = js.native
    def dispose(): Unit                                                  = js.native
    def enableAutomaticDebugValidation(enabled: Boolean): Unit           = js.native
    def createMatrixTexture(rows: Double, columns: Double): WebGLTexture = js.native
    def uploadPixelDataToTexture(
        texture: WebGLTexture,
        pixels: ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement
    ): Unit                                                                    = js.native
    def createPackedMatrixTexture(rows: Double, columns: Double): WebGLTexture = js.native
    def deleteMatrixTexture(texture: WebGLTexture): Unit                       = js.native
    def uploadMatrixToTexture(texture: WebGLTexture,
                              rows: Double,
                              columns: Double,
                              matrix: Float32Array): Unit = js.native
    def uploadMatrixToPackedTexture(texture: WebGLTexture,
                                    rows: Double,
                                    columns: Double,
                                    matrix: Float32Array): Unit = js.native
    def downloadMatrixFromTexture(texture: WebGLTexture,
                                  rows: Double,
                                  columns: Double): Float32Array = js.native
    def downloadMatrixFromPackedTexture(texture: WebGLTexture,
                                        rows: Double,
                                        columns: Double): Float32Array = js.native
    def createProgram(fragmentShaderSource: String): WebGLProgram      = js.native
    def deleteProgram(program: WebGLProgram): Unit                     = js.native
    def setProgram(program: WebGLProgram | Null): Unit                 = js.native
    def getUniformLocation(program: WebGLProgram, uniformName: String): WebGLUniformLocation =
      js.native
    def getAttributeLocation(program: WebGLProgram, attribute: String): Double = js.native
    def getUniformLocationNoThrow(program: WebGLProgram,
                                  uniformName: String): WebGLUniformLocation = js.native
    def setInputMatrixTexture(inputMatrixTexture: WebGLTexture,
                              uniformLocation: WebGLUniformLocation,
                              textureUnit: Double): Unit = js.native
    def setOutputMatrixTexture(outputMatrixTexture: WebGLTexture,
                               rows: Double,
                               columns: Double): Unit = js.native
    def setOutputPackedMatrixTexture(outputPackedMatrixTexture: WebGLTexture,
                                     rows: Double,
                                     columns: Double): Unit = js.native
    def setOutputMatrixWriteRegion(startRow: Double,
                                   numRows: Double,
                                   startColumn: Double,
                                   numColumns: Double): Unit = js.native
    def setOutputPackedMatrixWriteRegion(startRow: Double,
                                         numRows: Double,
                                         startColumn: Double,
                                         numColumns: Double): Unit         = js.native
    def debugValidate(): Unit                                              = js.native
    def executeProgram(attribLocations: js.Dictionary[Double] = ???): Unit = js.native
    def blockUntilAllProgramsCompleted(): Unit                             = js.native
    def runQuery(queryFn: js.Function0[Unit]): Promise[Double]             = js.native
  }

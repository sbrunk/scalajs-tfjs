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

import io.brunk.deeplearnjs.math.NDArray
import io.brunk.deeplearnjs.math.webgl.Shader_compiler.ShapeInfo
import org.scalajs.dom.raw.{ WebGLProgram, WebGLUniformLocation }

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait GPGPUProgram extends js.Object {
  var variableNames: js.Array[String]
  var outputShape: js.Array[Double]
  var params: js.Array[js.Any]
  var userCode: String
  var supportsBroadcasting: Boolean | Unit //js.UndefOr[Boolean]
}

@js.native
trait GPGPUBinary extends js.Object {
  var webGLProgram: WebGLProgram
  var program: GPGPUProgram
  var uniformLocations: js.Dictionary[WebGLUniformLocation]
  var attributeLocations: js.Dictionary[Double]
  var gpgpu: GPGPUContext
  var source: String
  var inShapeInfos: js.Array[ShapeInfo]
  var outShapeInfo: ShapeInfo
}

@js.native
@JSGlobalScope
object Gpgpu_math extends js.Object {
  def compileProgram[T <: NDArray, K <: NDArray](gpgpu: GPGPUContext,
                                                 program: GPGPUProgram,
                                                 inputs: js.Array[T],
                                                 output: K): GPGPUBinary = js.native
  def runProgram[T <: NDArray, K <: NDArray](
      binary: GPGPUBinary,
      inputs: js.Array[T],
      output: K,
      customSetup: js.Function2[GPGPUContext, WebGLProgram, Unit] = ???
  ): Unit = js.native
  def makeShaderKey(program: GPGPUProgram, inputs: js.Array[NDArray], output: NDArray): String =
    js.native
}

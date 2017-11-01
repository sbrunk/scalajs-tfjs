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
  var supportsBroadcasting: Boolean | Unit
  var numBatchDims: Double | Unit
}

@js.native
trait GPGPUBinary extends js.Object {
  var webGLProgram: WebGLProgram                            = js.native
  var program: GPGPUProgram                                 = js.native
  var uniformLocations: js.Dictionary[WebGLUniformLocation] = js.native
  var attributeLocations: js.Dictionary[Double]             = js.native
  var gpgpu: GPGPUContext                                   = js.native
  var source: String                                        = js.native
  var inShapeInfos: js.Array[ShapeInfo]                     = js.native
  var outShapeInfo: ShapeInfo                               = js.native
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

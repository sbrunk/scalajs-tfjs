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

package gpgpu_math {

  @js.native
  trait GPGPUProgram extends js.Object {
    var variableNames: js.Array[String] = js.native
    var outputShape: js.Array[Double]   = js.native
    var userCode: String                = js.native
    var supportsBroadcasting: Boolean   = js.native
  }

  @js.native
  trait GPGPUBinary extends js.Object {
    var webGLProgram: WebGLProgram                         = js.native
    var program: GPGPUProgram                              = js.native
    var uniformLocations: GPGPUBinary.UniformLocations     = js.native
    var attributeLocations: GPGPUBinary.AttributeLocations = js.native
    var gpgpu: GPGPUContext                                = js.native
    var source: String                                     = js.native
    var inShapeInfos: js.Array[ShapeInfo]                  = js.native
    var outShapeInfo: ShapeInfo                            = js.native
  }

  object GPGPUBinary {

    @js.native
    trait UniformLocations extends js.Object {
      @JSBracketAccess
      def apply(name: String): WebGLUniformLocation = js.native
      @JSBracketAccess
      def update(name: String, v: WebGLUniformLocation): Unit = js.native
    }

    @js.native
    trait AttributeLocations extends js.Object {
      @JSBracketAccess
      def apply(name: String): Double = js.native
      @JSBracketAccess
      def update(name: String, v: Double): Unit = js.native
    }
  }

  @js.native
  trait ArrayData[T <: NDArray[DataType, Rank]] extends js.Object {
    var array: T             = js.native
    var texData: TextureData = js.native
  }

  @js.native
  @JSGlobalScope
  object Gpgpu_math extends js.Object {
    def compileProgram[T <: NDArray[DataType, Rank], K <: NDArray[DataType, Rank]](
        gpgpu: GPGPUContext,
        program: GPGPUProgram,
        inputs: js.Array[ArrayData[T]],
        output: ArrayData[K]
    ): GPGPUBinary = js.native
    def runProgram[T <: NDArray[DataType, Rank], K <: NDArray[DataType, Rank]](
        binary: GPGPUBinary,
        inputs: js.Array[ArrayData[T]],
        output: ArrayData[K],
        customSetup: js.Function2[GPGPUContext, WebGLProgram, Unit] = ???
    ): Unit = js.native
    def makeShaderKey(program: GPGPUProgram,
                      inputs: js.Array[ArrayData[NDArray[DataType, Rank]]],
                      output: ArrayData[NDArray[DataType, Rank]]): String = js.native
  }

}

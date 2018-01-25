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

package io.brunk.deeplearnjs.math.backends

import io.brunk.deeplearnjs.math._
import io.brunk.deeplearnjs.math.Conv_util.Conv2DInfo
import io.brunk.deeplearnjs.math.NdarrayModule.{ DataType, Rank }
import io.brunk.deeplearnjs.math.backends.types.MatrixOrientation
import io.brunk.deeplearnjs.math.backends.webgl.gpgpu_context.GPGPUContext
import io.brunk.deeplearnjs.math.backends.webgl.tex_util.TextureData
import io.brunk.deeplearnjs.math.backends.webgl.texture_manager.TextureManager
import org.scalajs.dom.raw.WebGLTexture
import org.scalajs.dom.{ ImageData, html }

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.{ Promise, | }

@js.native
@JSGlobal
class MathBackendWebGL protected () extends MathBackend {
  def this(gpgpu: GPGPUContext = ???, delayedStorage: Boolean = ???) = this()
  def register(dataId: Double, shape: js.Array[Double], dtype: DataType): Unit = js.native
  def writePixels(dataId: Double,
                  pixels: ImageData | html.Image | html.Canvas | html.Video,
                  numChannels: Double): Unit                                        = js.native
  def write[D <: DataType](dataId: Double, values: js.Any): Unit                    = js.native
  def readSync[D <: DataType](dataId: Double): js.Any                               = js.native
  def read[D <: DataType](dataId: Double): Promise[js.Any]                          = js.native
  def time(query: js.Function0[NDArray[DataType, Rank]]): Promise[Double]           = js.native
  def disposeData(dataId: Double): Unit                                             = js.native
  def getTexture(dataId: Double): WebGLTexture                                      = js.native
  def getTextureData(dataId: Double): TextureData                                   = js.native
  def getGPGPUContext(): GPGPUContext                                               = js.native
  def clone[D <: DataType, T <: NDArray[D, Rank]](x: T): T                          = js.native
  def slice1D(x: Array1D[DataType], begin: Double, size: Double): Array1D[DataType] = js.native
  def slice2D(x: Array2D[DataType],
              begin: js.Tuple2[Double, Double],
              size: js.Tuple2[Double, Double]): Array2D[DataType] = js.native
  def slice3D(x: Array3D[DataType],
              begin: js.Tuple3[Double, Double, Double],
              size: js.Tuple3[Double, Double, Double]): Array3D[DataType] = js.native
  def slice4D(x: Array4D[DataType],
              begin: js.Tuple4[Double, Double, Double, Double],
              size: js.Tuple4[Double, Double, Double, Double]): Array4D[DataType] = js.native
  def reverse4D(x: Array4D[DataType], axis: js.Array[Double]): Array4D[DataType]  = js.native
  def concat1D(a: Array1D[DataType], b: Array1D[DataType]): Array1D[DataType]     = js.native
  def concat2D(a: Array2D[DataType], b: Array2D[DataType], axis: Double): Array2D[DataType] =
    js.native
  def concat3D(a: Array3D[DataType], b: Array3D[DataType], axis: Double): Array3D[DataType] =
    js.native
  def concat4D(a: Array4D[DataType], b: Array4D[DataType], axis: Double): Array4D[DataType] =
    js.native
  def neg[T <: NDArray[DataType, Rank]](x: T): T = js.native
  def matMul(a: Array2D[DataType],
             b: Array2D[DataType],
             aOrientation: MatrixOrientation,
             bOrientation: MatrixOrientation): Array2D[DataType] = js.native
  def multiply[D <: DataType](a: NDArray[D, Rank], b: NDArray[D, Rank]): NDArray[D, Rank] =
    js.native
  def batchNormalization2D(x: Array2D[DataType],
                           mean: Array2D[DataType] | Array1D[DataType],
                           variance: Array2D[DataType] | Array1D[DataType],
                           varianceEpsilon: Double,
                           scale: Array2D[DataType] | Array1D[DataType] = ???,
                           offset: Array2D[DataType] | Array1D[DataType] = ???): Array2D[DataType] =
    js.native
  def batchNormalization3D(x: Array3D[DataType],
                           mean: Array3D[DataType] | Array1D[DataType],
                           variance: Array3D[DataType] | Array1D[DataType],
                           varianceEpsilon: Double,
                           scale: Array3D[DataType] | Array1D[DataType] = ???,
                           offset: Array3D[DataType] | Array1D[DataType] = ???): Array3D[DataType] =
    js.native
  def batchNormalization4D(x: Array4D[DataType],
                           mean: Array4D[DataType] | Array1D[DataType],
                           variance: Array4D[DataType] | Array1D[DataType],
                           varianceEpsilon: Double,
                           scale: Array4D[DataType] | Array1D[DataType] = ???,
                           offset: Array4D[DataType] | Array1D[DataType] = ???): Array4D[DataType] =
    js.native
  def localResponseNormalization4D(x: Array4D[DataType],
                                   radius: Double,
                                   bias: Double,
                                   alpha: Double,
                                   beta: Double,
                                   normRegion: String): Array4D[DataType]         = js.native
  def tile[D <: DataType, T <: NDArray[D, Rank]](x: T, reps: js.Array[Double]): T = js.native
  def pad1D(x: Array1D[DataType],
            paddings: js.Tuple2[Double, Double],
            constantValue: Double): Array1D[DataType] =
    js.native
  def pad2D(x: Array2D[DataType],
            paddings: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
            constantValue: Double): Array2D[DataType]                                   = js.native
  def transpose[D <: DataType, T <: NDArray[D, Rank]](x: T, perm: js.Array[Double]): T  = js.native
  def sum[D <: DataType](x: NDArray[D, Rank], axes: js.Array[Double]): NDArray[js.Any]  = js.native
  def argMin(x: NDArray[DataType, Rank], axes: js.Array[Double]): NDArray[String, Rank] = js.native
  def argMax(x: NDArray[DataType, Rank], axes: js.Array[Double]): NDArray[String, Rank] = js.native
  def equal(a: NDArray[DataType, Rank], b: NDArray[DataType, Rank]): NDArray[String, Rank] =
    js.native
  def notEqual(a: NDArray[DataType, Rank], b: NDArray[DataType, Rank]): NDArray[String, Rank] =
    js.native
  def lessEqual(a: NDArray[DataType, Rank], b: NDArray[DataType, Rank]): NDArray[String, Rank] =
    js.native
  def greater(a: NDArray[DataType, Rank], b: NDArray[DataType, Rank]): NDArray[String, Rank] =
    js.native
  def greaterEqual(a: NDArray[DataType, Rank], b: NDArray[DataType, Rank]): NDArray[String, Rank] =
    js.native
  def logicalOr(a: NDArray[DataType, Rank], b: NDArray[DataType, Rank]): NDArray[String, Rank] =
    js.native
  def topKValues[D <: DataType, T <: NDArray[D, Rank]](x: T, k: Double): Array1D[DataType][D] =
    js.native
  def topKIndices(x: NDArray[DataType, Rank], k: Double): Array1D[DataType][String]      = js.native
  def min[D <: DataType](x: NDArray[D, Rank], axes: js.Array[Double]): NDArray[D, Rank]  = js.native
  def minimum[D <: DataType](a: NDArray[D, Rank], b: NDArray[D, Rank]): NDArray[D, Rank] = js.native
  def max[D <: DataType](x: NDArray[D, Rank], axes: js.Array[Double]): NDArray[D, Rank]  = js.native
  def maximum[D <: DataType](a: NDArray[D, Rank], b: NDArray[D, Rank]): NDArray[D, Rank] = js.native
  def divide(a: NDArray[DataType, Rank], b: NDArray[DataType, Rank]): NDArray[String, Rank] =
    js.native
  def add[D <: DataType](a: NDArray[D, Rank], b: NDArray[D, Rank]): NDArray[D, Rank] = js.native
  def subtract[D <: DataType](a: NDArray[D, Rank], b: NDArray[D, Rank]): NDArray[D, Rank] =
    js.native
  def pow[T <: NDArray[DataType, Rank]](a: T, b: NDArray[String, Rank]): T  = js.native
  def ceil[T <: NDArray[DataType, Rank]](x: T): T                           = js.native
  def floor[T <: NDArray[DataType, Rank]](x: T): T                          = js.native
  def exp[T <: NDArray[DataType, Rank]](x: T): T                            = js.native
  def log[T <: NDArray[DataType, Rank]](x: T): T                            = js.native
  def sqrt[T <: NDArray[DataType, Rank]](x: T): T                           = js.native
  def square[T <: NDArray[DataType, Rank]](x: T): T                         = js.native
  def relu[T <: NDArray[DataType, Rank]](x: T): T                           = js.native
  def elu[T <: NDArray[DataType, Rank]](x: T): T                            = js.native
  def eluDer[T <: NDArray[DataType, Rank]](x: T): T                         = js.native
  def selu[T <: NDArray[DataType, Rank]](x: T): T                           = js.native
  def leakyRelu[T <: NDArray[DataType, Rank]](x: T, alpha: Double): T       = js.native
  def prelu[T <: NDArray[DataType, Rank]](a: T, b: T): T                    = js.native
  def preluDer[T <: NDArray[DataType, Rank]](a: T, b: T): T                 = js.native
  def int[R <: Rank](x: NDArray[DataType, R]): NDArray[String, R]           = js.native
  def clip[T <: NDArray[DataType, Rank]](x: T, min: Double, max: Double): T = js.native
  def abs[T <: NDArray[DataType, Rank]](x: T): T                            = js.native
  def sigmoid[T <: NDArray[DataType, Rank]](x: T): T                        = js.native
  def sin[T <: NDArray[DataType, Rank]](x: T): T                            = js.native
  def cos[T <: NDArray[DataType, Rank]](x: T): T                            = js.native
  def tan[T <: NDArray[DataType, Rank]](x: T): T                            = js.native
  def asin[T <: NDArray[DataType, Rank]](x: T): T                           = js.native
  def acos[T <: NDArray[DataType, Rank]](x: T): T                           = js.native
  def atan[T <: NDArray[DataType, Rank]](x: T): T                           = js.native
  def sinh[T <: NDArray[DataType, Rank]](x: T): T                           = js.native
  def cosh[T <: NDArray[DataType, Rank]](x: T): T                           = js.native
  def tanh[T <: NDArray[DataType, Rank]](x: T): T                           = js.native
  def step[T <: NDArray[DataType, Rank]](x: T, alpha: Double): T            = js.native
  def conv2d(x: Array4D[DataType],
             filter: Array4D[DataType],
             bias: Array1D[DataType] | Null,
             convInfo: Conv2DInfo): Array4D[DataType] =
    js.native
  def conv2dDerInput(dy: Array4D[DataType],
                     filter: Array4D[DataType],
                     convInfo: Conv2DInfo): Array4D[DataType] = js.native
  def conv2dDerFilter(x: Array4D[DataType],
                      dy: Array4D[DataType],
                      convInfo: Conv2DInfo): Array4D[DataType] = js.native
  def conv2dDerBias(dy: Array4D[DataType]): Array1D[DataType]  = js.native
  def depthwiseConv2D(x: Array4D[DataType],
                      filter: Array4D[DataType],
                      convInfo: Conv2DInfo): Array4D[DataType]                       = js.native
  def maxPool(x: Array4D[DataType], convInfo: Conv2DInfo): Array4D[DataType]         = js.native
  def minPool(x: Array4D[DataType], convInfo: Conv2DInfo): Array4D[DataType]         = js.native
  def avgPool(x: Array4D[DataType], convInfo: Conv2DInfo): Array4D[DataType][String] = js.native
  def maxPoolBackprop(dy: Array4D[DataType],
                      x: Array4D[DataType],
                      convInfo: Conv2DInfo): Array4D[DataType] = js.native
  def avgPoolBackprop(dy: Array4D[DataType],
                      x: Array4D[DataType],
                      convInfo: Conv2DInfo): Array4D[DataType] = js.native
  def resizeBilinear3D(x: Array3D[DataType],
                       newShape2D: js.Tuple2[Double, Double],
                       alignCorners: Boolean): Array3D[DataType] = js.native
  def multinomial(probs: Array2D[DataType],
                  numSamples: Double,
                  seed: Double): Array2D[DataType][String] = js.native
  def oneHot(indices: Array1D[DataType],
             depth: Double,
             onValue: Double,
             offValue: Double): Array2D[DataType] =
    js.native
  def getTextureManager(): TextureManager = js.native
  def dispose(): Unit                     = js.native
}

@js.native
@JSGlobal
class NDArrayMathGPU protected () extends NDArrayMath {
  def this(gpgpu: GPGPUContext = ???, safeMode: Boolean = ???) = this()
  def getGPGPUContext(): GPGPUContext     = js.native
  def getTextureManager(): TextureManager = js.native
}

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

import io.brunk.deeplearnjs.math.NDArray
import io.brunk.deeplearnjs.math.NdarrayModule.DataType
import org.scalajs.dom.{ ImageData, html }

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.{ Promise, | }

@js.native
@JSGlobal
class MathBackendCPU extends MathBackend {
  def register(dataId: Double, shape: js.Array[Double], dtype: DataType): Unit = js.native
  def write[D <: DataType](dataId: Double, values: js.Any): Unit               = js.native
  def writePixels(dataId: Double,
                  pixels: ImageData | html.Image | html.Canvas | html.Video,
                  numChannels: Double): Unit                    = js.native
  def read[D <: DataType](dataId: Double): Promise[js.Any]      = js.native
  def readSync[D <: DataType](dataId: Double): js.Any           = js.native
  def disposeData(dataId: Double): Unit                         = js.native
  def time(query: js.Function0[NDArray]): Promise[Double]       = js.native
  def clone[T <: NDArray](x: T): T                              = js.native
  def slice1D(x: Array1D, begin: Double, size: Double): Array1D = js.native
  def slice2D(x: Array2D,
              begin: js.Tuple2[Double, Double],
              size: js.Tuple2[Double, Double]): Array2D = js.native
  def slice3D(x: Array3D,
              begin: js.Tuple3[Double, Double, Double],
              size: js.Tuple3[Double, Double, Double]): Array3D = js.native
  def slice4D(x: Array4D,
              begin: js.Tuple4[Double, Double, Double, Double],
              size: js.Tuple4[Double, Double, Double, Double]): Array4D = js.native
  def reverse4D(x: Array4D, axis: js.Array[Double]): Array4D            = js.native
  def concat1D(a: Array1D, b: Array1D): Array1D                         = js.native
  def concat2D(a: Array2D, b: Array2D, axis: Double): Array2D           = js.native
  def concat3D(a: Array3D, b: Array3D, axis: Double): Array3D           = js.native
  def concat4D(a: Array4D, b: Array4D, axis: Double): Array4D           = js.native
  def neg[T <: NDArray](x: T): T                                        = js.native
  def add[D <: DataType](a: NDArray[D], b: NDArray[D]): NDArray[D]      = js.native
  def subtract[D <: DataType](a: NDArray[D], b: NDArray[D]): NDArray[D] = js.native
  def pow[T <: NDArray](a: T, b: NDArray[String]): T                    = js.native
  def matMul(a: Array2D,
             b: Array2D,
             aOrientation: MatrixOrientation = ???,
             bOrientation: MatrixOrientation = ???): Array2D                     = js.native
  def multiply[D <: DataType](a: NDArray[D], b: NDArray[D]): NDArray[D]          = js.native
  def divide(a: NDArray, b: NDArray): NDArray[String]                            = js.native
  def sum[D <: DataType](x: NDArray[D], axes: js.Array[Double]): NDArray[js.Any] = js.native
  def argMin(x: NDArray, axes: js.Array[Double]): NDArray[String]                = js.native
  def argMax(x: NDArray, axes: js.Array[Double]): NDArray[String]                = js.native
  def equal(a: NDArray, b: NDArray): NDArray[String]                             = js.native
  def notEqual(a: NDArray, b: NDArray): NDArray[String]                          = js.native
  def lessEqual(a: NDArray, b: NDArray): NDArray[String]                         = js.native
  def greater(a: NDArray, b: NDArray): NDArray[String]                           = js.native
  def greaterEqual(a: NDArray, b: NDArray): NDArray[String]                      = js.native
  def logicalOr(a: NDArray, b: NDArray): NDArray[String]                         = js.native
  def topKValues[D <: DataType, T <: NDArray[D]](x: T, k: Double): Array1D[D]    = js.native
  def topKIndices(x: NDArray, k: Double): Array1D[String]                        = js.native
  def min[D <: DataType](x: NDArray[D], axes: js.Array[Double]): NDArray[D]      = js.native
  def minimum[D <: DataType](a: NDArray[D], b: NDArray[D]): NDArray[D]           = js.native
  def max[D <: DataType](x: NDArray[D], axes: js.Array[Double]): NDArray[D]      = js.native
  def maximum[D <: DataType](a: NDArray[D], b: NDArray[D]): NDArray[D]           = js.native
  def ceil[T <: NDArray](x: T): T                                                = js.native
  def floor[T <: NDArray](x: T): T                                               = js.native
  def exp[T <: NDArray](x: T): T                                                 = js.native
  def log[T <: NDArray](x: T): T                                                 = js.native
  def sqrt[T <: NDArray](x: T): T                                                = js.native
  def square[T <: NDArray](x: T): T                                              = js.native
  def relu[T <: NDArray](x: T): T                                                = js.native
  def elu[T <: NDArray](x: T): T                                                 = js.native
  def eluDer[T <: NDArray](x: T): T                                              = js.native
  def selu[T <: NDArray](x: T): T                                                = js.native
  def leakyRelu[T <: NDArray](x: T, alpha: Double): T                            = js.native
  def prelu[T <: NDArray](x: T, alpha: T): T                                     = js.native
  def preluDer[T <: NDArray](x: T, alpha: T): T                                  = js.native
  def clip[T <: NDArray](x: T, min: Double, max: Double): T                      = js.native
  def abs[T <: NDArray](x: T): T                                                 = js.native
  def int[R <: Rank](x: NDArray[DataType, R]): NDArray[String, R]                = js.native
  def sigmoid[T <: NDArray](x: T): T                                             = js.native
  def sin[T <: NDArray](x: T): T                                                 = js.native
  def cos[T <: NDArray](x: T): T                                                 = js.native
  def tan[T <: NDArray](x: T): T                                                 = js.native
  def asin[T <: NDArray](x: T): T                                                = js.native
  def acos[T <: NDArray](x: T): T                                                = js.native
  def atan[T <: NDArray](x: T): T                                                = js.native
  def sinh[T <: NDArray](x: T): T                                                = js.native
  def cosh[T <: NDArray](x: T): T                                                = js.native
  def tanh[T <: NDArray](x: T): T                                                = js.native
  def step[T <: NDArray](x: T, alpha: Double = ???): T                           = js.native
  def conv2d(x: Array4D, filter: Array4D, bias: Array1D | Null, convInfo: Conv2DInfo): Array4D =
    js.native
  def conv2dDerInput(dy: Array4D, filter: Array4D, convInfo: Conv2DInfo): Array4D = js.native
  def conv2dDerFilter(x: Array4D, dy: Array4D, convInfo: Conv2DInfo): Array4D     = js.native
  def conv2dDerBias(dy: Array4D): Array1D                                         = js.native
  def depthwiseConv2D(x: Array4D, filter: Array4D, convInfo: Conv2DInfo): Array4D = js.native
  def tile[D <: DataType, T <: NDArray[D]](x: T, reps: js.Array[Double]): T       = js.native
  def pad1D(x: Array1D, paddings: js.Tuple2[Double, Double], constantValue: Double): Array1D =
    js.native
  def pad2D(x: Array2D,
            paddings: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
            constantValue: Double): Array2D                                      = js.native
  def transpose[D <: DataType, T <: NDArray[D]](x: T, perm: js.Array[Double]): T = js.native
  def maxPool(x: Array4D, convInfo: Conv2DInfo): Array4D                         = js.native
  def maxPoolPositions(x: Array4D, convInfo: Conv2DInfo): Array4D[String]        = js.native
  def maxPoolBackprop(dy: Array4D, x: Array4D, convInfo: Conv2DInfo): Array4D    = js.native
  def avgPoolBackprop(dy: Array4D, x: Array4D, convInfo: Conv2DInfo): Array4D    = js.native
  def minPool(x: Array4D, convInfo: Conv2DInfo): Array4D                         = js.native
  def avgPool(x: Array4D, convInfo: Conv2DInfo): Array4D                         = js.native
  def resizeBilinear3D(x: Array3D,
                       newShape2D: js.Tuple2[Double, Double],
                       alignCorners: Boolean): Array3D = js.native
  def batchNormalization2D(x: Array2D,
                           mean: Array2D | Array1D,
                           variance: Array2D | Array1D,
                           varianceEpsilon: Double,
                           scale: Array2D | Array1D = ???,
                           offset: Array2D | Array1D = ???): Array2D = js.native
  def batchNormalization3D(x: Array3D,
                           mean: Array3D | Array1D,
                           variance: Array3D | Array1D,
                           varianceEpsilon: Double,
                           scale: Array3D | Array1D = ???,
                           offset: Array3D | Array1D = ???): Array3D = js.native
  def batchNormalization4D(x: Array4D,
                           mean: Array4D | Array1D,
                           variance: Array4D | Array1D,
                           varianceEpsilon: Double,
                           scale: Array4D | Array1D = ???,
                           offset: Array4D | Array1D = ???): Array4D = js.native
  def localResponseNormalization4D(x: Array4D,
                                   radius: Double,
                                   bias: Double,
                                   alpha: Double,
                                   beta: Double,
                                   normRegion: String): Array4D = js.native
  def multinomial(probabilities: Array2D, numSamples: Double, seed: Double): Array2D[String] =
    js.native
  def oneHot(indices: Array1D, depth: Double, onValue: Double, offValue: Double): Array2D =
    js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal
class NDArrayMathCPU protected () extends NDArrayMath {
  def this(safeMode: Boolean = ???) = this()
}

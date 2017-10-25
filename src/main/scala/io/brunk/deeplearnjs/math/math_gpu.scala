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

package io.brunk.deeplearnjs.math

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
@JSGlobal
class NDArrayMathGPU protected () extends NDArrayMath {
  def this(gpgpu: GPGPUContext = ???, safeMode: Boolean = ???) = this()
  def getGPGPUContext(): GPGPUContext                                       = js.native
  def cloneInternal[G <: String, T <: NDArray[G]](a: T): T                  = js.native
  def slice1DInternal(input: Array1D, begin: Double, size: Double): Array1D = js.native
  def slice2DInternal(input: Array2D,
                      begin: js.Tuple2[Double, Double],
                      size: js.Tuple2[Double, Double]): Array2D = js.native
  def slice3DInternal(input: Array3D,
                      begin: js.Tuple3[Double, Double, Double],
                      size: js.Tuple3[Double, Double, Double]): Array3D = js.native
  def slice4DInternal(input: Array4D,
                      begin: js.Tuple4[Double, Double, Double, Double],
                      size: js.Tuple4[Double, Double, Double, Double]): Array4D = js.native
  def copy2DInternal(source: Array2D,
                     sourceBeginRowCol: js.Tuple2[Double, Double],
                     sourceSizeRowCol: js.Tuple2[Double, Double],
                     dest: Array2D,
                     destBeginRowCol: js.Tuple2[Double, Double],
                     destSizeRowCol: js.Tuple2[Double, Double]): Unit             = js.native
  def concat1DInternal(a: Array1D, b: Array1D): Array1D                           = js.native
  def concat2DInternal(a: Array2D, b: Array2D, axis: Double): Array2D             = js.native
  def concat3DInternal(x1: Array3D, x2: Array3D, axis: Double): Array3D           = js.native
  def concat4DInternal(x1: Array4D, x2: Array4D, axis: Double): Array4D           = js.native
  def scaledArrayAddInternal[T <: NDArray](c1: Scalar, a: T, c2: Scalar, b: T): T = js.native
  def negInternal[T <: NDArray](a: T): T                                          = js.native
  def matMulInternal(a: Array2D,
                     b: Array2D,
                     aOrientation: MatrixOrientation,
                     bOrientation: MatrixOrientation): Array2D = js.native
  def multiplyInternal[T <: NDArray](a: T, b: T): T            = js.native
  def batchNormalization3DInternal(x: Array3D,
                                   mean: Array3D | Array1D,
                                   variance: Array3D | Array1D,
                                   varianceEpsilon: Double | Null,
                                   scale: Array3D | Array1D = ???,
                                   offset: Array3D | Array1D = ???): Array3D           = js.native
  def transposeInternal[D <: String, T <: NDArray[D]](a: T, perm: js.Array[Double]): T = js.native
  def sumInternal[T <: String](a: NDArray[T], axes: js.Array[Double]): NDArray[String] = js.native
  def argMinInternal(a: NDArray, axes: js.Array[Double]): NDArray[String]              = js.native
  def argMaxInternal(a: NDArray, axes: js.Array[Double]): NDArray[String]              = js.native
  def equalInternal(x: NDArray, y: NDArray): NDArray[String]                           = js.native
  def topKInternal(ndarray: NDArray, k: Double): js.Any                                = js.native
  def minInternal[G <: String](a: NDArray[G], axes: js.Array[Double]): NDArray[G]      = js.native
  def maxInternal[G <: String](a: NDArray[G], axes: js.Array[Double]): NDArray[G]      = js.native
  def divideInternal[T <: NDArray](a: T, b: T): T                                      = js.native
  def addInternal[T <: NDArray](a: T, b: T): T                                         = js.native
  def subtractInternal[T <: NDArray](a: T, b: T): T                                    = js.native
  def logSumExpInternal(a: NDArray, axes: js.Array[Double]): NDArray                   = js.native
  def ceilInternal[T <: NDArray](a: T): T                                              = js.native
  def floorInternal[T <: NDArray](a: T): T                                             = js.native
  def expInternal[T <: NDArray](a: T): T                                               = js.native
  def logInternal[T <: NDArray](a: T): T                                               = js.native
  def sqrtInternal[T <: NDArray](a: T): T                                              = js.native
  def reluInternal[T <: NDArray](a: T): T                                              = js.native
  def eluInternal[T <: NDArray](a: T): T                                               = js.native
  def leakyReluInternal[T <: NDArray](a: T, alpha: Double): T                          = js.native
  def clipInternal[T <: NDArray](a: T, min: Double, max: Double): T                    = js.native
  def absInternal[T <: NDArray](a: T): T                                               = js.native
  def sigmoidInternal[T <: NDArray](a: T): T                                           = js.native
  def sinInternal[T <: NDArray](a: T): T                                               = js.native
  def cosInternal[T <: NDArray](a: T): T                                               = js.native
  def tanInternal[T <: NDArray](a: T): T                                               = js.native
  def asinInternal[T <: NDArray](a: T): T                                              = js.native
  def acosInternal[T <: NDArray](a: T): T                                              = js.native
  def atanInternal[T <: NDArray](a: T): T                                              = js.native
  def sinhInternal[T <: NDArray](a: T): T                                              = js.native
  def coshInternal[T <: NDArray](a: T): T                                              = js.native
  def tanhInternal[T <: NDArray](a: T): T                                              = js.native
  def stepInternal[T <: NDArray](a: T): T                                              = js.native
  def conv2dInternal(x: Array3D,
                     filter: Array4D,
                     bias: Array1D | Null,
                     convInfo: ConvInfo): Array3D = js.native
  def conv2dDerInputInternal(dy: Array3D, filter: Array4D, convInfo: ConvInfo): Array3D =
    js.native
  def conv2dDerFilterInternal(x: Array3D, dY: Array3D, convInfo: ConvInfo): Array4D = js.native
  def conv2dDerBiasInternal(dY: Array3D): Array1D                                   = js.native
  def maxPoolInternal(x: Array3D, convInfo: ConvInfo): Array3D                      = js.native
  def minPoolInternal(x: Array3D, convInfo: ConvInfo): Array3D                      = js.native
  def avgPoolInternal(x: Array3D, convInfo: ConvInfo): Array3D                      = js.native
  def maxPoolBackpropInternal(dy: Array3D, x: Array3D, convInfo: ConvInfo): Array3D = js.native
  def resizeBilinear3DInternal(x: Array3D,
                               newShape2D: js.Tuple2[Double, Double],
                               alignCorners: Boolean): Array3D = js.native
  def multinomialInternal(probs: Array2D, numSamples: Double, seed: Double): Array2D[String] =
    js.native
  def oneHotInternal(indices: ndarray.Array1D,
                     depth: Double,
                     onValue: Double,
                     offValue: Double): ndarray.Array2D = js.native
  def getTextureManager(): TextureManager               = js.native
  def dispose(): Unit                                   = js.native
}

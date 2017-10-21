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

import io.brunk.deeplearnjs.math.Conv_util.ConvInfo
import io.brunk.deeplearnjs.math.webgl.{ GPGPUContext, TextureManager }

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class NDArrayMathGPU protected () extends NDArrayMath {
  def this(gpgpu: GPGPUContext = ???, safeMode: Boolean = ???) = this()
  def getGPGPUContext(): GPGPUContext                                       = js.native
  def cloneInternal[T <: NDArray](a: T): T                                  = js.native
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
                                   offset: Array3D | Array1D = ???): Array3D = js.native
  def switchDimInternal[T <: NDArray](a: T, newDim: js.Array[Double]): T     = js.native
  def sumInternal(a: NDArray): Scalar                                        = js.native
  def argMinInternal(a: NDArray): Scalar                                     = js.native
  def argMaxInternal(a: NDArray): Scalar                                     = js.native
  def argMaxEqualsInternal(x1: NDArray, x2: NDArray): Scalar                 = js.native
  def topKInternal(ndarray: NDArray, k: Double): js.Any                      = js.native
  def minInternal(a: NDArray): Scalar                                        = js.native
  def maxInternal(a: NDArray): Scalar                                        = js.native
  def divideInternal[T <: NDArray](a: T, b: T): T                            = js.native
  def addInternal[T <: NDArray](a: T, b: T): T                               = js.native
  def subInternal[T <: NDArray](a: T, b: T): T                               = js.native
  def logSumExpInternal(a: NDArray): Scalar                                  = js.native
  def expInternal[T <: NDArray](a: T): T                                     = js.native
  def logInternal[T <: NDArray](a: T): T                                     = js.native
  def sqrtInternal[T <: NDArray](a: T): T                                    = js.native
  def reluInternal[T <: NDArray](a: T): T                                    = js.native
  def absInternal[T <: NDArray](a: T): T                                     = js.native
  def sigmoidInternal[T <: NDArray](a: T): T                                 = js.native
  def sinInternal[T <: NDArray](a: T): T                                     = js.native
  def cosInternal[T <: NDArray](a: T): T                                     = js.native
  def tanInternal[T <: NDArray](a: T): T                                     = js.native
  def asinInternal[T <: NDArray](a: T): T                                    = js.native
  def acosInternal[T <: NDArray](a: T): T                                    = js.native
  def atanInternal[T <: NDArray](a: T): T                                    = js.native
  def sinhInternal[T <: NDArray](a: T): T                                    = js.native
  def coshInternal[T <: NDArray](a: T): T                                    = js.native
  def tanhInternal[T <: NDArray](a: T): T                                    = js.native
  def stepInternal[T <: NDArray](a: T): T                                    = js.native
  def conv2dInternal(x: Array3D,
                     filter: Array4D,
                     bias: Array1D | Null,
                     convInfo: ConvInfo): Array3D                                       = js.native
  def conv2dDerInputInternal(dy: Array3D, filter: Array4D, convInfo: ConvInfo): Array3D = js.native
  def conv2dDerFilterInternal(x: Array3D, dY: Array3D, convInfo: ConvInfo): Array4D     = js.native
  def conv2dDerBiasInternal(dY: Array3D): Array1D                                       = js.native
  def maxPoolInternal(x: Array3D, convInfo: ConvInfo): Array3D                          = js.native
  def minPoolInternal(x: Array3D, convInfo: ConvInfo): Array3D                          = js.native
  def avgPoolInternal(x: Array3D, convInfo: ConvInfo): Array3D                          = js.native
  def maxPoolBackpropInternal(dy: Array3D, x: Array3D, convInfo: ConvInfo): Array3D     = js.native
  def resizeBilinear3DInternal(x: Array3D,
                               newShape2D: js.Tuple2[Double, Double],
                               alignCorners: Boolean): Array3D                       = js.native
  def multinomialInternal(probs: Array1D, numSamples: Double, seed: Double): Array1D = js.native
  def oneHotInternal(indices: Array1D, depth: Double, onValue: Double, offValue: Double): Array2D =
    js.native
  def getTextureManager(): TextureManager = js.native
  override def dispose(): Unit            = js.native
}

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
import io.brunk.deeplearnjs.math.Math.{ ScopeResult, ScopeResultImmediate }

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.{ Promise, | }

@js.native
trait LSTMCell extends js.Object {
  def apply(data: Array2D, c: Array2D, h: Array2D): js.Tuple2[Array2D, Array2D] = js.native
}

@js.native
trait SumTypes extends js.Object {
  var float32: String = js.native
  var int32: String   = js.native
  var bool: String    = js.native
}

@js.native
sealed trait SumTypesMap extends js.Object {}

@js.native
@JSGlobal
object SumTypesMap extends js.Object {
  var float32: SumTypesMap = js.native
  var int32: SumTypesMap   = js.native
  var bool: SumTypesMap    = js.native
  @JSBracketAccess
  def apply(value: SumTypesMap): String = js.native
}

@js.native
@JSGlobal
abstract class NDArrayMath protected () extends js.Object {
  def this(safeMode: Boolean) = this()
  def scope[T <: ScopeResult](scopeFn: js.Function2[js.Function, js.Function, T]): T = js.native
  def enableDebugMode(): Unit                                                        = js.native
  def startScope(): Unit                                                             = js.native
  def endScope(result: ScopeResultImmediate): Unit                                   = js.native
  def keep[T <: NDArray](result: T): T                                               = js.native
  def track[G <: String, T <: NDArray](result: T): T                                 = js.native
  def dispose(): Unit                                                                = js.native
  def matMul(a: Array2D,
             b: Array2D,
             aOrientation: MatrixOrientation = ???,
             bOrientation: MatrixOrientation = ???): Array2D = js.native
  def matMulInternal(a: Array2D,
                     b: Array2D,
                     aOrientation: MatrixOrientation,
                     bOrientation: MatrixOrientation): Array2D
  def vectorTimesMatrix(v: Array1D, matrix: Array2D): Array1D = js.native
  def matrixTimesVector(matrix: Array2D, v: Array1D): Array1D = js.native
  def dotProduct(v1: Array1D, v2: Array1D): Scalar            = js.native
  def outerProduct(v1: Array1D, v2: Array1D): Array2D         = js.native
  def clone[T <: NDArray](ndarray: T): T                      = js.native
  def cloneInternal[T <: NDArray](ndarray: T): T
  def reshape[T1 <: NDArray, T2 <: NDArray](ndarray: T1, newShape: js.Array[Double]): T2 =
    js.native
  def slice1D(input: Array1D, begin: Double, size: Double): Array1D = js.native
  def slice1DInternal(input: Array1D, begin: Double, size: Double): Array1D
  def slice2D(input: Array2D,
              begin: js.Tuple2[Double, Double],
              size: js.Tuple2[Double, Double]): Array2D = js.native
  def slice2DInternal(input: Array2D,
                      begin: js.Tuple2[Double, Double],
                      size: js.Tuple2[Double, Double]): Array2D
  def slice3D(input: Array3D,
              begin: js.Tuple3[Double, Double, Double],
              size: js.Tuple3[Double, Double, Double]): Array3D = js.native
  def slice3DInternal(input: Array3D,
                      begin: js.Tuple3[Double, Double, Double],
                      size: js.Tuple3[Double, Double, Double]): Array3D
  def slice4D(input: Array4D,
              begin: js.Tuple4[Double, Double, Double, Double],
              size: js.Tuple4[Double, Double, Double, Double]): Array4D = js.native
  def slice4DInternal(input: Array4D,
                      begin: js.Tuple4[Double, Double, Double, Double],
                      size: js.Tuple4[Double, Double, Double, Double]): Array4D
  def copy2D(source: Array2D,
             sourceBegin: js.Tuple2[Double, Double],
             sourceSize: js.Tuple2[Double, Double],
             dest: Array2D,
             destBegin: js.Tuple2[Double, Double],
             destSize: js.Tuple2[Double, Double]): Unit = js.native
  def copy2DInternal(source: Array2D,
                     sourceBegin: js.Tuple2[Double, Double],
                     sourceSize: js.Tuple2[Double, Double],
                     dest: Array2D,
                     destBegin: js.Tuple2[Double, Double],
                     destSize: js.Tuple2[Double, Double]): Unit
  def concat1D(a: Array1D, b: Array1D): Array1D = js.native
  def concat1DInternal(a: Array1D, b: Array1D): Array1D
  def concat2D(a: Array2D, b: Array2D, axis: Double): Array2D = js.native
  def concat2DInternal(a: Array2D, b: Array2D, axis: Double): Array2D
  def concat3D(ndarray1: Array3D, ndarray2: Array3D, axis: Double): Array3D = js.native
  def concat3DInternal(ndarray1: Array3D, ndarray2: Array3D, axis: Double): Array3D
  def concat4D(ndarray1: Array4D, ndarray2: Array4D, axis: Double): Array4D = js.native
  def concat4DInternal(ndarray1: Array4D, ndarray2: Array4D, axis: Double): Array4D
  def logSumExp(input: NDArray,
                axis: Double | js.Array[Double] = ???,
                keepDims: Boolean = ???): NDArray = js.native
  def logSumExpInternal(ndarray: NDArray, axes: js.Array[Double]): NDArray
  def sum(input: NDArray, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): NDArray =
    js.native
  def sumInternal(ndarray: NDArray, axes: js.Array[Double]): NDArray
  def argMin(input: NDArray, axis: Double = ???): NDArray = js.native
  def argMinInternal(ndarray: NDArray, axes: js.Array[Double]): NDArray
  def argMax(input: NDArray, axis: Double = ???): NDArray = js.native
  def argMaxInternal(ndarray: NDArray, axes: js.Array[Double]): NDArray
  def argMaxEquals(x1: NDArray, x2: NDArray): Scalar = js.native
  def equal(x: NDArray, y: NDArray): NDArray         = js.native
  def equalInternal(x: NDArray, y: NDArray): NDArray
  def equalStrict[D <: String, T <: NDArray](x: T, y: T): NDArray = js.native
  def topK(ndarray: NDArray, k: Double): js.Any                   = js.native
  def topKInternal(ndarray: NDArray, k: Double): js.Any
  def min(input: NDArray, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): NDArray =
    js.native
  def minInternal(input: NDArray, axes: js.Array[Double]): NDArray
  def max(input: NDArray, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): NDArray =
    js.native
  def maxInternal(input: NDArray, axes: js.Array[Double]): NDArray
  def softmax[T <: NDArray](logits: T, dim: Double = ???): T                      = js.native
  def switchDim[T <: NDArray](a: T, newDim: js.Array[Double]): T                  = js.native
  def transpose[D <: String, T <: NDArray](a: T, perm: js.Array[Double] = ???): T = js.native
  def transposeInternal[D <: String, T <: NDArray](a: T, perm: js.Array[Double]): T
  def scalarPlusArray[T <: NDArray](c: Scalar, a: T): T  = js.native
  def scalarMinusArray[T <: NDArray](c: Scalar, a: T): T = js.native
  def arrayMinusScalar[T <: NDArray](a: T, c: Scalar): T = js.native
  def neg[T <: NDArray](a: T): T                         = js.native
  def negInternal[T <: NDArray](a: T): T
  def add(a: NDArray, b: NDArray): NDArray = js.native
  def addInternal(a: NDArray, b: NDArray): NDArray
  def addStrict[D <: String, T <: NDArray](a: T, b: T): T = js.native
  def subtract(a: NDArray, b: NDArray): NDArray           = js.native
  def sub(a: NDArray, b: NDArray): NDArray                = js.native
  def subtractInternal(a: NDArray, b: NDArray): NDArray
  def subStrict[D <: String, T <: NDArray](a: T, b: T): T = js.native
  def multiply(a: NDArray, b: NDArray): NDArray           = js.native
  def multiplyInternal[T <: NDArray](a: T, b: T): T
  def elementWiseMul[T <: NDArray](a: T, b: T): T = js.native
  def multiplyStrict[T <: NDArray](a: T, b: T): T = js.native
  def divide(a: NDArray, b: NDArray): NDArray     = js.native
  def divideInternal(a: NDArray, b: NDArray): NDArray
  def divideStrict[T <: NDArray](a: T, b: T): T              = js.native
  def scalarDividedByArray[T <: NDArray](c: Scalar, a: T): T = js.native
  def arrayDividedByScalar[T <: NDArray](a: T, c: Scalar): T = js.native
  def ceil[T <: NDArray](ndarray: T): T                      = js.native
  def ceilInternal[T <: NDArray](ndarray: T): T
  def floor[T <: NDArray](ndarray: T): T = js.native
  def floorInternal[T <: NDArray](ndarray: T): T
  def exp[T <: NDArray](ndarray: T): T = js.native
  def expInternal[T <: NDArray](ndarray: T): T
  def log[T <: NDArray](ndarray: T): T = js.native
  def logInternal[T <: NDArray](ndarray: T): T
  def sqrt[T <: NDArray](ndarray: T): T = js.native
  def sqrtInternal[T <: NDArray](ndarray: T): T
  def abs[T <: NDArray](ndarray: T): T = js.native
  def absInternal[T <: NDArray](ndarray: T): T
  def clip[T <: NDArray](ndarray: T, min: Double, max: Double): T = js.native
  def clipInternal[T <: NDArray](ndarray: T, min: Double, max: Double): T
  def relu[T <: NDArray](ndarray: T): T = js.native
  def reluInternal[T <: NDArray](ndarray: T): T
  def elu[T <: NDArray](ndarray: T): T = js.native
  def eluInternal[T <: NDArray](ndarray: T): T
  def leakyRelu[T <: NDArray](ndarray: T, alpha: Double = ???): T = js.native
  def leakyReluInternal[T <: NDArray](ndarray: T, alpha: Double): T
  def sigmoid[T <: NDArray](ndarray: T): T = js.native
  def sigmoidInternal[T <: NDArray](ndarray: T): T
  def sin[T <: NDArray](ndarray: T): T = js.native
  def sinInternal[T <: NDArray](ndarray: T): T
  def cos[T <: NDArray](ndarray: T): T = js.native
  def cosInternal[T <: NDArray](ndarray: T): T
  def tan[T <: NDArray](ndarray: T): T = js.native
  def tanInternal[T <: NDArray](ndarray: T): T
  def asin[T <: NDArray](ndarray: T): T = js.native
  def asinInternal[T <: NDArray](ndarray: T): T
  def acos[T <: NDArray](ndarray: T): T = js.native
  def acosInternal[T <: NDArray](ndarray: T): T
  def atan[T <: NDArray](ndarray: T): T = js.native
  def atanInternal[T <: NDArray](ndarray: T): T
  def sinh[T <: NDArray](ndarray: T): T = js.native
  def sinhInternal[T <: NDArray](ndarray: T): T
  def cosh[T <: NDArray](ndarray: T): T = js.native
  def coshInternal[T <: NDArray](ndarray: T): T
  def tanh[T <: NDArray](ndarray: T): T = js.native
  def tanhInternal[T <: NDArray](ndarray: T): T
  def step[T <: NDArray](ndarray: T): T = js.native
  def stepInternal[T <: NDArray](ndarray: T): T
  def scaledArrayAdd[T <: NDArray](c1: Scalar, a: T, c2: Scalar, b: T): T = js.native
  def scaledArrayAddInternal[T <: NDArray](c1: Scalar, a: T, c2: Scalar, b: T): T
  def scalarTimesArray[T <: NDArray](c: Scalar, a: T): T       = js.native
  def elementWiseMulBroadcast(a: Array2D, b: Array2D): Array2D = js.native
  def conv2d(x: Array3D,
             filter: Array4D,
             bias: Array1D | Null,
             strides: js.Tuple2[Double, Double] | Double,
             pad: String | Double): Array3D = js.native
  def conv2dInternal(x: Array3D, filter: Array4D, bias: Array1D | Null, convInfo: ConvInfo): Array3D
  def conv2dBackProp(x: Array3D,
                     dy: Array3D,
                     filter: Array4D,
                     strides: js.Tuple2[Double, Double] | Double,
                     pad: String | Double): js.Any = js.native
  def conv2dDerInput(inShape: js.Tuple3[Double, Double, Double],
                     dy: Array3D,
                     filter: Array4D,
                     strides: js.Tuple2[Double, Double] | Double,
                     pad: String | Double): Array3D = js.native
  def conv2dDerInputInternal(dy: Array3D, filter: Array4D, convInfo: ConvInfo): Array3D
  def conv2dDerBias(dy: Array3D): Array1D = js.native
  def conv2dDerBiasInternal(dY: Array3D): Array1D
  def conv2dDerFilter(x: Array3D,
                      dy: Array3D,
                      filterSize: js.Tuple4[Double, Double, Double, Double],
                      strides: js.Tuple2[Double, Double] | Double,
                      pad: String | Double): Array4D = js.native
  def conv2dDerFilterInternal(x: Array3D, dy: Array3D, convInfo: ConvInfo): Array4D
  def conv2dTranspose(x: Array3D,
                      filter: Array4D,
                      outputShape: js.Tuple3[Double, Double, Double],
                      strides: js.Tuple2[Double, Double] | Double,
                      pad: String | Double): Array3D = js.native
  def maxPool(x: Array3D,
              filterSize: js.Tuple2[Double, Double] | Double,
              strides: js.Tuple2[Double, Double] | Double,
              pad: String | Double): Array3D = js.native
  def maxPoolInternal(x: Array3D, convInfo: ConvInfo): Array3D
  def maxPoolBackprop(dy: Array3D,
                      x: Array3D,
                      filterSize: js.Tuple2[Double, Double] | Double,
                      strides: js.Tuple2[Double, Double] | Double,
                      pad: String | Double): Array3D = js.native
  def maxPoolBackpropInternal(dy: Array3D, x: Array3D, convInfo: ConvInfo): Array3D
  def minPool(x: Array3D,
              filterSize: js.Tuple2[Double, Double] | Double,
              strides: js.Tuple2[Double, Double] | Double,
              pad: String | Double): Array3D = js.native
  def minPoolInternal(x: Array3D, convInfo: ConvInfo): Array3D
  def avgPool(x: Array3D,
              filterSize: js.Tuple2[Double, Double] | Double,
              strides: js.Tuple2[Double, Double] | Double,
              pad: String | Double): Array3D = js.native
  def avgPoolInternal(x: Array3D, convInfo: ConvInfo): Array3D
  def resizeBilinear3D(x: Array3D,
                       newShape2D: js.Tuple2[Double, Double],
                       alignCorners: Boolean = ???): Array3D = js.native
  def resizeBilinear3DInternal(x: Array3D,
                               newShape2D: js.Tuple2[Double, Double],
                               alignCorners: Boolean): Array3D
  def batchNormalization3D(x: Array3D,
                           mean: Array3D | Array1D,
                           variance: Array3D | Array1D,
                           varianceEpsilon: Double = ???,
                           scale: Array3D | Array1D = ???,
                           offset: Array3D | Array1D = ???): Array3D = js.native
  def batchNormalization3DInternal(x: Array3D,
                                   mean: Array3D | Array1D,
                                   variance: Array3D | Array1D,
                                   varianceEpsilon: Double,
                                   scale: Array3D | Array1D,
                                   offset: Array3D | Array1D): Array3D
  def multiRNNCell(lstmCells: js.Array[LSTMCell],
                   data: Array2D,
                   c: js.Array[Array2D],
                   h: js.Array[Array2D]): js.Tuple2[js.Array[Array2D], js.Array[Array2D]] =
    js.native
  def basicLSTMCell(forgetBias: Scalar,
                    lstmKernel: Array2D,
                    lstmBias: Array1D,
                    data: Array2D,
                    c: Array2D,
                    h: Array2D): js.Tuple2[Array2D, Array2D] = js.native
  def multinomial(probabilities: Array1D | Array2D,
                  numSamples: Double,
                  seed: Double = ???): Array1D | Array2D = js.native
  def multinomialInternal(probabilities: Array2D, numSamples: Double, seed: Double): Array2D
  def oneHot(indices: Array1D,
             depth: Double,
             onValue: Double = ???,
             offValue: Double = ???): Array2D = js.native
  def oneHotInternal(indices: Array1D, depth: Double, onValue: Double, offValue: Double): Array2D
}

@js.native
sealed trait MatrixOrientation extends js.Object {}

@js.native
@JSGlobal
object MatrixOrientation extends js.Object {
  var REGULAR: MatrixOrientation    = js.native
  var TRANSPOSED: MatrixOrientation = js.native
  @JSBracketAccess
  def apply(value: MatrixOrientation): String = js.native
}

@js.native
@JSGlobalScope
object Math extends js.Object {
  type ScopeResultImmediate = js.Array[NDArray] | NDArray | Unit
  type ScopeResult          = ScopeResultImmediate | Promise[ScopeResultImmediate]
}

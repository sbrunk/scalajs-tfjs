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

package io.brunk.deeplearnjs.math

import io.brunk.deeplearnjs.math.Conv_util.ConvInfo
import io.brunk.deeplearnjs.math.Math.{ ScopeResult, ScopeResultImmediate }

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.{ Promise, | }

@js.native
trait LSTMCell extends js.Object {
  def apply(data: Array2D, c: Array2D, h: Array2D): js.Tuple2[Array2D, Array2D]
}

@js.native
trait NDArrayManager extends js.Object {
  def getNumArrays(): Double              = js.native
  def register(a: NDArray): Unit          = js.native
  def registerVariable(v: Variable): Unit = js.native
}

@js.native
@JSImport("deeplearn", "NDArrayMath")
class NDArrayMath protected () extends NDArrayManager {
  def this(backend: BackendType | MathBackend, safeMode: Boolean) = this()
  protected var backendEngine: BackendEngine              = js.native
  var registeredVariables: NamedVariableMap               = js.native
  def time(query: js.Function0[NDArray]): Promise[Double] = js.native
  def getNumArrays(): Double                              = js.native
  def register(a: NDArray | Variable): Unit               = js.native
  def registerVariable(v: Variable): Unit                 = js.native
  def writePixels(dataId: Double,
                  pixels: ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement,
                  numChannels: Double): Unit                                         = js.native
  def write[D <: DataType](dataId: Double, values: js.Any): Unit                     = js.native
  def readSync[D <: DataType](dataId: Double): js.Any                                = js.native
  def read[D <: DataType](dataId: Double): Promise[js.Any]                           = js.native
  def enableDebugMode(): Unit                                                        = js.native
  def scope[T <: ScopeResult](scopeFn: js.Function2[js.Function, js.Function, T]): T = js.native
  def gradientsScope[T <: ScopeResult](scopeFn: js.Function2[js.Function, js.Function, T]): T =
    js.native
  def startScope(): Unit                           = js.native
  def endScope(result: ScopeResultImmediate): Unit = js.native
  def keep[T <: NDArray](result: T): T             = js.native
  def track[T <: NDArray](result: T): T            = js.native
  def dispose(): Unit                              = js.native
  def matMul(a: Array2D,
             b: Array2D,
             aOrientation: MatrixOrientation = ???,
             bOrientation: MatrixOrientation = ???): Array2D  = js.native
  def vectorTimesMatrix(v: Array1D, matrix: Array2D): Array1D = js.native
  def matrixTimesVector(matrix: Array2D, v: Array1D): Array1D = js.native
  def dotProduct(v1: Array1D, v2: Array1D): Scalar            = js.native
  def outerProduct(v1: Array1D, v2: Array1D): Array2D         = js.native
  def clone[T <: NDArray](x: T): T                            = js.native
  def reshape[D <: DataType, R <: Rank, T <: js.Any](x: NDArray[D], newShape: js.Array[Double]): T =
    js.native
  def cast[D <: DataType, R <: Rank](x: NDArray[DataType, R], newDType: D): js.Any = js.native
  def slice1D(x: Array1D, begin: Double, size: Double): Array1D                    = js.native
  def slice2D(x: Array2D,
              begin: js.Tuple2[Double, Double],
              size: js.Tuple2[Double, Double]): Array2D = js.native
  def slice3D(x: Array3D,
              begin: js.Tuple3[Double, Double, Double],
              size: js.Tuple3[Double, Double, Double]): Array3D = js.native
  def slice4D(x: Array4D,
              begin: js.Tuple4[Double, Double, Double, Double],
              size: js.Tuple4[Double, Double, Double, Double]): Array4D = js.native
  def reverse1D(x: Array1D): Array1D                                    = js.native
  def reverse2D(x: Array2D, axis: Double | js.Array[Double]): Array2D   = js.native
  def reverse3D(x: Array3D, axis: Double | js.Array[Double]): Array3D   = js.native
  def reverse4D(x: Array4D, axis: Double | js.Array[Double]): Array4D   = js.native
  def concat1D(a: Array1D, b: Array1D): Array1D                         = js.native
  def concat2D(a: Array2D, b: Array2D, axis: Double): Array2D           = js.native
  def concat3D(a: Array3D, b: Array3D, axis: Double): Array3D           = js.native
  def concat4D(a: Array4D, b: Array4D, axis: Double): Array4D           = js.native
  def logSumExp[T <: NDArray[String]](input: NDArray,
                                      axis: Double | js.Array[Double] = ???,
                                      keepDims: Boolean = ???): T = js.native
  def sum[D <: DataType, T <: NDArray[js.Any]](x: NDArray[D],
                                               axis: Double | js.Array[Double] = ???,
                                               keepDims: Boolean = ???): T = js.native
  def mean(x: NDArray,
           axis: Double | js.Array[Double] = ???,
           keepDims: Boolean = ???): NDArray[String]                  = js.native
  def argMin[T <: NDArray[String]](x: NDArray, axis: Double = ???): T = js.native
  def argMax[T <: NDArray[String]](x: NDArray, axis: Double = ???): T = js.native
  def argMaxEquals(x1: NDArray, x2: NDArray): Scalar[String]          = js.native
  def equal[D1 <: DataType, D2 <: D1, T <: NDArray[String]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def equalStrict[T <: NDArray](a: T, b: T): NDArray[String] = js.native
  def notEqual[D1 <: DataType, D2 <: D1, T <: NDArray[String]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def notEqualStrict[R <: Rank, D1 <: DataType, D2 <: D1](a: NDArray[D1, R],
                                                          b: NDArray[D2, R]): js.Any = js.native
  def lessEqual[D1 <: DataType, D2 <: D1, T <: NDArray[String]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def greater[D1 <: DataType, D2 <: D1, T <: NDArray[String]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def greaterEqual[D1 <: DataType, D2 <: D1, T <: NDArray[String]](a: NDArray[D1],
                                                                   b: NDArray[D2]): T = js.native
  def logicalOr(a: NDArray[String], b: NDArray[String]): NDArray[String]              = js.native
  def topK(x: NDArray, k: Double): js.Any                                             = js.native
  def min[D <: DataType, T <: NDArray[D]](x: NDArray[D],
                                          axis: Double | js.Array[Double] = ???,
                                          keepDims: Boolean = ???): T = js.native
  def minimum[D1 <: DataType, D2 <: D1, T <: NDArray[D1]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def max[D <: DataType, T <: NDArray[D]](x: NDArray[D],
                                          axis: Double | js.Array[Double] = ???,
                                          keepDims: Boolean = ???): T = js.native
  def maximum[D1 <: DataType, D2 <: D1, T <: NDArray[D1]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def softmax[D <: DataType, R <: Rank](logits: NDArray[D, R], dim: Double = ???): js.Any =
    js.native
  def softmaxCrossEntropyWithLogits[R <: Rank,
                                    A <: NDArray[DataType, R],
                                    B <: NDArray[DataType, R],
                                    O <: NDArray[String]](labels: A,
                                                          logits: B,
                                                          dim: Double = ???): O = js.native
  def switchDim[T <: NDArray](a: T, newDim: js.Array[Double]): T                = js.native
  def tile[D <: DataType, T <: NDArray[D]](x: T, reps: js.Array[Double]): T     = js.native
  def pad1D(x: Array1D, paddings: js.Tuple2[Double, Double], constantValue: Double = ???): Array1D =
    js.native
  def pad2D(x: Array2D,
            paddings: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
            constantValue: Double = ???): Array2D                    = js.native
  def transpose[T <: NDArray](x: T, perm: js.Array[Double] = ???): T = js.native
  def scalarPlusArray[T <: NDArray](c: Scalar, a: T): T              = js.native
  def scalarMinusArray[T <: NDArray](c: Scalar, a: T): T             = js.native
  def arrayMinusScalar[T <: NDArray](a: T, c: Scalar): T             = js.native
  def neg[T <: NDArray](x: T): T                                     = js.native
  def add[D1 <: DataType, D2 <: D1, T <: NDArray[D1]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def addStrict[T <: NDArray](a: T, b: T): T = js.native
  def subtract[D1 <: DataType, D2 <: D1, T <: NDArray[D1]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def pow[D <: DataType, T <: NDArray[D]](a: NDArray[D], b: NDArray[String]): T = js.native
  def powStrict[D <: DataType](a: NDArray[D], b: NDArray[String]): NDArray[D]   = js.native
  def sub[D1 <: DataType, D2 <: D1, T <: NDArray[D1]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def subStrict[T <: NDArray](a: T, b: T): T = js.native
  def multiply[D1 <: DataType, D2 <: D1, T <: NDArray[D1]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def elementWiseMul[T <: NDArray](a: T, b: T): T                         = js.native
  def multiplyStrict[T <: NDArray](a: T, b: T): T                         = js.native
  def divide[T <: NDArray[String]](a: NDArray, b: NDArray): T             = js.native
  def divideStrict[T <: NDArray](a: T, b: T): T                           = js.native
  def scalarDividedByArray[T <: NDArray](c: Scalar, a: T): T              = js.native
  def arrayDividedByScalar[T <: NDArray](a: T, c: Scalar): T              = js.native
  def ceil[T <: NDArray](x: T): T                                         = js.native
  def floor[T <: NDArray](x: T): T                                        = js.native
  def exp[T <: NDArray](x: T): T                                          = js.native
  def log[T <: NDArray](x: T): T                                          = js.native
  def sqrt[T <: NDArray](x: T): T                                         = js.native
  def square[D <: DataType, R <: Rank, T <: NDArray[D, R]](x: T): T       = js.native
  def abs[T <: NDArray](x: T): T                                          = js.native
  def clip[T <: NDArray](x: T, min: Double, max: Double): T               = js.native
  def relu[D <: DataType, R <: Rank, T <: NDArray[D, R]](x: T): T         = js.native
  def elu[T <: NDArray](x: T): T                                          = js.native
  def eluDer[T <: NDArray](x: T): T                                       = js.native
  def selu[T <: NDArray](x: T): T                                         = js.native
  def leakyRelu[T <: NDArray](x: T, alpha: Double = ???): T               = js.native
  def prelu[T <: NDArray](x: T, alpha: T): T                              = js.native
  def preluDer[T <: NDArray](x: T, alpha: T): T                           = js.native
  def sigmoid[T <: NDArray](x: T): T                                      = js.native
  def sin[T <: NDArray](x: T): T                                          = js.native
  def cos[T <: NDArray](x: T): T                                          = js.native
  def tan[T <: NDArray](x: T): T                                          = js.native
  def asin[T <: NDArray](x: T): T                                         = js.native
  def acos[T <: NDArray](x: T): T                                         = js.native
  def atan[T <: NDArray](x: T): T                                         = js.native
  def sinh[T <: NDArray](x: T): T                                         = js.native
  def cosh[T <: NDArray](x: T): T                                         = js.native
  def tanh[T <: NDArray](x: T): T                                         = js.native
  def step[T <: NDArray](x: T, alpha: Double = ???): T                    = js.native
  def scaledArrayAdd[T <: NDArray](c1: Scalar, a: T, c2: Scalar, b: T): T = js.native
  def scalarTimesArray[T <: NDArray](c: Scalar, a: T): T                  = js.native
  def elementWiseMulBroadcast(a: Array2D, b: Array2D): Array2D            = js.native
  def conv1d[T <: NDArray](input: T,
                           filter: Array3D,
                           bias: Array1D | Null,
                           stride: Double,
                           pad: String | Double,
                           dimRoundingMode: String = ???): T = js.native
  def conv2d[T <: Array3D | Array4D](x: T,
                                     filter: Array4D,
                                     bias: Array1D | Null,
                                     strides: js.Tuple2[Double, Double] | Double,
                                     pad: String | Double,
                                     dimRoundingMode: String = ???): T = js.native
  def conv2dDerInput[T <: NDArray](
      xShape: js.Tuple4[Double, Double, Double, Double] | js.Tuple3[Double, Double, Double],
      dy: T,
      filter: Array4D,
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dimRoundingMode: String = ???
  ): T                                              = js.native
  def conv2dDerBias(dy: Array3D | Array4D): Array1D = js.native
  def conv2dDerFilter[T <: Array3D | Array4D](
      x: T,
      dy: T,
      filterShape: js.Tuple4[Double, Double, Double, Double],
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dimRoundingMode: String = ???
  ): Array4D = js.native
  def conv2dTranspose[T <: NDArray](
      x: T,
      filter: Array4D,
      outputShape: js.Tuple4[Double, Double, Double, Double] | js.Tuple3[Double, Double, Double],
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dimRoundingMode: String = ???
  ): T = js.native
  def depthwiseConv2D[T <: NDArray](input: T,
                                    filter: Array4D,
                                    strides: js.Tuple2[Double, Double] | Double,
                                    pad: String | Double,
                                    rates: js.Tuple2[Double, Double] | Double = ???,
                                    dimRoundingMode: String = ???): T = js.native
  def maxPool[T <: NDArray](x: T,
                            filterSize: js.Tuple2[Double, Double] | Double,
                            strides: js.Tuple2[Double, Double] | Double,
                            pad: String | Double,
                            dimRoundingMode: String = ???): T = js.native
  def maxPoolBackprop[T <: NDArray](dy: T,
                                    input: T,
                                    filterSize: js.Tuple2[Double, Double] | Double,
                                    strides: js.Tuple2[Double, Double] | Double,
                                    pad: String | Double,
                                    dimRoundingMode: String = ???): T = js.native
  def minPool[T <: NDArray](input: T,
                            filterSize: js.Tuple2[Double, Double] | Double,
                            strides: js.Tuple2[Double, Double] | Double,
                            pad: String | Double,
                            dimRoundingMode: String = ???): T = js.native
  def avgPool[R <: String](x: NDArray[String, R],
                           filterSize: js.Tuple2[Double, Double] | Double,
                           strides: js.Tuple2[Double, Double] | Double,
                           pad: String | Double,
                           dimRoundingMode: String = ???): js.Any = js.native
  def resizeBilinear3D(x: Array3D,
                       newShape2D: js.Tuple2[Double, Double],
                       alignCorners: Boolean = ???): Array3D = js.native
  def batchNormalization2D(x: Array2D,
                           mean: Array2D | Array1D,
                           variance: Array2D | Array1D,
                           varianceEpsilon: Double = ???,
                           scale: Array2D | Array1D = ???,
                           offset: Array2D | Array1D = ???): Array2D = js.native
  def batchNormalization3D(x: Array3D,
                           mean: Array3D | Array1D,
                           variance: Array3D | Array1D,
                           varianceEpsilon: Double = ???,
                           scale: Array3D | Array1D = ???,
                           offset: Array3D | Array1D = ???): Array3D = js.native
  def batchNormalization4D(x: Array4D,
                           mean: Array4D | Array1D,
                           variance: Array4D | Array1D,
                           varianceEpsilon: Double = ???,
                           scale: Array4D | Array1D = ???,
                           offset: Array4D | Array1D = ???): Array4D = js.native
  def localResponseNormalization3D(x: Array3D,
                                   radius: Double = ???,
                                   bias: Double = ???,
                                   alpha: Double = ???,
                                   beta: Double = ???,
                                   normRegion: String = ???): Array3D = js.native
  def localResponseNormalization4D(x: Array4D,
                                   radius: Double = ???,
                                   bias: Double = ???,
                                   alpha: Double = ???,
                                   beta: Double = ???,
                                   normRegion: String = ???): Array4D = js.native
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
                  seed: Double = ???): Array1D[String] | Array2D[String] = js.native
  def oneHot(indices: Array1D,
             depth: Double,
             onValue: Double = ???,
             offValue: Double = ???): Array2D = js.native
  def moments(x: NDArray, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): js.Any =
    js.native
  def norm[D <: DataType](x: NDArray[D],
                          ord: Double | String = ???,
                          axis: Double | js.Array[Double] = ???,
                          keepDims: Boolean = ???): NDArray[D | js.Any] = js.native
  def vjp[T <: NDArray | NamedArrayMap, R <: Rank](f: js.Function0[NDArray[DataType, R]],
                                                   x: T,
                                                   dy: NDArray[String, R]): T = js.native
  def gradients[T <: NDArray | NamedArrayMap, D <: DataType](f: js.Function0[Scalar[D]], x: T): T =
    js.native
  def variableGradients[D <: DataType](f: js.Function0[Scalar[D]]): js.Any = js.native
  def valueAndGradients[T <: NDArray | NamedArrayMap, D <: DataType](f: js.Function0[Scalar[D]],
                                                                     x: T): js.Any = js.native
  def customGradient[D <: DataType, R <: Rank](f: js.Function0[js.Any],
                                               inputs: NamedArrayMap,
                                               name: String = ???): NDArray[D, R] = js.native
  def disposeData(dataId: Double): Unit                                           = js.native
}

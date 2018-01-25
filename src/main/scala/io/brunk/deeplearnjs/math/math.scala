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

import io.brunk.deeplearnjs.Environment.BackendType
import io.brunk.deeplearnjs.Util.{ NamedArrayMap, NamedVariableMap }
import io.brunk.deeplearnjs.math.backends.Tape_util.{ ScopeResult, ScopeResultImmediate }
import io.brunk.deeplearnjs.math.backends.{ BackendEngine, MathBackend }
import io.brunk.deeplearnjs.math.backends.types.MatrixOrientation
import org.scalajs.dom.{ ImageData, html }

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.{ Promise, | }

@js.native
trait LSTMCell extends js.Object {
  def apply(
      data: Array2D[DataType][DataType],
      c: Array2D[DataType][DataType],
      h: Array2D[DataType][DataType]
  ): js.Tuple2[Array2D[DataType][DataType], Array2D[DataType][DataType]]
}

@js.native
trait NDArrayManager extends js.Object {
  def getNumArrays(): Double                     = js.native
  def register(a: NDArray[DataType, Rank]): Unit = js.native
  def registerVariable(v: Variable): Unit        = js.native
}

@js.native
@JSImport("deeplearn", "NDArrayMath")
class NDArrayMath protected () extends NDArrayManager {
  def this(backend: BackendType | MathBackend, safeMode: Boolean) = this()
  protected var backendEngine: BackendEngine                              = js.native
  var registeredVariables: NamedVariableMap                               = js.native
  def time(query: js.Function0[NDArray[DataType, Rank]]): Promise[Double] = js.native
  def getNumArrays(): Double                                              = js.native
  def register(a: NDArray[DataType, Rank] | Variable): Unit               = js.native
  def registerVariable(v: Variable): Unit                                 = js.native
  def writePixels(dataId: Double,
                  pixels: ImageData | html.Image | html.Canvas | html.Video,
                  numChannels: Double): Unit                                         = js.native
  def write[D <: DataType](dataId: Double, values: js.Any): Unit                     = js.native
  def readSync[D <: DataType](dataId: Double): js.Any                                = js.native
  def read[D <: DataType](dataId: Double): Promise[js.Any]                           = js.native
  def enableDebugMode(): Unit                                                        = js.native
  def scope[T <: ScopeResult](scopeFn: js.Function2[js.Function, js.Function, T]): T = js.native
  def gradientsScope[T <: ScopeResult](scopeFn: js.Function2[js.Function, js.Function, T]): T =
    js.native
  def startScope(): Unit                                = js.native
  def endScope(result: ScopeResultImmediate): Unit      = js.native
  def keep[T <: NDArray[DataType, Rank]](result: T): T  = js.native
  def track[T <: NDArray[DataType, Rank]](result: T): T = js.native
  def dispose(): Unit                                   = js.native
  def matMul(a: Array2D[DataType][DataType],
             b: Array2D[DataType][DataType],
             aOrientation: MatrixOrientation = ???,
             bOrientation: MatrixOrientation = ???): Array2D[DataType][DataType] = js.native
  def vectorTimesMatrix(v: Array1D[DataType][DataType],
                        matrix: Array2D[DataType][DataType]): Array1D[DataType][DataType] =
    js.native
  def matrixTimesVector(matrix: Array2D[DataType][DataType],
                        v: Array1D[DataType][DataType]): Array1D[DataType][DataType] = js.native
  def dotProduct(v1: Array1D[DataType][DataType],
                 v2: Array1D[DataType][DataType]): Scalar[DataType] =
    js.native
  def outerProduct(v1: Array1D[DataType][DataType],
                   v2: Array1D[DataType][DataType]): Array2D[DataType][DataType] = js.native
  def clone[T <: NDArray[DataType, Rank]](x: T): T                               = js.native
  def reshape[D <: DataType, R <: Rank, T <: js.Any](x: NDArray[D, Rank],
                                                     newShape: js.Array[Double]): T =
    js.native
  def cast[D <: DataType, R <: Rank](x: NDArray[DataType, R], newDType: D): js.Any = js.native
  def slice1D(x: Array1D[DataType][DataType],
              begin: Double,
              size: Double): Array1D[DataType][DataType] = js.native
  def slice2D(x: Array2D[DataType][DataType],
              begin: js.Tuple2[Double, Double],
              size: js.Tuple2[Double, Double]): Array2D[DataType][DataType] = js.native
  def slice3D(x: Array3D[DataType][DataType],
              begin: js.Tuple3[Double, Double, Double],
              size: js.Tuple3[Double, Double, Double]): Array3D[DataType][DataType] = js.native
  def slice4D(x: Array4D[DataType][DataType],
              begin: js.Tuple4[Double, Double, Double, Double],
              size: js.Tuple4[Double, Double, Double, Double]): Array4D[DataType][DataType] =
    js.native
  def reverse1D(x: Array1D[DataType][DataType]): Array1D[DataType][DataType] = js.native
  def reverse2D(x: Array2D[DataType][DataType],
                axis: Double | js.Array[Double]): Array2D[DataType][DataType] = js.native
  def reverse3D(x: Array3D[DataType][DataType],
                axis: Double | js.Array[Double]): Array3D[DataType][DataType] = js.native
  def reverse4D(x: Array4D[DataType][DataType],
                axis: Double | js.Array[Double]): Array4D[DataType][DataType] = js.native
  def concat1D(a: Array1D[DataType][DataType],
               b: Array1D[DataType][DataType]): Array1D[DataType][DataType] = js.native
  def concat2D(a: Array2D[DataType][DataType],
               b: Array2D[DataType][DataType],
               axis: Double): Array2D[DataType][DataType] = js.native
  def concat3D(a: Array3D[DataType][DataType],
               b: Array3D[DataType][DataType],
               axis: Double): Array3D[DataType][DataType] = js.native
  def concat4D(a: Array4D[DataType][DataType],
               b: Array4D[DataType][DataType],
               axis: Double): Array4D[DataType][DataType] = js.native
  def logSumExp[T <: NDArray[String, Rank]](input: NDArray[DataType, Rank],
                                            axis: Double | js.Array[Double] = ???,
                                            keepDims: Boolean = ???): T = js.native
  def sum[D <: DataType, T <: NDArray[js.Any]](x: NDArray[D, Rank],
                                               axis: Double | js.Array[Double] = ???,
                                               keepDims: Boolean = ???): T = js.native
  def mean(x: NDArray[DataType, Rank],
           axis: Double | js.Array[Double] = ???,
           keepDims: Boolean = ???): NDArray[String, Rank] = js.native
  def argMin[T <: NDArray[String, Rank]](x: NDArray[DataType, Rank], axis: Double = ???): T =
    js.native
  def argMax[T <: NDArray[String, Rank]](x: NDArray[DataType, Rank], axis: Double = ???): T =
    js.native
  def argMaxEquals(x1: NDArray[DataType, Rank], x2: NDArray[DataType, Rank]): Scalar[String] =
    js.native
  def equal[D1 <: DataType, D2 <: D1, T <: NDArray[String, Rank]](a: NDArray[D1],
                                                                  b: NDArray[D2]): T =
    js.native
  def equalStrict[T <: NDArray[DataType, Rank]](a: T, b: T): NDArray[String, Rank] = js.native
  def notEqual[D1 <: DataType, D2 <: D1, T <: NDArray[String, Rank]](a: NDArray[D1],
                                                                     b: NDArray[D2]): T =
    js.native
  def notEqualStrict[R <: Rank, D1 <: DataType, D2 <: D1](a: NDArray[D1, R],
                                                          b: NDArray[D2, R]): js.Any = js.native
  def lessEqual[D1 <: DataType, D2 <: D1, T <: NDArray[String, Rank]](a: NDArray[D1],
                                                                      b: NDArray[D2]): T =
    js.native
  def greater[D1 <: DataType, D2 <: D1, T <: NDArray[String, Rank]](a: NDArray[D1],
                                                                    b: NDArray[D2]): T =
    js.native
  def greaterEqual[D1 <: DataType, D2 <: D1, T <: NDArray[String, Rank]](a: NDArray[D1],
                                                                         b: NDArray[D2]): T =
    js.native
  def logicalOr(a: NDArray[String, Rank], b: NDArray[String, Rank]): NDArray[String, Rank] =
    js.native
  def topK(x: NDArray[DataType, Rank], k: Double): js.Any = js.native
  def min[D <: DataType, T <: NDArray[D, Rank]](x: NDArray[D, Rank],
                                                axis: Double | js.Array[Double] = ???,
                                                keepDims: Boolean = ???): T = js.native
  def minimum[D1 <: DataType, D2 <: D1, T <: NDArray[D1]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def max[D <: DataType, T <: NDArray[D, Rank]](x: NDArray[D, Rank],
                                                axis: Double | js.Array[Double] = ???,
                                                keepDims: Boolean = ???): T = js.native
  def maximum[D1 <: DataType, D2 <: D1, T <: NDArray[D1]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def softmax[D <: DataType, R <: Rank](logits: NDArray[D, R], dim: Double = ???): js.Any =
    js.native
  def softmaxCrossEntropyWithLogits[R <: Rank,
                                    A <: NDArray[DataType, R],
                                    B <: NDArray[DataType, R],
                                    O <: NDArray[String, Rank]](labels: A,
                                                                logits: B,
                                                                dim: Double = ???): O = js.native
  def switchDim[T <: NDArray[DataType, Rank]](a: T, newDim: js.Array[Double]): T      = js.native
  def tile[D <: DataType, T <: NDArray[D, Rank]](x: T, reps: js.Array[Double]): T     = js.native
  def pad1D(x: Array1D[DataType][DataType],
            paddings: js.Tuple2[Double, Double],
            constantValue: Double = ???): Array1D[DataType][DataType] =
    js.native
  def pad2D(x: Array2D[DataType][DataType],
            paddings: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
            constantValue: Double = ???): Array2D[DataType][DataType]                = js.native
  def transpose[T <: NDArray[DataType, Rank]](x: T, perm: js.Array[Double] = ???): T = js.native
  def scalarPlusArray[T <: NDArray[DataType, Rank]](c: Scalar[DataType], a: T): T    = js.native
  def scalarMinusArray[T <: NDArray[DataType, Rank]](c: Scalar[DataType], a: T): T   = js.native
  def arrayMinusScalar[T <: NDArray[DataType, Rank]](a: T, c: Scalar[DataType]): T   = js.native
  def neg[T <: NDArray[DataType, Rank]](x: T): T                                     = js.native
  def add[D1 <: DataType, D2 <: D1, T <: NDArray[D1]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def addStrict[T <: NDArray[DataType, Rank]](a: T, b: T): T = js.native
  def subtract[D1 <: DataType, D2 <: D1, T <: NDArray[D1]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def pow[D <: DataType, T <: NDArray[D, Rank]](a: NDArray[D, Rank], b: NDArray[String, Rank]): T =
    js.native
  def powStrict[D <: DataType](a: NDArray[D, Rank], b: NDArray[String, Rank]): NDArray[D, Rank] =
    js.native
  def sub[D1 <: DataType, D2 <: D1, T <: NDArray[D1]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def subStrict[T <: NDArray[DataType, Rank]](a: T, b: T): T = js.native
  def multiply[D1 <: DataType, D2 <: D1, T <: NDArray[D1]](a: NDArray[D1], b: NDArray[D2]): T =
    js.native
  def elementWiseMul[T <: NDArray[DataType, Rank]](a: T, b: T): T = js.native
  def multiplyStrict[T <: NDArray[DataType, Rank]](a: T, b: T): T = js.native
  def divide[T <: NDArray[String, Rank]](a: NDArray[DataType, Rank],
                                         b: NDArray[DataType, Rank]): T =
    js.native
  def divideStrict[T <: NDArray[DataType, Rank]](a: T, b: T): T                        = js.native
  def scalarDividedByArray[T <: NDArray[DataType, Rank]](c: Scalar[DataType], a: T): T = js.native
  def arrayDividedByScalar[T <: NDArray[DataType, Rank]](a: T, c: Scalar[DataType]): T = js.native
  def ceil[T <: NDArray[DataType, Rank]](x: T): T                                      = js.native
  def floor[T <: NDArray[DataType, Rank]](x: T): T                                     = js.native
  def exp[T <: NDArray[DataType, Rank]](x: T): T                                       = js.native
  def log[T <: NDArray[DataType, Rank]](x: T): T                                       = js.native
  def sqrt[T <: NDArray[DataType, Rank]](x: T): T                                      = js.native
  def square[D <: DataType, R <: Rank, T <: NDArray[D, R]](x: T): T                    = js.native
  def abs[T <: NDArray[DataType, Rank]](x: T): T                                       = js.native
  def clip[T <: NDArray[DataType, Rank]](x: T, min: Double, max: Double): T            = js.native
  def relu[D <: DataType, R <: Rank, T <: NDArray[D, R]](x: T): T                      = js.native
  def elu[T <: NDArray[DataType, Rank]](x: T): T                                       = js.native
  def eluDer[T <: NDArray[DataType, Rank]](x: T): T                                    = js.native
  def selu[T <: NDArray[DataType, Rank]](x: T): T                                      = js.native
  def leakyRelu[T <: NDArray[DataType, Rank]](x: T, alpha: Double = ???): T            = js.native
  def prelu[T <: NDArray[DataType, Rank]](x: T, alpha: T): T                           = js.native
  def preluDer[T <: NDArray[DataType, Rank]](x: T, alpha: T): T                        = js.native
  def sigmoid[T <: NDArray[DataType, Rank]](x: T): T                                   = js.native
  def sin[T <: NDArray[DataType, Rank]](x: T): T                                       = js.native
  def cos[T <: NDArray[DataType, Rank]](x: T): T                                       = js.native
  def tan[T <: NDArray[DataType, Rank]](x: T): T                                       = js.native
  def asin[T <: NDArray[DataType, Rank]](x: T): T                                      = js.native
  def acos[T <: NDArray[DataType, Rank]](x: T): T                                      = js.native
  def atan[T <: NDArray[DataType, Rank]](x: T): T                                      = js.native
  def sinh[T <: NDArray[DataType, Rank]](x: T): T                                      = js.native
  def cosh[T <: NDArray[DataType, Rank]](x: T): T                                      = js.native
  def tanh[T <: NDArray[DataType, Rank]](x: T): T                                      = js.native
  def step[T <: NDArray[DataType, Rank]](x: T, alpha: Double = ???): T                 = js.native
  def scaledArrayAdd[T <: NDArray[DataType, Rank]](c1: Scalar[DataType],
                                                   a: T,
                                                   c2: Scalar[DataType],
                                                   b: T): T =
    js.native
  def scalarTimesArray[T <: NDArray[DataType, Rank]](c: Scalar[DataType], a: T): T = js.native
  def elementWiseMulBroadcast(a: Array2D[DataType], b: Array2D[DataType]): Array2D[DataType] =
    js.native
  def conv1d[T <: NDArray[DataType, Rank]](input: T,
                                           filter: Array3D[DataType],
                                           bias: Array1D[DataType] | Null,
                                           stride: Double,
                                           pad: String | Double,
                                           dimRoundingMode: String = ???): T = js.native
  def conv2d[T <: Array3D[DataType] | Array4D[DataType]](
      x: T,
      filter: Array4D[DataType],
      bias: Array1D[DataType] | Null,
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dimRoundingMode: String = ???
  ): T = js.native
  def conv2dDerInput[T <: NDArray[DataType, Rank]](
      xShape: js.Tuple4[Double, Double, Double, Double] | js.Tuple3[Double, Double, Double],
      dy: T,
      filter: Array4D[DataType],
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dimRoundingMode: String = ???
  ): T                                                                            = js.native
  def conv2dDerBias(dy: Array3D[DataType] | Array4D[DataType]): Array1D[DataType] = js.native
  def conv2dDerFilter[T <: Array3D[DataType] | Array4D[DataType]](
      x: T,
      dy: T,
      filterShape: js.Tuple4[Double, Double, Double, Double],
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dimRoundingMode: String = ???
  ): Array4D[DataType] = js.native
  def conv2dTranspose[T <: NDArray[DataType, Rank]](
      x: T,
      filter: Array4D[DataType],
      outputShape: js.Tuple4[Double, Double, Double, Double] | js.Tuple3[Double, Double, Double],
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dimRoundingMode: String = ???
  ): T = js.native
  def depthwiseConv2D[T <: NDArray[DataType, Rank]](input: T,
                                                    filter: Array4D[DataType],
                                                    strides: js.Tuple2[Double, Double] | Double,
                                                    pad: String | Double,
                                                    rates: js.Tuple2[Double, Double] | Double = ???,
                                                    dimRoundingMode: String = ???): T = js.native
  def maxPool[T <: NDArray[DataType, Rank]](x: T,
                                            filterSize: js.Tuple2[Double, Double] | Double,
                                            strides: js.Tuple2[Double, Double] | Double,
                                            pad: String | Double,
                                            dimRoundingMode: String = ???): T = js.native
  def maxPoolBackprop[T <: NDArray[DataType, Rank]](dy: T,
                                                    input: T,
                                                    filterSize: js.Tuple2[Double, Double] | Double,
                                                    strides: js.Tuple2[Double, Double] | Double,
                                                    pad: String | Double,
                                                    dimRoundingMode: String = ???): T = js.native
  def minPool[T <: NDArray[DataType, Rank]](input: T,
                                            filterSize: js.Tuple2[Double, Double] | Double,
                                            strides: js.Tuple2[Double, Double] | Double,
                                            pad: String | Double,
                                            dimRoundingMode: String = ???): T = js.native
  def avgPool[R <: String](x: NDArray[String, R],
                           filterSize: js.Tuple2[Double, Double] | Double,
                           strides: js.Tuple2[Double, Double] | Double,
                           pad: String | Double,
                           dimRoundingMode: String = ???): js.Any = js.native
  def resizeBilinear3D(x: Array3D[DataType],
                       newShape2D: js.Tuple2[Double, Double],
                       alignCorners: Boolean = ???): Array3D[DataType] = js.native
  def batchNormalization2D(x: Array2D[DataType],
                           mean: Array2D[DataType] | Array1D[DataType],
                           variance: Array2D[DataType] | Array1D[DataType],
                           varianceEpsilon: Double = ???,
                           scale: Array2D[DataType] | Array1D[DataType] = ???,
                           offset: Array2D[DataType] | Array1D[DataType] = ???): Array2D[DataType] =
    js.native
  def batchNormalization3D(x: Array3D[DataType],
                           mean: Array3D[DataType] | Array1D[DataType],
                           variance: Array3D[DataType] | Array1D[DataType],
                           varianceEpsilon: Double = ???,
                           scale: Array3D[DataType] | Array1D[DataType] = ???,
                           offset: Array3D[DataType] | Array1D[DataType] = ???): Array3D[DataType] =
    js.native
  def batchNormalization4D(x: Array4D[DataType],
                           mean: Array4D[DataType] | Array1D[DataType],
                           variance: Array4D[DataType] | Array1D[DataType],
                           varianceEpsilon: Double = ???,
                           scale: Array4D[DataType] | Array1D[DataType] = ???,
                           offset: Array4D[DataType] | Array1D[DataType] = ???): Array4D[DataType] =
    js.native
  def localResponseNormalization3D(x: Array3D[DataType],
                                   radius: Double = ???,
                                   bias: Double = ???,
                                   alpha: Double = ???,
                                   beta: Double = ???,
                                   normRegion: String = ???): Array3D[DataType] = js.native
  def localResponseNormalization4D(x: Array4D[DataType],
                                   radius: Double = ???,
                                   bias: Double = ???,
                                   alpha: Double = ???,
                                   beta: Double = ???,
                                   normRegion: String = ???): Array4D[DataType] = js.native
  def multiRNNCell(
      lstmCells: js.Array[LSTMCell],
      data: Array2D[DataType],
      c: js.Array[Array2D[DataType]],
      h: js.Array[Array2D[DataType]]
  ): js.Tuple2[js.Array[Array2D[DataType]], js.Array[Array2D[DataType]]] =
    js.native
  def basicLSTMCell(forgetBias: Scalar[DataType],
                    lstmKernel: Array2D[DataType],
                    lstmBias: Array1D[DataType],
                    data: Array2D[DataType],
                    c: Array2D[DataType],
                    h: Array2D[DataType]): js.Tuple2[Array2D[DataType], Array2D[DataType]] =
    js.native
  def multinomial(probabilities: Array1D[DataType] | Array2D[DataType],
                  numSamples: Double,
                  seed: Double = ???): Array1D[DataType][String] | Array2D[DataType][String] =
    js.native
  def oneHot(indices: Array1D[DataType],
             depth: Double,
             onValue: Double = ???,
             offValue: Double = ???): Array2D[DataType] = js.native
  def moments(x: NDArray[DataType, Rank],
              axis: Double | js.Array[Double] = ???,
              keepDims: Boolean = ???): js.Any =
    js.native
  def norm[D <: DataType](x: NDArray[D, Rank],
                          ord: Double | String = ???,
                          axis: Double | js.Array[Double] = ???,
                          keepDims: Boolean = ???): NDArray[D | js.Any] = js.native
  def vjp[T <: NDArray[DataType, Rank] | NamedArrayMap, R <: Rank](
      f: js.Function0[NDArray[DataType, R]],
      x: T,
      dy: NDArray[String, R]
  ): T = js.native
  def gradients[T <: NDArray[DataType, Rank] | NamedArrayMap, D <: DataType](
      f: js.Function0[Scalar[D]],
      x: T
  ): T =
    js.native
  def variableGradients[D <: DataType](f: js.Function0[Scalar[D]]): js.Any = js.native
  def valueAndGradients[T <: NDArray[DataType, Rank] | NamedArrayMap, D <: DataType](
      f: js.Function0[Scalar[D]],
      x: T
  ): js.Any = js.native
  def customGradient[D <: DataType, R <: Rank](f: js.Function0[js.Any],
                                               inputs: NamedArrayMap,
                                               name: String = ???): NDArray[D, R] = js.native
  def disposeData(dataId: Double): Unit                                           = js.native
}

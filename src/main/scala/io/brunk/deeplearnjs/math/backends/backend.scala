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

import io.brunk.deeplearnjs.math.Conv_util.Conv2DInfo
import io.brunk.deeplearnjs.math._
import io.brunk.deeplearnjs.math.backends.types.MatrixOrientation
import org.scalajs.dom.{ ImageData, html }

import scala.scalajs.js
import scala.scalajs.js.{ Promise, | }

@js.native
trait NDArrayStorage extends js.Object {
  def read[D <: DataType](dataId: Double): Promise[js.Any]
  def readSync[D <: DataType](dataId: Double): js.Any
  def disposeData(dataId: Double): Unit
  def write[D <: DataType](dataId: Double, values: js.Any): Unit
  def writePixels(dataId: Double,
                  pixels: ImageData | html.Image | html.Canvas | html.Video,
                  numChannels: Double): Unit
  def time(query: js.Function0[NDArray[DataType, Rank]]): Promise[Double]
  def register(dataId: Double, shape: js.Array[Double], dtype: DataType): Unit
}

@js.native
trait MathBackend extends NDArrayStorage {
  def matMul(a: Array2D[DataType],
             b: Array2D[DataType],
             aOrientation: MatrixOrientation,
             bOrientation: MatrixOrientation): Array2D[DataType]
  def clone[D <: DataType, T <: NDArray[D, Rank]](x: T): T
  def slice1D(x: Array1D[DataType], begin: Double, size: Double): Array1D[DataType]
  def slice2D(x: Array2D[DataType],
              begin: js.Tuple2[Double, Double],
              size: js.Tuple2[Double, Double]): Array2D[DataType]
  def slice3D(x: Array3D[DataType],
              begin: js.Tuple3[Double, Double, Double],
              size: js.Tuple3[Double, Double, Double]): Array3D[DataType]
  def slice4D(x: Array4D[DataType],
              begin: js.Tuple4[Double, Double, Double, Double],
              size: js.Tuple4[Double, Double, Double, Double]): Array4D[DataType]
  def reverse4D(a: Array4D[DataType], axis: js.Array[Double]): Array4D[DataType]
  def concat1D(a: Array1D[DataType], b: Array1D[DataType]): Array1D[DataType]
  def concat2D(a: Array2D[DataType], b: Array2D[DataType], axis: Double): Array2D[DataType]
  def concat3D(a: Array3D[DataType], b: Array3D[DataType], axis: Double): Array3D[DataType]
  def concat4D(a: Array4D[DataType], b: Array4D[DataType], axis: Double): Array4D[DataType]
  def neg[T <: NDArray[DataType, Rank]](a: T): T
  def add[D <: DataType](a: NDArray[D, Rank], b: NDArray[D, Rank]): NDArray[D, Rank]
  def subtract[D <: DataType](a: NDArray[D, Rank], b: NDArray[D, Rank]): NDArray[D, Rank]
  def multiply[D <: DataType](a: NDArray[D, Rank], b: NDArray[D, Rank]): NDArray[D, Rank]
  def divide(a: NDArray[DataType, Rank], b: NDArray[DataType, Rank]): NDArray[Float32, Rank]
  def sum[D <: DataType](x: NDArray[D, Rank], axes: js.Array[Double]): NDArray[D, Rank] // TODO SumTypes
  def argMin(x: NDArray[DataType, Rank], axes: js.Array[Double]): NDArray[Int32, Rank]
  def argMax(x: NDArray[DataType, Rank], axes: js.Array[Double]): NDArray[Int32, Rank]
  def equal(a: NDArray[DataType, Rank], b: NDArray[DataType, Rank]): NDArray[Bool, Rank]
  def notEqual(a: NDArray[DataType, Rank], b: NDArray[DataType, Rank]): NDArray[Bool, Rank]
  def lessEqual(a: NDArray[DataType, Rank], b: NDArray[DataType, Rank]): NDArray[Bool, Rank]
  def greater(a: NDArray[DataType, Rank], b: NDArray[DataType, Rank]): NDArray[Bool, Rank]
  def greaterEqual(a: NDArray[DataType, Rank], b: NDArray[DataType, Rank]): NDArray[Bool, Rank]
  def logicalOr(a: NDArray[DataType, Rank], b: NDArray[DataType, Rank]): NDArray[Bool, Rank]
  def topKValues[D <: DataType, T <: NDArray[D, Rank]](x: T, k: Double): Array1D[D]
  def topKIndices(x: NDArray[DataType, Rank], k: Double): Array1D[Int32]
  def min[D <: DataType](x: NDArray[D, Rank], axes: js.Array[Double]): NDArray[D, Rank]
  def minimum[D <: DataType](a: NDArray[D, Rank], b: NDArray[D, Rank]): NDArray[D, Rank]
  def max[D <: DataType](x: NDArray[D, Rank], axes: js.Array[Double]): NDArray[D, Rank]
  def maximum[D <: DataType](a: NDArray[D, Rank], b: NDArray[D, Rank]): NDArray[D, Rank]
  def ceil[T <: NDArray[DataType, Rank]](x: T): T
  def floor[T <: NDArray[DataType, Rank]](x: T): T
  def pow[T <: NDArray[DataType, Rank]](a: T, b: NDArray[Int32, Rank]): T
  def exp[T <: NDArray[DataType, Rank]](x: T): T
  def log[T <: NDArray[DataType, Rank]](x: T): T
  def sqrt[T <: NDArray[DataType, Rank]](x: T): T
  def square[T <: NDArray[DataType, Rank]](x: T): T
  def relu[T <: NDArray[DataType, Rank]](x: T): T
  def elu[T <: NDArray[DataType, Rank]](x: T): T
  def eluDer[T <: NDArray[DataType, Rank]](x: T): T
  def selu[T <: NDArray[DataType, Rank]](x: T): T
  def leakyRelu[T <: NDArray[DataType, Rank]](x: T, alpha: Double): T
  def prelu[T <: NDArray[DataType, Rank]](x: T, alpha: T): T
  def preluDer[T <: NDArray[DataType, Rank]](x: T, alpha: T): T
  def int[R <: Rank](x: NDArray[DataType, R]): NDArray[Int32, R]
  def clip[T <: NDArray[DataType, Rank]](x: T, min: Double, max: Double): T
  def abs[T <: NDArray[DataType, Rank]](x: T): T
  def sigmoid[T <: NDArray[DataType, Rank]](x: T): T
  def sin[T <: NDArray[DataType, Rank]](x: T): T
  def cos[T <: NDArray[DataType, Rank]](x: T): T
  def tan[T <: NDArray[DataType, Rank]](x: T): T
  def asin[T <: NDArray[DataType, Rank]](x: T): T
  def acos[T <: NDArray[DataType, Rank]](x: T): T
  def atan[T <: NDArray[DataType, Rank]](x: T): T
  def sinh[T <: NDArray[DataType, Rank]](x: T): T
  def cosh[T <: NDArray[DataType, Rank]](x: T): T
  def tanh[T <: NDArray[DataType, Rank]](x: T): T
  def step[T <: NDArray[DataType, Rank]](x: T, alpha: Double): T
  def conv2d(x: Array4D[DataType],
             filter: Array4D[DataType],
             bias: Array1D[DataType] | Null,
             convInfo: Conv2DInfo): Array4D[DataType]
  def conv2dDerInput(dy: Array4D[DataType],
                     filter: Array4D[DataType],
                     convInfo: Conv2DInfo): Array4D[DataType]
  def conv2dDerFilter(x: Array4D[DataType],
                      dY: Array4D[DataType],
                      convInfo: Conv2DInfo): Array4D[DataType]
  def conv2dDerBias(dY: Array4D[DataType]): Array1D[DataType]
  def depthwiseConv2D(input: Array4D[DataType],
                      filter: Array4D[DataType],
                      convInfo: Conv2DInfo): Array4D[DataType]
  def maxPool(x: Array4D[DataType], convInfo: Conv2DInfo): Array4D[DataType]
  def maxPoolBackprop(dy: Array4D[DataType],
                      x: Array4D[DataType],
                      convInfo: Conv2DInfo): Array4D[DataType]
  def minPool(x: Array4D[DataType], convInfo: Conv2DInfo): Array4D[DataType]
  def avgPool(x: Array4D[DataType], convInfo: Conv2DInfo): Array4D[DataType]
  def avgPoolBackprop(dy: Array4D[DataType],
                      x: Array4D[DataType],
                      convInfo: Conv2DInfo): Array4D[DataType]
  def tile[D <: DataType, T <: NDArray[D, Rank]](x: T, reps: js.Array[Double]): T
  def pad1D(x: Array1D[DataType],
            paddings: js.Tuple2[Double, Double],
            constantValue: Double): Array1D[DataType]
  def pad2D(x: Array2D[DataType],
            paddings: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
            constantValue: Double): Array2D[DataType]
  def transpose[D <: DataType, T <: NDArray[D, Rank]](x: T, perm: js.Array[Double]): T
  def resizeBilinear3D(x: Array3D[DataType],
                       newShape2D: js.Tuple2[Double, Double],
                       alignCorners: Boolean): Array3D[DataType]
  def batchNormalization2D(x: Array2D[DataType],
                           mean: Array2D[DataType] | Array1D[DataType],
                           variance: Array2D[DataType] | Array1D[DataType],
                           varianceEpsilon: Double,
                           scale: Array2D[DataType] | Array1D[DataType] = ???,
                           offset: Array2D[DataType] | Array1D[DataType] = ???): Array2D[DataType]
  def batchNormalization3D(x: Array3D[DataType],
                           mean: Array3D[DataType] | Array1D[DataType],
                           variance: Array3D[DataType] | Array1D[DataType],
                           varianceEpsilon: Double,
                           scale: Array3D[DataType] | Array1D[DataType] = ???,
                           offset: Array3D[DataType] | Array1D[DataType] = ???): Array3D[DataType]
  def batchNormalization4D(x: Array4D[DataType],
                           mean: Array4D[DataType] | Array1D[DataType],
                           variance: Array4D[DataType] | Array1D[DataType],
                           varianceEpsilon: Double,
                           scale: Array4D[DataType] | Array1D[DataType] = ???,
                           offset: Array4D[DataType] | Array1D[DataType] = ???): Array4D[DataType]
  def localResponseNormalization4D(x: Array4D[DataType],
                                   radius: Double,
                                   bias: Double,
                                   alpha: Double,
                                   beta: Double,
                                   normRegion: String): Array4D[DataType]
  def multinomial(probabilities: Array2D[DataType],
                  numSamples: Double,
                  seed: Double): Array2D[Int32]
  def oneHot(indices: Array1D[DataType],
             depth: Double,
             onValue: Double,
             offValue: Double): Array2D[DataType]
  def dispose(): Unit
}

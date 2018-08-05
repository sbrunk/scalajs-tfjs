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

package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.{ Promise, | }
import TensorModule.{ DataId, Scalar, Tensor1D, Tensor2D, Tensor3D, Tensor4D, TensorND }
import Types._

@js.native
trait TensorData extends js.Object {
  var dataId: DataId     = js.native
  var values: TypedArray = js.native
}

@js.native
@JSGlobal
class TensorBuffer[R <: Rank] protected () extends js.Object {
  def this(shape: R#Shape, dtype: DataType, values: TypedArray) = this()
  var dtype: DataType                             = js.native
  var size: Double                                = js.native
  var shape: R#Shape                              = js.native
  var strides: js.Array[Double]                   = js.native
  var values: TypedArray                          = js.native
  def set(value: Double, locs: Double*): Unit     = js.native
  def get(locs: Double*): Double                  = js.native
  def locToIndex(locs: js.Array[Double]): Double  = js.native
  def indexToLoc(index: Double): js.Array[Double] = js.native
  def rank: Double                                = js.native
  def toTensor(): Tensor[R]                       = js.native
}

@js.native
trait TensorTracker extends js.Object {
  def registerTensor(t: TensorND): Unit                 = js.native
  def disposeTensor(t: TensorND): Unit                  = js.native
  def write(dataId: DataId, values: TypedArray): Unit = js.native
  def read(dataId: DataId): Promise[TypedArray]       = js.native
  def readSync(dataId: DataId): TypedArray            = js.native
  def registerVariable(v: Variable[Rank]): Unit             = js.native
}

@js.native
trait OpHandler extends js.Object {
  def cast[T <: TensorND](x: T, dtype: DataType): T = js.native
  def buffer[R <: Rank](
    shape: R#Shape,
    dtype: DataType,
    values: TypedArray = ???
  ): TensorBuffer[R]                                              = js.native
  def print[T <: TensorND](x: T, verbose: Boolean): Unit            = js.native
  def reshape[R2 <: Rank](x: TensorND, shape: R2#Shape): Tensor[R2]   = js.native
  def expandDims[R2 <: Rank](x: TensorND, axis: Double): Tensor[R2] = js.native
  def cumsum[T <: TensorND](x: TensorND, axis: Double, exclusive: Boolean, reverse: Boolean): T =
    js.native
  def squeeze[T <: TensorND](x: TensorND, axis: js.Array[Double] = ???): T = js.native
  def clone[T <: TensorND](x: T): T                                      = js.native
  def tile[T <: TensorND](x: T, reps: js.Array[Double]): T               = js.native
  def gather[T <: TensorND](x: T, indices: Tensor1D, axis: Double): T    = js.native
  def matMul(a: Tensor2D, b: Tensor2D, transposeA: Boolean, transposeB: Boolean): Tensor2D =
    js.native
  def dot(t1: TensorND, t2: TensorND): TensorND = js.native
  def norm(
    x: TensorND,
    ord: Double | String,
    axis: Double | js.Array[Double],
    keepDims: Boolean
  ): TensorND = js.native
  def slice[R <: Rank, T <: Tensor[R]](
    x: T,
    begin: Double | js.Array[Double],
    size: Double | js.Array[Double] = ???
  ): T                                                                     = js.native
  def reverse[T <: TensorND](x: T, axis: Double | js.Array[Double] = ???): T = js.native
  def concat[T <: TensorND](tensors: js.Array[T], axis: Double): T           = js.native
  def stack[T <: TensorND](tensors: js.Array[T], axis: Double): TensorND       = js.native
  def unstack[T <: TensorND](value: T, axis: Double): js.Array[TensorND]       = js.native
  def pad[T <: TensorND](
    x: T,
    paddings: js.Array[js.Tuple2[Double, Double]],
    constantValue: Double
  ): T = js.native
  def batchNormalization[R <: Rank](
    x: Tensor[R],
    mean: Tensor[R] | Tensor1D,
    variance: Tensor[R] | Tensor1D,
    varianceEpsilon: Double,
    scale: Tensor[R] | Tensor1D = ???,
    offset: Tensor[R] | Tensor1D = ???
  ): Tensor[R] = js.native
  def all[T <: TensorND](x: TensorND, axis: Double | js.Array[Double], keepDims: Boolean): T =
    js.native
  def any[T <: TensorND](x: TensorND, axis: Double | js.Array[Double], keepDims: Boolean): T =
    js.native
  def logSumExp[T <: TensorND](x: TensorND, axis: Double | js.Array[Double], keepDims: Boolean): T =
    js.native
  def sum[T <: TensorND](x: TensorND, axis: Double | js.Array[Double], keepDims: Boolean): T =
    js.native
  def mean[T <: TensorND](x: TensorND, axis: Double | js.Array[Double], keepDims: Boolean): T =
    js.native
  def min[T <: TensorND](x: TensorND, axis: Double | js.Array[Double], keepDims: Boolean): T =
    js.native
  def max[T <: TensorND](x: TensorND, axis: Double | js.Array[Double], keepDims: Boolean): T =
    js.native
  def argMin[T <: TensorND](x: TensorND, axis: Double): T                               = js.native
  def argMax[T <: TensorND](x: TensorND, axis: Double): T                               = js.native
  def add[T <: TensorND](a: TensorND, b: TensorND): T                                     = js.native
  def addStrict[T <: TensorND](a: T, b: T): T                                         = js.native
  def sub[T <: TensorND](a: TensorND, b: TensorND): T                                     = js.native
  def subStrict[T <: TensorND](a: T, b: T): T                                         = js.native
  def pow[T <: TensorND](base: T, exp: TensorND): T                                     = js.native
  def powStrict[T <: TensorND](base: T, exp: TensorND): T                               = js.native
  def mul[T <: TensorND](a: TensorND, b: TensorND): T                                     = js.native
  def mulStrict[T <: TensorND](a: T, b: T): T                                         = js.native
  def div[T <: TensorND](a: TensorND, b: TensorND): T                                     = js.native
  def floorDiv[T <: TensorND](a: TensorND, b: TensorND): T                                = js.native
  def divStrict[T <: TensorND](a: T, b: T): T                                         = js.native
  def mod[T <: TensorND](a: TensorND, b: TensorND): T                                     = js.native
  def modStrict[T <: TensorND](a: T, b: T): T                                         = js.native
  def minimum[T <: TensorND](a: TensorND, b: TensorND): T                                 = js.native
  def minimumStrict[T <: TensorND](a: T, b: T): T                                     = js.native
  def maximum[T <: TensorND](a: TensorND, b: TensorND): T                                 = js.native
  def maximumStrict[T <: TensorND](a: T, b: T): T                                     = js.native
  def squaredDifference[T <: TensorND](a: TensorND, b: TensorND): T                       = js.native
  def squaredDifferenceStrict[T <: TensorND](a: T, b: T): T                           = js.native
  def transpose[T <: TensorND](x: T, perm: js.Array[Double] = ???): T                 = js.native
  def logicalNot[T <: TensorND](x: T): T                                              = js.native
  def logicalAnd[T <: TensorND](a: TensorND, b: TensorND): T                              = js.native
  def logicalOr[T <: TensorND](a: TensorND, b: TensorND): T                               = js.native
  def logicalXor[T <: TensorND](a: TensorND, b: TensorND): T                              = js.native
  def where[T <: TensorND](condition: TensorND, a: T, b: T): T                          = js.native
  def notEqual[T <: TensorND](a: TensorND, b: TensorND): T                                = js.native
  def notEqualStrict[T <: TensorND](a: T, b: T): T                                    = js.native
  def less[T <: TensorND](a: TensorND, b: TensorND): T                                    = js.native
  def lessStrict[T <: TensorND](a: T, b: T): T                                        = js.native
  def equal[T <: TensorND](a: TensorND, b: TensorND): T                                   = js.native
  def equalStrict[T <: TensorND](a: T, b: T): T                                       = js.native
  def lessEqual[T <: TensorND](a: TensorND, b: TensorND): T                               = js.native
  def lessEqualStrict[T <: TensorND](a: T, b: T): T                                   = js.native
  def greater[T <: TensorND](a: TensorND, b: TensorND): T                                 = js.native
  def greaterStrict[T <: TensorND](a: T, b: T): T                                     = js.native
  def greaterEqual[T <: TensorND](a: TensorND, b: TensorND): T                            = js.native
  def greaterEqualStrict[T <: TensorND](a: T, b: T): T                                = js.native
  def neg[T <: TensorND](x: T): T                                                     = js.native
  def ceil[T <: TensorND](x: T): T                                                    = js.native
  def floor[T <: TensorND](x: T): T                                                   = js.native
  def sign[T <: TensorND](x: T): T                                                    = js.native
  def round[T <: TensorND](x: T): T                                                   = js.native
  def exp[T <: TensorND](x: T): T                                                     = js.native
  def expm1[T <: TensorND](x: T): T                                                   = js.native
  def log[T <: TensorND](x: T): T                                                     = js.native
  def log1p[T <: TensorND](x: T): T                                                   = js.native
  def sqrt[T <: TensorND](x: T): T                                                    = js.native
  def rsqrt[T <: TensorND](x: T): T                                                   = js.native
  def square[T <: TensorND](x: T): T                                                  = js.native
  def reciprocal[T <: TensorND](x: T): T                                              = js.native
  def abs[T <: TensorND](x: T): T                                                     = js.native
  def clipByValue[T <: TensorND](x: T, clipValueMin: Double, clipValueMax: Double): T = js.native
  def sigmoid[T <: TensorND](x: T): T                                                 = js.native
  def logSigmoid[T <: TensorND](x: T): T                                              = js.native
  def softplus[T <: TensorND](x: T): T                                                = js.native
  def sin[T <: TensorND](x: T): T                                                     = js.native
  def cos[T <: TensorND](x: T): T                                                     = js.native
  def tan[T <: TensorND](x: T): T                                                     = js.native
  def asin[T <: TensorND](x: T): T                                                    = js.native
  def acos[T <: TensorND](x: T): T                                                    = js.native
  def atan[T <: TensorND](x: T): T                                                    = js.native
  def sinh[T <: TensorND](x: T): T                                                    = js.native
  def cosh[T <: TensorND](x: T): T                                                    = js.native
  def tanh[T <: TensorND](x: T): T                                                    = js.native
  def asinh[T <: TensorND](x: T): T                                                   = js.native
  def acosh[T <: TensorND](x: T): T                                                   = js.native
  def atanh[T <: TensorND](x: T): T                                                   = js.native
  def erf[T <: TensorND](x: T): T                                                     = js.native
  def step[T <: TensorND](x: T, alpha: Double): T                                     = js.native
  def relu[T <: TensorND](x: T): T                                                    = js.native
  def elu[T <: TensorND](x: T): T                                                     = js.native
  def selu[T <: TensorND](x: T): T                                                    = js.native
  def leakyRelu[T <: TensorND](x: T, alpha: Double): T                                = js.native
  def prelu[T <: TensorND](x: T, alpha: T): T                                         = js.native
  def softmax[T <: TensorND](logits: T, dim: Double): T                               = js.native
  var image: OpHandler.Image                                                        = js.native
  def conv1d[T <: Tensor2D | Tensor3D](
    x: T,
    filter: Tensor3D,
    stride: Double,
    pad: String | Double,
    dataFormat: String,
    dilation: Double,
    dimRoundingMode: String = ???
  ): T = js.native
  def conv2d[T <: Tensor3D | Tensor4D](
    x: T,
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double] | Double,
    pad: String | Double,
    dataFormat: String,
    dilations: js.Tuple2[Double, Double] | Double,
    dimRoundingMode: String = ???
  ): T = js.native
  def conv2dTranspose[T <: Tensor3D | Tensor4D](
    x: T,
    filter: Tensor4D,
    outputShape: js.Tuple4[Double, Double, Double, Double] | js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double] | Double,
    pad: String | Double,
    dimRoundingMode: String = ???
  ): T = js.native
  def depthwiseConv2d[T <: Tensor3D | Tensor4D](
    x: T,
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double] | Double,
    pad: String | Double,
    dataFormat: String,
    dilations: js.Tuple2[Double, Double] | Double,
    dimRoundingMode: String = ???
  ): T = js.native
  def maxPool[T <: Tensor3D | Tensor4D](
    x: T,
    filterSize: js.Tuple2[Double, Double] | Double,
    strides: js.Tuple2[Double, Double] | Double,
    pad: String | Double,
    dimRoundingMode: String = ???
  ): T = js.native
  def avgPool[T <: Tensor3D | Tensor4D](
    x: T,
    filterSize: js.Tuple2[Double, Double] | Double,
    strides: js.Tuple2[Double, Double] | Double,
    pad: String | Double,
    dimRoundingMode: String = ???
  ): T = js.native
  def localResponseNormalization[T <: Tensor3D | Tensor4D](
    x: T,
    depthRadius: Double,
    bias: Double,
    alpha: Double,
    beta: Double
  ): T = js.native
  def unsortedSegmentSum[T <: TensorND](x: T, segmentIds: Tensor1D, numSegments: Double): T =
    js.native
  def batchToSpaceND[T <: TensorND](
    x: T,
    blockShape: js.Array[Double],
    crops: js.Array[js.Array[Double]]
  ): T = js.native
  def spaceToBatchND[T <: TensorND](
    x: T,
    blockShape: js.Array[Double],
    paddings: js.Array[js.Array[Double]]
  ): T = js.native
}

object OpHandler {

  @js.native
  trait Image extends js.Object {
    def resizeBilinear[T <: Tensor3D | Tensor4D](
      images: T,
      size: js.Tuple2[Double, Double],
      alignCorners: Boolean
    ): T = js.native
    def resizeNearestNeighbor[T <: Tensor3D | Tensor4D](
      images: T,
      size: js.Tuple2[Double, Double],
      alignCorners: Boolean
    ): T = js.native
  }
}

@js.native
@JSGlobal
class Tensor[+R <: Rank] protected () extends js.Object {
  def this(shape: R#Shape, dtype: DataType, values: TypedArray = ???, dataId: DataId = ???) = this()
  def id: Double                                                                   = js.native
  var dataId: DataId                                                               = js.native
  def shape: R#Shape                                                               = js.native
  def size: Double                                                                 = js.native
  def dtype: DataType                                                              = js.native
  def rankType: R                                                                  = js.native
  def strides: js.Array[Double]                                                    = js.native
  def flatten(): Tensor1D                                                          = js.native
  def asScalar(): Scalar                                                           = js.native
  def as1D(): Tensor1D                                                             = js.native
  def as2D(rows: Double, columns: Double): Tensor2D                                = js.native
  def as3D(rows: Double, columns: Double, depth: Double): Tensor3D                 = js.native
  def as4D(rows: Double, columns: Double, depth: Double, depth2: Double): Tensor4D = js.native
  def asType[T <: this.type](dtype: DataType): T                                   = js.native
  def rank: Double                                                                 = js.native
  def get(locs: Double*): Double                                                   = js.native
  def buffer[RR >: R <: Rank](): TensorBuffer[RR]                                  = js.native
  def data(): Promise[TypedArray]                                                  = js.native
  def dataSync(): TypedArray                                                       = js.native
  def dispose(): Unit                                                              = js.native
  def isDisposed: Boolean                                                          = js.native
  def toFloat[T <: this.type](): T                                                 = js.native
  def toInt(): this.type                                                           = js.native
  def toBool(): this.type                                                          = js.native
  def print(verbose: Boolean = ???): Unit                                          = js.native
  def reshape[R2 <: Rank](newShape: R2#Shape): Tensor[R2]                          = js.native
  def reshapeAs[T <: TensorND](x: T): T                                            = js.native
  def expandDims[R2 <: Rank](axis: Double = ???): Tensor[R2]                       = js.native
  def cumsum[T <: TensorND](
      axis: Double = ???,
      exclusive: Boolean = ???,
      reverse: Boolean = ???
  ): T                                                                            = js.native
  def squeeze[T <: TensorND](axis: js.Array[Double] = ???): T                     = js.native
  def clone[T <: TensorND](`this`: T): T                                          = js.native
  def toString(verbose: Boolean = ???): String                                    = js.native
  def tile[T <: this.type](`this`: T, reps: js.Array[Double]): T                  = js.native
  def gather[T <: this.type](`this`: T, indices: Tensor1D, axis: Double = ???): T = js.native
  def matMul(b: Tensor2D, transposeA: Boolean = ???, transposeB: Boolean = ???): Tensor2D =
    js.native
  def dot(b: TensorND): TensorND = js.native
  def norm(
      ord: Double | String = ???,
      axis: Double | js.Array[Double] = ???,
      keepDims: Boolean = ???
  ): TensorND = js.native
  def slice[RR >: R <: Rank, T <: Tensor[RR]](
      `this`: T,
      begin: Double | js.Array[Double],
      size: Double | js.Array[Double] = ???
  ): T                                                                            = js.native
  def reverse[T <: TensorND](`this`: T, axis: Double | js.Array[Double] = ???): T = js.native
  def concat[T <: TensorND](`this`: T, x: T, axis: Double = ???): T               = js.native
  def stack(x: TensorND, axis: Double = ???): TensorND                            = js.native
  def unstack(x: TensorND, axis: Double = ???): js.Array[TensorND]                = js.native
  def pad[T <: TensorND](
      `this`: T,
      paddings: js.Array[js.Tuple2[Double, Double]],
      constantValue: Double = ???
  ): T = js.native
  def batchNormalization[RR >: R <: Rank](
      mean: Tensor[RR] | Tensor1D,
      variance: Tensor[RR] | Tensor1D,
      varianceEpsilon: Double = ???,
      scale: Tensor[RR] | Tensor1D = ???,
      offset: Tensor[RR] | Tensor1D = ???
  ): Tensor[RR] = js.native
  def all[T <: TensorND](axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T =
    js.native
  def any[T <: TensorND](axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T =
    js.native
  def logSumExp[T <: TensorND](axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T =
    js.native
  def sum[T <: TensorND](axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T =
    js.native
  def mean[T <: TensorND](axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T =
    js.native
  def min[T <: TensorND](axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T =
    js.native
  def max[T <: TensorND](axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T =
    js.native
  def argMin[T <: TensorND](axis: Double = ???): T                         = js.native
  def argMax[T <: TensorND](axis: Double = ???): T                         = js.native
  def cast[T <: this.type](dtype: DataType): T                             = js.native
  def add[T <: TensorND](x: TensorND): T                                   = js.native
  def addStrict[T <: this.type](`this`: T, x: T): T                        = js.native
  def sub[T <: TensorND](x: TensorND): T                                   = js.native
  def subStrict[T <: this.type](`this`: T, x: T): T                        = js.native
  def pow[T <: TensorND](`this`: T, exp: TensorND): T                      = js.native
  def powStrict(exp: TensorND): Tensor[R]                                  = js.native
  def mul[T <: TensorND](x: TensorND): T                                   = js.native
  def mulStrict[T <: this.type](`this`: T, x: T): T                        = js.native
  def div[T <: TensorND](x: TensorND): T                                   = js.native
  def floorDiv[T <: TensorND](x: TensorND): T                              = js.native
  def divStrict[T <: this.type](`this`: T, x: T): T                        = js.native
  def minimum[T <: TensorND](x: TensorND): T                               = js.native
  def minimumStrict[T <: this.type](`this`: T, x: T): T                    = js.native
  def maximum[T <: TensorND](x: TensorND): T                               = js.native
  def maximumStrict[T <: this.type](`this`: T, x: T): T                    = js.native
  def mod[T <: TensorND](x: TensorND): T                                   = js.native
  def modStrict[T <: this.type](`this`: T, x: T): T                        = js.native
  def squaredDifference[T <: TensorND](x: TensorND): T                     = js.native
  def squaredDifferenceStrict[T <: this.type](`this`: T, x: T): T          = js.native
  def transpose[T <: TensorND](`this`: T, perm: js.Array[Double] = ???): T = js.native
  def notEqual[T <: TensorND](x: TensorND): T                              = js.native
  def notEqualStrict[T <: this.type](`this`: T, x: T): T                   = js.native
  def less[T <: TensorND](x: TensorND): T                                  = js.native
  def lessStrict[T <: this.type](`this`: T, x: T): T                       = js.native
  def equal[T <: TensorND](x: TensorND): T                                 = js.native
  def equalStrict[T <: this.type](`this`: T, x: T): T                      = js.native
  def lessEqual[T <: TensorND](x: TensorND): T                             = js.native
  def lessEqualStrict[T <: this.type](`this`: T, x: T): T                  = js.native
  def greater[T <: TensorND](x: TensorND): T                               = js.native
  def greaterStrict[T <: this.type](`this`: T, x: T): T                    = js.native
  def greaterEqual[T <: TensorND](x: TensorND): T                          = js.native
  def greaterEqualStrict[T <: this.type](`this`: T, x: T): T               = js.native
  def logicalAnd(x: TensorND): TensorND                                    = js.native
  def logicalOr(x: TensorND): TensorND                                     = js.native
  def logicalNot[T <: TensorND](`this`: T): T                              = js.native
  def logicalXor(x: TensorND): TensorND                                    = js.native
  def where(condition: TensorND, x: TensorND): TensorND                    = js.native
  def neg[T <: TensorND](`this`: T): T                                     = js.native
  def ceil[T <: TensorND](`this`: T): T                                    = js.native
  def floor[T <: TensorND](`this`: T): T                                   = js.native
  def sign[T <: TensorND](`this`: T): T                                    = js.native
  def exp[T <: TensorND](`this`: T): T                                     = js.native
  def expm1[T <: TensorND](`this`: T): T                                   = js.native
  def log[T <: TensorND](`this`: T): T                                     = js.native
  def log1p[T <: TensorND](`this`: T): T                                   = js.native
  def sqrt[T <: TensorND](`this`: T): T                                    = js.native
  def rsqrt[T <: TensorND](`this`: T): T                                   = js.native
  def square[T <: TensorND](`this`: T): T                                  = js.native
  def reciprocal[T <: TensorND](`this`: T): T                              = js.native
  def abs[T <: TensorND](`this`: T): T                                     = js.native
  def clipByValue(min: Double, max: Double): Tensor[R]                     = js.native
  def relu[T <: TensorND](`this`: T): T                                    = js.native
  def elu[T <: TensorND](`this`: T): T                                     = js.native
  def selu[T <: TensorND](`this`: T): T                                    = js.native
  def leakyRelu(alpha: Double = ???): Tensor[R]                            = js.native
  def prelu[RR >: R <: Rank](alpha: Tensor[RR]): Tensor[RR]                = js.native
  def sigmoid[T <: TensorND](`this`: T): T                                 = js.native
  def logSigmoid[T <: TensorND](`this`: T): T                              = js.native
  def softplus[T <: TensorND](`this`: T): T                                = js.native
  def sin[T <: TensorND](`this`: T): T                                     = js.native
  def cos[T <: TensorND](`this`: T): T                                     = js.native
  def tan[T <: TensorND](`this`: T): T                                     = js.native
  def asin[T <: TensorND](`this`: T): T                                    = js.native
  def acos[T <: TensorND](`this`: T): T                                    = js.native
  def atan[T <: TensorND](`this`: T): T                                    = js.native
  def sinh[T <: TensorND](`this`: T): T                                    = js.native
  def cosh[T <: TensorND](`this`: T): T                                    = js.native
  def tanh[T <: TensorND](`this`: T): T                                    = js.native
  def asinh[T <: TensorND](`this`: T): T                                   = js.native
  def acosh[T <: TensorND](`this`: T): T                                   = js.native
  def atanh[T <: TensorND](`this`: T): T                                   = js.native
  def erf[T <: TensorND](`this`: T): T                                     = js.native
  def round[T <: TensorND](`this`: T): T                                   = js.native
  def step[T <: TensorND](`this`: T, alpha: Double = ???): T               = js.native
  def softmax[T <: this.type](`this`: T, dim: Double = ???): T             = js.native
  def resizeBilinear[T <: Tensor3D | Tensor4D](
      `this`: T,
      newShape2D: js.Tuple2[Double, Double],
      alignCorners: Boolean = ???
  ): T = js.native
  def resizeNearestNeighbor[T <: Tensor3D | Tensor4D](
      `this`: T,
      newShape2D: js.Tuple2[Double, Double],
      alignCorners: Boolean = ???
  ): T = js.native
  def conv1d[T <: Tensor2D | Tensor3D](
      `this`: T,
      filter: Tensor3D,
      stride: Double,
      pad: String | Double,
      dataFormat: String = ???,
      dilation: Double = ???,
      dimRoundingMode: String = ???
  ): T = js.native
  def conv2d[T <: Tensor3D | Tensor4D](
      `this`: T,
      filter: Tensor4D,
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dataFormat: String = ???,
      dilations: js.Tuple2[Double, Double] | Double = ???,
      dimRoundingMode: String = ???
  ): T = js.native
  def conv2dTranspose[T <: Tensor3D | Tensor4D](
      `this`: T,
      filter: Tensor4D,
      outputShape: js.Tuple4[Double, Double, Double, Double] | js.Tuple3[Double, Double, Double],
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dimRoundingMode: String = ???
  ): T = js.native
  def depthwiseConv2D[T <: Tensor3D | Tensor4D](
      `this`: T,
      filter: Tensor4D,
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dataFormat: String = ???,
      dilations: js.Tuple2[Double, Double] | Double = ???,
      dimRoundingMode: String = ???
  ): T = js.native
  def avgPool[T <: Tensor3D | Tensor4D](
      `this`: T,
      filterSize: js.Tuple2[Double, Double] | Double,
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dimRoundingMode: String = ???
  ): T = js.native
  def maxPool[T <: Tensor3D | Tensor4D](
      `this`: T,
      filterSize: js.Tuple2[Double, Double] | Double,
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dimRoundingMode: String = ???
  ): T = js.native
  def localResponseNormalization[T <: Tensor3D | Tensor4D](
      `this`: T,
      radius: Double = ???,
      bias: Double = ???,
      alpha: Double = ???,
      beta: Double = ???
  ): T = js.native
  def variable[RR >: R <: Rank](
      trainable: Boolean = ???,
      name: String = ???,
      dtype: DataType = ???
  ): Variable[RR] =
    js.native
  def unsortedSegmentSum[T <: TensorND](
      `this`: T,
      segmentIds: Tensor1D,
      numSegments: Double,
      axis: Double = ???
  ): T = js.native
  def batchToSpaceND[T <: TensorND](
    `this`: T,
    blockShape: js.Array[Double],
    crops: js.Array[js.Array[Double]]
  ): T = js.native
  def spaceToBatchND[T <: TensorND](
    `this`: T,
    blockShape: js.Array[Double],
    paddings: js.Array[js.Array[Double]]
  ): T = js.native
}

@js.native
trait TensorCompanion extends js.Object {
  def make[T <: Tensor[R], D <: DataType, R <: Rank](
      shape: R#Shape,
      data: TensorData,
      dtype: D = ???
  ): T = js.native
}

@js.native
@JSGlobal
class Variable[R <: Rank] extends Tensor[R] {
  var trainable: Boolean                = js.native
  var name: String                      = js.native
  def assign(newValue: Tensor[R]): Unit = js.native
}

@js.native
trait VariableCompanion extends js.Object {
  def variable[R <: Rank](
      initialValue: Tensor[R],
      trainable: Boolean = ???,
      name: String = ???,
      dtype: DataType = ???
  ): Variable[R] = js.native
}

@js.native
trait TensorModule extends js.Object {
  def setTensorTracker(fn: js.Function0[TensorTracker]): Unit = js.native
  def setOpHandler(handler: OpHandler): Unit                  = js.native
  type DataId     = js.Object
  type Scalar     = Tensor[Rank.R0]
  type Tensor1D   = Tensor[Rank.R1]
  type Tensor2D   = Tensor[Rank.R2]
  type Tensor3D   = Tensor[Rank.R3]
  type Tensor4D   = Tensor[Rank.R4]
  type Tensor5D   = Tensor[Rank.R5]
  type Tensor6D   = Tensor[Rank.R6]
  type TensorND   = Tensor[Rank]
  type VariableND = Variable[Rank]
  //val variable: Variable.variable.type = js.native
}

@js.native
@JSGlobal
object TensorModule extends TensorModule

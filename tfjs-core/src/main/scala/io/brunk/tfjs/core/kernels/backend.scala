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

package io.brunk.tfjs.core.kernels

import io.brunk.tfjs.core.{DataType, Rank, Tensor}

import scala.scalajs.js
import js.annotation._
import js.{Promise, |}
import org.scalajs.dom.{ImageData, html}
import io.brunk.tfjs.core.TensorModule._
import io.brunk.tfjs.core.Types.TypedArray
import io.brunk.tfjs.core.ops.Conv_util.Conv2DInfo
@js.native
trait BackendTimingInfo extends js.Object {
  var kernelMs: Double
}

@js.native
trait TensorStorage extends js.Object {
  def read(dataId: DataId): Promise[TypedArray]
  def readSync(dataId: DataId): TypedArray
  def disposeData(dataId: DataId): Unit
  def write(dataId: DataId, values: TypedArray): Unit
  def fromPixels(
      pixels: ImageData | html.Image | html.Canvas | html.Video,
      numChannels: Double
  ): Tensor3D
  def register(dataId: DataId, shape: js.Array[Double], dtype: DataType): Unit
  def memory(): js.Any
}

@js.native
trait BackendTimer extends js.Object {
  def time(f: js.Function0[Unit]): Promise[BackendTimingInfo]
}

@js.native
trait KernelBackend extends TensorStorage with BackendTimer {
  def matMul(a: Tensor2D, b: Tensor2D, transposeA: Boolean, transposeB: Boolean): Tensor2D
  def slice[T <: TensorND](x: T, begin: js.Array[Double], size: js.Array[Double]): T
  def stridedSlice[T <: TensorND](
      x: T,
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double
  ): T
  def reverse[T <: TensorND](a: T, axis: js.Array[Double]): T
  def concat(a: Tensor2D, b: Tensor2D): Tensor2D
  def neg[T <: TensorND](a: T): T
  def add(a: TensorND, b: TensorND): TensorND
  def subtract(a: TensorND, b: TensorND): TensorND
  def multiply(a: TensorND, b: TensorND): TensorND
  def divide(a: TensorND, b: TensorND): TensorND
  def sum(x: TensorND, axes: js.Array[Double]): TensorND
  def argMin(x: TensorND, axis: Double): TensorND
  def argMax(x: TensorND, axis: Double): TensorND
  def equal(a: TensorND, b: TensorND): TensorND
  def notEqual(a: TensorND, b: TensorND): TensorND
  def less(a: TensorND, b: TensorND): TensorND
  def lessEqual(a: TensorND, b: TensorND): TensorND
  def greater(a: TensorND, b: TensorND): TensorND
  def greaterEqual(a: TensorND, b: TensorND): TensorND
  def logicalNot[T <: TensorND](a: T): T
  def logicalAnd(a: TensorND, b: TensorND): TensorND
  def logicalOr(a: TensorND, b: TensorND): TensorND
  def where(condition: TensorND, a: TensorND, b: TensorND, dtype: DataType): TensorND
  def topKValues[T <: TensorND](x: T, k: Double): Tensor1D
  def topKIndices(x: TensorND, k: Double): Tensor1D
  def min(x: TensorND, axes: js.Array[Double]): TensorND
  def minimum(a: TensorND, b: TensorND): TensorND
  def mod(a: TensorND, b: TensorND): TensorND
  def max(x: TensorND, axes: js.Array[Double]): TensorND
  def maximum(a: TensorND, b: TensorND): TensorND
  def squaredDifference(a: TensorND, b: TensorND): TensorND
  def ceil[T <: TensorND](x: T): T
  def floor[T <: TensorND](x: T): T
  def round[T <: TensorND](x: T): T
  def sign[T <: TensorND](x: T): T
  def pow[T <: TensorND](a: T, b: TensorND): T
  def exp[T <: TensorND](x: T): T
  def expm1[T <: TensorND](x: T): T
  def log[T <: TensorND](x: T): T
  def log1p[T <: TensorND](x: T): T
  def sqrt[T <: TensorND](x: T): T
  def rsqrt[T <: TensorND](x: T): T
  def square[T <: TensorND](x: T): T
  def reciprocal[T <: TensorND](x: T): T
  def relu[T <: TensorND](x: T): T
  def elu[T <: TensorND](x: T): T
  def eluDer[T <: TensorND](dy: T, y: T): T
  def selu[T <: TensorND](x: T): T
  def int[T <: TensorND](x: T): T
  def clip[T <: TensorND](x: T, min: Double, max: Double): T
  def abs[T <: TensorND](x: T): T
  def sigmoid[T <: TensorND](x: T): T
  def softplus[T <: TensorND](x: T): T
  def sin[T <: TensorND](x: T): T
  def cos[T <: TensorND](x: T): T
  def tan[T <: TensorND](x: T): T
  def asin[T <: TensorND](x: T): T
  def acos[T <: TensorND](x: T): T
  def atan[T <: TensorND](x: T): T
  def atan2[T <: TensorND](a: T, b: T): T
  def sinh[T <: TensorND](x: T): T
  def cosh[T <: TensorND](x: T): T
  def tanh[T <: TensorND](x: T): T
  def asinh[T <: TensorND](x: T): T
  def acosh[T <: TensorND](x: T): T
  def atanh[T <: TensorND](x: T): T
  def erf[T <: TensorND](x: T): T
  def step[T <: TensorND](x: T, alpha: Double): T
  def conv2d(x: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D
  def conv2dDerInput(dy: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D
  def conv2dDerFilter(x: Tensor4D, dY: Tensor4D, convInfo: Conv2DInfo): Tensor4D
  def depthwiseConv2D(input: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D
  def maxPool(x: Tensor4D, convInfo: Conv2DInfo): Tensor4D
  def maxPoolBackprop(dy: Tensor4D, x: Tensor4D, y: Tensor4D, convInfo: Conv2DInfo): Tensor4D
  def avgPool(x: Tensor4D, convInfo: Conv2DInfo): Tensor4D
  def avgPoolBackprop(dy: Tensor4D, x: Tensor4D, convInfo: Conv2DInfo): Tensor4D
  def reshape[T <: TensorND, R <: Rank](x: T, shape: R#Shape): Tensor[R]
  def cast[T <: TensorND](x: T, dtype: DataType): T
  def tile[T <: TensorND](x: T, reps: js.Array[Double]): T
  def pad[T <: TensorND](
      x: T,
      paddings: js.Array[js.Tuple2[Double, Double]],
      constantValue: Double
  ): T
  def transpose[T <: TensorND](x: T, perm: js.Array[Double]): T
  def gather[T <: TensorND](x: T, indices: Tensor1D, axis: Double): T
  def resizeBilinear(
      x: Tensor4D,
      newHeight: Double,
      newWidth: Double,
      alignCorners: Boolean
  ): Tensor4D
  def resizeBilinearBackprop(dy: Tensor4D, x: Tensor4D, alignCorners: Boolean): Tensor4D
  def resizeNearestNeighbor(
      x: Tensor4D,
      newHEight: Double,
      newWidth: Double,
      alignCorners: Boolean
  ): Tensor4D
  def batchNormalization(
      x: Tensor4D,
      mean: Tensor4D | Tensor1D,
      variance: Tensor4D | Tensor1D,
      varianceEpsilon: Double,
      scale: Tensor4D | Tensor1D = ???,
      offset: Tensor4D | Tensor1D = ???
  ): Tensor4D
  def localResponseNormalization4D(
      x: Tensor4D,
      radius: Double,
      bias: Double,
      alpha: Double,
      beta: Double
  ): Tensor4D
  def multinomial(
      logits: Tensor2D,
      normalized: Boolean,
      numSamples: Double,
      seed: Double
  ): Tensor2D
  def oneHot(indices: Tensor1D, depth: Double, onValue: Double, offValue: Double): Tensor2D
  def cumsum(x: TensorND, axis: Double, exclusive: Boolean, reverse: Boolean): TensorND
  def dispose(): Unit
}

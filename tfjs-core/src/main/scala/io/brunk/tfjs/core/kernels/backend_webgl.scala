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

import io.brunk.tfjs.core.{DataType, Rank, Tensor, TimingInfo}
import io.brunk.tfjs.core.TensorModule._
import io.brunk.tfjs.core.Types.TypedArray
import io.brunk.tfjs.core.kernels.webgl.{GPGPUContext, TextureData, TextureManager}
import io.brunk.tfjs.core.ops.Conv_util.Conv2DInfo
import org.scalajs.dom
import org.scalajs.dom.html
import org.scalajs.dom.webgl.Texture

import scala.scalajs.js
import js.annotation._
import js.{Promise, |}

@js.native
trait CPUTimerQuery extends js.Object {
  var startMs: Double = js.native
  var endMs: Double   = js.native
}

@js.native
trait WebGLTimingInfo extends TimingInfo {
  var uploadWaitMs: Double   = js.native
  var downloadWaitMs: Double = js.native
}

@js.native
@JSGlobal
class MathBackendWebGL protected () extends KernelBackend {
  def this(gpgpu: GPGPUContext = ???, delayedStorage: Boolean = ???) = this()
  def register(dataId: DataId, shape: js.Array[Double], dtype: DataType): Unit = js.native
  def fromPixels(
    pixels: dom.ImageData | html.Image | html.Canvas | html.Video,
      numChannels: Double
  ): Tensor3D                                                                      = js.native
  def write(dataId: DataId, values: TypedArray): Unit                              = js.native
  def readSync(dataId: DataId): TypedArray                                         = js.native
  def read(dataId: DataId): Promise[TypedArray]                                    = js.native
  def time(f: js.Function0[Unit]): Promise[WebGLTimingInfo]                        = js.native
  def memory(): js.Any                                                             = js.native
  def disposeData(dataId: DataId): Unit                                            = js.native
  def getTexture(dataId: DataId): Texture                                     = js.native
  def getTextureData(dataId: DataId): TextureData                                  = js.native
  def getGPGPUContext(): GPGPUContext                                              = js.native
  def getCanvas(): html.Canvas                                               = js.native
  def slice[T <: TensorND](x: T, begin: js.Array[Double], size: js.Array[Double]): T = js.native
  def stridedSlice[T <: TensorND](
      x: T,
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double
  ): T                                                      = js.native
  def reverse[T <: TensorND](x: T, axis: js.Array[Double]): T = js.native
  def concat(a: Tensor2D, b: Tensor2D): Tensor2D            = js.native
  def neg[T <: TensorND](x: T): T                             = js.native
  def matMul(a: Tensor2D, b: Tensor2D, transposeA: Boolean, transposeB: Boolean): Tensor2D =
    js.native
  def multiply(a: TensorND, b: TensorND): TensorND = js.native
  def batchNormalization(
      x: Tensor4D,
      mean: Tensor4D | Tensor1D,
      variance: Tensor4D | Tensor1D,
      varianceEpsilon: Double,
      scale: Tensor4D | Tensor1D = ???,
      offset: Tensor4D | Tensor1D = ???
  ): Tensor4D = js.native
  def localResponseNormalization4D(
      x: Tensor4D,
      radius: Double,
      bias: Double,
      alpha: Double,
      beta: Double
  ): Tensor4D                                            = js.native
  def tile[T <: TensorND](x: T, reps: js.Array[Double]): T = js.native
  def pad[T <: TensorND](
      x: T,
      paddings: js.Array[js.Tuple2[Double, Double]],
      constantValue: Double
  ): T                                                                               = js.native
  def transpose[T <: TensorND](x: T, perm: js.Array[Double]): T                        = js.native
  def gather[T <: TensorND](x: T, indices: Tensor1D, axis: Double): T                  = js.native
  def sum(x: TensorND, axes: js.Array[Double]): TensorND                                 = js.native
  def argMin(x: TensorND, axis: Double): TensorND                                        = js.native
  def argMax(x: TensorND, axis: Double): TensorND                                        = js.native
  def cumsum(x: TensorND, axis: Double, exclusive: Boolean, reverse: Boolean): TensorND  = js.native
  def equal(a: TensorND, b: TensorND): TensorND                                            = js.native
  def notEqual(a: TensorND, b: TensorND): TensorND                                         = js.native
  def less(a: TensorND, b: TensorND): TensorND                                             = js.native
  def lessEqual(a: TensorND, b: TensorND): TensorND                                        = js.native
  def greater(a: TensorND, b: TensorND): TensorND                                          = js.native
  def greaterEqual(a: TensorND, b: TensorND): TensorND                                     = js.native
  def logicalNot[T <: TensorND](x: T): T                                               = js.native
  def logicalAnd(a: TensorND, b: TensorND): TensorND                                       = js.native
  def logicalOr(a: TensorND, b: TensorND): TensorND                                        = js.native
  def where(condition: TensorND, a: TensorND, b: TensorND, dtype: DataType): TensorND        = js.native
  def topKValues[T <: TensorND](x: T, k: Double): Tensor1D                             = js.native
  def topKIndices(x: TensorND, k: Double): Tensor1D                                    = js.native
  def min(x: TensorND, axes: js.Array[Double]): TensorND                                 = js.native
  def minimum(a: TensorND, b: TensorND): TensorND                                          = js.native
  def mod(a: TensorND, b: TensorND): TensorND                                              = js.native
  def max(x: TensorND, axes: js.Array[Double]): TensorND                                 = js.native
  def maximum(a: TensorND, b: TensorND): TensorND                                          = js.native
  def squaredDifference(a: TensorND, b: TensorND): TensorND                                = js.native
  def divide(a: TensorND, b: TensorND): TensorND                                           = js.native
  def add(a: TensorND, b: TensorND): TensorND                                              = js.native
  def subtract(a: TensorND, b: TensorND): TensorND                                         = js.native
  def pow[T <: TensorND](a: T, b: TensorND): T                                           = js.native
  def ceil[T <: TensorND](x: T): T                                                     = js.native
  def floor[T <: TensorND](x: T): T                                                    = js.native
  def sign[T <: TensorND](x: T): T                                                     = js.native
  def round[T <: TensorND](x: T): T                                                    = js.native
  def exp[T <: TensorND](x: T): T                                                      = js.native
  def expm1[T <: TensorND](x: T): T                                                    = js.native
  def log[T <: TensorND](x: T): T                                                      = js.native
  def log1p[T <: TensorND](x: T): T                                                    = js.native
  def sqrt[T <: TensorND](x: T): T                                                     = js.native
  def rsqrt[T <: TensorND](x: T): T                                                    = js.native
  def square[T <: TensorND](x: T): T                                                   = js.native
  def reciprocal[T <: TensorND](x: T): T                                               = js.native
  def relu[T <: TensorND](x: T): T                                                     = js.native
  def elu[T <: TensorND](x: T): T                                                      = js.native
  def eluDer[T <: TensorND](dy: T, y: T): T                                            = js.native
  def selu[T <: TensorND](x: T): T                                                     = js.native
  def int[T <: TensorND](x: T): T                                                      = js.native
  def clip[T <: TensorND](x: T, min: Double, max: Double): T                           = js.native
  def abs[T <: TensorND](x: T): T                                                      = js.native
  def sigmoid[T <: TensorND](x: T): T                                                  = js.native
  def softplus[T <: TensorND](x: T): T                                                 = js.native
  def sin[T <: TensorND](x: T): T                                                      = js.native
  def cos[T <: TensorND](x: T): T                                                      = js.native
  def tan[T <: TensorND](x: T): T                                                      = js.native
  def asin[T <: TensorND](x: T): T                                                     = js.native
  def acos[T <: TensorND](x: T): T                                                     = js.native
  def atan[T <: TensorND](x: T): T                                                     = js.native
  def atan2[T <: TensorND](a: T, b: T): T                                              = js.native
  def sinh[T <: TensorND](x: T): T                                                     = js.native
  def cosh[T <: TensorND](x: T): T                                                     = js.native
  def tanh[T <: TensorND](x: T): T                                                     = js.native
  def asinh[T <: TensorND](x: T): T                                                    = js.native
  def acosh[T <: TensorND](x: T): T                                                    = js.native
  def atanh[T <: TensorND](x: T): T                                                    = js.native
  def erf[T <: TensorND](x: T): T                                                      = js.native
  def step[T <: TensorND](x: T, alpha: Double): T                                      = js.native
  def conv2d(x: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D          = js.native
  def conv2dDerInput(dy: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  def conv2dDerFilter(x: Tensor4D, dy: Tensor4D, convInfo: Conv2DInfo): Tensor4D     = js.native
  def depthwiseConv2D(x: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  def maxPool(x: Tensor4D, convInfo: Conv2DInfo): Tensor4D                           = js.native
  def avgPool(x: Tensor4D, convInfo: Conv2DInfo): Tensor4D                           = js.native
  def maxPoolBackprop(dy: Tensor4D, x: Tensor4D, y: Tensor4D, convInfo: Conv2DInfo): Tensor4D =
    js.native
  def avgPoolBackprop(dy: Tensor4D, x: Tensor4D, convInfo: Conv2DInfo): Tensor4D        = js.native
  def cast[T <: TensorND](x: T, dtype: DataType): T                           = js.native
  def reshape[T <: Tensor[R], R <: Rank](x: T, shape: js.Any): Tensor[R] = js.native
  def resizeBilinear(
      x: Tensor4D,
      newHeight: Double,
      newWidth: Double,
      alignCorners: Boolean
  ): Tensor4D                                                                            = js.native
  def resizeBilinearBackprop(dy: Tensor4D, x: Tensor4D, alignCorners: Boolean): Tensor4D = js.native
  def resizeNearestNeighbor(
      x: Tensor4D,
      newHeight: Double,
      newWidth: Double,
      alignCorners: Boolean
  ): Tensor4D = js.native
  def multinomial(
      logits: Tensor2D,
      normalized: Boolean,
      numSamples: Double,
      seed: Double
  ): Tensor2D = js.native
  def oneHot(indices: Tensor1D, depth: Double, onValue: Double, offValue: Double): Tensor2D =
    js.native
  def getTextureManager(): TextureManager = js.native
  def dispose(): Unit                     = js.native
}

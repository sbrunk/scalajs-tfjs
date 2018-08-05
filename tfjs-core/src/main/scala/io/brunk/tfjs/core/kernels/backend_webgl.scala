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

import scala.scalajs.js
import js.annotation._
import js.|

package backend_webgl {

  @js.native
  trait CPUTimerQuery extends js.Object {
    var startMs: Double = js.native
    var endMs: Double   = js.native
  }

  @js.native
  trait WebGLMemoryInfo extends MemoryInfo {
    var numBytesInGPU: Double = js.native
    var unreliable: Boolean   = js.native
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
        pixels: ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement,
        numChannels: Double
    ): Tensor3D                                                                      = js.native
    def write(dataId: DataId, values: TypedArray): Unit                              = js.native
    def readSync(dataId: DataId): TypedArray                                         = js.native
    def read(dataId: DataId): Promise[TypedArray]                                    = js.native
    def time(f: js.Function0[Unit]): Promise[WebGLTimingInfo]                        = js.native
    def memory(): WebGLMemoryInfo                                                    = js.native
    def disposeData(dataId: DataId): Unit                                            = js.native
    def getTexture(dataId: DataId): WebGLTexture                                     = js.native
    def getGPGPUContext(): GPGPUContext                                              = js.native
    def getCanvas(): HTMLCanvasElement                                               = js.native
    def slice[T <: Tensor](x: T, begin: js.Array[Double], size: js.Array[Double]): T = js.native
    def stridedSlice[T <: Tensor](
        x: T,
        begin: js.Array[Double],
        end: js.Array[Double],
        strides: js.Array[Double],
        beginMask: Double,
        endMask: Double
    ): T                                                      = js.native
    def reverse[T <: Tensor](x: T, axis: js.Array[Double]): T = js.native
    def concat(a: Tensor2D, b: Tensor2D): Tensor2D            = js.native
    def neg[T <: Tensor](x: T): T                             = js.native
    def matMul(a: Tensor2D, b: Tensor2D, transposeA: Boolean, transposeB: Boolean): Tensor2D =
      js.native
    def multiply(a: Tensor, b: Tensor): Tensor = js.native
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
    ): Tensor4D = js.native
    def LRNGrad(
        dy: Tensor4D,
        inputImage: Tensor4D,
        outputImage: Tensor4D,
        depthRadius: Double,
        bias: Double,
        alpha: Double,
        beta: Double
    ): Tensor4D                                            = js.native
    def tile[T <: Tensor](x: T, reps: js.Array[Double]): T = js.native
    def pad[T <: Tensor](
        x: T,
        paddings: js.Array[js.Tuple2[Double, Double]],
        constantValue: Double
    ): T                                                              = js.native
    def transpose[T <: Tensor](x: T, perm: js.Array[Double]): T       = js.native
    def gather[T <: Tensor](x: T, indices: Tensor1D, axis: Double): T = js.native
    def batchToSpaceND[T <: Tensor](
        x: T,
        blockShape: js.Array[Double],
        crops: js.Array[js.Array[Double]]
    ): T = js.native
    def spaceToBatchND[T <: Tensor](
        x: T,
        blockShape: js.Array[Double],
        paddings: js.Array[js.Tuple2[Double, Double]]
    ): T                                               = js.native
    def sum(x: Tensor, axes: js.Array[Double]): Tensor = js.native
    def unsortedSegmentSum[T <: Tensor](x: T, segmentIds: Tensor1D, numSegments: Double): Tensor =
      js.native
    def argMin(x: Tensor, axis: Double): Tensor                                        = js.native
    def argMax(x: Tensor, axis: Double): Tensor                                        = js.native
    def cumsum(x: Tensor, axis: Double, exclusive: Boolean, reverse: Boolean): Tensor  = js.native
    def equal(a: Tensor, b: Tensor): Tensor                                            = js.native
    def notEqual(a: Tensor, b: Tensor): Tensor                                         = js.native
    def less(a: Tensor, b: Tensor): Tensor                                             = js.native
    def lessEqual(a: Tensor, b: Tensor): Tensor                                        = js.native
    def greater(a: Tensor, b: Tensor): Tensor                                          = js.native
    def greaterEqual(a: Tensor, b: Tensor): Tensor                                     = js.native
    def logicalNot[T <: Tensor](x: T): T                                               = js.native
    def logicalAnd(a: Tensor, b: Tensor): Tensor                                       = js.native
    def logicalOr(a: Tensor, b: Tensor): Tensor                                        = js.native
    def select(condition: Tensor, a: Tensor, b: Tensor): Tensor                        = js.native
    def where(condition: Tensor): Tensor2D                                             = js.native
    def topk[T <: Tensor](x: T, k: Double, sorted: Boolean): js.Tuple2[T, T]           = js.native
    def min(x: Tensor, axes: js.Array[Double]): Tensor                                 = js.native
    def minimum(a: Tensor, b: Tensor): Tensor                                          = js.native
    def mod(a: Tensor, b: Tensor): Tensor                                              = js.native
    def max(x: Tensor, axes: js.Array[Double]): Tensor                                 = js.native
    def maximum(a: Tensor, b: Tensor): Tensor                                          = js.native
    def all(x: Tensor, axes: js.Array[Double]): Tensor                                 = js.native
    def any(x: Tensor, axes: js.Array[Double]): Tensor                                 = js.native
    def squaredDifference(a: Tensor, b: Tensor): Tensor                                = js.native
    def realDivide(a: Tensor, b: Tensor): Tensor                                       = js.native
    def floorDiv(a: Tensor, b: Tensor): Tensor                                         = js.native
    def add(a: Tensor, b: Tensor): Tensor                                              = js.native
    def addN[T <: Tensor](tensors: js.Array[T]): T                                     = js.native
    def subtract(a: Tensor, b: Tensor): Tensor                                         = js.native
    def pow[T <: Tensor](a: T, b: Tensor): T                                           = js.native
    def ceil[T <: Tensor](x: T): T                                                     = js.native
    def floor[T <: Tensor](x: T): T                                                    = js.native
    def sign[T <: Tensor](x: T): T                                                     = js.native
    def round[T <: Tensor](x: T): T                                                    = js.native
    def exp[T <: Tensor](x: T): T                                                      = js.native
    def expm1[T <: Tensor](x: T): T                                                    = js.native
    def log[T <: Tensor](x: T): T                                                      = js.native
    def log1p[T <: Tensor](x: T): T                                                    = js.native
    def sqrt[T <: Tensor](x: T): T                                                     = js.native
    def rsqrt[T <: Tensor](x: T): T                                                    = js.native
    def square[T <: Tensor](x: T): T                                                   = js.native
    def reciprocal[T <: Tensor](x: T): T                                               = js.native
    def relu[T <: Tensor](x: T): T                                                     = js.native
    def elu[T <: Tensor](x: T): T                                                      = js.native
    def eluDer[T <: Tensor](dy: T, y: T): T                                            = js.native
    def selu[T <: Tensor](x: T): T                                                     = js.native
    def int[T <: Tensor](x: T): T                                                      = js.native
    def clip[T <: Tensor](x: T, min: Double, max: Double): T                           = js.native
    def abs[T <: Tensor](x: T): T                                                      = js.native
    def sigmoid[T <: Tensor](x: T): T                                                  = js.native
    def softplus[T <: Tensor](x: T): T                                                 = js.native
    def sin[T <: Tensor](x: T): T                                                      = js.native
    def cos[T <: Tensor](x: T): T                                                      = js.native
    def tan[T <: Tensor](x: T): T                                                      = js.native
    def asin[T <: Tensor](x: T): T                                                     = js.native
    def acos[T <: Tensor](x: T): T                                                     = js.native
    def atan[T <: Tensor](x: T): T                                                     = js.native
    def atan2[T <: Tensor](a: T, b: T): T                                              = js.native
    def sinh[T <: Tensor](x: T): T                                                     = js.native
    def cosh[T <: Tensor](x: T): T                                                     = js.native
    def tanh[T <: Tensor](x: T): T                                                     = js.native
    def asinh[T <: Tensor](x: T): T                                                    = js.native
    def acosh[T <: Tensor](x: T): T                                                    = js.native
    def atanh[T <: Tensor](x: T): T                                                    = js.native
    def erf[T <: Tensor](x: T): T                                                      = js.native
    def step[T <: Tensor](x: T, alpha: Double): T                                      = js.native
    def conv2d(x: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D          = js.native
    def conv2dDerInput(dy: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
    def conv2dDerFilter(x: Tensor4D, dy: Tensor4D, convInfo: Conv2DInfo): Tensor4D     = js.native
    def depthwiseConv2D(x: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
    def depthwiseConv2DDerInput(dy: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D =
      js.native
    def depthwiseConv2DDerFilter(x: Tensor4D, dy: Tensor4D, convInfo: Conv2DInfo): Tensor4D =
      js.native
    def maxPool(x: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
    def avgPool(x: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
    def maxPoolBackprop(dy: Tensor4D, x: Tensor4D, y: Tensor4D, convInfo: Conv2DInfo): Tensor4D =
      js.native
    def avgPoolBackprop(dy: Tensor4D, x: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
    def cast[T <: Tensor](x: T, dtype: DataType): T                                = js.native
    def reshape[R <: Rank](x: Tensor, shape: js.Any): Tensor[R]                    = js.native
    def resizeBilinear(
        x: Tensor4D,
        newHeight: Double,
        newWidth: Double,
        alignCorners: Boolean
    ): Tensor4D = js.native
    def resizeBilinearBackprop(dy: Tensor4D, x: Tensor4D, alignCorners: Boolean): Tensor4D =
      js.native
    def resizeNearestNeighbor(
        x: Tensor4D,
        newHeight: Double,
        newWidth: Double,
        alignCorners: Boolean
    ): Tensor4D = js.native
    def resizeNearestNeighborBackprop(dy: Tensor4D, x: Tensor4D, alignCorners: Boolean): Tensor4D =
      js.native
    def multinomial(
        logits: Tensor2D,
        normalized: Boolean,
        numSamples: Double,
        seed: Double
    ): Tensor2D = js.native
    def oneHot(indices: Tensor1D, depth: Double, onValue: Double, offValue: Double): Tensor2D =
      js.native
    def nonMaxSuppression(
        boxes: Tensor2D,
        scores: Tensor1D,
        maxOutputSize: Double,
        iouThreshold: Double,
        scoreThreshold: Double
    ): Tensor1D                             = js.native
    def getTextureManager(): TextureManager = js.native
    def dispose(): Unit                     = js.native
  }

  @js.native
  @JSGlobalScope
  object Backend_webgl extends js.Object {
    val SIZE_UPLOAD_UNIFORM: Int = js.native
  }

}

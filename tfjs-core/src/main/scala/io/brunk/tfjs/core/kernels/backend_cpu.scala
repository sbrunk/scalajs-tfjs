package io.brunk.tfjs.core.kernels

import scala.scalajs.js
import js.annotation._
import js.|

package backend_cpu {

@js.native
@JSGlobal
class MathBackendCPU extends KernelBackend {
  def register(dataId: DataId, shape: js.Array[Double], dtype: DataType): Unit = js.native
  def write(dataId: DataId, values: TypedArray): Unit = js.native
  def fromPixels(pixels: ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement, numChannels: Double): Tensor3D = js.native
  def read(dataId: DataId): Promise[TypedArray] = js.native
  def readSync(dataId: DataId): TypedArray = js.native
  def disposeData(dataId: DataId): Unit = js.native
  def time(f: js.Function0[Unit]): Promise[BackendTimingInfo] = js.native
  def memory(): js.Any = js.native
  def slice[T <: Tensor](x: T, begin: js.Array[Double], size: js.Array[Double]): T = js.native
  def stridedSlice[T <: Tensor](x: T, begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double], beginMask: Double, endMask: Double): T = js.native
  def reverse[T <: Tensor](x: T, axis: js.Array[Double]): T = js.native
  def concat(a: Tensor2D, b: Tensor2D): Tensor2D = js.native
  def neg[T <: Tensor](x: T): T = js.native
  def add(a: Tensor, b: Tensor): Tensor = js.native
  def subtract(a: Tensor, b: Tensor): Tensor = js.native
  def pow[T <: Tensor](a: T, b: Tensor): T = js.native
  def matMul(a: Tensor2D, b: Tensor2D, transposeA: Boolean, transposeB: Boolean): Tensor2D = js.native
  def multiply(a: Tensor, b: Tensor): Tensor = js.native
  def divide(a: Tensor, b: Tensor): Tensor = js.native
  def sum(x: Tensor, axes: js.Array[Double]): Tensor = js.native
  def argMin(x: Tensor, axis: Double): Tensor = js.native
  def argMax(x: Tensor, axis: Double): Tensor = js.native
  def cumsum(x: Tensor, axis: Double, exclusive: Boolean, reverse: Boolean): Tensor = js.native
  def equal(a: Tensor, b: Tensor): Tensor = js.native
  def notEqual(a: Tensor, b: Tensor): Tensor = js.native
  def less(a: Tensor, b: Tensor): Tensor = js.native
  def lessEqual(a: Tensor, b: Tensor): Tensor = js.native
  def greater(a: Tensor, b: Tensor): Tensor = js.native
  def greaterEqual(a: Tensor, b: Tensor): Tensor = js.native
  def logicalNot[T <: Tensor](x: T): T = js.native
  def logicalAnd(a: Tensor, b: Tensor): Tensor = js.native
  def logicalOr(a: Tensor, b: Tensor): Tensor = js.native
  def where(condition: Tensor, a: Tensor, b: Tensor, dtype: DataType): Tensor = js.native
  def topKValues[T <: Tensor](x: T, k: Double): Tensor1D = js.native
  def topKIndices(x: Tensor, k: Double): Tensor1D = js.native
  def min(x: Tensor, axes: js.Array[Double]): Tensor = js.native
  def minimum(a: Tensor, b: Tensor): Tensor = js.native
  def mod(a: Tensor, b: Tensor): Tensor = js.native
  def max(x: Tensor, axes: js.Array[Double]): Tensor = js.native
  def maximum(a: Tensor, b: Tensor): Tensor = js.native
  def squaredDifference(a: Tensor, b: Tensor): Tensor = js.native
  def ceil[T <: Tensor](x: T): T = js.native
  def floor[T <: Tensor](x: T): T = js.native
  def sign[T <: Tensor](x: T): T = js.native
  def round[T <: Tensor](x: T): T = js.native
  def exp[T <: Tensor](x: T): T = js.native
  def expm1[T <: Tensor](x: T): T = js.native
  def log[T <: Tensor](x: T): T = js.native
  def log1p[T <: Tensor](x: T): T = js.native
  def sqrt[T <: Tensor](x: T): T = js.native
  def rsqrt[T <: Tensor](x: T): T = js.native
  def square[T <: Tensor](x: T): T = js.native
  def reciprocal[T <: Tensor](x: T): T = js.native
  def relu[T <: Tensor](x: T): T = js.native
  def elu[T <: Tensor](x: T): T = js.native
  def eluDer[T <: Tensor](dy: T, y: T): T = js.native
  def selu[T <: Tensor](x: T): T = js.native
  def clip[T <: Tensor](x: T, min: Double, max: Double): T = js.native
  def abs[T <: Tensor](x: T): T = js.native
  def int[T <: Tensor](x: T): T = js.native
  def sigmoid[T <: Tensor](x: T): T = js.native
  def softplus[T <: Tensor](x: T): T = js.native
  def sin[T <: Tensor](x: T): T = js.native
  def cos[T <: Tensor](x: T): T = js.native
  def tan[T <: Tensor](x: T): T = js.native
  def asin[T <: Tensor](x: T): T = js.native
  def acos[T <: Tensor](x: T): T = js.native
  def atan[T <: Tensor](x: T): T = js.native
  def atan2[T <: Tensor](a: T, b: T): T = js.native
  def sinh[T <: Tensor](x: T): T = js.native
  def cosh[T <: Tensor](x: T): T = js.native
  def tanh[T <: Tensor](x: T): T = js.native
  def asinh[T <: Tensor](x: T): T = js.native
  def acosh[T <: Tensor](x: T): T = js.native
  def atanh[T <: Tensor](x: T): T = js.native
  def erf[T <: Tensor](x: T): T = js.native
  def step[T <: Tensor](x: T, alpha: Double = ???): T = js.native
  def conv2d(x: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  def conv2dDerInput(dy: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  def conv2dDerFilter(x: Tensor4D, dy: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  def depthwiseConv2D(x: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  def tile[T <: Tensor](x: T, reps: js.Array[Double]): T = js.native
  def pad[T <: Tensor](x: T, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
  def transpose[T <: Tensor](x: T, perm: js.Array[Double]): T = js.native
  def gather[T <: Tensor](x: T, indices: Tensor1D, axis: Double): T = js.native
  def maxPool(x: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  def maxPoolBackprop(dy: Tensor4D, x: Tensor4D, y: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  def avgPoolBackprop(dy: Tensor4D, x: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  def cast[T <: Tensor[types.Rank]](x: T, dtype: DataType): T = js.native
  def reshape[T <: Tensor[types.Rank], R <: types.Rank](x: T, shape: js.Any): Tensor[R] = js.native
  def avgPool(x: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  def resizeBilinear(x: Tensor4D, newHeight: Double, newWidth: Double, alignCorners: Boolean): Tensor4D = js.native
  def resizeBilinearBackprop(dy: Tensor4D, x: Tensor4D, alignCorners: Boolean): Tensor[types.Rank.R4] = js.native
  def resizeNearestNeighbor(x: Tensor4D, newHeight: Double, newWidth: Double, alignCorners: Boolean): Tensor4D = js.native
  def batchNormalization(x: Tensor4D, mean: Tensor4D | Tensor1D, variance: Tensor4D | Tensor1D, varianceEpsilon: Double, scale: Tensor4D | Tensor1D = ???, offset: Tensor4D | Tensor1D = ???): Tensor4D = js.native
  def localResponseNormalization4D(x: Tensor4D, radius: Double, bias: Double, alpha: Double, beta: Double): Tensor4D = js.native
  def multinomial(logits: Tensor2D, normalized: Boolean, numSamples: Double, seed: Double): Tensor2D = js.native
  def oneHot(indices: Tensor1D, depth: Double, onValue: Double, offValue: Double): Tensor2D = js.native
  def dispose(): Unit = js.native
}

}

package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class ReductionOps extends js.Object {
}

@js.native
@JSGlobal
object ReductionOps extends js.Object {
  def logSumExp[T <: Tensor](x: Tensor, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def sum[T <: Tensor](x: Tensor, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def mean[T <: Tensor](x: Tensor, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def min[T <: Tensor](x: Tensor, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def max[T <: Tensor](x: Tensor, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def argMin[T <: Tensor](x: Tensor, axis: Double = ???): T = js.native
  def argMax[T <: Tensor](x: Tensor, axis: Double = ???): T = js.native
  def moments(x: Tensor, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): js.Any = js.native
  def unsortedSegmentSum[T <: Tensor](x: T, segmentIds: Tensor1D, numSegments: Double, axis: Double = ???): T = js.native
}

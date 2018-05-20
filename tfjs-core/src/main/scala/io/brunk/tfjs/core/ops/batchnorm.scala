package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package batchnorm {

@js.native
@JSGlobal
class BatchNormOps extends js.Object {
}

@js.native
@JSGlobal
object BatchNormOps extends js.Object {
  def batchNormalization2d(x: Tensor2D, mean: Tensor2D | Tensor1D, variance: Tensor2D | Tensor1D, varianceEpsilon: Double = ???, scale: Tensor2D | Tensor1D = ???, offset: Tensor2D | Tensor1D = ???): Tensor2D = js.native
  def batchNormalization3d(x: Tensor3D, mean: Tensor3D | Tensor1D, variance: Tensor3D | Tensor1D, varianceEpsilon: Double = ???, scale: Tensor3D | Tensor1D = ???, offset: Tensor3D | Tensor1D = ???): Tensor3D = js.native
  def batchNormalization4d(x: Tensor4D, mean: Tensor4D | Tensor1D, variance: Tensor4D | Tensor1D, varianceEpsilon: Double = ???, scale: Tensor4D | Tensor1D = ???, offset: Tensor4D | Tensor1D = ???): Tensor4D = js.native
  def batchNormalization[R <: Rank](x: Tensor[R], mean: Tensor[R] | Tensor1D, variance: Tensor[R] | Tensor1D, varianceEpsilon: Double = ???, scale: Tensor[R] | Tensor1D = ???, offset: Tensor[R] | Tensor1D = ???): Tensor[R] = js.native
}

}

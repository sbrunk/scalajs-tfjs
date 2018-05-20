package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package matmul {

@js.native
@JSGlobal
class MatmulOps extends js.Object {
}

@js.native
@JSGlobal
object MatmulOps extends js.Object {
  def matMul(a: Tensor2D, b: Tensor2D, transposeA: Boolean = ???, transposeB: Boolean = ???): Tensor2D = js.native
  def vectorTimesMatrix(v: Tensor1D, matrix: Tensor2D): Tensor1D = js.native
  def matrixTimesVector(matrix: Tensor2D, v: Tensor1D): Tensor1D = js.native
  def dotProduct(v1: Tensor1D, v2: Tensor1D): Scalar = js.native
  def outerProduct(v1: Tensor1D, v2: Tensor1D): Tensor2D = js.native
}

}

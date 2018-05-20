package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package logical_ops {

@js.native
@JSGlobal
class LogicalOps extends js.Object {
}

@js.native
@JSGlobal
object LogicalOps extends js.Object {
  def logicalNot[T <: Tensor](x: T): T = js.native
  def logicalAnd[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def logicalOr[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def logicalXor[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def where[T <: Tensor](condition: Tensor, a: T, b: T): T = js.native
}

}

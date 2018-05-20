package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package compare {

@js.native
@JSGlobal
class CompareOps extends js.Object {
}

@js.native
@JSGlobal
object CompareOps extends js.Object {
  def notEqual[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def notEqualStrict[T <: Tensor](a: T, b: T): T = js.native
  def less[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def lessStrict[T <: Tensor](a: T, b: T): T = js.native
  def equal[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def equalStrict[T <: Tensor](a: T, b: T): T = js.native
  def lessEqual[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def lessEqualStrict[T <: Tensor](a: T, b: T): T = js.native
  def greater[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def greaterStrict[T <: Tensor](a: T, b: T): T = js.native
  def greaterEqual[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def greaterEqualStrict[T <: Tensor](a: T, b: T): T = js.native
}

}

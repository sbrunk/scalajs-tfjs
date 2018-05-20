package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class BinaryOps extends js.Object {
}

@js.native
@JSGlobal
object BinaryOps extends js.Object {
  def add[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def addStrict[T <: Tensor](a: T, b: T): T = js.native
  def sub[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def subStrict[T <: Tensor](a: T, b: T): T = js.native
  def pow[T <: Tensor](base: T, exp: Tensor): T = js.native
  def powStrict[T <: Tensor](base: T, exp: Tensor): T = js.native
  def mul[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def mulStrict[T <: Tensor](a: T, b: T): T = js.native
  def div[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def divStrict[T <: Tensor](a: T, b: T): T = js.native
  def mod[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def modStrict[T <: Tensor](a: T, b: T): T = js.native
  def minimum[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def minimumStrict[T <: Tensor](a: T, b: T): T = js.native
  def maximum[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def maximumStrict[T <: Tensor](a: T, b: T): T = js.native
  def squaredDifference[T <: Tensor](a: Tensor, b: Tensor): T = js.native
  def squaredDifferenceStrict[T <: Tensor](a: T, b: T): T = js.native
  def atan2[T <: Tensor](a: Tensor, b: Tensor): T = js.native
}

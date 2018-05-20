package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class SoftmaxOps extends js.Object {
}

@js.native
@JSGlobal
object SoftmaxOps extends js.Object {
  def softmax[T <: Tensor](logits: T, dim: Double = ???): T = js.native
  def softmaxCrossEntropy[T <: Tensor, O <: Tensor](labels: T, logits: T, dim: Double = ???): O = js.native
}

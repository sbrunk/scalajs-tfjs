package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package sigmoid_cross_entropy {

@js.native
@JSGlobal
class SigmoidCrossEntropyOps extends js.Object {
}

@js.native
@JSGlobal
object SigmoidCrossEntropyOps extends js.Object {
  def sigmoidCrossEntropyWithLogits[T <: Tensor, O <: Tensor](labels: T, logits: T): O = js.native
}

}

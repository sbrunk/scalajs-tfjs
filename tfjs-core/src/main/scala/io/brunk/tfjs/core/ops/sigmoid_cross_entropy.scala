package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

  @js.native
  trait SigmoidCrossEntropyOps extends js.Object {
    def sigmoidCrossEntropyWithLogits[T <: TensorND, O <: TensorND](labels: T, logits: T): O = js.native
  }


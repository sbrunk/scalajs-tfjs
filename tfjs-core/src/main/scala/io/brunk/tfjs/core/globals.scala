package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Globals extends js.Object {
  val tidy: Tracking.tidy.type = js.native
  val keep: Tracking.keep.type = js.native
  val dispose: Tracking.dispose.type = js.native
  val time: Tracking.time.type = js.native
  val grad: Gradients.grad.type = js.native
  val valueAndGrad: Gradients.valueAndGrad.type = js.native
  val grads: Gradients.grads.type = js.native
  val valueAndGrads: Gradients.valueAndGrads.type = js.native
  val variableGrads: Gradients.variableGrads.type = js.native
  val customGrad: Gradients.customGrad.type = js.native
}

package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
object train extends js.Object {
  var sgd: OptimizerConstructors.sgd.type = js.native
  var momentum: OptimizerConstructors.momentum.type = js.native
  var adadelta: OptimizerConstructors.adadelta.type = js.native
  var adagrad: OptimizerConstructors.adagrad.type = js.native
  var rmsprop: OptimizerConstructors.rmsprop.type = js.native
  var adamax: OptimizerConstructors.adamax.type = js.native
  var adam: OptimizerConstructors.adam.type = js.native
}

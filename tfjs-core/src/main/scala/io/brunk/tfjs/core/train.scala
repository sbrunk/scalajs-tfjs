/*
 * Copyright 2017 Sören Brunk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|
import optimizers.OptimizerConstructors

@js.native
@JSGlobal
object train extends js.Object {
  var sgd: OptimizerConstructors.sgd.type           = js.native
  var momentum: OptimizerConstructors.momentum.type = js.native
  var adadelta: OptimizerConstructors.adadelta.type = js.native
  var adagrad: OptimizerConstructors.adagrad.type   = js.native
  var rmsprop: OptimizerConstructors.rmsprop.type   = js.native
  var adamax: OptimizerConstructors.adamax.type     = js.native
  var adam: OptimizerConstructors.adam.type         = js.native
}

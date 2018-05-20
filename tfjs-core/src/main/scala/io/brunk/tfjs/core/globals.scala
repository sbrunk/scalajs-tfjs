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

@js.native
@JSGlobalScope
object Globals extends js.Object {
  val tidy: Tracking.tidy.type                    = js.native
  val keep: Tracking.keep.type                    = js.native
  val dispose: Tracking.dispose.type              = js.native
  val time: Tracking.time.type                    = js.native
  val grad: Gradients.grad.type                   = js.native
  val valueAndGrad: Gradients.valueAndGrad.type   = js.native
  val grads: Gradients.grads.type                 = js.native
  val valueAndGrads: Gradients.valueAndGrads.type = js.native
  val variableGrads: Gradients.variableGrads.type = js.native
  val customGrad: Gradients.customGrad.type       = js.native
}

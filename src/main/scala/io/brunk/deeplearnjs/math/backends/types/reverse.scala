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

package io.brunk.deeplearnjs.math.backends.types

import scala.scalajs.js

@js.native
trait Reverse4DNode extends KernelNode {
  var inputAndArgs: Reverse4DInputConfig                                     = js.native
  var output: Array4D                                                        = js.native
  var gradient: js.Function2[Array4D, Array4D, Reverse4DGradientInputArrays] = js.native
}

@js.native
trait Reverse4DInputConfig extends KernelInputConfig {
  var inputs: Reverse4DInputArrays    = js.native
  var args: Reverse4DInputConfig.Args = js.native
}

object Reverse4DInputConfig {

  @js.native
  trait Args extends js.Object {
    var axis: js.Array[Double] = js.native
  }
}

@js.native
trait Reverse4DInputArrays extends NamedArrayMap {
  var x: Array4D = js.native
}

@js.native
trait Reverse4DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array4D] = js.native
}

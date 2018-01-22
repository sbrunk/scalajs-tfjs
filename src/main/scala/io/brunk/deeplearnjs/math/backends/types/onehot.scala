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
import js.annotation._
import js.|

package onehot {

  @js.native
  trait OneHotNode extends KernelNode {
    var inputAndArgs: OneHotInputConfig                                     = js.native
    var output: Array2D                                                     = js.native
    var gradient: js.Function2[Array2D, Array2D, OneHotGradientInputArrays] = js.native
  }

  @js.native
  trait OneHotInputConfig extends KernelInputConfig {
    var inputs: OneHotInputArrays    = js.native
    var args: OneHotInputConfig.Args = js.native
  }

  object OneHotInputConfig {

    @js.native
    trait Args extends js.Object {
      var depth: Double    = js.native
      var onValue: Double  = js.native
      var offValue: Double = js.native
    }
  }

  @js.native
  trait OneHotInputArrays extends NamedArrayMap {
    var indices: Array1D = js.native
  }

  @js.native
  trait OneHotGradientInputArrays extends TapeNodeInputGradientArrays {
    var indices: js.Function0[Array1D] = js.native
  }

}

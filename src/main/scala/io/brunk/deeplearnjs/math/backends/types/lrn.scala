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

package lrn {

  @js.native
  trait LRN4DNode extends KernelNode {
    var inputAndArgs: LRN4DInputConfig                                     = js.native
    var output: Array4D                                                    = js.native
    var gradient: js.Function2[Array4D, Array4D, LRN4DGradientInputArrays] = js.native
  }

  @js.native
  trait LRN4DInputConfig extends KernelInputConfig {
    var inputs: LRN4DInputArrays    = js.native
    var args: LRN4DInputConfig.Args = js.native
  }

  object LRN4DInputConfig {

    @js.native
    trait Args extends js.Object {
      var radius: Double     = js.native
      var bias: Double       = js.native
      var alpha: Double      = js.native
      var beta: Double       = js.native
      var normRegion: String = js.native
    }
  }

  @js.native
  trait LRN4DInputArrays extends NamedArrayMap {
    var x: Array4D = js.native
  }

  @js.native
  trait LRN4DGradientInputArrays extends TapeNodeInputGradientArrays {
    var x: js.Function0[Array4D] = js.native
  }

}

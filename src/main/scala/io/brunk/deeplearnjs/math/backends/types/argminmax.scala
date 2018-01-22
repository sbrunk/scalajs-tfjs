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

package argminmax {

  @js.native
  trait ArgMaxNode extends KernelNode {
    var inputAndArgs: ArgMaxInputConfig = js.native
    var output: NDArray[String]         = js.native
    var gradient: js.Function2[NDArray[String], NDArray[String], ArgMaxGradientInputArrays] =
      js.native
  }

  @js.native
  trait ArgMaxInputConfig extends KernelInputConfig {
    var inputs: ArgMaxInputArrays    = js.native
    var args: ArgMaxInputConfig.Args = js.native
  }

  object ArgMaxInputConfig {

    @js.native
    trait Args extends js.Object {
      var axes: js.Array[Double] = js.native
    }
  }

  @js.native
  trait ArgMaxInputArrays extends NamedArrayMap {
    var x: NDArray = js.native
  }

  @js.native
  trait ArgMaxGradientInputArrays extends TapeNodeInputGradientArrays {
    var x: js.Function0[NDArray] = js.native
  }

  @js.native
  trait ArgMinNode extends KernelNode {
    var inputAndArgs: ArgMinInputConfig = js.native
    var output: NDArray[String]         = js.native
    var gradient: js.Function2[NDArray[String], NDArray[String], ArgMinGradientInputArrays] =
      js.native
  }

  @js.native
  trait ArgMinInputConfig extends KernelInputConfig {
    var inputs: ArgMinInputArrays    = js.native
    var args: ArgMinInputConfig.Args = js.native
  }

  object ArgMinInputConfig {

    @js.native
    trait Args extends js.Object {
      var axes: js.Array[Double] = js.native
    }
  }

  @js.native
  trait ArgMinInputArrays extends NamedArrayMap {
    var x: NDArray = js.native
  }

  @js.native
  trait ArgMinGradientInputArrays extends TapeNodeInputGradientArrays {
    var x: js.Function0[NDArray] = js.native
  }

}
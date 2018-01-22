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

package sum {

  @js.native
  trait SumNode[D <: DataType] extends KernelNode {
    var inputAndArgs: SumInputConfig[D] = js.native
    var output: NDArray[js.Any]         = js.native
    var gradient: js.Function2[NDArray[js.Any], NDArray[js.Any], SumGradientInputArrays[D]] =
      js.native
  }

  @js.native
  trait SumInputConfig[D <: DataType] extends KernelInputConfig {
    var inputs: SumInputArrays[D] = js.native
    var args: SumInputConfig.Args = js.native
  }

  object SumInputConfig {

    @js.native
    trait Args extends js.Object {
      var axes: js.Array[Double] = js.native
    }
  }

  @js.native
  trait SumInputArrays[D <: DataType] extends NamedArrayMap {
    var x: NDArray[D] = js.native
  }

  @js.native
  trait SumGradientInputArrays[D <: DataType] extends TapeNodeInputGradientArrays {
    var x: js.Function0[NDArray[D]] = js.native
  }

}
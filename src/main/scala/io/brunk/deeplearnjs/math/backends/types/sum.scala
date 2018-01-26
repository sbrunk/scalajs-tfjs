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

import io.brunk.deeplearnjs.Util.NamedArrayMap
import io.brunk.deeplearnjs.math.backends.Tape_types.TapeNodeInputGradientArrays
import io.brunk.deeplearnjs.math.{ DataType, NDArray, Rank }
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }

import scala.scalajs.js

@js.native
trait SumNode[D <: DataType] extends KernelNode {
  var inputAndArgs: SumInputConfig[D] = js.native
  var output: NDArray[js.Any, Rank]   = js.native
  // var gradient: js.Function2[NDArray[js.Any, Rank], NDArray[js.Any, Rank], SumGradientInputArrays[D]] = js.native
}

@js.native
trait SumInputConfig[D <: DataType] extends KernelInputConfig {
  var inputs: SumInputArrays[D] = js.native
  var args: SumInputConfig.Args = js.native
}

object SumInputConfig {

  @js.native
  trait Args extends KernelInputConfig.Args {
    var axes: js.Array[Double] = js.native
  }
}

@js.native
trait SumInputArrays[D <: DataType] extends NamedArrayMap {
  var x: NDArray[D, Rank] = js.native
}

@js.native
trait SumGradientInputArrays[D <: DataType] extends TapeNodeInputGradientArrays {
  var x: js.Function0[NDArray[D, Rank]] = js.native
}

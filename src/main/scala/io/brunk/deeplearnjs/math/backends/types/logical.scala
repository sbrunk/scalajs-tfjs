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
import io.brunk.deeplearnjs.math.{ Bool, DataType, NDArray, Rank }
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }
import io.brunk.deeplearnjs.math.backends.Tape_types.TapeNodeInputGradientArrays

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DualInputArrays extends NamedArrayMap {
  var a: NDArray[DataType, Rank] = js.native
  var b: NDArray[DataType, Rank] = js.native
}

@js.native
trait DualGradientInputArrays extends TapeNodeInputGradientArrays {
  var a: js.Function0[NDArray[DataType, Rank]] = js.native
  var b: js.Function0[NDArray[DataType, Rank]] = js.native
}

@js.native
trait EqualNode extends KernelNode {
  var inputAndArgs: EqualInputConfig = js.native
  var output: NDArray[Bool, Rank]    = js.native
  //var gradient: js.Function2[NDArray[Bool, Rank], NDArray[Bool, Rank], DualGradientInputArrays] = js.native
}

@js.native
trait EqualInputConfig extends KernelInputConfig {
  var inputs: DualInputArrays = js.native
}

@js.native
trait LogicalOrNode extends KernelNode {
  var inputAndArgs: LogicalOrInputConfig = js.native
  var output: NDArray[Bool, Rank]        = js.native
  //var gradient: js.Function2[NDArray[DataType, Rank], NDArray[DataType, Rank], DualGradientInputArrays] = js.native
}

@js.native
trait LogicalOrInputConfig extends KernelInputConfig {
  var inputs: DualInputArrays = js.native
}

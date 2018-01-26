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
trait MinNode[D <: DataType] extends KernelNode {
  var inputAndArgs: MinInputConfig[D] = js.native
  var output: NDArray[D, Rank]        = js.native
  // var gradient: js.Function2[NDArray[D, Rank], NDArray[D, Rank], MinGradientInputArrays[D]] = js.native
}

@js.native
trait MinimumNode[D <: DataType] extends KernelNode {
  var inputAndArgs: MinimumInputConfig[D] = js.native
  var output: NDArray[D, Rank]            = js.native
  // var gradient: js.Function2[NDArray[D, Rank], NDArray[D, Rank], js.Any] = js.native
}

@js.native
trait MinimumInputConfig[D <: DataType] extends KernelInputConfig {
  var inputs: MinimumInputConfig.Inputs[D] = js.native
}

object MinimumInputConfig {

  @js.native
  trait Inputs[D <: DataType] extends js.Object {
    var a: NDArray[D, Rank] = js.native
    var b: NDArray[D, Rank] = js.native
  }
}

@js.native
trait MinInputConfig[D <: DataType] extends KernelInputConfig {
  var inputs: MinInputArrays[D] = js.native
}

@js.native
trait MinInputArrays[D <: DataType] extends NamedArrayMap {
  var x: NDArray[D, Rank] = js.native
}

@js.native
trait MinGradientInputArrays[D <: DataType] extends TapeNodeInputGradientArrays {
  var x: js.Function0[NDArray[D, Rank]] = js.native
}

@js.native
trait MaxNode[D <: DataType] extends KernelNode {
  var inputAndArgs: MaxInputConfig[D] = js.native
  var output: NDArray[D, Rank]        = js.native
  // var gradient: js.Function2[NDArray[D, Rank], NDArray[D, Rank], MaxGradientInputArrays[D]] = js.native
}

@js.native
trait MaximumNode[D <: DataType] extends KernelNode {
  var inputAndArgs: MaximumInputConfig[D] = js.native
  var output: NDArray[D, Rank]            = js.native
  // var gradient: js.Function2[NDArray[D, Rank], NDArray[D, Rank], js.Any] = js.native
}

@js.native
trait MaximumInputConfig[D <: DataType] extends KernelInputConfig {
  var inputs: MaximumInputConfig.Inputs[D] = js.native
}

object MaximumInputConfig {

  @js.native
  trait Inputs[D <: DataType] extends NamedArrayMap {
    var a: NDArray[D, Rank] = js.native
    var b: NDArray[D, Rank] = js.native
  }
}

@js.native
trait MaxInputConfig[D <: DataType] extends KernelInputConfig {
  var inputs: MaxInputArrays[D] = js.native
}

@js.native
trait MaxInputArrays[D <: DataType] extends NamedArrayMap {
  var x: NDArray[D, Rank] = js.native
}

@js.native
trait MaxGradientInputArrays[D <: DataType] extends TapeNodeInputGradientArrays {
  var x: js.Function0[NDArray[D, Rank]] = js.native
}

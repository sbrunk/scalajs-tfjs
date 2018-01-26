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
import io.brunk.deeplearnjs.math.{ DataType, Int32, NDArray, Rank }
import io.brunk.deeplearnjs.math.backends.Tape_types.TapeNodeInputGradientArrays
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }

import scala.scalajs.js

@js.native
trait ArgMaxNode extends KernelNode {
  var inputAndArgs: ArgMaxInputConfig = js.native
  var output: NDArray[Int32, Rank]    = js.native
  // var gradient: js.Function2[NDArray[String, Rank], NDArray[String, Rank], ArgMaxGradientInputArrays] = js.native
}

@js.native
trait ArgMaxInputConfig extends KernelInputConfig {
  var inputs: ArgMaxInputArrays    = js.native
  var args: ArgMaxInputConfig.Args = js.native
}

object ArgMaxInputConfig {

  @js.native
  trait Args extends KernelInputConfig.Args {
    var axes: js.Array[Double] = js.native
  }
}

@js.native
trait ArgMaxInputArrays extends NamedArrayMap {
  var x: NDArray[DataType, Rank] = js.native
}

@js.native
trait ArgMaxGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[NDArray[DataType, Rank]] = js.native
}

@js.native
trait ArgMinNode extends KernelNode {
  var inputAndArgs: ArgMinInputConfig = js.native
  var output: NDArray[Int32, Rank]    = js.native
  // var gradient: js.Function2[NDArray[String, Rank], NDArray[String, Rank], ArgMinGradientInputArrays] = js.native
}

@js.native
trait ArgMinInputConfig extends KernelInputConfig {
  var inputs: ArgMinInputArrays    = js.native
  var args: ArgMinInputConfig.Args = js.native
}

object ArgMinInputConfig {

  @js.native
  trait Args extends KernelInputConfig.Args {
    var axes: js.Array[Double] = js.native
  }
}

@js.native
trait ArgMinInputArrays extends NamedArrayMap {
  var x: NDArray[DataType, Rank] = js.native
}

@js.native
trait ArgMinGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[NDArray[DataType, Rank]] = js.native
}

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
import io.brunk.deeplearnjs.math._
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }

import scala.scalajs.js

@js.native
trait TopKValuesNode[D <: DataType, T <: NDArray[D, Rank]] extends KernelNode {
  var inputAndArgs: TopKValuesInputConfig[T] = js.native
  var output: Array1D[D]                     = js.native
  // var gradient: js.Function2[Array1D[D], Array1D[D], TopKValuesGradientInputArrays[T]] = js.native
}

@js.native
trait TopKValuesInputConfig[T <: NDArray[DataType, Rank]] extends KernelInputConfig {
  var inputs: TopKValuesInputArrays[T] = js.native
  var args: TopKValuesInputConfig.Args = js.native
}

object TopKValuesInputConfig {

  @js.native
  trait Args extends KernelInputConfig.Args {
    var k: Double = js.native
  }
}

@js.native
trait TopKValuesInputArrays[T <: NDArray[DataType, Rank]] extends NamedArrayMap {
  var x: T = js.native
}

@js.native
trait TopKValuesGradientInputArrays[T <: NDArray[DataType, Rank]]
    extends TapeNodeInputGradientArrays {
  var x: js.Function0[T] = js.native
}

@js.native
trait TopKIndicesNode extends KernelNode {
  var inputAndArgs: TopKIndicesInputConfig = js.native
  var output: Array1D[Int32]               = js.native
  // var gradient: js.Function2[Array1D[String], Array1D[String], TopKIndicesGradientInputArrays] =
  js.native
}

@js.native
trait TopKIndicesInputConfig extends KernelInputConfig {
  var inputs: TopKIndicesInputArrays    = js.native
  var args: TopKIndicesInputConfig.Args = js.native
}

object TopKIndicesInputConfig {

  @js.native
  trait Args extends KernelInputConfig.Args {
    var k: Double = js.native
  }
}

@js.native
trait TopKIndicesInputArrays extends NamedArrayMap {
  var x: NDArray[DataType, Rank] = js.native
}

@js.native
trait TopKIndicesGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[NDArray[DataType, Rank]] = js.native
}

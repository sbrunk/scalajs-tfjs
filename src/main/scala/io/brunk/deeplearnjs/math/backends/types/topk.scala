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
trait TopKValuesNode[D <: DataType, T <: NDArray[D]] extends KernelNode {
  var inputAndArgs: TopKValuesInputConfig[T]                                           = js.native
  var output: Array1D[D]                                                               = js.native
  var gradient: js.Function2[Array1D[D], Array1D[D], TopKValuesGradientInputArrays[T]] = js.native
}

@js.native
trait TopKValuesInputConfig[T <: NDArray] extends KernelInputConfig {
  var inputs: TopKValuesInputArrays[T] = js.native
  var args: TopKValuesInputConfig.Args = js.native
}

object TopKValuesInputConfig {

  @js.native
  trait Args extends js.Object {
    var k: Double = js.native
  }
}

@js.native
trait TopKValuesInputArrays[T <: NDArray] extends NamedArrayMap {
  var x: T = js.native
}

@js.native
trait TopKValuesGradientInputArrays[T <: NDArray] extends TapeNodeInputGradientArrays {
  var x: js.Function0[T] = js.native
}

@js.native
trait TopKIndicesNode extends KernelNode {
  var inputAndArgs: TopKIndicesInputConfig = js.native
  var output: Array1D[String]              = js.native
  var gradient: js.Function2[Array1D[String], Array1D[String], TopKIndicesGradientInputArrays] =
    js.native
}

@js.native
trait TopKIndicesInputConfig extends KernelInputConfig {
  var inputs: TopKIndicesInputArrays    = js.native
  var args: TopKIndicesInputConfig.Args = js.native
}

object TopKIndicesInputConfig {

  @js.native
  trait Args extends js.Object {
    var k: Double = js.native
  }
}

@js.native
trait TopKIndicesInputArrays extends NamedArrayMap {
  var x: NDArray = js.native
}

@js.native
trait TopKIndicesGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[NDArray] = js.native
}

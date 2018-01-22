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

package minmax {

  @js.native
  trait MinNode[D <: DataType] extends KernelNode {
    var inputAndArgs: MinInputConfig[D]                                           = js.native
    var output: NDArray[D]                                                        = js.native
    var gradient: js.Function2[NDArray[D], NDArray[D], MinGradientInputArrays[D]] = js.native
  }

  @js.native
  trait MinimumNode[D <: DataType] extends KernelNode {
    var inputAndArgs: MinimumInputConfig[D]                    = js.native
    var output: NDArray[D]                                     = js.native
    var gradient: js.Function2[NDArray[D], NDArray[D], js.Any] = js.native
  }

  @js.native
  trait MinimumInputConfig[D <: DataType] extends KernelInputConfig {
    var inputs: MinimumInputConfig.Inputs = js.native
  }

  object MinimumInputConfig {

    @js.native
    trait Inputs extends js.Object {
      var a: NDArray[D] = js.native
      var b: NDArray[D] = js.native
    }
  }

  @js.native
  trait MinInputConfig[D <: DataType] extends KernelInputConfig {
    var inputs: MinInputArrays[D] = js.native
  }

  @js.native
  trait MinInputArrays[D <: DataType] extends NamedArrayMap {
    var x: NDArray[D] = js.native
  }

  @js.native
  trait MinGradientInputArrays[D <: DataType] extends TapeNodeInputGradientArrays {
    var x: js.Function0[NDArray[D]] = js.native
  }

  @js.native
  trait MaxNode[D <: DataType] extends KernelNode {
    var inputAndArgs: MaxInputConfig[D]                                           = js.native
    var output: NDArray[D]                                                        = js.native
    var gradient: js.Function2[NDArray[D], NDArray[D], MaxGradientInputArrays[D]] = js.native
  }

  @js.native
  trait MaximumNode[D <: DataType] extends KernelNode {
    var inputAndArgs: MaximumInputConfig[D]                    = js.native
    var output: NDArray[D]                                     = js.native
    var gradient: js.Function2[NDArray[D], NDArray[D], js.Any] = js.native
  }

  @js.native
  trait MaximumInputConfig[D <: DataType] extends KernelInputConfig {
    var inputs: MaximumInputConfig.Inputs = js.native
  }

  object MaximumInputConfig {

    @js.native
    trait Inputs extends js.Object {
      var a: NDArray[D] = js.native
      var b: NDArray[D] = js.native
    }
  }

  @js.native
  trait MaxInputConfig[D <: DataType] extends KernelInputConfig {
    var inputs: MaxInputArrays[D] = js.native
  }

  @js.native
  trait MaxInputArrays[D <: DataType] extends NamedArrayMap {
    var x: NDArray[D] = js.native
  }

  @js.native
  trait MaxGradientInputArrays[D <: DataType] extends TapeNodeInputGradientArrays {
    var x: js.Function0[NDArray[D]] = js.native
  }

}

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
trait PReLUNode[T <: NDArray] extends KernelNode {
  var inputAndArgs: PReLUInputConfig[T]                         = js.native
  var output: T                                                 = js.native
  var gradient: js.Function2[T, T, PReLUGradientInputArrays[T]] = js.native
}

@js.native
trait PReLUInputConfig[T <: NDArray] extends KernelInputConfig {
  var inputs: PReLUInputArrays[T] = js.native
}

@js.native
trait PReLUInputArrays[T <: NDArray] extends NamedArrayMap {
  var x: T     = js.native
  var alpha: T = js.native
}

@js.native
trait PReLUGradientInputArrays[T <: NDArray] extends TapeNodeInputGradientArrays {
  var x: js.Function0[T]     = js.native
  var alpha: js.Function0[T] = js.native
}

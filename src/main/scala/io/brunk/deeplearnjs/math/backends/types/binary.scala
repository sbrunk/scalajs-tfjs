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
trait BinaryNode extends KernelNode {
  var inputAndArgs: BinaryInputConfig                                     = js.native
  var output: NDArray                                                     = js.native
  var gradient: js.Function2[NDArray, NDArray, BinaryInputGradientArrays] = js.native
}

@js.native
trait BinaryInputConfig extends KernelInputConfig {
  var inputs: BinaryInputArrays = js.native
}

@js.native
trait BinaryInputArrays extends NamedArrayMap {
  var a: NDArray = js.native
  var b: NDArray = js.native
}

@js.native
trait BinaryInputGradientArrays extends TapeNodeInputGradientArrays {
  var a: js.Function0[NDArray] = js.native
  var b: js.Function0[NDArray] = js.native
}

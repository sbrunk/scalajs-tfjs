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
trait DualInputArrays extends NamedArrayMap {
  var a: NDArray = js.native
  var b: NDArray = js.native
}

@js.native
trait DualGradientInputArrays extends TapeNodeInputGradientArrays {
  var a: js.Function0[NDArray] = js.native
  var b: js.Function0[NDArray] = js.native
}

@js.native
trait EqualNode extends KernelNode {
  var inputAndArgs: EqualInputConfig = js.native
  var output: NDArray[String]        = js.native
  var gradient: js.Function2[NDArray[String], NDArray[String], DualGradientInputArrays] =
    js.native
}

@js.native
trait EqualInputConfig extends KernelInputConfig {
  var inputs: DualInputArrays = js.native
}

@js.native
trait LogicalOrNode extends KernelNode {
  var inputAndArgs: LogicalOrInputConfig = js.native
  var output: NDArray[String]            = js.native
  var gradient: js.Function2[NDArray[String], NDArray[String], DualGradientInputArrays] =
    js.native
}

@js.native
trait LogicalOrInputConfig extends KernelInputConfig {
  var inputs: DualInputArrays = js.native
}

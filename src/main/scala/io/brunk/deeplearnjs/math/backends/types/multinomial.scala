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
import io.brunk.deeplearnjs.math.{ Array2D, DataType }
import io.brunk.deeplearnjs.math.backends.Tape_types.TapeNodeInputGradientArrays
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }

import scala.scalajs.js

@js.native
trait MultinomialNode extends KernelNode {
  var inputAndArgs: MultinomialInputConfig = js.native
  var output: Array2D[String]              = js.native
  var gradient: js.Function2[Array2D[String], Array2D[String], MultinomialGradientInputArrays] =
    js.native
}

@js.native
trait MultinomialInputConfig extends KernelInputConfig {
  var inputs: MultinomialInputArrays    = js.native
  var args: MultinomialInputConfig.Args = js.native
}

object MultinomialInputConfig {

  @js.native
  trait Args extends js.Object {
    var numSamples: Double = js.native
    var seed: Double       = js.native
  }
}

@js.native
trait MultinomialInputArrays extends NamedArrayMap {
  var probs: Array2D[DataType] = js.native
}

@js.native
trait MultinomialGradientInputArrays extends TapeNodeInputGradientArrays {
  var probs: js.Function0[Array2D[DataType]] = js.native
}

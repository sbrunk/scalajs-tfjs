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
import io.brunk.deeplearnjs.math.{ Array1D, Array2D, DataType }
import io.brunk.deeplearnjs.math.backends.Tape_types.TapeNodeInputGradientArrays
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }

import scala.scalajs.js

@js.native
trait Pad1DNode extends KernelNode {
  var inputAndArgs: Pad1DInputConfig = js.native
  var output: Array1D[DataType]      = js.native
  var gradient: js.Function2[Array1D[DataType], Array1D[DataType], Pad1DGradientInputArrays] =
    js.native
}

@js.native
trait Pad1DInputConfig extends KernelInputConfig {
  var inputs: Pad1DInputArrays    = js.native
  var args: Pad1DInputConfig.Args = js.native
}

object Pad1DInputConfig {

  @js.native
  trait Args extends js.Object {
    var paddings: js.Tuple2[Double, Double] = js.native
    var constantValue: Double               = js.native
  }
}

@js.native
trait Pad1DInputArrays extends NamedArrayMap {
  var x: Array1D[DataType] = js.native
}

@js.native
trait Pad1DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array1D[DataType]] = js.native
}

@js.native
trait Pad2DNode extends KernelNode {
  var inputAndArgs: Pad2DInputConfig = js.native
  var output: Array2D[DataType]      = js.native
  var gradient: js.Function2[Array2D[DataType], Array2D[DataType], Pad2DGradientInputArrays] =
    js.native
}

@js.native
trait Pad2DInputConfig extends KernelInputConfig {
  var inputs: Pad2DInputArrays    = js.native
  var args: Pad2DInputConfig.Args = js.native
}

object Pad2DInputConfig {

  @js.native
  trait Args extends js.Object {
    var paddings: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
    var constantValue: Double                                                     = js.native
  }
}

@js.native
trait Pad2DInputArrays extends NamedArrayMap {
  var x: Array2D[DataType] = js.native
}

@js.native
trait Pad2DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array2D[DataType]] = js.native
}

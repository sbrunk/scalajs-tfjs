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
import io.brunk.deeplearnjs.math.{ Array3D, DataType }
import io.brunk.deeplearnjs.math.backends.Tape_types.TapeNodeInputGradientArrays
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }

import scala.scalajs.js

@js.native
trait ResizeBilinear3DNode extends KernelNode {
  var inputAndArgs: ResizeBilinear3DInputConfig = js.native
  var output: Array3D[DataType]                 = js.native
  // var gradient: js.Function2[Array3D[DataType], Array3D[DataType], ResizeBilinear3DGradientInputArrays] = js.native
}

@js.native
trait ResizeBilinear3DInputConfig extends KernelInputConfig {
  var inputs: ResizeBilinear3DInputArrays    = js.native
  var args: ResizeBilinear3DInputConfig.Args = js.native
}

object ResizeBilinear3DInputConfig {

  @js.native
  trait Args extends KernelInputConfig.Args {
    var newShape2D: js.Tuple2[Double, Double] = js.native
    var alignCorners: Boolean                 = js.native
  }
}

@js.native
trait ResizeBilinear3DInputArrays extends NamedArrayMap {
  var x: Array3D[DataType] = js.native
}

@js.native
trait ResizeBilinear3DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array3D[DataType]] = js.native
}

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

import scala.scalajs.js
import scala.scalajs.js.|
import io.brunk.deeplearnjs.math._
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }

@js.native
trait BatchNorm4DNode extends KernelNode {
  var inputAndArgs: BatchNorm4DInputConfig = js.native
  var output: Array4D[DataType]            = js.native
  var gradient: js.Function2[Array4D[DataType], Array4D[DataType], BatchNorm4DGradientInputArrays] =
    js.native
}

@js.native
trait BatchNorm4DInputConfig extends KernelInputConfig {
  var inputs: BatchNorm4DInputArrays    = js.native
  var args: BatchNorm4DInputConfig.Args = js.native
}

object BatchNorm4DInputConfig {

  @js.native
  trait Args extends js.Object {
    var varianceEpsilon: Double = js.native
  }
}

@js.native
trait BatchNorm4DInputArrays extends NamedArrayMap {
  var x: Array4D[DataType]                            = js.native
  var mean: Array4D[DataType] | Array1D[DataType]     = js.native
  var variance: Array4D[DataType] | Array1D[DataType] = js.native
  var scale: Array4D[DataType] | Array1D[DataType]    = js.native
  var offset: Array4D[DataType] | Array1D[DataType]   = js.native
}

@js.native
trait BatchNorm4DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array4D[DataType]]                            = js.native
  var mean: js.Function0[Array4D[DataType] | Array1D[DataType]]     = js.native
  var variance: js.Function0[Array4D[DataType] | Array1D[DataType]] = js.native
  var scale: js.Function0[Array4D[DataType] | Array1D[DataType]]    = js.native
  var offset: js.Function0[Array4D[DataType] | Array1D[DataType]]   = js.native
}

@js.native
trait BatchNorm3DNode extends KernelNode {
  var inputAndArgs: BatchNorm3DInputConfig = js.native
  var output: Array3D[DataType]            = js.native
  var gradient: js.Function2[Array3D[DataType], Array3D[DataType], BatchNorm3DGradientInputArrays] =
    js.native
}

@js.native
trait BatchNorm3DInputConfig extends KernelInputConfig {
  var inputs: BatchNorm3DInputArrays    = js.native
  var args: BatchNorm3DInputConfig.Args = js.native
}

object BatchNorm3DInputConfig {

  @js.native
  trait Args extends js.Object {
    var varianceEpsilon: Double = js.native
  }
}

@js.native
trait BatchNorm3DInputArrays extends NamedArrayMap {
  var x: Array3D[DataType]                            = js.native
  var mean: Array3D[DataType] | Array1D[DataType]     = js.native
  var variance: Array3D[DataType] | Array1D[DataType] = js.native
  var scale: Array3D[DataType] | Array1D[DataType]    = js.native
  var offset: Array3D[DataType] | Array1D[DataType]   = js.native
}

@js.native
trait BatchNorm3DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array3D[DataType]]                            = js.native
  var mean: js.Function0[Array3D[DataType] | Array1D[DataType]]     = js.native
  var variance: js.Function0[Array3D[DataType] | Array1D[DataType]] = js.native
  var scale: js.Function0[Array3D[DataType] | Array1D[DataType]]    = js.native
  var offset: js.Function0[Array3D[DataType] | Array1D[DataType]]   = js.native
}

@js.native
trait BatchNorm2DNode extends KernelNode {
  var inputAndArgs: BatchNorm2DInputConfig = js.native
  var output: Array2D[DataType]            = js.native
  var gradient: js.Function2[Array2D[DataType], Array2D[DataType], BatchNorm2DGradientInputArrays] =
    js.native
}

@js.native
trait BatchNorm2DInputConfig extends KernelInputConfig {
  var inputs: BatchNorm2DInputArrays    = js.native
  var args: BatchNorm2DInputConfig.Args = js.native
}

object BatchNorm2DInputConfig {

  @js.native
  trait Args extends js.Object {
    var varianceEpsilon: Double = js.native
  }
}

@js.native
trait BatchNorm2DInputArrays extends NamedArrayMap {
  var x: Array2D[DataType]                            = js.native
  var mean: Array2D[DataType] | Array1D[DataType]     = js.native
  var variance: Array2D[DataType] | Array1D[DataType] = js.native
  var scale: Array2D[DataType] | Array1D[DataType]    = js.native
  var offset: Array2D[DataType] | Array1D[DataType]   = js.native
}

@js.native
trait BatchNorm2DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array2D[DataType]]                            = js.native
  var mean: js.Function0[Array2D[DataType] | Array1D[DataType]]     = js.native
  var variance: js.Function0[Array2D[DataType] | Array1D[DataType]] = js.native
  var scale: js.Function0[Array2D[DataType] | Array1D[DataType]]    = js.native
  var offset: js.Function0[Array2D[DataType] | Array1D[DataType]]   = js.native
}

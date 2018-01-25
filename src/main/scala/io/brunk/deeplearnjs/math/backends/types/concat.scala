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
import io.brunk.deeplearnjs.math.{ Array1D, Array2D, Array3D, Array4D, DataType }
import io.brunk.deeplearnjs.math.backends.Tape_types.TapeNodeInputGradientArrays
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }

import scala.scalajs.js

@js.native
trait Concat1DNode extends KernelNode {
  var inputAndArgs: Concat1DInputConfig = js.native
  var output: Array1D[DataType]         = js.native
  var gradient: js.Function2[Array1D[DataType], Array1D[DataType], Concat1DGradientArrays] =
    js.native
}

@js.native
trait Concat1DInputConfig extends KernelInputConfig {
  var inputs: Concat1DInputArrays = js.native
}

@js.native
trait Concat1DInputArrays extends NamedArrayMap {
  var a: Array1D[DataType] = js.native
  var b: Array1D[DataType] = js.native
}

@js.native
trait Concat1DGradientArrays extends TapeNodeInputGradientArrays {
  var a: js.Function0[Array1D[DataType]] = js.native
  var b: js.Function0[Array1D[DataType]] = js.native
}

@js.native
trait Concat2DNode extends KernelNode {
  var inputAndArgs: Concat2DInputConfig = js.native
  var output: Array2D[DataType]         = js.native
  var gradient: js.Function2[Array2D[DataType], Array2D[DataType], Concat2DGradientArrays] =
    js.native
}

@js.native
trait Concat2DInputConfig extends KernelInputConfig {
  var inputs: Concat2DInputArrays    = js.native
  var args: Concat2DInputConfig.Args = js.native
}

object Concat2DInputConfig {

  @js.native
  trait Args extends js.Object {
    var axis: Double = js.native
  }
}

@js.native
trait Concat2DInputArrays extends NamedArrayMap {
  var a: Array2D[DataType] = js.native
  var b: Array2D[DataType] = js.native
}

@js.native
trait Concat2DGradientArrays extends TapeNodeInputGradientArrays {
  var a: js.Function0[Array2D[DataType]] = js.native
  var b: js.Function0[Array2D[DataType]] = js.native
}

@js.native
trait Concat3DNode extends KernelNode {
  var inputAndArgs: Concat3DInputConfig = js.native
  var output: Array3D[DataType]         = js.native
  var gradient: js.Function2[Array3D[DataType], Array3D[DataType], Concat3DGradientArrays] =
    js.native
}

@js.native
trait Concat3DInputConfig extends KernelInputConfig {
  var inputs: Concat3DInputArrays    = js.native
  var args: Concat3DInputConfig.Args = js.native
}

object Concat3DInputConfig {

  @js.native
  trait Args extends js.Object {
    var axis: Double = js.native
  }
}

@js.native
trait Concat3DInputArrays extends NamedArrayMap {
  var a: Array3D[DataType] = js.native
  var b: Array3D[DataType] = js.native
}

@js.native
trait Concat3DGradientArrays extends TapeNodeInputGradientArrays {
  var a: js.Function0[Array3D[DataType]] = js.native
  var b: js.Function0[Array3D[DataType]] = js.native
}

@js.native
trait Concat4DNode extends KernelNode {
  var inputAndArgs: Concat4DInputConfig = js.native
  var output: Array4D[DataType]         = js.native
  var gradient: js.Function2[Array4D[DataType], Array4D[DataType], Concat4DGradientArrays] =
    js.native
}

@js.native
trait Concat4DInputConfig extends KernelInputConfig {
  var inputs: Concat4DInputArrays    = js.native
  var args: Concat4DInputConfig.Args = js.native
}

object Concat4DInputConfig {

  @js.native
  trait Args extends js.Object {
    var axis: Double = js.native
  }
}

@js.native
trait Concat4DInputArrays extends NamedArrayMap {
  var a: Array4D[DataType] = js.native
  var b: Array4D[DataType] = js.native
}

@js.native
trait Concat4DGradientArrays extends TapeNodeInputGradientArrays {
  var a: js.Function0[Array4D[DataType]] = js.native
  var b: js.Function0[Array4D[DataType]] = js.native
}

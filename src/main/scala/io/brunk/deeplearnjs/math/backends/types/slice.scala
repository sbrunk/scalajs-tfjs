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
import io.brunk.deeplearnjs.math._
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }
import io.brunk.deeplearnjs.math.backends.Tape_types.TapeNodeInputGradientArrays

import scala.scalajs.js

@js.native
trait Slice1DNode extends KernelNode {
  var inputAndArgs: Slice1DInputConfig = js.native
  var output: Array1D[DataType]        = js.native
  var gradient: js.Function2[Array1D[DataType], Array1D[DataType], Slice1DGradientInputArrays] =
    js.native
}

@js.native
trait Slice1DInputConfig extends KernelInputConfig {
  var inputs: Slice1DInputArrays    = js.native
  var args: Slice1DInputConfig.Args = js.native
}

object Slice1DInputConfig {

  @js.native
  trait Args extends js.Object {
    var begin: Double = js.native
    var size: Double  = js.native
  }
}

@js.native
trait Slice1DInputArrays extends NamedArrayMap {
  var x: Array1D[DataType] = js.native
}

@js.native
trait Slice1DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array1D[DataType]] = js.native
}

@js.native
trait Slice2DNode extends KernelNode {
  var inputAndArgs: Slice2DInputConfig = js.native
  var output: Array2D[DataType]        = js.native
  var gradient: js.Function2[Array2D[DataType], Array2D[DataType], Slice2DGradientInputArrays] =
    js.native
}

@js.native
trait Slice2DInputConfig extends KernelInputConfig {
  var inputs: Slice2DInputArrays    = js.native
  var args: Slice2DInputConfig.Args = js.native
}

object Slice2DInputConfig {

  @js.native
  trait Args extends js.Object {
    var begin: js.Tuple2[Double, Double] = js.native
    var size: js.Tuple2[Double, Double]  = js.native
  }
}

@js.native
trait Slice2DInputArrays extends NamedArrayMap {
  var x: Array2D[DataType] = js.native
}

@js.native
trait Slice2DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array2D[DataType]] = js.native
}

@js.native
trait Slice3DNode extends KernelNode {
  var inputAndArgs: Slice3DInputConfig = js.native
  var output: Array3D[DataType]        = js.native
  var gradient: js.Function2[Array3D[DataType], Array3D[DataType], Slice3DGradientInputArrays] =
    js.native
}

@js.native
trait Slice3DInputConfig extends KernelInputConfig {
  var inputs: Slice3DInputArrays    = js.native
  var args: Slice3DInputConfig.Args = js.native
}

object Slice3DInputConfig {

  @js.native
  trait Args extends js.Object {
    var begin: js.Tuple3[Double, Double, Double] = js.native
    var size: js.Tuple3[Double, Double, Double]  = js.native
  }
}

@js.native
trait Slice3DInputArrays extends NamedArrayMap {
  var x: Array3D[DataType] = js.native
}

@js.native
trait Slice3DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array3D[DataType]] = js.native
}

@js.native
trait Slice4DNode extends KernelNode {
  var inputAndArgs: Slice4DInputConfig = js.native
  var output: Array4D[DataType]        = js.native
  var gradient: js.Function2[Array4D[DataType], Array4D[DataType], Slice4DGradientInputArrays] =
    js.native
}

@js.native
trait Slice4DInputConfig extends KernelInputConfig {
  var inputs: Slice4DInputArrays    = js.native
  var args: Slice4DInputConfig.Args = js.native
}

object Slice4DInputConfig {

  @js.native
  trait Args extends js.Object {
    var begin: js.Tuple4[Double, Double, Double, Double] = js.native
    var size: js.Tuple4[Double, Double, Double, Double]  = js.native
  }
}

@js.native
trait Slice4DInputArrays extends NamedArrayMap {
  var x: Array4D[DataType] = js.native
}

@js.native
trait Slice4DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array4D[DataType]] = js.native
}

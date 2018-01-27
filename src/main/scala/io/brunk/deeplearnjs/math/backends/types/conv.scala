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
import io.brunk.deeplearnjs.math.{ Array1D, Array4D, DataType }
import io.brunk.deeplearnjs.math.Conv_util.Conv2DInfo
import io.brunk.deeplearnjs.math.backends.Tape_types.TapeNodeInputGradientArrays
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }

import scala.scalajs.js

@js.native
trait Conv2DNode extends KernelNode {
  var inputAndArgs: Conv2DInputConfig = js.native
  var output: Array4D[DataType]       = js.native
  // var gradient: js.Function2[Array4D[DataType], Array4D[DataType], Conv2DGradientInputArrays] = js.native
}

@js.native
trait Conv2DInputConfig extends KernelInputConfig {
  var inputs: Conv2DInputArrays    = js.native
  var args: Conv2DInputConfig.Args = js.native
}

object Conv2DInputConfig {

  @js.native
  trait Args extends KernelInputConfig.Args {
    var convInfo: Conv2DInfo = js.native
  }
}

@js.native
trait Conv2DInputArrays extends NamedArrayMap {
  var x: Array4D[DataType]      = js.native
  var filter: Array4D[DataType] = js.native
  var bias: Array1D[DataType]   = js.native
}

@js.native
trait Conv2DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array4D[DataType]]      = js.native
  var filter: js.Function0[Array4D[DataType]] = js.native
  var bias: js.Function0[Array1D[DataType]]   = js.native
}

@js.native
trait Conv2DDerInputNode extends KernelNode {
  var inputAndArgs: Conv2DDerInputInputConfig = js.native
  var output: Array4D[DataType]               = js.native
  // var gradient: js.Function2[Array4D[DataType], Array4D[DataType], Conv2DDerInputGradientInputArrays] = js.native
}

@js.native
trait Conv2DDerInputInputConfig extends KernelInputConfig {
  var inputs: Conv2DDerInputInputArrays    = js.native
  var args: Conv2DDerInputInputConfig.Args = js.native
}

object Conv2DDerInputInputConfig {

  @js.native
  trait Args extends KernelInputConfig.Args {
    var convInfo: Conv2DInfo = js.native
  }
}

@js.native
trait Conv2DDerInputInputArrays extends NamedArrayMap {
  var dy: Array4D[DataType]     = js.native
  var filter: Array4D[DataType] = js.native
}

@js.native
trait Conv2DDerInputGradientInputArrays extends TapeNodeInputGradientArrays {
  var dy: js.Function0[Array4D[DataType]]     = js.native
  var filter: js.Function0[Array4D[DataType]] = js.native
}

@js.native
trait Conv2DDerFilterNode extends KernelNode {
  var inputAndArgs: Conv2DDerFilterInputConfig = js.native
  var output: Array4D[DataType]                = js.native
  // var gradient: js.Function2[Array4D[DataType], Array4D[DataType], Conv2DDerFilterGradientInputArrays] = js.native
}

@js.native
trait Conv2DDerFilterInputConfig extends KernelInputConfig {
  var inputs: Conv2DDerFilterInputArrays    = js.native
  var args: Conv2DDerFilterInputConfig.Args = js.native
}

object Conv2DDerFilterInputConfig {

  @js.native
  trait Args extends KernelInputConfig.Args {
    var convInfo: Conv2DInfo = js.native
  }
}

@js.native
trait Conv2DDerFilterInputArrays extends NamedArrayMap {
  var x: Array4D[DataType]  = js.native
  var dy: Array4D[DataType] = js.native
}

@js.native
trait Conv2DDerFilterGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array4D[DataType]]  = js.native
  var dy: js.Function0[Array4D[DataType]] = js.native
}

@js.native
trait Conv2DDerBiasNode extends KernelNode {
  var inputAndArgs: Conv2DDerBiasInputConfig = js.native
  var output: Array1D[DataType]              = js.native
  // var gradient: js.Function2[Array1D[DataType], Array1D[DataType], Conv2DDerBiasGradientInputArrays] = js.native
}

@js.native
trait Conv2DDerBiasInputConfig extends KernelInputConfig {
  var inputs: Conv2DDerBiasInputArrays = js.native
}

@js.native
trait Conv2DDerBiasInputArrays extends NamedArrayMap {
  var dy: Array4D[DataType] = js.native
}

@js.native
trait Conv2DDerBiasGradientInputArrays extends TapeNodeInputGradientArrays {
  var dy: js.Function0[Array4D[DataType]] = js.native
}

@js.native
trait DepthwiseConv2DNode extends KernelNode {
  var inputAndArgs: DepthwiseConv2DInputConfig = js.native
  var output: Array4D[DataType]                = js.native
  // var gradient: js.Function2[Array4D[DataType], Array4D[DataType], DepthwiseConv2DGradientInputArrays] = js.native
}

@js.native
trait DepthwiseConv2DInputConfig extends KernelInputConfig {
  var inputs: DepthwiseConv2DInputArrays    = js.native
  var args: DepthwiseConv2DInputConfig.Args = js.native
}

object DepthwiseConv2DInputConfig {

  @js.native
  trait Args extends KernelInputConfig.Args {
    var convInfo: Conv2DInfo = js.native
  }
}

@js.native
trait DepthwiseConv2DInputArrays extends NamedArrayMap {
  var x: Array4D[DataType]      = js.native
  var filter: Array4D[DataType] = js.native
}

@js.native
trait DepthwiseConv2DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array4D[DataType]]      = js.native
  var filter: js.Function0[Array4D[DataType]] = js.native
}

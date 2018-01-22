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
trait Conv2DNode extends KernelNode {
  var inputAndArgs: Conv2DInputConfig                                     = js.native
  var output: Array4D                                                     = js.native
  var gradient: js.Function2[Array4D, Array4D, Conv2DGradientInputArrays] = js.native
}

@js.native
trait Conv2DInputConfig extends KernelInputConfig {
  var inputs: Conv2DInputArrays    = js.native
  var args: Conv2DInputConfig.Args = js.native
}

object Conv2DInputConfig {

  @js.native
  trait Args extends js.Object {
    var convInfo: Conv2DInfo = js.native
  }
}

@js.native
trait Conv2DInputArrays extends NamedArrayMap {
  var x: Array4D      = js.native
  var filter: Array4D = js.native
  var bias: Array1D   = js.native
}

@js.native
trait Conv2DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array4D]      = js.native
  var filter: js.Function0[Array4D] = js.native
  var bias: js.Function0[Array1D]   = js.native
}

@js.native
trait Conv2DDerInputNode extends KernelNode {
  var inputAndArgs: Conv2DDerInputInputConfig                                     = js.native
  var output: Array4D                                                             = js.native
  var gradient: js.Function2[Array4D, Array4D, Conv2DDerInputGradientInputArrays] = js.native
}

@js.native
trait Conv2DDerInputInputConfig extends KernelInputConfig {
  var inputs: Conv2DDerInputInputArrays    = js.native
  var args: Conv2DDerInputInputConfig.Args = js.native
}

object Conv2DDerInputInputConfig {

  @js.native
  trait Args extends js.Object {
    var convInfo: Conv2DInfo = js.native
  }
}

@js.native
trait Conv2DDerInputInputArrays extends NamedArrayMap {
  var dy: Array4D     = js.native
  var filter: Array4D = js.native
}

@js.native
trait Conv2DDerInputGradientInputArrays extends TapeNodeInputGradientArrays {
  var dy: js.Function0[Array4D]     = js.native
  var filter: js.Function0[Array4D] = js.native
}

@js.native
trait Conv2DDerFilterNode extends KernelNode {
  var inputAndArgs: Conv2DDerFilterInputConfig                                     = js.native
  var output: Array4D                                                              = js.native
  var gradient: js.Function2[Array4D, Array4D, Conv2DDerFilterGradientInputArrays] = js.native
}

@js.native
trait Conv2DDerFilterInputConfig extends KernelInputConfig {
  var inputs: Conv2DDerFilterInputArrays    = js.native
  var args: Conv2DDerFilterInputConfig.Args = js.native
}

object Conv2DDerFilterInputConfig {

  @js.native
  trait Args extends js.Object {
    var convInfo: Conv2DInfo = js.native
  }
}

@js.native
trait Conv2DDerFilterInputArrays extends NamedArrayMap {
  var x: Array4D  = js.native
  var dy: Array4D = js.native
}

@js.native
trait Conv2DDerFilterGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array4D]  = js.native
  var dy: js.Function0[Array4D] = js.native
}

@js.native
trait Conv2DDerBiasNode extends KernelNode {
  var inputAndArgs: Conv2DDerBiasInputConfig                                     = js.native
  var output: Array1D                                                            = js.native
  var gradient: js.Function2[Array1D, Array1D, Conv2DDerBiasGradientInputArrays] = js.native
}

@js.native
trait Conv2DDerBiasInputConfig extends KernelInputConfig {
  var inputs: Conv2DDerBiasInputArrays = js.native
}

@js.native
trait Conv2DDerBiasInputArrays extends NamedArrayMap {
  var dy: Array4D = js.native
}

@js.native
trait Conv2DDerBiasGradientInputArrays extends TapeNodeInputGradientArrays {
  var dy: js.Function0[Array4D] = js.native
}

@js.native
trait DepthwiseConv2DNode extends KernelNode {
  var inputAndArgs: DepthwiseConv2DInputConfig                                     = js.native
  var output: Array4D                                                              = js.native
  var gradient: js.Function2[Array4D, Array4D, DepthwiseConv2DGradientInputArrays] = js.native
}

@js.native
trait DepthwiseConv2DInputConfig extends KernelInputConfig {
  var inputs: DepthwiseConv2DInputArrays    = js.native
  var args: DepthwiseConv2DInputConfig.Args = js.native
}

object DepthwiseConv2DInputConfig {

  @js.native
  trait Args extends js.Object {
    var convInfo: Conv2DInfo = js.native
  }
}

@js.native
trait DepthwiseConv2DInputArrays extends NamedArrayMap {
  var x: Array4D      = js.native
  var filter: Array4D = js.native
}

@js.native
trait DepthwiseConv2DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array4D]      = js.native
  var filter: js.Function0[Array4D] = js.native
}

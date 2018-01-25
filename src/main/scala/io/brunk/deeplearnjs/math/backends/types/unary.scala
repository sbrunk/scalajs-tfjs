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
import io.brunk.deeplearnjs.math.NDArray
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }
import io.brunk.deeplearnjs.math.backends.Tape_types.TapeNodeInputGradientArrays

import scala.scalajs.js

@js.native
trait UnaryNode[T <: NDArray[DataType, Rank]] extends KernelNode {
  var inputAndArgs: UnaryInputConfig[T]                         = js.native
  var output: T                                                 = js.native
  var gradient: js.Function2[T, T, UnaryGradientInputArrays[T]] = js.native
}

@js.native
trait UnaryInputConfig[T <: NDArray[DataType, Rank]] extends KernelInputConfig {
  var inputs: UnaryInputArrays[T] = js.native
}

@js.native
trait UnaryInputArrays[T <: NDArray[DataType, Rank]] extends NamedArrayMap {
  var x: T = js.native
}

@js.native
trait UnaryGradientInputArrays[T <: NDArray[DataType, Rank]] extends TapeNodeInputGradientArrays {
  var x: js.Function0[T] = js.native
}

@js.native
trait LeakyReluNode[T <: NDArray[DataType, Rank]] extends KernelNode {
  var inputAndArgs: LeakyReluInputConfig[T]                     = js.native
  var output: T                                                 = js.native
  var gradient: js.Function2[T, T, UnaryGradientInputArrays[T]] = js.native
}

@js.native
trait LeakyReluInputConfig[T <: NDArray[DataType, Rank]] extends KernelInputConfig {
  var inputs: UnaryInputArrays[T]     = js.native
  var args: LeakyReluInputConfig.Args = js.native
}

object LeakyReluInputConfig {

  @js.native
  trait Args extends js.Object {
    var alpha: Double = js.native
  }
}

@js.native
trait StepNode[T <: NDArray[DataType, Rank]] extends KernelNode {
  var inputAndArgs: StepInputConfig[T]                          = js.native
  var output: T                                                 = js.native
  var gradient: js.Function2[T, T, UnaryGradientInputArrays[T]] = js.native
}

@js.native
trait StepInputConfig[T <: NDArray[DataType, Rank]] extends KernelInputConfig {
  var inputs: UnaryInputArrays[T] = js.native
  var args: StepInputConfig.Args  = js.native
}

object StepInputConfig {

  @js.native
  trait Args extends js.Object {
    var alpha: Double = js.native
  }
}

@js.native
trait ClipNode[T <: NDArray[DataType, Rank]] extends KernelNode {
  var inputAndArgs: ClipInputConfig[T]                          = js.native
  var output: T                                                 = js.native
  var gradient: js.Function2[T, T, UnaryGradientInputArrays[T]] = js.native
}

@js.native
trait ClipInputConfig[T <: NDArray[DataType, Rank]] extends KernelInputConfig {
  var inputs: UnaryInputArrays[T] = js.native
  var args: ClipInputConfig.Args  = js.native
}

object ClipInputConfig {

  @js.native
  trait Args extends js.Object {
    var min: Double = js.native
    var max: Double = js.native
  }
}

@js.native
trait TransposeNode[T <: NDArray[DataType, Rank]] extends KernelNode {
  var inputAndArgs: TransposeInputConfig[T]                     = js.native
  var output: T                                                 = js.native
  var gradient: js.Function2[T, T, UnaryGradientInputArrays[T]] = js.native
}

@js.native
trait TransposeInputConfig[T <: NDArray[DataType, Rank]] extends KernelInputConfig {
  var inputs: UnaryInputArrays[T]     = js.native
  var args: TransposeInputConfig.Args = js.native
}

object TransposeInputConfig {

  @js.native
  trait Args extends js.Object {
    var perm: js.Array[Double] = js.native
  }
}

@js.native
trait TileNode[T <: NDArray[DataType, Rank]] extends KernelNode {
  var inputAndArgs: TileInputConfig[T]                          = js.native
  var output: T                                                 = js.native
  var gradient: js.Function2[T, T, UnaryGradientInputArrays[T]] = js.native
}

@js.native
trait TileInputConfig[T <: NDArray[DataType, Rank]] extends KernelInputConfig {
  var inputs: UnaryInputArrays[T] = js.native
  var args: TileInputConfig.Args  = js.native
}

object TileInputConfig {

  @js.native
  trait Args extends js.Object {
    var reps: js.Array[Double] = js.native
  }
}

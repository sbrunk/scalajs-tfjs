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

package io.brunk.deeplearnjs.math.backends

import io.brunk.deeplearnjs.Util.NamedArrayMap
import io.brunk.deeplearnjs.math.{ DataType, NDArray, Rank }
import io.brunk.deeplearnjs.math.backends.Tape_types.{
  TapeNodeInputGradientArrays,
  TapeNodeOutput,
  TapeNodeType
}

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait TapeNode[T <: TapeNodeOutput] extends js.Object {
  var id: Double
  var `type`: TapeNodeType
  var name: String
  var inputAndArgs: TapeNodeInputConfig
  var output: T
  var gradient: js.Function2[NDArray[DataType, Rank] | NamedArrayMap,
                             T,
                             TapeNodeInputGradientArrays]
}

@js.native
trait TapeNodeInputConfig extends js.Object {
  var inputs: NamedArrayMap
}

@js.native
trait KernelNode extends TapeNode[NDArray[DataType, Rank]] {
  var kernel: String
  var inputAndArgs: KernelInputConfig
  var output: NDArray[DataType, Rank]
}

@js.native
trait KernelInputConfig extends TapeNodeInputConfig {
  var inputs: NamedArrayMap
  var args: KernelInputConfig.Args
}

object KernelInputConfig {

  @js.native
  trait Args extends js.Object {
    @JSBracketAccess
    def apply(argName: String): js.Any = js.native
    @JSBracketAccess
    def update(argName: String, v: js.Any): Unit = js.native
  }
}

@js.native
@JSGlobalScope
object Tape_types extends js.Object {
  type Tape = js.Array[TapeNode[TapeNodeOutput]]
  //type TapeNodeOutput = NDArray[DataType, Rank] | NamedArrayMap
  type TapeNodeOutput = NDArray[DataType, Rank]
  type TapeNodeType   = String
  //type TapeNodeInputGradientArrays = js.Dictionary[js.Function0[NDArray[DataType, Rank]]]
  @js.native
  trait TapeNodeInputGradientArrays extends js.Object {
    @JSBracketAccess
    def apply(inputName: String): js.Function0[NDArray[DataType, Rank]] = js.native
    @JSBracketAccess
    def update(inputName: String, v: js.Function0[NDArray[DataType, Rank]]): Unit = js.native
  }
}

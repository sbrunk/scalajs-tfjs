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

import scala.scalajs.js
import js.annotation._
import js.|

package tape_types {

  @js.native
  trait TapeNode[T <: TapeNodeOutput] extends js.Object {
    var id: Double                                                                      = js.native
    var `type`: TapeNodeType                                                            = js.native
    var name: String                                                                    = js.native
    var inputAndArgs: TapeNodeInputConfig                                               = js.native
    var output: T                                                                       = js.native
    var gradient: js.Function2[NDArray | NamedArrayMap, T, TapeNodeInputGradientArrays] = js.native
  }

  @js.native
  trait TapeNodeInputConfig extends js.Object {
    var inputs: NamedArrayMap = js.native
  }

  @js.native
  trait KernelNode extends TapeNode[NDArray] {
    var kernel: String                  = js.native
    var inputAndArgs: KernelInputConfig = js.native
    var output: NDArray                 = js.native
  }

  @js.native
  trait KernelInputConfig extends TapeNodeInputConfig {
    var inputs: NamedArrayMap        = js.native
    var args: KernelInputConfig.Args = js.native
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
    type Tape                        = js.Array[TapeNode[TapeNodeOutput]]
    type TapeNodeOutput              = NDArray | NamedArrayMap
    type TapeNodeType                = String
    type TapeNodeInputGradientArrays = js.Dictionary[js.Function0[NDArray]]
  }

}
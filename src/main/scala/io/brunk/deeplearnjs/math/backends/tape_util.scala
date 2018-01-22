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

import io.brunk.deeplearnjs.math.NDArray
import io.brunk.deeplearnjs.math.backends.Tape_types.Tape

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.{ Promise, | }

@js.native
@JSGlobalScope
object Tape_util extends js.Object {
  def getFilteredNodesXToY(tape: Tape, xs: js.Array[NDArray], y: NDArray): Tape = js.native
  def backpropagateGradients(arrayAccumulatedGradientMap: js.Any, filteredTape: Tape): Unit =
    js.native
  def computeInputs(tape: Tape): js.Dictionary[NDArray] = js.native
  type ScopeResultImmediate = Unit | NDArray | js.Array[NDArray] | js.Dictionary[NDArray]
  type ScopeResult          = ScopeResultImmediate | Promise[ScopeResultImmediate]
  def extractNDArraysFromScopeResult(result: ScopeResultImmediate): js.Array[NDArray] = js.native
  def stripUndefinedInputsFromInputConfig(config: TapeNodeInputConfig): TapeNodeInputConfig =
    js.native
}

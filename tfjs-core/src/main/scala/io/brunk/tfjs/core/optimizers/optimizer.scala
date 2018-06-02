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

package io.brunk.tfjs.core.optimizers

import io.brunk.tfjs.core.TensorModule.{Scalar, TensorND}
import io.brunk.tfjs.core.{NamedTensorMap, Rank, Variable}

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
abstract class Optimizer extends io.brunk.tfjs.core.Serializable {
  type T <: NamedTensorMap
  def minimize(
      f: js.Function0[Scalar],
      returnCost: Boolean = ???,
      varList: js.Array[Variable[Rank]] = ???
  ): Scalar | Null = js.native
  def computeGradients(f: js.Function0[Scalar], varList: js.Array[Variable[Rank]] = ???): js.Any =
    js.native
  def applyGradients(variableGradients: T): Unit
}

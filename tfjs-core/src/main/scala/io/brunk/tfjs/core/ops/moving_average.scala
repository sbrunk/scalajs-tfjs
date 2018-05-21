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

package io.brunk.tfjs.core.ops

import io.brunk.tfjs.core.TensorModule.{Scalar, TensorND}

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class MovingAverageOps extends js.Object {}

@js.native
@JSGlobal
object MovingAverageOps extends js.Object {
  def movingAverage[T <: TensorND](
      v: T,
      x: T,
      decay: Double | Scalar,
      step: Double | Scalar = ???,
      zeroDebias: Boolean = ???
  ): T = js.native
}

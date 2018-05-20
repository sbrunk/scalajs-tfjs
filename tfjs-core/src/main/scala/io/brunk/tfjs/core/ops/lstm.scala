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

import io.brunk.tfjs.core.TensorModule.{Scalar, Tensor1D, Tensor2D}
import io.brunk.tfjs.core.ops.Lstm.LSTMCellFunc

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class LSTMOps extends js.Object {}

@js.native
@JSGlobal
object LSTMOps extends js.Object {
  def multiRNNCell(
      lstmCells: js.Array[LSTMCellFunc],
      data: Tensor2D,
      c: js.Array[Tensor2D],
      h: js.Array[Tensor2D]
  ): js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]] =
    js.native
  def basicLSTMCell(
      forgetBias: Scalar,
      lstmKernel: Tensor2D,
      lstmBias: Tensor1D,
      data: Tensor2D,
      c: Tensor2D,
      h: Tensor2D
  ): js.Tuple2[Tensor2D, Tensor2D] = js.native
}

@js.native
@JSGlobalScope
object Lstm extends js.Object {
  type LSTMCellFunc = js.Any
}

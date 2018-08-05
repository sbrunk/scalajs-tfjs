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

import scala.scalajs.js
import js.annotation._
import js.|

package lstm {

@js.native
@JSGlobalScope
object Lstm extends js.Object {
  type LSTMCellFunc = js.Any
  def multiRNNCell_(lstmCells: js.Array[LSTMCellFunc], data: Tensor2D | TensorLike, c: js.Array[Tensor2D] | js.Array[TensorLike], h: js.Array[Tensor2D] | js.Array[TensorLike]): js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]] = js.native
  def basicLSTMCell_(forgetBias: Scalar | TensorLike, lstmKernel: Tensor2D | TensorLike, lstmBias: Tensor1D | TensorLike, data: Tensor2D | TensorLike, c: Tensor2D | TensorLike, h: Tensor2D | TensorLike): js.Tuple2[Tensor2D, Tensor2D] = js.native
  val basicLSTMCell: basicLSTMCell_.type = js.native
  val multiRNNCell: multiRNNCell_.type = js.native
}

}

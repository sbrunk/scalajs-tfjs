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

package matmul {

  @js.native
  @JSGlobalScope
  object Matmul extends js.Object {
    def matMul_(
        a: Tensor2D | TensorLike,
        b: Tensor2D | TensorLike,
        transposeA: Boolean = ???,
        transposeB: Boolean = ???
    ): Tensor2D                                                                       = js.native
    def outerProduct_(v1: Tensor1D | TensorLike, v2: Tensor1D | TensorLike): Tensor2D = js.native
    def dot_(t1: Tensor | TensorLike, t2: Tensor | TensorLike): Tensor                = js.native
    val matMul: matMul_.type                                                          = js.native
    val dot: dot_.type                                                                = js.native
    val outerProduct: outerProduct_.type                                              = js.native
  }

}

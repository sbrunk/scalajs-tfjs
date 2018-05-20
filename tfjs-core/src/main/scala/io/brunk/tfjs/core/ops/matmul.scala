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

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class MatmulOps extends js.Object {}

@js.native
@JSGlobal
object MatmulOps extends js.Object {
  def matMul(
      a: Tensor2D,
      b: Tensor2D,
      transposeA: Boolean = ???,
      transposeB: Boolean = ???
  ): Tensor2D                                                    = js.native
  def vectorTimesMatrix(v: Tensor1D, matrix: Tensor2D): Tensor1D = js.native
  def matrixTimesVector(matrix: Tensor2D, v: Tensor1D): Tensor1D = js.native
  def dotProduct(v1: Tensor1D, v2: Tensor1D): Scalar             = js.native
  def outerProduct(v1: Tensor1D, v2: Tensor1D): Tensor2D         = js.native
}

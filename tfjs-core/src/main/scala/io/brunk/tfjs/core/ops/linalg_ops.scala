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

import io.brunk.tfjs.core.TensorModule.{Tensor1D, Tensor2D}

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class LinalgOps extends js.Object {}

@js.native
@JSGlobal
object LinalgOps extends js.Object {
  def gramSchmidt(xs: js.Array[Tensor1D] | Tensor2D): js.Array[Tensor1D] | Tensor2D = js.native
}
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

package io.brunk.tfjs.core.kernels

import scala.scalajs.js
import js.annotation._

import io.brunk.tfjs.core.DataType
import io.brunk.tfjs.core.Types.TypedArray
import io.brunk.tfjs.core.TensorModule.TensorND


@js.native
@JSGlobalScope
object Topk_impl extends js.Object {
  def topkImpl[T <: TensorND](x: TypedArray, xShape: js.Array[Double], xDtype: DataType, k: Double, sorted: Boolean): js.Tuple2[T, T] = js.native
}

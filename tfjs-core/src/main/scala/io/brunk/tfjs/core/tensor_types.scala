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

package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|
import _root_.io.brunk.tfjs.core.TensorModule.TensorND
import Tensor_types.TensorContainer


@js.native
trait TensorContainerObject extends js.Object {
  @JSBracketAccess
  def apply(x: String): TensorContainer = js.native
  @JSBracketAccess
  def update(x: String, v: TensorContainer): Unit = js.native
}

@js.native
trait TensorContainerArray extends js.Array[TensorContainer] {
}

@js.native
trait TensorInfo extends js.Object {
  var name: String = js.native
  var shape: js.Array[Double] = js.native
  var dtype: DataType = js.native
}

@js.native
@JSGlobalScope
object Tensor_types extends js.Object {
  type NamedTensorMap = js.Dictionary[TensorND]
  type NamedVariableMap = js.Dictionary[Variable[Rank]]
  type TensorContainer = Unit | TensorND | String | Double | Boolean | TensorContainerObject | TensorContainerArray
}

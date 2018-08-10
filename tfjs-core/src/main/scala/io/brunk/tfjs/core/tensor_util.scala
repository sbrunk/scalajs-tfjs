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
import TensorModule.TensorND
import _root_.io.brunk.tfjs.core.Tensor_types.TensorContainer

@js.native
@JSGlobalScope
object Tensor_util extends js.Object {
  def assertTypesMatch(a: TensorND, b: TensorND): Unit                          = js.native
  def isTensorInList(tensor: TensorND, tensorList: js.Array[TensorND]): Boolean = js.native
  def flattenNameArrayMap(
    nameArrayMap: TensorND | NamedTensorMap,
    keys: js.Array[String] = ???
  ): js.Array[TensorND] = js.native
  def unflattenToNameArrayMap(
    keys: js.Array[String],
    flatArrays: js.Array[TensorND]
  ): NamedTensorMap                                                    = js.native
  def getTensorsInContainer(result: TensorContainer): js.Array[TensorND] = js.native
}

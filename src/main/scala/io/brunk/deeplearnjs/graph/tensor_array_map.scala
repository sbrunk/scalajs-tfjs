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

package io.brunk.deeplearnjs.graph

import io.brunk.deeplearnjs.math.{ NDArray, NDArrayMath }

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
@JSGlobal
abstract class TensorArrayMapBase extends js.Object {
  def get(tensor: Tensor, skipChecks: Boolean = ???): NDArray = js.native
  def delete(tensor: Tensor): Unit                            = js.native
  def nullify(tensor: Tensor): Unit                           = js.native
  def disposeArray(tensor: Tensor): Unit                      = js.native
  def size(): Double                                          = js.native
  def dispose(): Unit                                         = js.native
  def hasNullArray(tensor: Tensor): Boolean                   = js.native
  protected var dict: js.Any                                  = js.native
}

@js.native
@JSGlobal
class TensorArrayMap extends TensorArrayMapBase {
  def set(tensor: Tensor, array: NDArray | Null): Unit = js.native
}

@js.native
@JSGlobal
class SummedTensorArrayMap protected () extends TensorArrayMapBase {
  def this(math: NDArrayMath) = this()
  def add(tensor: Tensor, array: NDArray): Unit = js.native
}

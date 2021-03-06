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

package io.brunk.tfjs.layers.engine

import io.brunk.tfjs.core.{DataType, serialization}
import io.brunk.tfjs.layers.Types.{Kwargs, Shape}
import io.brunk.tfjs.core.TensorModule.TensorND

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait InputLayerConfig extends js.Object {
  var inputShape: Shape      = js.native
  var batchSize: Double      = js.native
  var batchInputShape: Shape = js.native
  var dtype: DataType        = js.native
  var sparse: Boolean        = js.native
  var name: String           = js.native
}

@js.native
@JSGlobal
class InputLayer protected () extends Layer {
  def this(config: InputLayerConfig) = this()
  var sparse: Boolean = js.native
// until we have real union types aka dotty, we have to stick with the wider type of the base class
//  @JSName("apply")
//  override def apply(
//      inputs: TensorND | js.Array[TensorND] | SymbolicTensor | js.Array[SymbolicTensor],
//      kwargs: Kwargs = ???
//  ): TensorND | js.Array[TensorND] | SymbolicTensor = js.native
  override def getConfig(): serialization.ConfigDict     = js.native
}

@js.native
@JSGlobal
object InputLayer extends js.Object {
  def className: String = js.native
}

@js.native
trait InputConfig extends js.Object {
  var shape: Shape      = js.native
  var batchShape: Shape = js.native
  var name: String      = js.native
  var dtype: DataType   = js.native
  var sparse: Boolean   = js.native
}

@js.native
@JSGlobalScope
object Input_layer extends js.Object {
  def Input(config: InputConfig): SymbolicTensor = js.native
}

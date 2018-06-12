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

package io.brunk.tfjs.layers.layers

import io.brunk.tfjs.layers.SymbolicTensor
import io.brunk.tfjs.layers.Types.{Kwargs, Shape}
import io.brunk.tfjs.layers.engine.{Layer, LayerConfig}

import scala.scalajs.js
import js.annotation._
import js.|
import io.brunk.tfjs.tf._


@js.native
@JSGlobal
abstract class Merge protected () extends Layer {
  def this(config: LayerConfig = ???) = this()
  protected var reshapeRequired: Boolean = js.native
  def mergeFunction(inputs: js.Array[TensorND]): TensorND = js.native
  override def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  override def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
}

@js.native
@JSGlobal
class Add protected () extends Merge {
  def this(config: LayerConfig = ???) = this()
  override def mergeFunction(inputs: js.Array[TensorND]): TensorND = js.native
}

@js.native
@JSGlobal
object Add extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class Multiply protected () extends Merge {
  def this(config: LayerConfig = ???) = this()
  override def mergeFunction(inputs: js.Array[TensorND]): TensorND = js.native
}

@js.native
@JSGlobal
object Multiply extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class Average protected () extends Merge {
  def this(config: LayerConfig = ???) = this()
  override def mergeFunction(inputs: js.Array[TensorND]): TensorND = js.native
}

@js.native
@JSGlobal
object Average extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class Maximum protected () extends Merge {
  def this(config: LayerConfig = ???) = this()
  override def mergeFunction(inputs: js.Array[TensorND]): TensorND = js.native
}

@js.native
@JSGlobal
object Maximum extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class Minimum protected () extends Merge {
  def this(config: LayerConfig = ???) = this()
  override def mergeFunction(inputs: js.Array[TensorND]): TensorND = js.native
}

@js.native
@JSGlobal
object Minimum extends js.Object {
  var className: String = js.native
}

@js.native
trait ConcatenateLayerConfig extends LayerConfig {
  var axis: Double = js.native
}

@js.native
@JSGlobal
class Concatenate protected () extends Merge {
  def this(config: ConcatenateLayerConfig = ???) = this()
  def DEFAULT_AXIS: Double = js.native
  override def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  override def mergeFunction(inputs: js.Array[TensorND]): TensorND = js.native
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
}

@js.native
@JSGlobal
object Concatenate extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobalScope
object Merge extends js.Object {
  def add(config: js.Array[SymbolicTensor] | js.Array[TensorND] | LayerConfig = ???): Layer | SymbolicTensor | TensorND = js.native
  def multiply(config: js.Array[SymbolicTensor] | js.Array[TensorND] | LayerConfig = ???): Layer | SymbolicTensor | TensorND = js.native
  def average(config: js.Array[SymbolicTensor] | js.Array[TensorND] | LayerConfig = ???): Layer | SymbolicTensor | TensorND = js.native
  def maximum(config: js.Array[SymbolicTensor] | js.Array[TensorND] | LayerConfig = ???): Layer | SymbolicTensor | TensorND = js.native
  def minimum(config: js.Array[SymbolicTensor] | js.Array[TensorND] | LayerConfig = ???): Layer | SymbolicTensor | TensorND = js.native
  def concatenate(config: js.Array[SymbolicTensor] | js.Array[TensorND] | ConcatenateLayerConfig = ???): Layer | SymbolicTensor | TensorND = js.native
}

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

import io.brunk.tfjs.layers.Types.{Kwargs, Shape}
import io.brunk.tfjs.layers.engine.{Layer, LayerConfig}

import scala.scalajs.js
import js.annotation._
import js.|
import io.brunk.tfjs.tf._


@js.native
trait LeakyReLULayerConfig extends LayerConfig {
  var alpha: Double = js.native
}

@js.native
@JSGlobal
class LeakyReLU protected () extends Layer {
  def this(config: LeakyReLULayerConfig = ???) = this()
  def alpha: Double = js.native
  def DEFAULT_ALPHA: Double = js.native
  def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object LeakyReLU extends js.Object {
  var className: String = js.native
}

@js.native
trait ELULayerConfig extends LayerConfig {
  var alpha: Double = js.native
}

@js.native
@JSGlobal
class ELU protected () extends Layer {
  def this(config: ELULayerConfig = ???) = this()
  def alpha: Double = js.native
  def DEFAULT_ALPHA: Double = js.native
  def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object ELU extends js.Object {
  var className: String = js.native
}

@js.native
trait ThresholdedReLULayerConfig extends LayerConfig {
  var theta: Double = js.native
}

@js.native
@JSGlobal
class ThresholdedReLU protected () extends Layer {
  def this(config: ThresholdedReLULayerConfig = ???) = this()
  def theta: Double = js.native
  def DEFAULT_THETA: Double = js.native
  def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object ThresholdedReLU extends js.Object {
  var className: String = js.native
}

@js.native
trait SoftmaxLayerConfig extends LayerConfig {
  var axis: Double = js.native
}

@js.native
@JSGlobal
class Softmax protected () extends Layer {
  def this(config: SoftmaxLayerConfig = ???) = this()
  def axis: Double = js.native
  def softmax: js.Function2[TensorND, Double, TensorND] = js.native
  def DEFAULT_AXIS: Double = js.native
  def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Softmax extends js.Object {
  var className: String = js.native
}

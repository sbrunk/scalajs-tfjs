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

import io.brunk.tfjs.layers.Common.{DataFormat, PaddingMode, PoolMode}
import io.brunk.tfjs.layers.Types.{Kwargs, Shape}
import io.brunk.tfjs.layers.engine.{Layer, LayerConfig}
import io.brunk.tfjs.tf._

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait Pooling1DLayerConfig extends LayerConfig {
  var poolSize: Double = js.native
  var strides: Double = js.native
  var padding: PaddingMode = js.native
}

@js.native
@JSGlobal
abstract class Pooling1D protected () extends Layer {
  def this(config: Pooling1DLayerConfig) = this()
  protected def poolSize: Tuple1[Double] = js.native
  protected def strides: Tuple1[Double] = js.native
  protected def padding: PaddingMode = js.native
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def poolingFunction(inputs: TensorND, poolSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], padding: PaddingMode, dataFormat: DataFormat): TensorND
  override def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
class MaxPooling1D protected () extends Pooling1D {
  def this(config: Pooling1DLayerConfig) = this()
  def poolingFunction(inputs: TensorND, poolSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], padding: PaddingMode, dataFormat: DataFormat): TensorND = js.native
}

@js.native
@JSGlobal
object MaxPooling1D extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class AveragePooling1D protected () extends Pooling1D {
  def this(config: Pooling1DLayerConfig) = this()
  def poolingFunction(inputs: TensorND, poolSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], padding: PaddingMode, dataFormat: DataFormat): TensorND = js.native
}

@js.native
@JSGlobal
object AveragePooling1D extends js.Object {
  var className: String = js.native
}

@js.native
trait Pooling2DLayerConfig extends LayerConfig {
  var poolSize: Double | js.Tuple2[Double, Double] = js.native
  var strides: js.Tuple2[Double, Double] = js.native
  var padding: PaddingMode = js.native
  var dataFormat: DataFormat = js.native
}

@js.native
@JSGlobal
abstract class Pooling2D protected () extends Layer {
  def this(config: Pooling2DLayerConfig) = this()
  protected def poolSize: js.Tuple2[Double, Double] = js.native
  protected def strides: js.Tuple2[Double, Double] = js.native
  protected def padding: PaddingMode = js.native
  protected def dataFormat: DataFormat = js.native
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def poolingFunction(inputs: TensorND, poolSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], padding: PaddingMode, dataFormat: DataFormat): TensorND
  override def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
class MaxPooling2D protected () extends Pooling2D {
  def this(config: Pooling2DLayerConfig) = this()
  def poolingFunction(inputs: TensorND, poolSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], padding: PaddingMode, dataFormat: DataFormat): TensorND = js.native
}

@js.native
@JSGlobal
object MaxPooling2D extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class AveragePooling2D protected () extends Pooling2D {
  def this(config: Pooling2DLayerConfig) = this()
  def poolingFunction(inputs: TensorND, poolSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], padding: PaddingMode, dataFormat: DataFormat): TensorND = js.native
}

@js.native
@JSGlobal
object AveragePooling2D extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
abstract class GlobalPooling1D protected () extends Layer {
  def this(config: LayerConfig) = this()
  def computeOutputShape(inputShape: Shape): Shape = js.native
  override def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
}

@js.native
@JSGlobal
class GlobalAveragePooling1D protected () extends GlobalPooling1D {
  def this(config: LayerConfig) = this()
  override def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
}

@js.native
@JSGlobal
object GlobalAveragePooling1D extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class GlobalMaxPooling1D protected () extends GlobalPooling1D {
  def this(config: LayerConfig) = this()
  override def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
}

@js.native
@JSGlobal
object GlobalMaxPooling1D extends js.Object {
  var className: String = js.native
}

@js.native
trait GlobalPooling2DLayerConfig extends LayerConfig {
  var dataFormat: DataFormat = js.native
}

@js.native
@JSGlobal
abstract class GlobalPooling2D protected () extends Layer {
  def this(config: GlobalPooling2DLayerConfig) = this()
  protected var dataFormat: DataFormat = js.native
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  override def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
class GlobalAveragePooling2D extends GlobalPooling2D {
  override def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
}

@js.native
@JSGlobal
object GlobalAveragePooling2D extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class GlobalMaxPooling2D extends GlobalPooling2D {
  override def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
}

@js.native
@JSGlobal
object GlobalMaxPooling2D extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobalScope
object Pooling extends js.Object {
  def pool2d(x: TensorND, poolSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double] = ???, padding: PaddingMode = ???, dataFormat: DataFormat = ???, poolMode: PoolMode = ???): TensorND = js.native
}

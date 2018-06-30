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

import io.brunk.tfjs.layers.Common.DataFormat
import io.brunk.tfjs.layers.Types.{ Kwargs, Shape }
import io.brunk.tfjs.layers.engine.{ Layer, LayerConfig }

import scala.scalajs.js
import js.annotation._
import js.|
import io.brunk.tfjs.tf._
@js.native
trait ZeroPadding2DLayerConfig extends LayerConfig {
  var padding: Double | js.Tuple2[Double, Double] | js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[
    Double,
    Double
  ]]                         = js.native
  var dataFormat: DataFormat = js.native
}

@js.native
@JSGlobal
class ZeroPadding2D protected () extends Layer {
  def this(config: ZeroPadding2DLayerConfig = ???) = this()
  def dataFormat: DataFormat                                                   = js.native
  def padding: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] =
    js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                   = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object ZeroPadding2D extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobalScope
object Padding extends js.Object {
  def temporalPadding(x: TensorND, padding: js.Tuple2[Double, Double] = ???): TensorND = js.native
  def spatial2dPadding(
      x: TensorND,
      padding: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = ???,
      dataFormat: DataFormat = ???
  ): TensorND = js.native
}

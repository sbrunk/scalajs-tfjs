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
import io.brunk.tfjs.layers.Constraints.ConstraintIdentifier
import io.brunk.tfjs.layers.{ Constraint, Initializer, Regularizer }
import io.brunk.tfjs.layers.Initializers.InitializerIdentifier
import io.brunk.tfjs.layers.Regularizers.RegularizerIdentifier
import io.brunk.tfjs.layers.Types.{ Kwargs, Shape }

import scala.scalajs.js
import js.annotation._
import js.|
import io.brunk.tfjs.tf.TensorND

@js.native
trait DepthwiseConv2DLayerConfig extends BaseConvLayerConfig {
  // can't override var and types don't match either
  // override var kernelSize: Double | js.Tuple2[Double, Double] = js.native
  var depthMultiplier: Double                                   = js.native
  var depthwiseInitializer: InitializerIdentifier | Initializer = js.native
  var depthwiseConstraint: ConstraintIdentifier | Constraint    = js.native
  var depthwiseRegularizer: RegularizerIdentifier | Regularizer = js.native
}

@js.native
@JSGlobal
class DepthwiseConv2D protected () extends Conv2D {
  def this(config: DepthwiseConv2DLayerConfig) = this()
  override def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND] = js.native
  override def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] =
    js.native
}

@js.native
@JSGlobal
object DepthwiseConv2D extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobalScope
object Convolutional_depthwise extends js.Object {
  def depthwiseConv2d(
      x: TensorND,
      depthwiseKernel: TensorND,
      strides: js.Tuple2[Double, Double] = ???,
      padding: String = ???,
      dataFormat: DataFormat = ???,
      dilationRate: js.Tuple2[Double, Double] = ???
  ): TensorND = js.native
}

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

import io.brunk.tfjs.layers.Constraints.ConstraintIdentifier
import io.brunk.tfjs.layers.{Constraint, Initializer, Regularizer}
import io.brunk.tfjs.layers.Initializers.InitializerIdentifier
import io.brunk.tfjs.layers.Regularizers.RegularizerIdentifier
import io.brunk.tfjs.layers.Types.{Kwargs, Shape}
import io.brunk.tfjs.layers.engine.{Layer, LayerConfig}

import scala.scalajs.js
import js.annotation._
import js.|
import io.brunk.tfjs.tf._


@js.native
trait BatchNormalizationLayerConfig extends LayerConfig {
  var axis: Double = js.native
  var momentum: Double = js.native
  var epsilon: Double = js.native
  var center: Boolean = js.native
  var scale: Boolean = js.native
  var betaInitializer: InitializerIdentifier | Initializer = js.native
  var gammaInitializer: InitializerIdentifier | Initializer = js.native
  var movingMeanInitializer: InitializerIdentifier | Initializer = js.native
  var movingVarianceInitializer: InitializerIdentifier | Initializer = js.native
  var betaConstraint: ConstraintIdentifier | Constraint = js.native
  var gammaConstraint: ConstraintIdentifier | Constraint = js.native
  var betaRegularizer: RegularizerIdentifier | Regularizer = js.native
  var gammaRegularizer: RegularizerIdentifier | Regularizer = js.native
}

@js.native
@JSGlobal
class BatchNormalization protected () extends Layer {
  def this(config: BatchNormalizationLayerConfig) = this()
  override def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  override def call(inputs: TensorND | js.Array[TensorND], kwargs: Kwargs): TensorND | js.Array[TensorND] = js.native
  override def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object BatchNormalization extends js.Object {
  var className: String = js.native
}

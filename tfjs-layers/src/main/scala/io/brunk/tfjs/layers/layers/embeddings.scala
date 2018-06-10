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
trait EmbeddingLayerConfig extends LayerConfig {
  var inputDim: Double = js.native
  var outputDim: Double = js.native
  var embeddingsInitializer: InitializerIdentifier | Initializer = js.native
  var embeddingsRegularizer: RegularizerIdentifier | Regularizer = js.native
  var activityRegularizer: RegularizerIdentifier | Regularizer = js.native
  var embeddingsConstraint: ConstraintIdentifier | Constraint = js.native
  var maskZero: Boolean = js.native
  var inputLength: Double | js.Array[Double] = js.native
}

@js.native
@JSGlobal
class Embedding protected () extends Layer {
  def this(config: EmbeddingLayerConfig) = this()
  def DEFAULT_EMBEDDINGS_INITIALIZER: InitializerIdentifier = js.native
  def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  def computeMask(inputs: Tensor | js.Array[Tensor], mask: Tensor | js.Array[Tensor] = ???): Tensor = js.native
  def computeOutputShape(inputShape: Shape | js.Array[Shape]): Shape | js.Array[Shape] = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object Embedding extends js.Object {
  var className: String = js.native
}

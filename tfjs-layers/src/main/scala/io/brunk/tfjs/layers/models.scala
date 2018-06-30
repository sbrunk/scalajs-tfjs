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

package io.brunk.tfjs.layers

import io.brunk.tfjs.core.io.types.{ IOHandler, WeightsManifestConfig }
import io.brunk.tfjs.layers.Types.{ Kwargs, Shape }
import io.brunk.tfjs.tf.{ Scalar, TensorND }
import io.brunk.tfjs.tf.serialization
import io.brunk.tfjs.layers.engine._

import scala.scalajs.js
import js.annotation._
import js.{ Promise, | }

@js.native
trait ModelAndWeightsConfig extends js.Object {
  var modelTopology: JsonDict                = js.native
  var weightsManifest: WeightsManifestConfig = js.native
  var pathPrefix: String                     = js.native
}

@js.native
trait SequentialConfig extends js.Object {
  var layers: js.Array[Layer] = js.native
  var name: String            = js.native
}

@js.native
@JSImport("@tensorflow/tfjs-layers", "Sequential")
class Sequential protected () extends Model {
  def this(config: SequentialConfig = ???) = this()
  def add(layer: Layer): Unit = js.native
  def pop(): Unit             = js.native
  override def call(
      inputs: TensorND | js.Array[TensorND],
      kwargs: Kwargs
  ): TensorND | js.Array[TensorND]                           = js.native
  def build(inputShape: Shape = ???): Unit                   = js.native
  override def setWeights(weights: js.Array[TensorND]): Unit = js.native
  // cannot override a mutable variable
  // override var updatable: Boolean = js.native
  override def evaluate(
      x: TensorND | js.Array[TensorND],
      y: TensorND | js.Array[TensorND],
      config: ModelEvaluateConfig = ???
  ): Scalar | js.Array[Scalar] = js.native
  override def predict(
      x: TensorND | js.Array[TensorND],
      config: ModelPredictConfig = ???
  ): TensorND | js.Array[TensorND]                                        = js.native
  override def predictOnBatch(x: TensorND): TensorND | js.Array[TensorND] = js.native
  override def compile(config: ModelCompileConfig): Unit                  = js.native
  override def fit(
      x: TensorND | js.Array[TensorND] | js.Dictionary[TensorND],
      y: TensorND | js.Array[TensorND] | js.Dictionary[TensorND],
      config: ModelFitConfig = ???
  ): Promise[History] = js.native
  //def getConfig(): js.Dynamic = js.native TODO in TS we return a broader type in a subclass here. Check whether we can map that to Scala
  @JSName("getConfig")
  def getConfigAny(): js.Dynamic = js.native
}

@js.native
@JSImport("@tensorflow/tfjs-layers", "Sequential")
object Sequential extends js.Object {
  var className: String = js.native
  def fromConfig[T <: serialization.Serializable](
      cls: serialization.SerializableConstructor[T],
      config: serialization.ConfigDict
  ): T = js.native
}

@js.native
@JSGlobalScope
object Models extends js.Object {
  def modelFromJSON(
      modelAndWeightsConfig: ModelAndWeightsConfig,
      customObjects: serialization.ConfigDict = ???
  ): Promise[Model]                                                          = js.native
  def loadModelInternal(pathOrIOHandler: String | IOHandler): Promise[Model] = js.native
  def loadModelFromIOHandler(
      handler: IOHandler,
      customObjects: serialization.ConfigDict = ???
  ): Promise[Model]                                              = js.native
  def loadModelFromPath(modelConfigPath: String): Promise[Model] = js.native
}

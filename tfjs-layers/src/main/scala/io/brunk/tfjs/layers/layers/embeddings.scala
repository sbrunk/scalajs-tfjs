package io.brunk.tfjs.layers.layers

import scala.scalajs.js
import js.annotation._
import js.|

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

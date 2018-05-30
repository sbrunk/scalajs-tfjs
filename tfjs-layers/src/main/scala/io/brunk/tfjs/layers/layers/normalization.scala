package io.brunk.tfjs.layers.layers

import scala.scalajs.js
import js.annotation._
import js.|

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
  def build(inputShape: Shape | js.Array[Shape]): Unit = js.native
  def call(inputs: Tensor | js.Array[Tensor], kwargs: Kwargs): Tensor | js.Array[Tensor] = js.native
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
object BatchNormalization extends js.Object {
  var className: String = js.native
}

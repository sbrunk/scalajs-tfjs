package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Index extends js.Object {
  val model: ModelExports.model.type = js.native
  val sequential: ModelExports.sequential.type = js.native
  val loadModel: ModelExports.loadModel.type = js.native
  val input: ModelExports.input.type = js.native
  val layers: LayerExports.type = js.native
  val constraints: ConstraintExports.type = js.native
  val initializers: InitializerExports.type = js.native
  val metrics: MetricExports.type = js.native
  val regularizers: RegularizerExports.type = js.native
}

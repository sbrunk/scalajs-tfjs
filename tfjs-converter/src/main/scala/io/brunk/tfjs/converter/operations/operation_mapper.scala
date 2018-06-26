package io.brunk.tfjs.converter.operations

import scala.scalajs.js
import js.annotation._
import js.|

package operation_mapper {

@js.native
@JSGlobal
class OperationMapper extends js.Object {
  def transformGraph(graph: tensorflow.IGraphDef): Graph = js.native
}

@js.native
@JSGlobal
object OperationMapper extends js.Object {
  def Instance: OperationMapper = js.native
}

}

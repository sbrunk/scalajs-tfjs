package io.brunk.tfjs.converter.operations.executors

import scala.scalajs.js
import js.annotation._
import js.|

package utils {

@js.native
@JSGlobalScope
object Utils extends js.Object {
  def getParamValue(paramName: String, node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): ValueType = js.native
  def getTensor(name: String, tensorsMap: NamedTensorsMap, context: ExecutionContext): tfc.Tensor = js.native
  def getNodeNameAndIndex(inputName: String, context: ExecutionContext = ???): js.Tuple2[String, Double] = js.native
  def parseNodeName(name: String): js.Tuple2[String, Double] = js.native
  def split(arr: js.Array[Double], size: Double): js.Array[js.Array[Double]] = js.native
}

}

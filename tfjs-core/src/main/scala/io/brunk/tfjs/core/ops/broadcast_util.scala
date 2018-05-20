package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package broadcast_util {

@js.native
@JSGlobalScope
object Broadcast_util extends js.Object {
  def getBroadcastDims(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = js.native
  def getReductionAxes(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = js.native
  def broadcastDimsAreOuter(dims: js.Array[Double]): Boolean = js.native
  def assertAndGetBroadcastShape(shapeA: js.Array[Double], shapeB: js.Array[Double]): js.Array[Double] = js.native
}

}

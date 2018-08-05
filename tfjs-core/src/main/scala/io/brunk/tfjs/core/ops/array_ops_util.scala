package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package array_ops_util {

@js.native
@JSGlobalScope
object Array_ops_util extends js.Object {
  def getReshaped(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean = ???): js.Array[Double] = js.native
  def getPermuted(reshapedRank: Double, blockShapeRank: Double, batchToSpace: Boolean = ???): js.Array[Double] = js.native
  def getReshapedPermuted(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean = ???): js.Array[Double] = js.native
  def getSliceBeginCoords(crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] = js.native
  def getSliceSize(uncroppedShape: js.Array[Double], crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] = js.native
}

}

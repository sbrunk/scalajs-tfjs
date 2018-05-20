package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package reduce_util {

@js.native
trait ReduceInfo extends js.Object {
  var windowSize: Double = js.native
  var batchSize: Double = js.native
  var inSize: Double = js.native
}

@js.native
@JSGlobalScope
object Reduce_util extends js.Object {
  val PARALLELIZE_THRESHOLD: Int = js.native
  def computeOptimalWindowSize(inSize: Double): Double = js.native
}

}

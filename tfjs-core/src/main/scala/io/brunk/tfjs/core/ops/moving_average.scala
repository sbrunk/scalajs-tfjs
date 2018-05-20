package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package moving_average {

@js.native
@JSGlobal
class MovingAverageOps extends js.Object {
}

@js.native
@JSGlobal
object MovingAverageOps extends js.Object {
  def movingAverage[T <: Tensor](v: T, x: T, decay: Double | Scalar, step: Double | Scalar = ???, zeroDebias: Boolean = ???): T = js.native
}

}

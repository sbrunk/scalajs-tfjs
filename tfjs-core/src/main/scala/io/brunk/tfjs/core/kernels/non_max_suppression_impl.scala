package io.brunk.tfjs.core.kernels

import scala.scalajs.js
import js.annotation._
import js.|

package non_max_suppression_impl {

@js.native
@JSGlobalScope
object Non_max_suppression_impl extends js.Object {
  def nonMaxSuppressionImpl(boxes: TypedArray, scores: TypedArray, maxOutputSize: Double, iouThreshold: Double, scoreThreshold: Double): Tensor1D = js.native
}

}

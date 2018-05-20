package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package pool {

@js.native
@JSGlobal
class PoolOps extends js.Object {
}

@js.native
@JSGlobal
object PoolOps extends js.Object {
  def maxPool[T <: Tensor3D | Tensor4D](x: T, filterSize: js.Tuple2[Double, Double] | Double, strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dimRoundingMode: String = ???): T = js.native
  def maxPoolBackprop(dy: Tensor4D, input: Tensor4D, output: Tensor4D, filterSize: js.Tuple2[Double, Double] | Double, strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dimRoundingMode: String = ???): Tensor4D = js.native
  def avgPool[T <: Tensor3D | Tensor4D](x: T, filterSize: js.Tuple2[Double, Double] | Double, strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dimRoundingMode: String = ???): T = js.native
  def avgPoolBackprop[T <: Tensor3D | Tensor4D](dy: T, input: T, filterSize: js.Tuple2[Double, Double] | Double, strides: js.Tuple2[Double, Double] | Double, pad: String | Double): T = js.native
}

}

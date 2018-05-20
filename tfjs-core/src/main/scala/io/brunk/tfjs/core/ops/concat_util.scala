package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Concat_util extends js.Object {
  def assertParams(aShape: js.Array[Double], bShape: js.Array[Double], axis: Double): Unit = js.native
  def computeOutShape1D(x1Shape: js.Array[Double], x2Shape: js.Array[Double]): js.Array[Double] = js.native
  def computeOutShape(x1Shape: js.Array[Double], x2Shape: js.Array[Double], axis: Double): js.Array[Double] = js.native
  def computeGradientSliceShapes(aShape: js.Tuple2[Double, Double], bShape: js.Tuple2[Double, Double]): js.Any = js.native
}

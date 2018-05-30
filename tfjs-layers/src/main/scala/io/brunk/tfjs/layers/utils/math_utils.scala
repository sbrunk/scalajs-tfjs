package io.brunk.tfjs.layers.utils

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Math_utils extends js.Object {
  type ArrayTypes = Uint8Array | Int32Array | Float32Array
  def isInteger(x: Double): Boolean = js.native
  def arrayProd(array: js.Array[Double] | ArrayTypes, begin: Double = ???, end: Double = ???): Double = js.native
  def min(array: js.Array[Double] | Float32Array): Double = js.native
  def max(array: js.Array[Double] | Float32Array): Double = js.native
  def sum(array: js.Array[Double] | Float32Array): Double = js.native
  def mean(array: js.Array[Double] | Float32Array): Double = js.native
  def variance(array: js.Array[Double] | Float32Array): Double = js.native
  def median(array: js.Array[Double] | Float32Array): Double = js.native
  def range(begin: Double, end: Double): js.Array[Double] = js.native
}

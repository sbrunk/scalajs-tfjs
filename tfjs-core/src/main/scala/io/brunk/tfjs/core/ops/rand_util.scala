package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package rand_util {

@js.native
@JSGlobalScope
object Rand_util extends js.Object {
  def jarqueBeraNormalityTest(a: Tensor | TypedArray | js.Array[Double]): Unit = js.native
  def expectArrayInMeanStdRange(actual: Tensor | TypedArray | js.Array[Double], expectedMean: Double, expectedStdDev: Double, epsilon: Double = ???): Unit = js.native
}

}

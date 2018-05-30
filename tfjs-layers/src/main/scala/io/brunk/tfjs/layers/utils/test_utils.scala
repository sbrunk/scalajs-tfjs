package io.brunk.tfjs.layers.utils

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Test_utils extends js.Object {
  def expectTensorsClose(actual: Tensor | js.Array[Double], expected: Tensor | js.Array[Double], epsilon: Double = ???): Unit = js.native
  def expectTensorsValuesInRange(actual: Tensor, low: Double, high: Double): Unit = js.native
  def describeMathCPUAndGPU(testName: String, tests: js.Function0[Unit]): Unit = js.native
  def describeMathCPU(testName: String, tests: js.Function0[Unit]): Unit = js.native
  def describeMathGPU(testName: String, tests: js.Function0[Unit]): Unit = js.native
  def expectNoLeakedTensors(testFunc: js.Function0[Any], numNewTensors: Double): Unit = js.native
}

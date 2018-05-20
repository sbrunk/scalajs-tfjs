package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait RandGauss extends js.Object {
  def nextValue(): Double = js.native
}

@js.native
trait RandNormalDataTypes extends js.Object {
  var float32: Float32Array = js.native
  var int32: Int32Array = js.native
}

@js.native
@JSGlobal
class MPRandGauss protected () extends RandGauss {
  def this(mean: Double, stdDeviation: Double, dtype: String = ???, truncated: Boolean = ???, seed: Double = ???) = this()
  def nextValue(): Double = js.native
}

package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class BinaryOpProgram protected () extends GPGPUProgram {
  def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double]) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
  var supportsBroadcasting: Boolean = js.native
}

@js.native
@JSGlobalScope
object Binaryop_gpu extends js.Object {
  val ADD: String = js.native
  val SUB: String = js.native
  val MUL: String = js.native
  val DIV: String = js.native
  val INT_DIV: String = js.native
  val POW: String = js.native
  val SQUARED_DIFFERENCE: String = js.native
  val EQUAL: String = js.native
  val NOT_EQUAL: String = js.native
  val LESS: String = js.native
  val LESS_EQUAL: String = js.native
  val GREATER: String = js.native
  val GREATER_EQUAL: String = js.native
  val LOGICAL_AND: String = js.native
  val LOGICAL_OR: String = js.native
  val MAX: String = js.native
  val MIN: String = js.native
  val MOD: String = js.native
  val ATAN2: String = js.native
  val ELU_DER: String = js.native
}

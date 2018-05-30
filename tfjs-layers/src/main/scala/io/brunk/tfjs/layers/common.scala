package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Common extends js.Object {
  type DataFormat = String
  val VALID_DATA_FORMAT_VALUES: js.Array[String] = js.native
  def checkDataFormat(value: String = ???): Unit = js.native
  type PaddingMode = String
  val VALID_PADDING_MODE_VALUES: js.Array[String] = js.native
  def checkPaddingMode(value: String = ???): Unit = js.native
  type PoolMode = String
  val VALID_POOL_MODE_VALUES: js.Array[String] = js.native
  def checkPoolMode(value: String = ???): Unit = js.native
  def nameScope[T](name: String, fn: js.Function0[T]): T = js.native
  def getScopedTensorName(tensorName: String): String = js.native
  def getUniqueTensorName(scopedName: String): String = js.native
  def isValidTensorName(name: String): Boolean = js.native
}

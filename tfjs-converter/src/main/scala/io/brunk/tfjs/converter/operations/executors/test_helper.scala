package io.brunk.tfjs.converter.operations.executors

import scala.scalajs.js
import js.annotation._
import js.|

package test_helper {

@js.native
@JSGlobalScope
object Test_helper extends js.Object {
  def createNumberAttr(value: Double): ParamValue = js.native
  def createNumberAttrFromIndex(inputIndex: Double): ParamValue = js.native
  def createStrAttr(str: String): ParamValue = js.native
  def createBoolAttr(value: Boolean): ParamValue = js.native
  def createNumericArrayAttr(value: js.Array[Double]): ParamValue = js.native
  def createNumericArrayAttrFromIndex(inputIndex: Double): ParamValue = js.native
  def createTensorAttr(index: Double): ParamValue = js.native
  def createTensorsAttr(index: Double, paramLength: Double): ParamValue = js.native
  def createDtypeAttr(dtype: String): ParamValue = js.native
}

}

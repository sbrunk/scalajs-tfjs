/*
 * Copyright 2017 Sören Brunk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.brunk.tfjs.converter.operations.executors

import io.brunk.tfjs.converter.operations.types.ParamValue

import scala.scalajs.js
import js.annotation._
import js.|
@js.native
@JSGlobalScope
object Test_helper extends js.Object {
  def createNumberAttr(value: Double): ParamValue                       = js.native
  def createNumberAttrFromIndex(inputIndex: Double): ParamValue         = js.native
  def createStrAttr(str: String): ParamValue                            = js.native
  def createBoolAttr(value: Boolean): ParamValue                        = js.native
  def createNumericArrayAttr(value: js.Array[Double]): ParamValue       = js.native
  def createNumericArrayAttrFromIndex(inputIndex: Double): ParamValue   = js.native
  def createTensorAttr(index: Double): ParamValue                       = js.native
  def createTensorsAttr(index: Double, paramLength: Double): ParamValue = js.native
  def createDtypeAttr(dtype: String): ParamValue                        = js.native
}

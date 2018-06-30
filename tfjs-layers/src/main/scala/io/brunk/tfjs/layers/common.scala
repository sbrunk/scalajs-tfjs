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
  val VALID_POOL_MODE_VALUES: js.Array[String]           = js.native
  def checkPoolMode(value: String = ???): Unit           = js.native
  def nameScope[T](name: String, fn: js.Function0[T]): T = js.native
  def getScopedTensorName(tensorName: String): String    = js.native
  def getUniqueTensorName(scopedName: String): String    = js.native
  def isValidTensorName(name: String): Boolean           = js.native
}

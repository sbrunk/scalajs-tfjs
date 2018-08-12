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

package io.brunk.tfjs.layers.utils

import io.brunk.tfjs.core.{ DataType, serialization }
import io.brunk.tfjs.core.TensorModule.TensorND
import io.brunk.tfjs.layers.LayerVariable
import io.brunk.tfjs.layers.Types.Shape

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Generic_utils extends js.Object {
  def pyListRepeat(value: js.Any, numValues: Double): js.Array[js.Any] = js.native
  def assert(`val`: Boolean, message: String = ???): Unit              = js.native
  def count[T](array: js.Array[T], refernce: T): Double                = js.native
  def singletonOrArray[T](xs: js.Array[T]): T | js.Array[T]            = js.native
  def toList(x: js.Any): js.Array[js.Any]                              = js.native
  def objectListUid(objs: js.Any | js.Array[js.Any]): String           = js.native
  def toSnakeCase(name: String): String                                = js.native
  def toCamelCase(identifier: String): String                          = js.native
  def serializeKerasObject(instance: serialization.Serializable): serialization.ConfigDictValue =
    js.native
  def deserializeKerasObject(
      identifier: String | serialization.ConfigDict,
      moduleObjects: js.Dictionary[js.Any] = ???,
      customObjects: js.Dictionary[js.Any] = ???,
      printableModuleName: String = ???
  ): js.Dynamic                                                         = js.native
  def numberCompare(a: Double, b: Double): Int                          = js.native
  def reverseNumberCompare(a: Double, b: Double): Double                = js.native
  def stringToDType(dtype: String): DataType                            = js.native
  def stringsEqual(xs: js.Array[String], ys: js.Array[String]): Boolean = js.native
  def unique[T](xs: js.Array[T]): js.Array[T]                           = js.native
  def isObjectEmpty(obj: js.Any): Boolean                               = js.native
  def checkStringTypeUnionValue(values: js.Array[String], label: String, value: String): Unit =
    js.native
  def checkArrayTypeAndLength(
      x: js.Any,
      expectedType: String,
      minLength: Double = ???,
      maxLength: Double = ???
  ): Boolean = js.native
}

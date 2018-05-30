package io.brunk.tfjs.layers.utils

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Generic_utils extends js.Object {
  def pyListRepeat(value: js.Any, numValues: Double): js.Array[js.Any] = js.native
  def assert(`val`: Boolean, message: String = ???): Unit = js.native
  def count[T](array: js.Array[T], refernce: T): Double = js.native
  def singletonOrArray[T](xs: js.Array[T]): T | js.Array[T] = js.native
  def toList(x: js.Any): js.Array[js.Any] = js.native
  def objectListUid(objs: js.Any | js.Array[js.Any]): String = js.native
  def isArrayOfShapes(x: Shape | js.Array[Shape]): Boolean = js.native
  def normalizeShapeList(x: Shape | js.Array[Shape]): js.Array[Shape] = js.native
  def toSnakeCase(name: String): String = js.native
  def toCamelCase(identifier: String): String = js.native
  def serializeKerasObject(instance: serialization.Serializable): serialization.ConfigDictValue = js.native
  def deserializeKerasObject(identifier: String | serialization.ConfigDict, moduleObjects: js.Dictionary[js.Any] = ???, customObjects: js.Dictionary[js.Any] = ???, printableModuleName: String = ???): js.Dynamic = js.native
  def getExactlyOneTensor(xs: Tensor | js.Array[Tensor]): Tensor = js.native
  def getExactlyOneShape(shapes: Shape | js.Array[Shape]): Shape = js.native
  def numberCompare(a: Double, b: Double): Int = js.native
  def reverseNumberCompare(a: Double, b: Double): Double = js.native
  def stringToDType(dtype: String): DataType = js.native
  def stringsEqual(xs: js.Array[String], ys: js.Array[String]): Boolean = js.native
  def unique[T](xs: js.Array[T]): js.Array[T] = js.native
  def isObjectEmpty(obj: js.Any): Boolean = js.native
  def checkStringTypeUnionValue(values: js.Array[String], label: String, value: String): Unit = js.native
}

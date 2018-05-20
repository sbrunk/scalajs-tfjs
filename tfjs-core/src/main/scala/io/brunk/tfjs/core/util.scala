package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Util extends js.Object {
  def assertArgumentsAreTensors(args: js.Dictionary[Tensor | js.Array[Tensor]], functionName: String): Unit = js.native
  def shuffle(array: js.Array[js.Any] | Uint32Array | Int32Array | Float32Array): Unit = js.native
  def clamp(min: Double, x: Double, max: Double): Double = js.native
  def randUniform(a: Double, b: Double): Double = js.native
  def distSquared(a: FlatVector, b: FlatVector): Double = js.native
  def assert(expr: Boolean, msg: String): Unit = js.native
  def assertShapesMatch(shapeA: js.Array[Double], shapeB: js.Array[Double], errorMessagePrefix: String = ???): Unit = js.native
  def assertTypesMatch(a: Tensor, b: Tensor): Unit = js.native
  def flatten[T <: Double | Boolean | Tensor | Promise[Double]](arr: T | RecursiveArray[T], ret: js.Array[T] = ???): js.Array[T] = js.native
  def inferShape(`val`: TypedArray | Double | Boolean | RegularArray[Double] | RegularArray[Boolean]): js.Array[Double] = js.native
  def sizeFromShape(shape: js.Array[Double]): Double = js.native
  def isScalarShape(shape: js.Array[Double]): Boolean = js.native
  def arraysEqual(n1: FlatVector, n2: FlatVector): Boolean = js.native
  def isInt(a: Double): Boolean = js.native
  def tanh(x: Double): Double = js.native
  def sizeToSquarishShape(size: Double): js.Tuple2[Double, Double] = js.native
  def createShuffledIndices(n: Double): Uint32Array = js.native
  def rightPad(a: String, size: Double): String = js.native
  def repeatedTry(checkFn: js.Function0[Boolean], delayFn: js.Function1[Double, Double] = ???, maxCounter: Double = ???): Promise[Unit] = js.native
  def getQueryParams(queryString: String): js.Dictionary[String] = js.native
  def inferFromImplicitShape(shape: js.Array[Double], size: Double): js.Array[Double] = js.native
  def squeezeShape(shape: js.Array[Double], axis: js.Array[Double] = ???): js.Any = js.native
  def getTypedArrayFromDType[D <: DataType](dtype: D, size: Double): js.Any = js.native
  def isTensorInList(tensor: Tensor, tensorList: js.Array[Tensor]): Boolean = js.native
  def checkForNaN[D <: DataType](vals: js.Any, dtype: D, name: String): Unit = js.native
  def flattenNameArrayMap(nameArrayMap: Tensor | NamedTensorMap, keys: js.Array[String] = ???): js.Array[Tensor] = js.native
  def unflattenToNameArrayMap(keys: js.Array[String], flatArrays: js.Array[Tensor]): NamedTensorMap = js.native
  def hasEncodingLoss(oldType: DataType, newType: DataType): Boolean = js.native
  def copyTypedArray[D <: DataType](array: js.Any | js.Array[Double] | js.Array[Boolean], dtype: D): js.Any = js.native
  def isTypedArray(a: TypedArray | Double | Boolean | RegularArray[Double] | RegularArray[Boolean]): Boolean = js.native
  def bytesPerElement(dtype: DataType): Double = js.native
  def isFunction(f: js.Function): Boolean = js.native
  def extractTensorsFromContainer(result: TensorContainer): js.Array[Tensor] = js.native
  def extractTensorsFromAny(result: js.Any): js.Array[Tensor] = js.native
}

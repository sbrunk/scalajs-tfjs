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

package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.{ Promise, | }
import scala.scalajs.js.typedarray.{ Float32Array, Int32Array, Uint32Array }
import Types._
import TensorModule.TensorND

@js.native
@JSImport("@tensorflow/tfjs-core", "util")
object Util extends js.Object {
  def assertArgumentsAreTensors(
      args: js.Dictionary[TensorND | js.Array[TensorND]],
      functionName: String
  ): Unit                                                                              = js.native
  def shuffle(array: js.Array[js.Any] | Uint32Array | Int32Array | Float32Array): Unit = js.native
  def clamp(min: Double, x: Double, max: Double): Double                               = js.native
  def randUniform(a: Double, b: Double): Double                                        = js.native
  def distSquared(a: FlatVector, b: FlatVector): Double                                = js.native
  def assert(expr: Boolean, msg: String): Unit                                         = js.native
  def assertShapesMatch(
      shapeA: js.Array[Double],
      shapeB: js.Array[Double],
      errorMessagePrefix: String = ???
  ): Unit                                              = js.native
  def assertTypesMatch(a: TensorND, b: TensorND): Unit = js.native
  def flatten[T <: Double | Boolean | TensorND | Promise[Double]](
      arr: T | RecursiveArray[T],
      ret: js.Array[T] = ???
  ): js.Array[T] = js.native
  def inferShape(
      `val`: TypedArray | Double | Boolean | RegularArray[Double] | RegularArray[Boolean]
  ): js.Array[Double]                                              = js.native
  def sizeFromShape(shape: js.Array[Double]): Double               = js.native
  def isScalarShape(shape: js.Array[Double]): Boolean              = js.native
  def arraysEqual(n1: FlatVector, n2: FlatVector): Boolean         = js.native
  def isInt(a: Double): Boolean                                    = js.native
  def tanh(x: Double): Double                                      = js.native
  def sizeToSquarishShape(size: Double): js.Tuple2[Double, Double] = js.native
  def createShuffledIndices(n: Double): Uint32Array                = js.native
  def rightPad(a: String, size: Double): String                    = js.native
  def repeatedTry(
      checkFn: js.Function0[Boolean],
      delayFn: js.Function1[Double, Double] = ???,
      maxCounter: Double = ???
  ): Promise[Unit]                                                                    = js.native
  def getQueryParams(queryString: String): js.Dictionary[String]                      = js.native
  def inferFromImplicitShape(shape: js.Array[Double], size: Double): js.Array[Double] = js.native
  def squeezeShape(shape: js.Array[Double], axis: js.Array[Double] = ???): js.Any     = js.native
  def getTypedArrayFromDType[D <: DataType](dtype: D, size: Double): js.Any           = js.native
  def isTensorInList(tensor: TensorND, tensorList: js.Array[TensorND]): Boolean       = js.native
  def checkForNaN[D <: DataType](vals: js.Any, dtype: D, name: String): Unit          = js.native
  def flattenNameArrayMap(
      nameArrayMap: TensorND | NamedTensorMap,
      keys: js.Array[String] = ???
  ): js.Array[TensorND] = js.native
  def unflattenToNameArrayMap(
      keys: js.Array[String],
      flatArrays: js.Array[TensorND]
  ): NamedTensorMap                                                  = js.native
  def hasEncodingLoss(oldType: DataType, newType: DataType): Boolean = js.native
  def copyTypedArray[D <: DataType](
      array: js.Any | js.Array[Double] | js.Array[Boolean],
      dtype: D
  ): js.Any = js.native
  def isTypedArray(
      a: TypedArray | Double | Boolean | RegularArray[Double] | RegularArray[Boolean]
  ): Boolean                                                                   = js.native
  def bytesPerElement(dtype: DataType): Double                                 = js.native
  def isFunction(f: js.Function): Boolean                                      = js.native
  def getTensorsInContainer(result: TensorContainer): js.Array[Tensor] = js.native
  def nearestDivisor(size: Double, start: Double): Double              = js.native
}

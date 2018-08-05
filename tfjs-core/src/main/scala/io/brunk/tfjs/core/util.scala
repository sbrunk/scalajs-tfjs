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
import js.|

package util {

  @js.native
  @JSGlobalScope
  object Util extends js.Object {
    def shuffle(array: js.Array[js.Any] | Uint32Array | Int32Array | Float32Array): Unit = js.native
    def clamp(min: Double, x: Double, max: Double): Double                               = js.native
    def randUniform(a: Double, b: Double): Double                                        = js.native
    def distSquared(a: FlatVector, b: FlatVector): Double                                = js.native
    def assert(expr: Boolean, msg: String | js.Function0[String]): Unit                  = js.native
    def assertShapesMatch(
        shapeA: js.Array[Double],
        shapeB: js.Array[Double],
        errorMessagePrefix: String = ???
    ): Unit                                = js.native
    def assertNonNull(a: TensorLike): Unit = js.native
    def flatten[T <: Double | Boolean | Promise[Double]](
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
    def inferFromImplicitShape(shape: js.Array[Double], size: Double): js.Array[Double] = js.native
    def squeezeShape(shape: js.Array[Double], axis: js.Array[Double] = ???): js.Any     = js.native
    def getTypedArrayFromDType[D <: DataType](dtype: D, size: Double): js.Any           = js.native
    def checkComputationForNaN[D <: DataType](vals: js.Any, dtype: D, name: String): Unit =
      js.native
    def checkConversionForNaN[D <: DataType](vals: js.Any | js.Array[Double], dtype: D): Unit =
      js.native
    def hasEncodingLoss(oldType: DataType, newType: DataType): Boolean = js.native
    def isTypedArray(
        a: TypedArray | Double | Boolean | RegularArray[Double] | RegularArray[Boolean]
    ): Boolean                                                    = js.native
    def bytesPerElement(dtype: DataType): Double                  = js.native
    def isFunction(f: js.Function): Boolean                       = js.native
    def nearestDivisor(size: Double, start: Double): Double       = js.native
    def computeStrides(shape: js.Array[Double]): js.Array[Double] = js.native
    def toTypedArray[D <: DataType](a: ArrayData[D], dtype: D, debugMode: Boolean): js.Any =
      js.native
    def makeOnesTypedArray[D <: DataType](size: Double, dtype: D): js.Any  = js.native
    def makeZerosTypedArray[D <: DataType](size: Double, dtype: D): js.Any = js.native
    def now(): Double                                                      = js.native
  }

}

/*
 * Copyright (c) 2017 Sören Brunk
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.brunk.deeplearnjs.math

import io.brunk.deeplearnjs.math.webgl.{ GPGPUContext, TextureManager }
import org.scalajs.dom.raw.WebGLTexture

import scala.scalajs.js
import js.annotation._
import js.{ Promise, | }
import scala.scalajs.js.typedarray.Float32Array

@js.native
trait NDArrayData extends js.Object {
  var values: Float32Array                      = js.native
  var texture: WebGLTexture                     = js.native
  var textureShapeRC: js.Tuple2[Double, Double] = js.native
}

@js.native
@JSGlobal
class NDArray protected () extends js.Object {
  def this(shape: js.Array[Double], data: NDArrayData) = this()
  var shape: js.Array[Double]                                                     = js.native
  var size: Double                                                                = js.native
  protected var strides: js.Array[Double]                                         = js.native
  def reshape(newShape: js.Array[Double]): NDArray                                = js.native
  def asScalar(): Scalar                                                          = js.native
  def as1D(): Array1D                                                             = js.native
  def as2D(rows: Double, columns: Double): Array2D                                = js.native
  def as3D(rows: Double, columns: Double, depth: Double): Array3D                 = js.native
  def as4D(rows: Double, columns: Double, depth: Double, depth2: Double): Array4D = js.native
  def rank: Double                                                                = js.native
  def get(locs: Double*): Double                                                  = js.native
  def add(value: Double, locs: Double*): Unit                                     = js.native
  def set(value: Double, locs: Double*): Unit                                     = js.native
  def locToIndex(locs: js.Array[Double]): Double                                  = js.native
  def indexToLoc(index: Double): js.Array[Double]                                 = js.native
  def fill(value: Double): Unit                                                   = js.native
  def getData(): NDArrayData                                                      = js.native
  def getValues(): Float32Array                                                   = js.native
  def getValuesAsync(): Promise[Float32Array]                                     = js.native
  def getTexture(preferredShapeRC: js.Tuple2[Double, Double] = ???): WebGLTexture = js.native
  def getTextureShapeRC(
      preferredShapeRC: js.Tuple2[Double, Double] = ???
  ): js.Tuple2[Double, Double]    = js.native
  def dispose(): Unit             = js.native
  def inGPU(): Boolean            = js.native
  def equals(t: NDArray): Boolean = js.native
}

@js.native
@JSGlobal
object NDArray extends js.Object {
  def zeros(shape: js.Array[Double]): NDArray                                    = js.native
  def zerosLike[T <: NDArray](another: T): T                                     = js.native
  def like[T <: NDArray](another: T): T                                          = js.native
  def make(shape: js.Array[Double], data: NDArrayData): NDArray                  = js.native
  def rand(shape: js.Array[Double], randFunction: js.Function0[Double]): NDArray = js.native
  def randNormal(shape: js.Array[Double], mean: Double = ???, stdDev: Double = ???): NDArray =
    js.native
  def randTruncatedNormal(shape: js.Array[Double],
                          mean: Double = ???,
                          stdDev: Double = ???): NDArray                  = js.native
  def randUniform(shape: js.Array[Double], a: Double, b: Double): NDArray = js.native
}

@js.native
@JSGlobal
class Scalar protected () extends NDArray {
  def this(data: NDArrayData) = this()
  def get(): Double            = js.native
  def set(value: Double): Unit = js.native
  def add(value: Double): Unit = js.native
}

@js.native
@JSGlobal
object Scalar extends js.Object {
  def `new`(value: Double): Scalar = js.native
  var ZERO: Scalar                 = js.native
  var ONE: Scalar                  = js.native
  var TWO: Scalar                  = js.native
  var NEG_ONE: Scalar              = js.native
}

@js.native
@JSGlobal
class Array1D protected () extends NDArray {
  def this(data: NDArrayData) = this()
  @JSName("shape")
  var shape1D: Tuple1[Double]                 = js.native
  def get(i: Double): Double                  = js.native
  def set(value: Double, i: Double): Unit     = js.native
  def add(value: Double, i: Double): Unit     = js.native
  def locToIndex(loc: Tuple1[Double]): Double = js.native
  @JSName("indexToLoc")
  def indexToLoc1D(index: Double): Tuple1[Double] = js.native
}

@js.native
@JSGlobal
object Array1D extends js.Object {
  def `new`(values: Float32Array | js.Array[Double]): Array1D = js.native
  def zeros(shape: Tuple1[Double]): Array1D                   = js.native
  def randNormal(shape: Tuple1[Double], mean: Double = ???, stdDev: Double = ???): Array1D =
    js.native
  def randTruncatedNormal(shape: Tuple1[Double],
                          mean: Double = ???,
                          stdDev: Double = ???): Array1D                = js.native
  def randUniform(shape: Tuple1[Double], a: Double, b: Double): Array1D = js.native
  def make(shape: Tuple1[Double], data: NDArrayData): Array1D           = js.native
}

@js.native
@JSGlobal
class Array2D protected () extends NDArray {
  def this(shape: js.Tuple2[Double, Double], data: NDArrayData) = this()
  @JSName("shape")
  var shape2D: js.Tuple2[Double, Double]                  = js.native
  def get(i: Double, j: Double): Double                   = js.native
  def set(value: Double, i: Double, j: Double): Unit      = js.native
  def add(value: Double, i: Double, j: Double): Unit      = js.native
  def locToIndex(locs: js.Tuple2[Double, Double]): Double = js.native
  @JSName("indexToLoc")
  def indexToLoc2D(index: Double): js.Tuple2[Double, Double] = js.native
}

@js.native
@JSGlobal
object Array2D extends js.Object {
  def `new`(shape: js.Tuple2[Double, Double],
            values: Float32Array | js.Array[Double] | js.Array[js.Array[Double]]): Array2D =
    js.native
  def zeros(shape: js.Tuple2[Double, Double]): Array2D = js.native
  def randNormal(shape: js.Tuple2[Double, Double],
                 mean: Double = ???,
                 stdDev: Double = ???): Array2D = js.native
  def randTruncatedNormal(shape: js.Tuple2[Double, Double],
                          mean: Double = ???,
                          stdDev: Double = ???): Array2D                           = js.native
  def randUniform(shape: js.Tuple2[Double, Double], a: Double, b: Double): Array2D = js.native
  def make(shape: js.Tuple2[Double, Double], data: NDArrayData): Array2D           = js.native
}

@js.native
@JSGlobal
class Array3D protected () extends NDArray {
  def this(shape: js.Tuple3[Double, Double, Double], data: NDArrayData) = this()
  @JSName("shape")
  var shape3D: js.Tuple3[Double, Double, Double]                  = js.native
  def get(i: Double, j: Double, k: Double): Double                = js.native
  def set(value: Double, i: Double, j: Double, k: Double): Unit   = js.native
  def add(value: Double, i: Double, j: Double, k: Double): Unit   = js.native
  def locToIndex(locs: js.Tuple3[Double, Double, Double]): Double = js.native
  @JSName("indexToLoc")
  def indexToLoc3D(index: Double): js.Tuple3[Double, Double, Double] = js.native
}

@js.native
@JSGlobal
object Array3D extends js.Object {
  def `new`(
      shape: js.Tuple3[Double, Double, Double],
      values: Float32Array | js.Array[Double] | js.Array[js.Array[js.Array[Double]]]
  ): Array3D                                                   = js.native
  def zeros(shape: js.Tuple3[Double, Double, Double]): Array3D = js.native
  def randNormal(shape: js.Tuple3[Double, Double, Double],
                 mean: Double = ???,
                 stdDev: Double = ???): Array3D = js.native
  def randTruncatedNormal(shape: js.Tuple3[Double, Double, Double],
                          mean: Double = ???,
                          stdDev: Double = ???): Array3D = js.native
  def randUniform(shape: js.Tuple3[Double, Double, Double], a: Double, b: Double): Array3D =
    js.native
  def make(shape: js.Tuple3[Double, Double, Double], data: NDArrayData): Array3D = js.native
}

@js.native
@JSGlobal
class Array4D protected () extends NDArray {
  def this(shape: js.Tuple4[Double, Double, Double, Double], data: NDArrayData) = this()
  @JSName("shape")
  var shape4D: js.Tuple4[Double, Double, Double, Double]                   = js.native
  def get(i: Double, j: Double, k: Double, l: Double): Double              = js.native
  def set(value: Double, i: Double, j: Double, k: Double, l: Double): Unit = js.native
  def add(value: Double, i: Double, j: Double, k: Double, l: Double): Unit = js.native
  def locToIndex(locs: js.Tuple4[Double, Double, Double, Double]): Double  = js.native
  @JSName("indexToLoc")
  def indexToLoc4D(index: Double): js.Tuple4[Double, Double, Double, Double] = js.native
}

@js.native
@JSGlobal
object Array4D extends js.Object {
  def `new`(
      shape: js.Tuple4[Double, Double, Double, Double],
      values: Float32Array | js.Array[Double] | js.Array[js.Array[js.Array[js.Array[Double]]]]
  ): Array4D                                                           = js.native
  def zeros(shape: js.Tuple4[Double, Double, Double, Double]): Array4D = js.native
  def randNormal(shape: js.Tuple4[Double, Double, Double, Double],
                 mean: Double = ???,
                 stdDev: Double = ???): Array4D = js.native
  def randTruncatedNormal(shape: js.Tuple4[Double, Double, Double, Double],
                          mean: Double = ???,
                          stdDev: Double = ???): Array4D = js.native
  def randUniform(shape: js.Tuple4[Double, Double, Double, Double], a: Double, b: Double): Array4D =
    js.native
  def make(shape: js.Tuple4[Double, Double, Double, Double], data: NDArrayData): Array4D = js.native
}

@js.native
@JSGlobalScope
object Ndarray extends js.Object {
  def GPGPU: GPGPUContext                                                      = js.native
  def TEXTURE_MANAGER: TextureManager                                          = js.native
  def initializeGPU(gpgpu: GPGPUContext, textureManager: TextureManager): Unit = js.native
}

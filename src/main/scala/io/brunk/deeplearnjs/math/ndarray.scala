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

import io.brunk.deeplearnjs.math.webgl.{ GPGPUContext, TextureManager, TextureType }
import org.scalajs.dom.ImageData
import org.scalajs.dom.raw.{ HTMLCanvasElement, HTMLVideoElement, WebGLTexture }
import org.w3c.dom.html.HTMLImageElement

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ Float32Array, Int32Array, Uint8Array }
import scala.scalajs.js.{ Promise, | }

@js.native
sealed trait DType extends js.Object {}

@js.native
@JSGlobal
object DType extends js.Object {
  var float32: DType = js.native
  var int32: DType   = js.native
  var bool: DType    = js.native
  @JSBracketAccess
  def apply(value: DType): String = js.native
}

@js.native
trait DataTypes extends js.Object {
  var float32: Float32Array = js.native
  var int32: Int32Array     = js.native
  var bool: Uint8Array      = js.native
}

@js.native
trait NDArrayData[T <: String] extends js.Object {
  var values: Float32Array | Int32Array | Uint8Array = js.native
  var texture: WebGLTexture                          = js.native
  var textureShapeRC: js.Tuple2[Double, Double]      = js.native
  var textureType: TextureType                       = js.native
}

@js.native
@JSGlobal
class NDArray[T <: String] protected () extends js.Object {
  def this(shape: js.Array[Double], data: NDArrayData[T], dtype: T) = this()
  var shape: js.Array[Double]                                                        = js.native
  var size: Double                                                                   = js.native
  var dtype: T                                                                       = js.native
  protected var strides: js.Array[Double]                                            = js.native
  def reshape(newShape: js.Array[Double]): NDArray[T]                                = js.native
  def flatten(): Array1D[T]                                                          = js.native
  def asScalar(): Scalar[T]                                                          = js.native
  def as1D(): Array1D[T]                                                             = js.native
  def as2D(rows: Double, columns: Double): Array2D[T]                                = js.native
  def as3D(rows: Double, columns: Double, depth: Double): Array3D[T]                 = js.native
  def as4D(rows: Double, columns: Double, depth: Double, depth2: Double): Array4D[T] = js.native
  def asType[G <: String](dtype: G): NDArray[G]                                      = js.native
  def rank: Double                                                                   = js.native
  def get(locs: Double*): Double                                                     = js.native
  def add(value: Double, locs: Double*): Unit                                        = js.native
  def set(value: Double, locs: Double*): Unit                                        = js.native
  def `val`(locs: Double*): Promise[Double]                                          = js.native
  def locToIndex(locs: js.Array[Double]): Double                                     = js.native
  def indexToLoc(index: Double): js.Array[Double]                                    = js.native
  def fill(value: Double): Unit                                                      = js.native
  def getData(): NDArrayData[T]                                                      = js.native
  def getValues(): Float32Array | Int32Array | Uint8Array                            = js.native
  def getValuesAsync(): Promise[Float32Array | Int32Array | Uint8Array]              = js.native
  def data(): Promise[Float32Array | Int32Array | Uint8Array]                        = js.native
  def dataSync(): Float32Array | Int32Array | Uint8Array                             = js.native
  def getTexture(preferredShapeRC: js.Tuple2[Double, Double] = ???): WebGLTexture    = js.native
  def getTextureShapeRC(
      preferredShapeRC: js.Tuple2[Double, Double] = ???
  ): js.Tuple2[Double, Double]       = js.native
  def dispose(): Unit                = js.native
  def inGPU(): Boolean               = js.native
  def equals(t: NDArray[T]): Boolean = js.native
}

@js.native
@JSGlobal
object NDArray extends js.Object {
  def zeros[T <: String](shape: js.Array[Double], dtype: T = ???): NDArray[T] = js.native
  def zerosLike[G <: String, T <: NDArray[G]](another: T): T                  = js.native
  def like[G <: String, T <: NDArray[G]](another: T): T                       = js.native
  def make[T <: String](shape: js.Array[Double], data: NDArrayData[T], dtype: T = ???): NDArray[T] =
    js.native
  def fromPixels(pixels: ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement,
                 numChannels: Double = ???): Array3D[String] = js.native
  def rand(shape: js.Array[Double], randFunction: js.Function0[Double]): NDArray[String] =
    js.native
  def randNormal(shape: js.Array[Double],
                 mean: Double = ???,
                 stdDev: Double = ???): NDArray[String] = js.native
  def randTruncatedNormal(shape: js.Array[Double],
                          mean: Double = ???,
                          stdDev: Double = ???): NDArray[String]                  = js.native
  def randUniform(shape: js.Array[Double], a: Double, b: Double): NDArray[String] = js.native
}

@js.native
@JSGlobal
class Scalar[T <: String] protected () extends NDArray[T] {
  def this(data: NDArrayData[T], dtype: T) = this()
  def get(): Double                               = js.native
  def `val`(): Promise[Double]                    = js.native
  def set(value: Double): Unit                    = js.native
  def add(value: Double): Unit                    = js.native
  def asType[G <: String](dtype: G): Scalar[G]    = js.native
  def locToIndex(loc: js.Array[Double]): Double   = js.native
  def indexToLoc(index: Double): js.Array[Double] = js.native
}

@js.native
@JSGlobal
object Scalar extends js.Object {
  def `new`[T <: String](value: Double | Boolean, dtype: T = ???): Scalar[T] = js.native
  var ZERO: Scalar[String]                                                   = js.native
  var ONE: Scalar[String]                                                    = js.native
  var TWO: Scalar[String]                                                    = js.native
  var NEG_ONE: Scalar[String]                                                = js.native
}

@js.native
@JSGlobal
class Array1D[T <: String] protected () extends NDArray[T] {
  def this(data: NDArrayData[T], dtype: T) = this()
  var shape: js.Tuple1[Double]                     = js.native
  def get(i: Double): Double                       = js.native
  def set(value: Double, i: Double): Unit          = js.native
  def `val`(i: Double): Promise[Double]            = js.native
  def add(value: Double, i: Double): Unit          = js.native
  def locToIndex(loc: js.Tuple1[Double]): Double   = js.native
  def indexToLoc(index: Double): js.Tuple1[Double] = js.native
  def asType[G <: String](dtype: G): Array1D[G]    = js.native
}

@js.native
@JSGlobal
object Array1D extends js.Object {
  def `new`[T <: String](
      values: Float32Array | Int32Array | Uint8Array | js.Array[Double] | js.Array[Boolean],
      dtype: T = ???
  ): Array1D[T]                                                                = js.native
  def zeros[T <: String](shape: js.Tuple1[Double], dtype: T = ???): Array1D[T] = js.native
  def randNormal(shape: js.Tuple1[Double],
                 mean: Double = ???,
                 stdDev: Double = ???): Array1D[String] = js.native
  def randTruncatedNormal(shape: js.Tuple1[Double],
                          mean: Double = ???,
                          stdDev: Double = ???): Array1D[String]                   = js.native
  def randUniform(shape: js.Tuple1[Double], a: Double, b: Double): Array1D[String] = js.native
}

@js.native
@JSGlobal
class Array2D[T <: String] protected () extends NDArray[T] {
  def this(shape: js.Tuple2[Double, Double], data: NDArrayData[T], dtype: T) = this()
  var shape: js.Tuple2[Double, Double]                     = js.native
  def get(i: Double, j: Double): Double                    = js.native
  def set(value: Double, i: Double, j: Double): Unit       = js.native
  def add(value: Double, i: Double, j: Double): Unit       = js.native
  def `val`(i: Double, j: Double): Promise[Double]         = js.native
  def locToIndex(locs: js.Tuple2[Double, Double]): Double  = js.native
  def indexToLoc(index: Double): js.Tuple2[Double, Double] = js.native
  def asType[G <: String](dtype: G): Array2D[G]            = js.native
}

@js.native
@JSGlobal
object Array2D extends js.Object {
  def `new`[T <: String](
      shape: js.Tuple2[Double, Double],
      values: Float32Array | Int32Array | Uint8Array | js.Array[Double] | js.Array[
        js.Array[Double]
      ] | js.Array[Boolean] | js.Array[js.Array[Boolean]],
      dtype: T = ???
  ): Array2D[T]                                                                        = js.native
  def zeros[T <: String](shape: js.Tuple2[Double, Double], dtype: T = ???): Array2D[T] = js.native
  def randNormal(shape: js.Tuple2[Double, Double],
                 mean: Double = ???,
                 stdDev: Double = ???): Array2D[String] = js.native
  def randTruncatedNormal(shape: js.Tuple2[Double, Double],
                          mean: Double = ???,
                          stdDev: Double = ???): Array2D[String] = js.native
  def randUniform(shape: js.Tuple2[Double, Double], a: Double, b: Double): Array2D[String] =
    js.native
}

@js.native
@JSGlobal
class Array3D[T <: String] protected () extends NDArray[T] {
  def this(shape: js.Tuple3[Double, Double, Double], data: NDArrayData[T], dtype: T) = this()
  var shape: js.Tuple3[Double, Double, Double]                     = js.native
  def get(i: Double, j: Double, k: Double): Double                 = js.native
  def set(value: Double, i: Double, j: Double, k: Double): Unit    = js.native
  def `val`(i: Double, j: Double, k: Double): Promise[Double]      = js.native
  def add(value: Double, i: Double, j: Double, k: Double): Unit    = js.native
  def locToIndex(locs: js.Tuple3[Double, Double, Double]): Double  = js.native
  def indexToLoc(index: Double): js.Tuple3[Double, Double, Double] = js.native
  def asType[G <: String](dtype: G): Array3D[G]                    = js.native
}

@js.native
@JSGlobal
object Array3D extends js.Object {
  def `new`[T <: String](
      shape: js.Tuple3[Double, Double, Double],
      values: Float32Array | Int32Array | Uint8Array | js.Array[Double] | js.Array[
        js.Array[js.Array[Double]]
      ] | js.Array[Boolean] | js.Array[js.Array[js.Array[Boolean]]],
      dtype: T = ???
  ): Array3D[T] = js.native
  def zeros[T <: String](shape: js.Tuple3[Double, Double, Double], dtype: T = ???): Array3D[T] =
    js.native
  def randNormal(shape: js.Tuple3[Double, Double, Double],
                 mean: Double = ???,
                 stdDev: Double = ???): Array3D[String] = js.native
  def randTruncatedNormal(shape: js.Tuple3[Double, Double, Double],
                          mean: Double = ???,
                          stdDev: Double = ???): Array3D[String] = js.native
  def randUniform(shape: js.Tuple3[Double, Double, Double], a: Double, b: Double): Array3D[String] =
    js.native
}

@js.native
@JSGlobal
class Array4D[T <: String] protected () extends NDArray[T] {
  def this(shape: js.Tuple4[Double, Double, Double, Double], data: NDArrayData[T], dtype: T) =
    this()
  var shape: js.Tuple4[Double, Double, Double, Double]                     = js.native
  def get(i: Double, j: Double, k: Double, l: Double): Double              = js.native
  def set(value: Double, i: Double, j: Double, k: Double, l: Double): Unit = js.native
  def `val`(i: Double, j: Double, k: Double, l: Double): Promise[Double]   = js.native
  def add(value: Double, i: Double, j: Double, k: Double, l: Double): Unit = js.native
  def locToIndex(locs: js.Tuple4[Double, Double, Double, Double]): Double  = js.native
  def indexToLoc(index: Double): js.Tuple4[Double, Double, Double, Double] = js.native
  def asType[G <: String](dtype: G): Array4D[G]                            = js.native
}

@js.native
@JSGlobal
object Array4D extends js.Object {
  def `new`[T <: String](
      shape: js.Tuple4[Double, Double, Double, Double],
      values: Float32Array | Int32Array | Uint8Array | js.Array[Double] | js.Array[
        js.Array[js.Array[js.Array[Double]]]
      ] | js.Array[Boolean] | js.Array[js.Array[js.Array[js.Array[Boolean]]]],
      dtype: T = ???
  ): Array4D[T] = js.native
  def zeros[T <: String](shape: js.Tuple4[Double, Double, Double, Double],
                         dtype: T = ???): Array4D[T] = js.native
  def randNormal(shape: js.Tuple4[Double, Double, Double, Double],
                 mean: Double = ???,
                 stdDev: Double = ???): Array4D[String] = js.native
  def randTruncatedNormal(shape: js.Tuple4[Double, Double, Double, Double],
                          mean: Double = ???,
                          stdDev: Double = ???): Array4D[String] = js.native
  def randUniform(shape: js.Tuple4[Double, Double, Double, Double],
                  a: Double,
                  b: Double): Array4D[String] = js.native
}

@js.native
@JSGlobalScope
object Ndarray extends js.Object {
  def GPGPU: GPGPUContext                                                      = js.native
  def TEXTURE_MANAGER: TextureManager                                          = js.native
  def initializeGPU(gpgpu: GPGPUContext, textureManager: TextureManager): Unit = js.native
}

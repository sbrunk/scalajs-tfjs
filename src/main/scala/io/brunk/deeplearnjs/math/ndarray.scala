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
@JSImport("deeplearn", "DType")
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
trait NDArrayData extends js.Object {
  var values: Float32Array | Int32Array | Uint8Array = js.native
  var texture: WebGLTexture                          = js.native
  var textureShapeRC: js.Tuple2[Double, Double]      = js.native
  var textureType: TextureType                       = js.native
}

@js.native
@JSImport("deeplearn", "NDArray")
class NDArray protected () extends js.Object {
  def this(shape: js.Array[Double], data: NDArrayData, dtype: DType) = this()
  var shape: js.Array[Double]                                                     = js.native
  var size: Double                                                                = js.native
  var dtype: DType                                                                = js.native
  protected var strides: js.Array[Double]                                         = js.native
  def reshape(newShape: js.Array[Double]): NDArray                                = js.native
  def flatten(): Array1D                                                          = js.native
  def asScalar(): Scalar                                                          = js.native
  def as1D(): Array1D                                                             = js.native
  def as2D(rows: Double, columns: Double): Array2D                                = js.native
  def as3D(rows: Double, columns: Double, depth: Double): Array3D                 = js.native
  def as4D(rows: Double, columns: Double, depth: Double, depth2: Double): Array4D = js.native
  def asType(dtype: DType): NDArray                                               = js.native
  def rank: Double                                                                = js.native
  def get(locs: Double*): Double                                                  = js.native
  def add(value: Double, locs: Double*): Unit                                     = js.native
  def set(value: Double, locs: Double*): Unit                                     = js.native
  def `val`(locs: Double*): Promise[Double]                                       = js.native
  def locToIndex(locs: js.Array[Double]): Double                                  = js.native
  def indexToLoc(index: Double): js.Array[Double]                                 = js.native
  def fill(value: Double): Unit                                                   = js.native
  def getData(): NDArrayData                                                      = js.native
  def getValues(): Float32Array | Int32Array | Uint8Array                         = js.native
  def getValuesAsync(): Promise[Float32Array | Int32Array | Uint8Array]           = js.native
  def data(): Promise[Float32Array | Int32Array | Uint8Array]                     = js.native
  def dataSync(): Float32Array | Int32Array | Uint8Array                          = js.native
  def getTexture(preferredShapeRC: js.Tuple2[Double, Double] = ???): WebGLTexture = js.native
  def getTextureShapeRC(
      preferredShapeRC: js.Tuple2[Double, Double] = ???
  ): js.Tuple2[Double, Double]    = js.native
  def dispose(): Unit             = js.native
  def inGPU(): Boolean            = js.native
  def equals(t: NDArray): Boolean = js.native
}

@js.native
@JSImport("deeplearn", "NDArray")
object NDArray extends js.Object {
  def zeros(shape: js.Array[Double], dtype: DType = ???): NDArray = js.native
  def zerosLike(another: DType): NDArray                          = js.native
  def like(another: DType): NDArray                               = js.native
  def make(shape: js.Array[Double], data: NDArrayData, dtype: DType = ???): NDArray =
    js.native
  def fromPixels(pixels: ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement,
                 numChannels: Double = ???): Array3D = js.native
  def rand(shape: js.Array[Double], randFunction: js.Function0[Double]): NDArray =
    js.native
  def randNormal(shape: js.Array[Double], mean: Double = ???, stdDev: Double = ???): NDArray =
    js.native
  def randTruncatedNormal(shape: js.Array[Double],
                          mean: Double = ???,
                          stdDev: Double = ???): NDArray                  = js.native
  def randUniform(shape: js.Array[Double], a: Double, b: Double): NDArray = js.native
}

@js.native
@JSImport("deeplearn", "Scalar")
class Scalar protected () extends NDArray {
  def this(data: NDArrayData, dtype: DType) = this()
  def get(): Double                                        = js.native
  def `val`(): Promise[Double]                             = js.native
  def set(value: Double): Unit                             = js.native
  def add(value: Double): Unit                             = js.native
  override def asType(dtype: DType): Scalar                = js.native
  override def locToIndex(loc: js.Array[Double]): Double   = js.native
  override def indexToLoc(index: Double): js.Array[Double] = js.native
}

@js.native
@JSImport("deeplearn", "Scalar")
object Scalar extends js.Object {
  def `new`(value: Double | Boolean, dtype: DType = ???): Scalar = js.native
  var ZERO: Scalar                                               = js.native
  var ONE: Scalar                                                = js.native
  var TWO: Scalar                                                = js.native
  var NEG_ONE: Scalar                                            = js.native
}

@js.native
@JSImport("deeplearn", "Array1D")
class Array1D protected () extends NDArray {
  def this(data: NDArrayData, dtype: DType) = this()
  @JSName("shape")
  var shape1D: Tuple1[Double]                 = js.native
  def get(i: Double): Double                  = js.native
  def set(value: Double, i: Double): Unit     = js.native
  def `val`(i: Double): Promise[Double]       = js.native
  def add(value: Double, i: Double): Unit     = js.native
  def locToIndex(loc: Tuple1[Double]): Double = js.native
  @JSName("indexToLoc")
  def indexToLoc1D(index: Double): Tuple1[Double] = js.native
  override def asType(dtype: DType): Array1D      = js.native
}

@js.native
@JSImport("deeplearn", "Array1D")
object Array1D extends js.Object {
  def `new`(
      values: Float32Array | Int32Array | Uint8Array | js.Array[Double] | js.Array[Boolean],
      dtype: DType = ???
  ): Array1D                                                    = js.native
  def zeros(shape: Tuple1[Double], dtype: DType = ???): Array1D = js.native
  def randNormal(shape: Tuple1[Double], mean: Double = ???, stdDev: Double = ???): Array1D =
    js.native
  def randTruncatedNormal(shape: Tuple1[Double],
                          mean: Double = ???,
                          stdDev: Double = ???): Array1D                = js.native
  def randUniform(shape: Tuple1[Double], a: Double, b: Double): Array1D = js.native
}

@js.native
@JSImport("deeplearn", "Array2D")
class Array2D protected () extends NDArray {
  def this(shape: js.Tuple2[Double, Double], data: NDArrayData, dtype: DType) = this()
  @JSName("shape")
  var shape2D: js.Tuple2[Double, Double]                  = js.native
  def get(i: Double, j: Double): Double                   = js.native
  def set(value: Double, i: Double, j: Double): Unit      = js.native
  def add(value: Double, i: Double, j: Double): Unit      = js.native
  def `val`(i: Double, j: Double): Promise[Double]        = js.native
  def locToIndex(locs: js.Tuple2[Double, Double]): Double = js.native
  @JSName("indexToLoc")
  def indexToLoc2D(index: Double): js.Tuple2[Double, Double] = js.native
  override def asType(dtype: DType): Array2D                 = js.native
}

@js.native
@JSImport("deeplearn", "Array2D")
object Array2D extends js.Object {
  def `new`(
      shape: js.Tuple2[Double, Double],
      values: Float32Array | Int32Array | Uint8Array | js.Array[Double] | js.Array[
        js.Array[Double]
      ] | js.Array[Boolean] | js.Array[js.Array[Boolean]],
      dtype: DType = ???
  ): Array2D                                                               = js.native
  def zeros(shape: js.Tuple2[Double, Double], dtype: DType = ???): Array2D = js.native
  def randNormal(shape: js.Tuple2[Double, Double],
                 mean: Double = ???,
                 stdDev: Double = ???): Array2D = js.native
  def randTruncatedNormal(shape: js.Tuple2[Double, Double],
                          mean: Double = ???,
                          stdDev: Double = ???): Array2D = js.native
  def randUniform(shape: js.Tuple2[Double, Double], a: Double, b: Double): Array2D =
    js.native
}

@js.native
@JSImport("deeplearn", "Array3D")
class Array3D protected () extends NDArray {
  def this(shape: js.Tuple3[Double, Double, Double], data: NDArrayData, dtype: DType) = this()
  @JSName("shape")
  var shape3D: js.Tuple3[Double, Double, Double]                  = js.native
  def get(i: Double, j: Double, k: Double): Double                = js.native
  def set(value: Double, i: Double, j: Double, k: Double): Unit   = js.native
  def `val`(i: Double, j: Double, k: Double): Promise[Double]     = js.native
  def add(value: Double, i: Double, j: Double, k: Double): Unit   = js.native
  def locToIndex(locs: js.Tuple3[Double, Double, Double]): Double = js.native
  @JSName("indexToLoc")
  def indexToLoc3D(index: Double): js.Tuple3[Double, Double, Double] = js.native
  override def asType(dtype: DType): Array3D                         = js.native
}

@js.native
@JSImport("deeplearn", "Array3D")
object Array3D extends js.Object {
  def `new`(
      shape: js.Tuple3[Double, Double, Double],
      values: Float32Array | Int32Array | Uint8Array | js.Array[Double] | js.Array[
        js.Array[js.Array[Double]]
      ] | js.Array[Boolean] | js.Array[js.Array[js.Array[Boolean]]],
      dtype: DType = ???
  ): Array3D = js.native
  def zeros(shape: js.Tuple3[Double, Double, Double], dtype: DType = ???): Array3D =
    js.native
  def randNormal(shape: js.Tuple3[Double, Double, Double],
                 mean: Double = ???,
                 stdDev: Double = ???): Array3D = js.native
  def randTruncatedNormal(shape: js.Tuple3[Double, Double, Double],
                          mean: Double = ???,
                          stdDev: Double = ???): Array3D = js.native
  def randUniform(shape: js.Tuple3[Double, Double, Double], a: Double, b: Double): Array3D =
    js.native
}

@js.native
@JSImport("deeplearn", "Array4D")
class Array4D protected () extends NDArray {
  def this(shape: js.Tuple4[Double, Double, Double, Double], data: NDArrayData, dtype: DType) =
    this()
  @JSName("shape")
  var shape4D: js.Tuple4[Double, Double, Double, Double]                   = js.native
  def get(i: Double, j: Double, k: Double, l: Double): Double              = js.native
  def set(value: Double, i: Double, j: Double, k: Double, l: Double): Unit = js.native
  def `val`(i: Double, j: Double, k: Double, l: Double): Promise[Double]   = js.native
  def add(value: Double, i: Double, j: Double, k: Double, l: Double): Unit = js.native
  def locToIndex(locs: js.Tuple4[Double, Double, Double, Double]): Double  = js.native
  @JSName("indexToLoc")
  def indexToLoc4D(index: Double): js.Tuple4[Double, Double, Double, Double] = js.native
  override def asType(dtype: DType): Array4D                                 = js.native
}

@js.native
@JSImport("deeplearn", "Array4D")
object Array4D extends js.Object {
  def `new`(
      shape: js.Tuple4[Double, Double, Double, Double],
      values: Float32Array | Int32Array | Uint8Array | js.Array[Double] | js.Array[
        js.Array[js.Array[js.Array[Double]]]
      ] | js.Array[Boolean] | js.Array[js.Array[js.Array[js.Array[Boolean]]]],
      dtype: DType = ???
  ): Array4D = js.native
  def zeros(shape: js.Tuple4[Double, Double, Double, Double], dtype: DType = ???): Array4D =
    js.native
  def randNormal(shape: js.Tuple4[Double, Double, Double, Double],
                 mean: Double = ???,
                 stdDev: Double = ???): Array4D = js.native
  def randTruncatedNormal(shape: js.Tuple4[Double, Double, Double, Double],
                          mean: Double = ???,
                          stdDev: Double = ???): Array4D = js.native
  def randUniform(shape: js.Tuple4[Double, Double, Double, Double], a: Double, b: Double): Array4D =
    js.native
}

@js.native
@JSGlobalScope
object Ndarray extends js.Object {
  def GPGPU: GPGPUContext                                                      = js.native
  def TEXTURE_MANAGER: TextureManager                                          = js.native
  def initializeGPU(gpgpu: GPGPUContext, textureManager: TextureManager): Unit = js.native
}

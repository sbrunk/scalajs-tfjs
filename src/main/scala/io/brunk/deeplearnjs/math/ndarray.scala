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

package io.brunk.deeplearnjs.math

import org.scalajs.dom.ImageData
import org.scalajs.dom.raw.{ HTMLCanvasElement, HTMLVideoElement, WebGLTexture }
import org.w3c.dom.html.HTMLImageElement

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.{ Float32Array, Int32Array, Uint8Array }
import scala.scalajs.js.{ Promise, | }

sealed trait DataType
sealed trait Float32 extends DataType

sealed trait Rank

@ScalaJSDefined
trait SupportedType extends js.Any {
  type D <: DataType
}

object SupportedType {
  val float32 = "float32".asInstanceOf[SupportedType { type DataType = Float32 }]
}

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
trait DataTypeMap extends js.Object {
  var float32: Float32Array = js.native
  var int32: Int32Array     = js.native
  var bool: Uint8Array      = js.native
}

@js.native
trait RankMap[D <: DataType] extends js.Object {
  var `0`: Scalar[D]             = js.native
  var `1`: Array1D[D]            = js.native
  var `2`: Array2D[D]            = js.native
  var `3`: Array3D[D]            = js.native
  var `4`: Array4D[D]            = js.native
  var higher: NDArray[D, String] = js.native
}

@js.native
trait NDArrayData[D <: DataType] extends js.Object {
  var dataId: Double = js.native
  var values: js.Any = js.native
}

@js.native
trait ShapeMap extends js.Object {
  var `0`: js.Array[Double]                          = js.native
  var `1`: js.Tuple1[Double]                         = js.native
  var `2`: js.Tuple2[Double, Double]                 = js.native
  var `3`: js.Tuple3[Double, Double, Double]         = js.native
  var `4`: js.Tuple4[Double, Double, Double, Double] = js.native
  var higher: js.Array[Double]                       = js.native
}

@js.native
@JSImport("deeplearn", "NDArray")
class NDArray[D <: DataType, R <: Rank] protected () extends js.Object {
  def this(shape: js.Array[Double],
           dtype: D,
           values: js.Any = ???,
           dataId: Double = ???,
           math: NDArrayMath = ???) = this()
  var id: Double                                                                     = js.native
  var dataId: Double                                                                 = js.native
  var shape: js.Any                                                                  = js.native
  var size: Double                                                                   = js.native
  var dtype: D                                                                       = js.native
  var rankType: R                                                                    = js.native
  var strides: js.Array[Double]                                                      = js.native
  protected var math: NDArrayMath                                                    = js.native
  def reshape[R2 <: Rank](newShape: js.Array[Double]): js.Any                        = js.native
  def squeeze[T <: NDArray[D, Rank]](axis: js.Array[Double] = ???): T                = js.native
  def flatten(): Array1D[D]                                                          = js.native
  def asScalar(): Scalar[D]                                                          = js.native
  def as1D(): Array1D[D]                                                             = js.native
  def as2D(rows: Double, columns: Double): Array2D[D]                                = js.native
  def as3D(rows: Double, columns: Double, depth: Double): Array3D[D]                 = js.native
  def as4D(rows: Double, columns: Double, depth: Double, depth2: Double): Array4D[D] = js.native
  def asType[D2 <: DataType](dtype: D2): NDArray[D2, R]                              = js.native
  def rank: Double                                                                   = js.native
  def get(locs: Double*): Double                                                     = js.native
  def add(value: Double, locs: Double*): Unit                                        = js.native
  def set(value: Double, locs: Double*): Unit                                        = js.native
  def `val`(locs: Double*): Promise[Double]                                          = js.native
  def locToIndex(locs: js.Any): Double                                               = js.native
  def indexToLoc(index: Double): js.Any                                              = js.native
  def fill(value: Double): Unit                                                      = js.native
  def getValues(): js.Any                                                            = js.native
  def getValuesAsync(): Promise[js.Any]                                              = js.native
  def data(): Promise[js.Any]                                                        = js.native
  def dataSync(): js.Any                                                             = js.native
  def dispose(): Unit                                                                = js.native
  def equals(t: NDArray[D, R]): Boolean                                              = js.native
}

@js.native
@JSImport("deeplearn", "NDArray")
object NDArray extends js.Object {
  def ones[D <: DataType, R <: Rank](shape: js.Array[Double], dtype: D = ???): js.Any  = js.native
  def zeros[D <: DataType, R <: Rank](shape: js.Array[Double], dtype: D = ???): js.Any = js.native
  def onesLike[T <: NDArray[DataType, Rank]](another: T): T                            = js.native
  def zerosLike[T <: NDArray[DataType, Rank]](another: T): T                           = js.native
  def like[T <: NDArray[DataType, Rank]](another: T): T                                = js.native
  def make[D <: DataType, R <: Rank](shape: js.Array[Double],
                                     data: NDArrayData[D],
                                     dtype: D = ???,
                                     math: NDArrayMath = ???): js.Any = js.native
  def fromPixels(pixels: ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement,
                 numChannels: Double = ???,
                 math: NDArrayMath = ???): Array3D[String] = js.native
  def rand[D <: DataType, R <: Rank](shape: js.Array[Double],
                                     randFunction: js.Function0[Double],
                                     dtype: D = ???): js.Any = js.native
  def randNormal[D <: String, R <: Rank](shape: js.Array[Double],
                                         mean: Double = ???,
                                         stdDev: Double = ???,
                                         dtype: D = ???,
                                         seed: Double = ???): js.Any = js.native
  def randTruncatedNormal[D <: String, R <: Rank](shape: js.Array[Double],
                                                  mean: Double = ???,
                                                  stdDev: Double = ???,
                                                  dtype: D = ???,
                                                  seed: Double = ???): js.Any = js.native
  def randUniform[D <: DataType, R <: Rank](shape: js.Array[Double],
                                            a: Double,
                                            b: Double,
                                            dtype: D = ???): js.Any = js.native
}

@js.native
@JSImport("deeplearn", "Scalar")
class Scalar[D <: DataType] extends NDArray[D, String] {
  def get(): Double                                 = js.native
  def `val`(): Promise[Double]                      = js.native
  def add(value: Double): Unit                      = js.native
  def asType[D2 <: DataType](dtype: D2): Scalar[D2] = js.native
  def locToIndex(loc: js.Array[Double]): Double     = js.native
  def indexToLoc(index: Double): js.Array[Double]   = js.native
}

@js.native
@JSImport("deeplearn", "Scalar")
object Scalar extends js.Object {
  def `new`[D <: DataType](value: Double | Boolean, dtype: D = ???): Scalar[D] = js.native
}

@js.native
@JSImport("deeplearn", "Array1D")
class Array1D[D <: DataType] extends NDArray[D, String] {
  def get(i: Double): Double                     = js.native
  def `val`(i: Double): Promise[Double]          = js.native
  def add(value: Double, i: Double): Unit        = js.native
  def locToIndex(loc: js.Tuple1[Double]): Double = js.native
  @JSName("indexToLoc")
  def indexToLoc(index: Double): js.Tuple1[Double]   = js.native
  def asType[D2 <: DataType](dtype: D2): Array1D[D2] = js.native
}

@js.native
@JSImport("deeplearn", "Array1D")
object Array1D extends js.Object {
  def `new`[D <: DataType](values: js.Any | js.Array[Double] | js.Array[Boolean],
                           dtype: D = ???): Array1D[D]                          = js.native
  def ones[D <: DataType](shape: js.Tuple1[Double], dtype: D = ???): Array1D[D] = js.native
  def randNormal[D <: String](shape: js.Tuple1[Double],
                              mean: Double = ???,
                              stdDev: Double = ???,
                              dtype: D = ???,
                              seed: Double = ???): Array1D[D] = js.native
  def randTruncatedNormal[D <: String](shape: js.Tuple1[Double],
                                       mean: Double = ???,
                                       stdDev: Double = ???,
                                       dtype: D = ???,
                                       seed: Double = ???): Array1D[D] = js.native
  def randUniform[D <: DataType](shape: js.Tuple1[Double],
                                 a: Double,
                                 b: Double,
                                 dtype: D = ???): Array1D[D] = js.native
}

@js.native
@JSImport("deeplearn", "Array2D")
class Array2D[D <: DataType] protected () extends NDArray[D, String] {
  def this(shape: js.Tuple2[Double, Double],
           dtype: D,
           values: js.Any = ???,
           dataId: Double = ???,
           math: NDArrayMath = ???) = this()
  def get(i: Double, j: Double): Double                   = js.native
  def add(value: Double, i: Double, j: Double): Unit      = js.native
  def `val`(i: Double, j: Double): Promise[Double]        = js.native
  def locToIndex(locs: js.Tuple2[Double, Double]): Double = js.native
  @JSName("indexToLoc")
  def indexToLoc(index: Double): js.Tuple2[Double, Double] = js.native
  def asType[D2 <: DataType](dtype: D2): Array2D[D2]       = js.native
}
@js.native
@JSImport("deeplearn", "Array2D")
object Array2D extends js.Object {
  def `new`[D <: DataType](
      shape: js.Tuple2[Double, Double],
      values: js.Any | js.Array[Double] | js.Array[js.Array[Double]] | js.Array[Boolean] | js.Array[
        js.Array[Boolean]
      ],
      dtype: D = ???
  ): Array2D[D] = js.native
  def ones[D <: DataType](shape: js.Tuple2[Double, Double], dtype: D = ???): Array2D[D] =
    js.native
  def zeros[D <: DataType](shape: js.Tuple2[Double, Double], dtype: D = ???): Array2D[D] =
    js.native
  def randNormal[D <: String](shape: js.Tuple2[Double, Double],
                              mean: Double = ???,
                              stdDev: Double = ???,
                              dtype: D = ???,
                              seed: Double = ???): Array2D[D] = js.native
  def randTruncatedNormal[D <: String](shape: js.Tuple2[Double, Double],
                                       mean: Double = ???,
                                       stdDev: Double = ???,
                                       dtype: D = ???,
                                       seed: Double = ???): Array2D[D] = js.native
  def randUniform[D <: DataType](shape: js.Tuple2[Double, Double],
                                 a: Double,
                                 b: Double,
                                 dtype: D = ???): Array2D[D] = js.native
}

@js.native
@JSImport("deeplearn", "Array3D")
class Array3D[D <: DataType] protected () extends NDArray[D, String] {
  def this(shape: js.Tuple3[Double, Double, Double],
           dtype: D,
           values: js.Any = ???,
           dataId: Double = ???,
           math: NDArrayMath = ???) = this()
  def get(i: Double, j: Double, k: Double): Double                = js.native
  def `val`(i: Double, j: Double, k: Double): Promise[Double]     = js.native
  def add(value: Double, i: Double, j: Double, k: Double): Unit   = js.native
  def locToIndex(locs: js.Tuple3[Double, Double, Double]): Double = js.native
  @JSName("indexToLoc")
  def indexToLoc(index: Double): js.Tuple3[Double, Double, Double] = js.native
  def asType[D2 <: DataType](dtype: D2): Array3D[D2]               = js.native
}

@js.native
@JSImport("deeplearn", "Array3D")
object Array3D extends js.Object {
  def `new`[D <: DataType](shape: js.Tuple3[Double, Double, Double],
                           values: js.Any | js.Array[Double] | js.Array[
                             js.Array[js.Array[Double]]
                           ] | js.Array[Boolean] | js.Array[js.Array[js.Array[Boolean]]],
                           dtype: D = ???): Array3D[D] = js.native
  def ones[D <: DataType](shape: js.Tuple3[Double, Double, Double], dtype: D = ???): Array3D[D] =
    js.native
  def zeros[D <: DataType](shape: js.Tuple3[Double, Double, Double], dtype: D = ???): Array3D[D] =
    js.native
  def randNormal[D <: String](shape: js.Tuple3[Double, Double, Double],
                              mean: Double = ???,
                              stdDev: Double = ???,
                              dtype: D = ???,
                              seed: Double = ???): Array3D[D] = js.native
  def randTruncatedNormal[D <: String](shape: js.Tuple3[Double, Double, Double],
                                       mean: Double = ???,
                                       stdDev: Double = ???,
                                       dtype: D = ???,
                                       seed: Double = ???): Array3D[D] = js.native
  def randUniform[D <: DataType](shape: js.Tuple3[Double, Double, Double],
                                 a: Double,
                                 b: Double,
                                 dtype: D = ???): Array3D[D] = js.native
}

@js.native
@JSImport("deeplearn", "Array4D")
class Array4D[D <: DataType] protected () extends NDArray[D, String] {
  def this(shape: js.Tuple4[Double, Double, Double, Double],
           dtype: D,
           values: js.Any = ???,
           dataId: Double = ???,
           math: NDArrayMath = ???) = this()
  def get(i: Double, j: Double, k: Double, l: Double): Double              = js.native
  def `val`(i: Double, j: Double, k: Double, l: Double): Promise[Double]   = js.native
  def add(value: Double, i: Double, j: Double, k: Double, l: Double): Unit = js.native
  def locToIndex(locs: js.Tuple4[Double, Double, Double, Double]): Double  = js.native
  @JSName("indexToLoc")
  def indexToLoc(index: Double): js.Tuple4[Double, Double, Double, Double] = js.native
  def asType[D2 <: DataType](dtype: D2): Array4D[D2]                       = js.native
}

@js.native
@JSImport("deeplearn", "Array4D")
object Array4D extends js.Object {
  def `new`[D <: DataType](shape: js.Tuple4[Double, Double, Double, Double],
                           values: js.Any | js.Array[Double] | js.Array[
                             js.Array[js.Array[js.Array[Double]]]
                           ] | js.Array[Boolean] | js.Array[
                             js.Array[js.Array[js.Array[Boolean]]]
                           ],
                           dtype: D = ???): Array4D[D] = js.native
  def ones[D <: DataType](shape: js.Tuple4[Double, Double, Double, Double],
                          dtype: D = ???): Array4D[D] = js.native
  def zeros[D <: DataType](shape: js.Tuple4[Double, Double, Double, Double],
                           dtype: D = ???): Array4D[D] = js.native
  def randNormal[D <: String](shape: js.Tuple4[Double, Double, Double, Double],
                              mean: Double = ???,
                              stdDev: Double = ???,
                              dtype: D = ???,
                              seed: Double = ???): Array4D[D] = js.native
  def randTruncatedNormal[D <: String](shape: js.Tuple4[Double, Double, Double, Double],
                                       mean: Double = ???,
                                       stdDev: Double = ???,
                                       dtype: D = ???,
                                       seed: Double = ???): Array4D[D] = js.native
  def randUniform[D <: DataType](shape: js.Tuple4[Double, Double, Double, Double],
                                 a: Double,
                                 b: Double,
                                 dtype: D = ???): Array4D[D] = js.native
}

@js.native
@JSGlobal
class Variable[D <: DataType, R <: Rank] extends NDArray[D, R] {
  var trainable: Boolean                    = js.native
  var name: String                          = js.native
  def assign(newValue: NDArray[D, R]): Unit = js.native
}

@js.native
@JSGlobal
object Variable extends js.Object {
  def variable[D <: DataType, R <: Rank](initialValue: NDArray[D, R],
                                         trainable: Boolean = ???,
                                         name: String = ???,
                                         dtype: D = ???): Variable[D, R] = js.native
}

@js.native
@JSImport("deeplearn", "ndarray")
object NdarrayModule extends js.Object {
  val variable: Variable.variable.type = js.native
}

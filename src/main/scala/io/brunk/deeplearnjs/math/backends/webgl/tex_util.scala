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

package io.brunk.deeplearnjs.math.backends.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package tex_util {

  import io.brunk.deeplearnjs.math.DataType
  import org.scalajs.dom.webgl

  import scala.scalajs.js.typedarray.{ Float32Array, Uint8Array }

  @js.native
  sealed trait TextureType extends js.Object {}

  @js.native
  @JSGlobal
  object TextureType extends js.Object {
    var DEFAULT: TextureType    = js.native
    var RGBA_COLOR: TextureType = js.native
    @JSBracketAccess
    def apply(value: TextureType): String = js.native
  }

  @js.native
  trait TextureData extends js.Object {
    var texture: webgl.Texture              = js.native
    var shape: js.Array[Double]             = js.native
    var texShape: js.Tuple2[Double, Double] = js.native
    var textureType: TextureType            = js.native
    var dtype: DataType                     = js.native
    var numChannels: Double                 = js.native
    var values: js.Any                      = js.native
  }

  @js.native
  @JSGlobalScope
  object Tex_util extends js.Object {
    def getUnpackedMatrixTextureShapeWidthHeight(rows: Double,
                                                 columns: Double): js.Tuple2[Double, Double] =
      js.native
    def getUnpackedArraySizeFromMatrixSize(matrixSize: Double, channelsPerTexture: Double): Double =
      js.native
    def getColorMatrixTextureShapeWidthHeight(rows: Double,
                                              columns: Double): js.Tuple2[Double, Double] =
      js.native
    def getMatrixSizeFromUnpackedArraySize(unpackedSize: Double,
                                           channelsPerTexture: Double): Double = js.native
    type TypedArray = Float32Array | Uint8Array
    def encodeMatrixToUnpackedArray(matrix: TypedArray,
                                    unpackedArray: TypedArray,
                                    channelsPerTexture: Double): Unit = js.native
    val FLOAT_MAX: Double                                             = js.native
    val FLOAT_MIN: Double                                             = js.native
    val BYTE_NAN_VALUE: Double                                        = js.native
    def encodeFloatArray(floatArray: Float32Array): Uint8Array        = js.native
    def decodeToFloatArray(uintArray: Uint8Array): Float32Array       = js.native
    def decodeMatrixFromUnpackedArray(unpackedArray: Float32Array,
                                      matrix: Float32Array,
                                      channelsPerTexture: Double): Unit = js.native
    def decodeMatrixFromUnpackedColorRGBAArray(unpackedArray: Float32Array,
                                               matrix: Float32Array,
                                               channels: Double): Unit = js.native
    def getPackedMatrixTextureShapeWidthHeight(rows: Double,
                                               columns: Double): js.Tuple2[Double, Double] =
      js.native
    def getPackedRGBAArraySizeFromMatrixShape(rows: Double, columns: Double): Double = js.native
    def encodeMatrixToPackedRGBA(matrix: Float32Array,
                                 rows: Double,
                                 columns: Double,
                                 packedRGBA: Float32Array): Float32Array = js.native
    def decodeMatrixFromPackedRGBA(packedRGBA: Float32Array,
                                   rows: Double,
                                   columns: Double,
                                   matrix: Float32Array): Float32Array = js.native
  }

}

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

package io.brunk.deeplearnjs.math.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package tex_util {

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
    val FLOAT_MAX: js.Any                                             = js.native
    val FLOAT_MIN: Double                                             = js.native
    val BYTE_NAN_VALUE: js.Any                                        = js.native
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

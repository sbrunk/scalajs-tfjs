package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
sealed trait TextureType extends js.Object {
}

@js.native
@JSGlobal
object TextureType extends js.Object {
  var FLOAT: TextureType = js.native
  var UNSIGNED_BYTE: TextureType = js.native
  @JSBracketAccess
  def apply(value: TextureType): String = js.native
}

@js.native
trait TextureData extends js.Object {
  var texture: WebGLTexture = js.native
  var shape: js.Array[Double] = js.native
  var texShape: js.Tuple2[Double, Double] = js.native
  var dtype: DataType = js.native
  var values: js.Any = js.native
  var texType: TextureType = js.native
}

@js.native
@JSGlobalScope
object Tex_util extends js.Object {
  def getUnpackedMatrixTextureShapeWidthHeight(rows: Double, columns: Double): js.Tuple2[Double, Double] = js.native
  def getUnpackedArraySizeFromMatrixSize(matrixSize: Double, channelsPerTexture: Double): Double = js.native
  def getColorMatrixTextureShapeWidthHeight(rows: Double, columns: Double): js.Tuple2[Double, Double] = js.native
  def getMatrixSizeFromUnpackedArraySize(unpackedSize: Double, channelsPerTexture: Double): Double = js.native
  type TypedArray = Float32Array | Uint8Array
  def encodeMatrixToUnpackedArray(matrix: TypedArray, unpackedArray: TypedArray, channelsPerTexture: Double): Unit = js.native
  val FLOAT_MAX: Int = js.native
  val FLOAT_MIN: Double = js.native
  val BYTE_NAN_VALUE: Int = js.native
  def encodeFloatArray(floatArray: Float32Array): Uint8Array = js.native
  def decodeToFloatArray(uintArray: Uint8Array): Float32Array = js.native
  def decodeMatrixFromUnpackedArray(unpackedArray: Float32Array, matrix: Float32Array, channelsPerTexture: Double): Unit = js.native
  def decodeMatrixFromUnpackedColorRGBAArray(unpackedArray: Float32Array, matrix: Float32Array, channels: Double): Unit = js.native
  def getPackedMatrixTextureShapeWidthHeight(rows: Double, columns: Double): js.Tuple2[Double, Double] = js.native
  def getPackedRGBAArraySizeFromMatrixShape(rows: Double, columns: Double): Double = js.native
  def encodeMatrixToPackedRGBA(matrix: Float32Array, rows: Double, columns: Double, packedRGBA: Float32Array): Float32Array = js.native
  def decodeMatrixFromPackedRGBA(packedRGBA: Float32Array, rows: Double, columns: Double, matrix: Float32Array): Float32Array = js.native
}

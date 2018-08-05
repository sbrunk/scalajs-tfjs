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

package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package array_ops {

@js.native
@JSGlobalScope
object Array_ops extends js.Object {
  def clone_[T <: Tensor](x: T | TensorLike): T = js.native
  def eye_(numRows: Double, numColumns: Double = ???, batchShape: js.Tuple1[Double] | js.Tuple2[Double, Double] | js.Tuple3[Double, Double, Double] | js.Tuple4[Double, Double, Double, Double] = ???, dtype: DataType = ???): Tensor2D = js.native
  def randomNormal_[R <: Rank](shape: js.Any, mean: Double = ???, stdDev: Double = ???, dtype: String = ???, seed: Double = ???): Tensor[R] = js.native
  def truncatedNormal_[R <: Rank](shape: js.Any, mean: Double = ???, stdDev: Double = ???, dtype: String = ???, seed: Double = ???): Tensor[R] = js.native
  def randomUniform_[R <: Rank](shape: js.Any, minval: Double = ???, maxval: Double = ???, dtype: DataType = ???): Tensor[R] = js.native
  def rand_[R <: Rank](shape: js.Any, randFunction: js.Function0[Double], dtype: DataType = ???): Tensor[R] = js.native
  def multinomial_(logits: Tensor1D | Tensor2D | TensorLike, numSamples: Double, seed: Double = ???, normalized: Boolean = ???): Tensor1D | Tensor2D = js.native
  def oneHot_(indices: Tensor1D | TensorLike1D, depth: Double, onValue: Double = ???, offValue: Double = ???): Tensor2D = js.native
  def fromPixels_(pixels: ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement, numChannels: Double = ???): Tensor3D = js.native
  def toPixels(img: Tensor2D | Tensor3D | TensorLike, canvas: HTMLCanvasElement = ???): Promise[Uint8ClampedArray] = js.native
  def reshape_[R2 <: Rank](x: Tensor | TensorLike, shape: js.Any): Tensor[R2] = js.native
  def squeeze_[T <: Tensor](x: Tensor | TensorLike, axis: js.Array[Double] = ???): T = js.native
  def cast_[T <: Tensor](x: T | TensorLike, dtype: DataType): T = js.native
  def tile_[T <: Tensor](x: T | TensorLike, reps: js.Array[Double]): T = js.native
  def pad1d_(x: Tensor1D | TensorLike, paddings: js.Tuple2[Double, Double], constantValue: Double = ???): Tensor1D = js.native
  def pad2d_(x: Tensor2D | TensorLike, paddings: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], constantValue: Double = ???): Tensor2D = js.native
  def pad3d_(x: Tensor3D | TensorLike, paddings: js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]], constantValue: Double = ???): Tensor3D = js.native
  def pad4d_(x: Tensor4D | TensorLike, paddings: js.Tuple4[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]], constantValue: Double = ???): Tensor4D = js.native
  def pad_[T <: Tensor](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double = ???): T = js.native
  def stack_[T <: Tensor](tensors: js.Array[T] | js.Array[TensorLike], axis: Double = ???): Tensor = js.native
  def batchToSpaceND_[T <: Tensor](x: T | TensorLike, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = js.native
  def spaceToBatchND_[T <: Tensor](x: T | TensorLike, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = js.native
  def unstack_[T <: Tensor](x: T | TensorLike, axis: Double = ???): js.Array[Tensor] = js.native
  def split_[T <: Tensor](x: T | TensorLike, numOrSizeSplits: js.Array[Double] | Double, axis: Double = ???): js.Array[T] = js.native
  def cumsum_[T <: Tensor](x: Tensor | TensorLike, axis: Double = ???, exclusive: Boolean = ???, reverse: Boolean = ???): T = js.native
  def expandDims_[R2 <: Rank](x: Tensor | TensorLike, axis: Double = ???): Tensor[R2] = js.native
  def buffer[R <: Rank](shape: js.Any, dtype: DataType = ???, values: TypedArray = ???): TensorBuffer[R] = js.native
  def print[T <: Tensor](x: T, verbose: Boolean = ???): Unit = js.native
  val cast: cast_.type = js.native
  val clone: clone_.type = js.native
  val cumsum: cumsum_.type = js.native
  val expandDims: expandDims_.type = js.native
  val eye: eye_.type = js.native
  val fromPixels: fromPixels_.type = js.native
  val multinomial: multinomial_.type = js.native
  val oneHot: oneHot_.type = js.native
  val pad: pad_.type = js.native
  val pad1d: pad1d_.type = js.native
  val pad2d: pad2d_.type = js.native
  val pad3d: pad3d_.type = js.native
  val pad4d: pad4d_.type = js.native
  val rand: rand_.type = js.native
  val randomNormal: randomNormal_.type = js.native
  val randomUniform: randomUniform_.type = js.native
  val reshape: reshape_.type = js.native
  val split: split_.type = js.native
  val squeeze: squeeze_.type = js.native
  val stack: stack_.type = js.native
  val tile: tile_.type = js.native
  val truncatedNormal: truncatedNormal_.type = js.native
  val unstack: unstack_.type = js.native
  val batchToSpaceND: batchToSpaceND_.type = js.native
  val spaceToBatchND: spaceToBatchND_.type = js.native
}

}

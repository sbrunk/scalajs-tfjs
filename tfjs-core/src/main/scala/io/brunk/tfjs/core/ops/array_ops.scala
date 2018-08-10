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

import io.brunk.tfjs.core.TensorModule._
import io.brunk.tfjs.core.{ DataType, Rank, Tensor, TensorBuffer, TensorModule }
import io.brunk.tfjs.core.Types._
import org.scalajs.dom.{ ImageData, html }

import scala.scalajs.js
import js.annotation._
import js.{ Promise, | }
import scala.scalajs.js.typedarray.Uint8ClampedArray

@js.native
trait ArrayOps extends js.Object {
  def clone[T <: TensorND](x: T | TensorLike): T                                   = js.native
  def eye(
      numRows: Double,
      numColumns: Double = ???,
      batchShape: Tuple1[Double] | js.Tuple2[Double, Double] | js.Tuple3[Double, Double, Double] | js.Tuple4[Double, Double, Double, Double] = ???,
      dtype: DataType = ???
  ): Tensor2D = js.native
  def randomNormal[R <: Rank](
      shape: R#Shape,
      mean: Double = ???,
      stdDev: Double = ???,
      dtype: String = ???,
      seed: Double = ???
  ): Tensor[R] = js.native
  def truncatedNormal[R <: Rank](
      shape: R#Shape,
      mean: Double = ???,
      stdDev: Double = ???,
      dtype: String = ???,
      seed: Double = ???
  ): Tensor[R] = js.native
  def randomUniform[R <: Rank](
      shape: R#Shape,
      minval: Double = ???,
      maxval: Double = ???,
      dtype: DataType = ???
  ): Tensor[R] = js.native
  def rand[R <: Rank](
      shape: R#Shape,
      randFunction: js.Function0[Double],
      dtype: DataType = ???
  ): Tensor[R] = js.native
  def multinomial(
      logits: Tensor1D | Tensor2D | TensorLike,
      numSamples: Double,
      seed: Double = ???,
      normalized: Boolean = ???
  ): Tensor1D | Tensor2D = js.native
  def oneHot(
      indices: Tensor1D | TensorLike1D,
      depth: Double,
      onValue: Double = ???,
      offValue: Double = ???
  ): Tensor2D = js.native
  def fromPixels(
      pixels: ImageData | html.Image | html.Canvas | html.Video,
      numChannels: Double = ???
  ): Tensor3D = js.native
  def toPixels(
      img: Tensor2D | Tensor3D | TensorLike,
      canvas: html.Canvas = ???
  ): Promise[Uint8ClampedArray]                                             = js.native
  def reshape[R2 <: Rank](x: TensorND | TensorLike, shape: R2#Shape): Tensor[R2]           = js.native
  def squeeze[T <: TensorND](x: TensorND | TensorLike, axis: js.Array[Double] = ???): T  = js.native
  def cast[T <: TensorND](x: T | TensorLike, dtype: DataType): T                         = js.native
  def tile[T <: TensorND](x: T | TensorLike, reps: js.Array[Double]): T                  = js.native
  def pad1d(
      x: Tensor1D | TensorLike,
      paddings: js.Tuple2[Double, Double],
      constantValue: Double = ???
  ): Tensor1D = js.native
  def pad2d(
      x: Tensor2D | TensorLike,
      paddings: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
      constantValue: Double = ???
  ): Tensor2D = js.native
  def pad3d(
      x: Tensor3D | TensorLike,
      paddings: js.Tuple3[
        js.Tuple2[Double, Double],
        js.Tuple2[Double, Double],
        js.Tuple2[Double, Double]
      ],
      constantValue: Double = ???
  ): Tensor3D = js.native
  def pad4d(
      x: Tensor4D | TensorLike,
      paddings: js.Tuple4[
        js.Tuple2[Double, Double],
        js.Tuple2[Double, Double],
        js.Tuple2[Double, Double],
        js.Tuple2[Double, Double]
      ],
      constantValue: Double = ???
  ): Tensor4D = js.native
  def pad[T <: TensorND](
      x: T | TensorLike,
      paddings: js.Array[js.Tuple2[Double, Double]],
      constantValue: Double = ???
  ): T = js.native
  def stack[T <: TensorND](tensors: js.Array[T] | js.Array[TensorLike], axis: Double = ???): TensorND = js.native
  def batchToSpaceND[T <: TensorND](
    x: T | TensorLike,
    blockShape: js.Array[Double],
    crops: js.Array[js.Array[Double]]
  ): T = js.native
  def spaceToBatchND[T <: TensorND](
    x: T | TensorLike,
    blockShape: js.Array[Double],
    paddings: js.Array[js.Array[Double]]
  ): T = js.native
  def unstack[T <: TensorND](value: T | TensorLike, axis: Double = ???): js.Array[TensorND] = js.native
  def split[T <: TensorND](
      x: T | TensorLike,
      numOrSizeSplits: js.Array[Double] | Double,
      axis: Double = ???
  ): js.Array[T] = js.native
  def cumsum[T <: TensorND](
      x: TensorND | TensorLike,
      axis: Double = ???,
      exclusive: Boolean = ???,
      reverse: Boolean = ???
  ): T                                                                    = js.native
  def expandDims[R2 <: Rank](x: TensorND | TensorLike, axis: Double = ???): Tensor[R2] = js.native
  def buffer[R <: Rank](
      shape: R#Shape,
      dtype: DataType = ???,
      values: TypedArray = ???
  ): TensorBuffer[R]                                           = js.native
  def print[T <: TensorND](x: T, verbose: Boolean = ???): Unit = js.native
}

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
  def tensor[R <: Rank](
      values: TensorLike,
      shape: R#Shape = ???,
      dtype: DataType = ???
  ): Tensor[R] =
    js.native
  def scalar(value: Double | Boolean, dtype: DataType = ???): Scalar  = js.native
  def tensor1d(values: TensorLike1D, dtype: DataType = ???): Tensor1D = js.native
  def tensor2d(
      values: TensorLike2D,
      shape: js.Tuple2[Double, Double] = ???,
      dtype: DataType = ???
  ): Tensor2D = js.native
  def tensor3d(
      values: TensorLike3D,
      shape: js.Tuple3[Double, Double, Double] = ???,
      dtype: DataType = ???
  ): Tensor3D = js.native
  def tensor4d(
      values: TensorLike4D,
      shape: js.Tuple4[Double, Double, Double, Double] = ???,
      dtype: DataType = ???
  ): Tensor4D = js.native
  def tensor5d(
      values: TensorLike5D,
      shape: js.Tuple5[Double, Double, Double, Double, Double] = ???,
      dtype: DataType = ???
  ): Tensor5D = js.native
  def tensor6d(
      values: TensorLike6D,
      shape: js.Tuple6[Double, Double, Double, Double, Double, Double] = ???,
      dtype: DataType = ???
  ): Tensor6D                                                                          = js.native
  def ones[R <: Rank](shape: R#Shape, dtype: DataType = ???): Tensor[R]                = js.native
  def zeros[R <: Rank](shape: R#Shape, dtype: DataType = ???): Tensor[R]               = js.native
  def fill[R <: Rank](shape: R#Shape, value: Double, dtype: DataType = ???): Tensor[R] = js.native
  def onesLike[T <: TensorND](x: T): T                                                 = js.native
  def zerosLike[T <: TensorND](x: T): T                                                = js.native
  def clone[T <: TensorND](x: T): T                                                    = js.native
  def eye(
      numRows: Double,
      numColumns: Double = ???,
      batchShape: Tuple1[Double] | js.Tuple2[Double, Double] = ???,
      dtype: DataType = ???
  ): Tensor2D = js.native
  def randomNormal[R <: Rank](
      shape: js.Any,
      mean: Double = ???,
      stdDev: Double = ???,
      dtype: String = ???,
      seed: Double = ???
  ): Tensor[R] = js.native
  def truncatedNormal[R <: Rank](
      shape: js.Any,
      mean: Double = ???,
      stdDev: Double = ???,
      dtype: String = ???,
      seed: Double = ???
  ): Tensor[R] = js.native
  def randomUniform[R <: Rank](
      shape: js.Any,
      minval: Double = ???,
      maxval: Double = ???,
      dtype: DataType = ???
  ): Tensor[R] = js.native
  def rand[R <: Rank](
      shape: js.Any,
      randFunction: js.Function0[Double],
      dtype: DataType = ???
  ): Tensor[R] = js.native
  def multinomial(
      logits: Tensor1D | Tensor2D,
      numSamples: Double,
      seed: Double = ???,
      normalized: Boolean = ???
  ): Tensor1D | Tensor2D = js.native
  def oneHot(
      indices: Tensor1D,
      depth: Double,
      onValue: Double = ???,
      offValue: Double = ???
  ): Tensor2D = js.native
  def fromPixels(
      pixels: ImageData | html.Image | html.Canvas | html.Video,
      numChannels: Double = ???
  ): Tensor3D = js.native
  def toPixels(
      img: Tensor2D | Tensor3D,
      canvas: html.Canvas = ???
  ): Promise[Uint8ClampedArray]                                             = js.native
  def reshape[R2 <: Rank](x: TensorND, shape: js.Any): Tensor[R2]           = js.native
  def squeeze[T <: TensorND](x: TensorND, axis: js.Array[Double] = ???): T  = js.native
  def cast[T <: TensorND](x: T, dtype: DataType): T                         = js.native
  def tile[T <: TensorND](x: T, reps: js.Array[Double]): T                  = js.native
  def gather[T <: TensorND](x: T, indices: Tensor1D, axis: Double = ???): T = js.native
  def pad1d(
      x: Tensor1D,
      paddings: js.Tuple2[Double, Double],
      constantValue: Double = ???
  ): Tensor1D = js.native
  def pad2d(
      x: Tensor2D,
      paddings: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
      constantValue: Double = ???
  ): Tensor2D = js.native
  def pad3d(
      x: Tensor3D,
      paddings: js.Tuple3[
        js.Tuple2[Double, Double],
        js.Tuple2[Double, Double],
        js.Tuple2[Double, Double]
      ],
      constantValue: Double = ???
  ): Tensor3D = js.native
  def pad4d(
      x: Tensor4D,
      paddings: js.Tuple4[
        js.Tuple2[Double, Double],
        js.Tuple2[Double, Double],
        js.Tuple2[Double, Double],
        js.Tuple2[Double, Double]
      ],
      constantValue: Double = ???
  ): Tensor4D = js.native
  def pad[T <: TensorND](
      x: T,
      paddings: js.Array[js.Tuple2[Double, Double]],
      constantValue: Double = ???
  ): T                                                                         = js.native
  def stack[T <: TensorND](tensors: js.Array[T], axis: Double = ???): TensorND = js.native
  def unstack[T <: TensorND](value: T, axis: Double = ???): js.Array[TensorND] = js.native
  def split[T <: TensorND](
      x: T,
      numOrSizeSplits: js.Array[Double] | Double,
      axis: Double = ???
  ): js.Array[T] = js.native
  def cumsum[T <: TensorND](
      x: TensorND,
      axis: Double = ???,
      exclusive: Boolean = ???,
      reverse: Boolean = ???
  ): T                                                                    = js.native
  def expandDims[R2 <: Rank](x: TensorND, axis: Double = ???): Tensor[R2] = js.native
  def linspace(start: Double, stop: Double, num: Double): Tensor1D        = js.native
  def range(start: Double, stop: Double, step: Double = ???, dtype: String = ???): Tensor1D =
    js.native
  def buffer[R <: Rank](
      shape: js.Any,
      dtype: DataType = ???,
      values: TypedArray = ???
  ): TensorBuffer[R]                                           = js.native
  def print[T <: TensorND](x: T, verbose: Boolean = ???): Unit = js.native
}

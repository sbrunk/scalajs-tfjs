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

package conv {

@js.native
@JSGlobalScope
object Conv extends js.Object {
  def conv1d_[T <: Tensor2D | Tensor3D](x: T | TensorLike, filter: Tensor3D | TensorLike, stride: Double, pad: String | Double, dataFormat: String = ???, dilation: Double = ???, dimRoundingMode: String = ???): T = js.native
  def conv2d_[T <: Tensor3D | Tensor4D](x: T | TensorLike, filter: Tensor4D | TensorLike, strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dataFormat: String = ???, dilations: js.Tuple2[Double, Double] | Double = ???, dimRoundingMode: String = ???): T = js.native
  def conv2dTranspose_[T <: Tensor3D | Tensor4D](x: T | TensorLike, filter: Tensor4D | TensorLike, outputShape: js.Tuple4[Double, Double, Double, Double] | js.Tuple3[Double, Double, Double], strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dimRoundingMode: String = ???): T = js.native
  def depthwiseConv2d_[T <: Tensor3D | Tensor4D](x: T | TensorLike, filter: Tensor4D | TensorLike, strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dataFormat: String = ???, dilations: js.Tuple2[Double, Double] | Double = ???, dimRoundingMode: String = ???): T = js.native
  def separableConv2d_[T <: Tensor3D | Tensor4D](x: T | TensorLike, depthwiseFilter: Tensor4D | TensorLike, pointwiseFilter: Tensor4D | TensorLike, strides: js.Tuple2[Double, Double] | Double, pad: String, dilation: js.Tuple2[Double, Double] | Double = ???, dataFormat: String = ???): T = js.native
  val conv1d: conv1d_.type = js.native
  val conv2d: conv2d_.type = js.native
  val depthwiseConv2d: depthwiseConv2d_.type = js.native
  val separableConv2d: separableConv2d_.type = js.native
  val conv2dTranspose: conv2dTranspose_.type = js.native
}

}

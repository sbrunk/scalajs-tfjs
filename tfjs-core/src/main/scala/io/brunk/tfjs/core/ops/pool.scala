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

import io.brunk.tfjs.core.TensorModule.{Tensor3D, Tensor4D}

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait PoolOps extends js.Object {
  def maxPool[T <: Tensor3D | Tensor4D](
      x: T,
      filterSize: js.Tuple2[Double, Double] | Double,
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dimRoundingMode: String = ???
  ): T = js.native
  private def maxPoolBackprop(
      dy: Tensor4D,
      input: Tensor4D,
      output: Tensor4D,
      filterSize: js.Tuple2[Double, Double] | Double,
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dimRoundingMode: String = ???
  ): Tensor4D = js.native
  def avgPool[T <: Tensor3D | Tensor4D](
      x: T,
      filterSize: js.Tuple2[Double, Double] | Double,
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double,
      dimRoundingMode: String = ???
  ): T = js.native
  private def avgPoolBackprop[T <: Tensor3D | Tensor4D](
      dy: T,
      input: T,
      filterSize: js.Tuple2[Double, Double] | Double,
      strides: js.Tuple2[Double, Double] | Double,
      pad: String | Double
  ): T = js.native
}

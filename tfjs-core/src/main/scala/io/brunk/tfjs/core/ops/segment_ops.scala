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

package segment_ops {

@js.native
@JSGlobalScope
object Segment_ops extends js.Object {
  def unsortedSegmentSum_[T <: Tensor](x: T | TensorLike, segmentIds: Tensor1D | TensorLike, numSegments: Double): T = js.native
  def gather_[T <: Tensor](x: T | TensorLike, indices: Tensor1D | TensorLike, axis: Double = ???): T = js.native
  val gather: gather_.type = js.native
  val unsortedSegmentSum: unsortedSegmentSum_.type = js.native
}

}

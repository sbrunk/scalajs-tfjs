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

import io.brunk.tfjs.core.TensorModule.TensorND

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait Ops
    extends Batchnorm
    with Concat
    with Conv
    with Matmul
    with Reverse
    with Pool
    with Slice
    with UnaryOps
    with ReductionOps
    with Compare
    with BinaryOps
    with ReluOps
    with LogicalOps
    with ArrayOps
    with TensorOps
    with Transpose
    with Softmax
    with Lrn
    with Norm
    with SegmentOps
    with Lstm
    with MovingAverage
    with StridedSlice
    with Topk
    with Operation {
  // Second level exports.
  val image: ImageOps   = js.native
  val linalg: LinalgOps = js.native
  // TODO operation
  val losses: LossOps = js.native
}

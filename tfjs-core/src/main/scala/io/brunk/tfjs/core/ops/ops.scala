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
trait Losses extends LossOps with SoftmaxLossOps

@js.native
trait Image extends ImageOps

@js.native
trait Ops
    extends BatchNormOps
    with ConcatOps
    with ConvOps
    with MatmulOps
    with PoolOps
    with TransposeOps
    with ReverseOps
    with SliceOps
    with StridedSliceOps
    with ReductionOps
    with SegmentOps
    with CompareOps
    with LogicalOps
    with UnaryOps
    with BinaryOps
    with NormOps
    with ArrayOps
    with MovingAverageOps
    with LSTMOps
    with SoftmaxOps
    with SigmoidCrossEntropyOps
    with LRNOps {
  val linalg: LinalgOps = js.native
  // TODO operation
  val losses: Losses = js.native
  val image: Image   = js.native
}

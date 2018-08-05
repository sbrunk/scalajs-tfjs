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

package segment_util {

@js.native
trait SegOpInfo extends js.Object {
  var windowSize: Double = js.native
  var batchSize: Double = js.native
  var inSize: Double = js.native
  var numSegments: Double = js.native
}

@js.native
@JSGlobalScope
object Segment_util extends js.Object {
  def segOpComputeOptimalWindowSize(inSize: Double, numSegments: Double): Double = js.native
  def computeOutShape(aShape: js.Array[Double], axis: Double, numSegments: Double): js.Array[Double] = js.native
}

}

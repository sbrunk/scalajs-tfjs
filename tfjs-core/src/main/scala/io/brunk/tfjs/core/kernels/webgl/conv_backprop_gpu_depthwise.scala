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

package io.brunk.tfjs.core.kernels.webgl

import io.brunk.tfjs.core.ops.Conv_util.Conv2DInfo

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class DepthwiseConv2DDerFilterProgram protected () extends GPGPUProgram {
  def this(convInfo: Conv2DInfo) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double]   = js.native
  var userCode: String                = js.native
}

@js.native
@JSGlobal
class DepthwiseConv2DDerInputProgram protected () extends GPGPUProgram {
  def this(convInfo: Conv2DInfo) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double]   = js.native
  var userCode: String                = js.native
}

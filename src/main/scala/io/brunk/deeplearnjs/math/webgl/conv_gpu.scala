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

package io.brunk.deeplearnjs.math.webgl

import io.brunk.deeplearnjs.math.Conv_util.ConvInfo

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
@JSGlobal
class Conv2DProgram protected () extends GPGPUProgram {
  def this(convInfo: ConvInfo, hasBias: Boolean) = this()
  var variableNames: js.Array[String] = js.native
  var params: js.Array[js.Any]        = js.native
  var outputShape: js.Array[Double]   = js.native
  var userCode: String                = js.native

  var supportsBroadcasting: Boolean | Unit = js.native
  var numBatchDims: Double | Unit          = js.native
}

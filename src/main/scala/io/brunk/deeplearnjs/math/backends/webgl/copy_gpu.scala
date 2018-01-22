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

package io.brunk.deeplearnjs.math.backends.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package copy_gpu {

  @js.native
  @JSGlobal
  class Copy2DProgram protected () extends GPGPUProgram {
    def this(srcNumCols: Double, destNumCols: Double) = this()
    var variableNames: js.Array[String] = js.native
    var outputShape: js.Array[Double]   = js.native
    var userCode: String                = js.native
    def getCustomSetupFunc(
        sourceStart: js.Tuple2[Double, Double],
        destStart: js.Tuple2[Double, Double],
        destSize: js.Tuple2[Double, Double]
    ): js.Function2[GPGPUContext, WebGLProgram, Unit] = js.native
  }

}
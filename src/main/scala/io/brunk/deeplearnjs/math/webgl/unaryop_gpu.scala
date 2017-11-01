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

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
@JSGlobal
class UnaryOpProgram protected () extends GPGPUProgram {
  def this(aShape: js.Array[Double], opSnippet: String) = this()
  var variableNames: js.Array[String] = js.native
  var params: js.Array[js.Any]        = js.native
  var userCode: String                = js.native
  var outputShape: js.Array[Double]   = js.native

  var supportsBroadcasting: Boolean | Unit = js.native
  var numBatchDims: Double | Unit          = js.native
}

@js.native
@JSGlobalScope
object Unaryop_gpu extends js.Object {
  val CHECK_NAN_SNIPPET: js.Any         = js.native
  val ABS: js.Any                       = js.native
  val RELU: js.Any                      = js.native
  val ELU: js.Any                       = js.native
  def LEAKY_RELU(alpha: Double): String = js.native
  val STEP: js.Any                      = js.native
  val NEG: js.Any                       = js.native
  val CEIL: js.Any                      = js.native
  val FLOOR: js.Any                     = js.native
  val EXP: js.Any                       = js.native
  val LOG: js.Any                       = js.native
  val SQRT: String                      = js.native
  val SIGMOID: js.Any                   = js.native
  val SIN: String                       = js.native
  val COS: String                       = js.native
  val TAN: js.Any                       = js.native
  val ASIN: String                      = js.native
  val ACOS: String                      = js.native
  val ATAN: String                      = js.native
  val SINH: js.Any                      = js.native
  val COSH: js.Any                      = js.native
  val TANH: js.Any                      = js.native
}

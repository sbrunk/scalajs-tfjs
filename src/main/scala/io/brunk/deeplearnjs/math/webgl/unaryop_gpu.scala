/*
 * Copyright (c) 2017 Sören Brunk
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.brunk.deeplearnjs.math.webgl

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
@JSGlobal
class UnaryOpProgram protected () extends GPGPUProgram {
  def this(aShape: js.Array[Double], opSnippet: String) = this()
  var variableNames: js.Array[String]      = js.native
  var params: js.Array[js.Any]             = js.native
  var userCode: String                     = js.native
  var outputShape: js.Array[Double]        = js.native
  var supportsBroadcasting: Boolean | Unit = js.native
}

@js.native
@JSGlobalScope
object Unaryop_gpu extends js.Object {
  val CHECK_NAN_SNIPPET: String = js.native
  val ABS: String               = js.native
  val RELU: String              = js.native
  val STEP: String              = js.native
  val NEG: String               = js.native
  val EXP: String               = js.native
  val LOG: String               = js.native
  val SQRT: String              = js.native
  val SIGMOID: String           = js.native
  val SIN: String               = js.native
  val COS: String               = js.native
  val TAN: String               = js.native
  val ASIN: String              = js.native
  val ACOS: String              = js.native
  val ATAN: String              = js.native
  val SINH: String              = js.native
  val COSH: String              = js.native
  val TANH: String              = js.native
}

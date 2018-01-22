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

package io.brunk.deeplearnjs.math.backends.types

import io.brunk.deeplearnjs.Util.NamedArrayMap
import io.brunk.deeplearnjs.math.Array2D
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }
import io.brunk.deeplearnjs.math.backends.Tape_types.TapeNodeInputGradientArrays
import io.brunk.deeplearnjs.math.backends.tape_types.KernelInputConfig

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait MatMulNode extends KernelNode {
  var inputAndArgs: MatMulInputConfig                                     = js.native
  var output: Array2D                                                     = js.native
  var gradient: js.Function2[Array2D, Array2D, MatMulGradientInputArrays] = js.native
}

@js.native
trait MatMulInputConfig extends KernelInputConfig {
  var inputs: MatMulInputArrays    = js.native
  var args: MatMulInputConfig.Args = js.native
}

object MatMulInputConfig {

  @js.native
  trait Args extends js.Object {
    var aOrientation: MatrixOrientation = js.native
    var bOrientation: MatrixOrientation = js.native
  }
}

@js.native
trait MatMulInputArrays extends NamedArrayMap {
  var a: Array2D = js.native
  var b: Array2D = js.native
}

@js.native
trait MatMulGradientInputArrays extends TapeNodeInputGradientArrays {
  var a: js.Function0[Array2D] = js.native
  var b: js.Function0[Array2D] = js.native
}

@js.native
sealed trait MatrixOrientation extends js.Object {}

@js.native
@JSGlobal
object MatrixOrientation extends js.Object {
  var REGULAR: MatrixOrientation    = js.native
  var TRANSPOSED: MatrixOrientation = js.native
  @JSBracketAccess
  def apply(value: MatrixOrientation): String = js.native
}

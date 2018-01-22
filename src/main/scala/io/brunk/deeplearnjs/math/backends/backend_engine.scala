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

package io.brunk.deeplearnjs.math.backends

import io.brunk.deeplearnjs.Util.NamedArrayMap
import io.brunk.deeplearnjs.math.{ NDArray, Scalar }
import io.brunk.deeplearnjs.math.NdarrayModule.{ DataType, Rank }
import io.brunk.deeplearnjs.math.backends.Tape_util.{ ScopeResult, ScopeResultImmediate }

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
@JSGlobal
class BackendEngine protected () extends js.Object {
  def this(backend: MathBackend, safeMode: Boolean) = this()
  def enableDebugMode(): Unit = js.native
  def executeKernel[K <: String, C <: js.Any](kernelName: K,
                                              config: C,
                                              grad: js.Any = ???): js.Any = js.native
  def customGradient[D <: DataType, R <: Rank](f: js.Function0[js.Any],
                                               inputs: NamedArrayMap,
                                               name: String): NDArray[D, R] = js.native
  def gradients(f: js.Function0[Scalar],
                xs: js.Array[NDArray],
                returnValue: Boolean): js.Array[NDArray] | js.Any = js.native
  def vjp[T <: NDArray](f: js.Function0[T], xs: js.Array[NDArray], dy: T): js.Array[NDArray] =
    js.native
  def scope[T <: ScopeResult](name: String,
                              scopeFn: js.Function2[js.Function, js.Function, T],
                              gradientsMode: Boolean): T                   = js.native
  def startScope(gradientsMode: Boolean): Unit                             = js.native
  def endScope(result: ScopeResultImmediate, gradientsMode: Boolean): Unit = js.native
  def keep[T <: NDArray](result: T): T                                     = js.native
  def track[D <: DataType, T <: NDArray[D]](result: T): T                  = js.native
  def getBackend(): MathBackend                                            = js.native
}

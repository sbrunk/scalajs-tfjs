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

package io.brunk.deeplearnjs.math

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait ActivationFunction extends js.Object {
  def output[T <: NDArray](math: NDArrayMath, input: T): T
  def der[T <: NDArray](math: NDArrayMath, input: T, output: T): T
  def dispose(): Unit
}

@js.native
@JSGlobal
class TanHFunc extends ActivationFunction {
  def output[T <: NDArray](math: NDArrayMath, x: T): T    = js.native
  def der[T <: NDArray](math: NDArrayMath, x: T, y: T): T = js.native
  def dispose(): Unit                                     = js.native
}

@js.native
@JSGlobal
class ReLUFunc extends ActivationFunction {
  def output[T <: NDArray](math: NDArrayMath, x: T): T    = js.native
  def der[T <: NDArray](math: NDArrayMath, x: T, y: T): T = js.native
  def dispose(): Unit                                     = js.native
}

@js.native
@JSGlobal
class LeakyReluFunc protected () extends ActivationFunction {
  def this(alpha: Double) = this()
  def output[T <: NDArray](math: NDArrayMath, x: T): T    = js.native
  def der[T <: NDArray](math: NDArrayMath, x: T, y: T): T = js.native
  def dispose(): Unit                                     = js.native
}

@js.native
@JSGlobal
class SigmoidFunc extends ActivationFunction {
  def output[T <: NDArray](math: NDArrayMath, x: T): T    = js.native
  def der[T <: NDArray](math: NDArrayMath, x: T, y: T): T = js.native
  def dispose(): Unit                                     = js.native
}

@js.native
@JSGlobal
class SquareFunc extends ActivationFunction {
  def output[T <: NDArray](math: NDArrayMath, x: T): T    = js.native
  def der[T <: NDArray](math: NDArrayMath, x: T, y: T): T = js.native
  def dispose(): Unit                                     = js.native
}

@js.native
@JSGlobal
class EluFunc extends ActivationFunction {
  def output[T <: NDArray](math: NDArrayMath, x: T): T    = js.native
  def der[T <: NDArray](math: NDArrayMath, x: T, y: T): T = js.native
  def dispose(): Unit                                     = js.native
}

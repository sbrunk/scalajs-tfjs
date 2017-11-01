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

package io.brunk.deeplearnjs.data

import io.brunk.deeplearnjs.math.{ NDArray, NDArrayMath }

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.Uint32Array

@js.native
trait InputProvider extends js.Object {
  def getNextCopy(math: NDArrayMath): NDArray
  def disposeCopy(math: NDArrayMath, copy: NDArray): Unit
}

@js.native
trait ShuffledInputProviderBuilder extends js.Object {
  def getInputProviders(): js.Array[InputProvider]
}

@js.native
@JSImport("deeplearn", "InMemoryShuffledInputProviderBuilder")
abstract class InMemoryShuffledInputProviderBuilder protected ()
    extends ShuffledInputProviderBuilder {
  def this(inputs: js.Array[js.Array[_ <: NDArray]]) = this()
  protected var inputs: js.Array[js.Array[NDArray]] = js.native
  protected var shuffledIndices: Uint32Array        = js.native
  protected var numInputs: Double                   = js.native
  protected var idx: Double                         = js.native
  protected var inputCounter: Double                = js.native
  protected var epoch: Double                       = js.native
  def getCurrentExampleIndex(): Double              = js.native
  def getNextInput(inputId: Double): NDArray        = js.native
  def getEpoch(): Double                            = js.native
  def getInputProviders(): js.Array[InputProvider]  = js.native
  def getInputProvider(inputId: Double): InputProvider
}

@js.native
@JSImport("deeplearn", "InCPUMemoryShuffledInputProviderBuilder")
class InCPUMemoryShuffledInputProviderBuilder protected ()
    extends InMemoryShuffledInputProviderBuilder {
  def this(inputs: js.Array[js.Array[_ <: NDArray]]) = this()
  def getInputProvider(inputId: Double): InputProvider = js.native
}

@js.native
@JSImport("deeplearn", "InGPUMemoryShuffledInputProviderBuilder")
class InGPUMemoryShuffledInputProviderBuilder protected ()
    extends InMemoryShuffledInputProviderBuilder {
  def this(inputs: js.Array[js.Array[_ <: NDArray]]) = this()
  def getInputProvider(inputId: Double): InputProvider = js.native
}

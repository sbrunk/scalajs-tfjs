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

package io.brunk.deeplearnjs.data

import io.brunk.deeplearnjs.math.{ NDArray, NDArrayMath }

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.Uint32Array

@js.native
trait InputProvider extends js.Object {
  def getNextCopy(math: NDArrayMath): NDArray             = js.native
  def disposeCopy(math: NDArrayMath, copy: NDArray): Unit = js.native
}

@js.native
trait ShuffledInputProviderBuilder extends js.Object {
  def getInputProviders(): js.Array[InputProvider] = js.native
}

@js.native
@JSGlobal
abstract class InMemoryShuffledInputProviderBuilder protected ()
    extends ShuffledInputProviderBuilder {
  def this(inputs: js.Array[js.Array[NDArray]]) = this()
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
@JSGlobal
class InCPUMemoryShuffledInputProviderBuilder extends InMemoryShuffledInputProviderBuilder {
  def getInputProvider(inputId: Double): js.Any = js.native
}

@js.native
@JSGlobal
class InGPUMemoryShuffledInputProviderBuilder extends InMemoryShuffledInputProviderBuilder {
  def getInputProvider(inputId: Double): js.Any = js.native
}

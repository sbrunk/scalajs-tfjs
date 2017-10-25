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

package io.brunk.deeplearnjs

import scala.scalajs.js
import js.annotation._
import js.|
@js.native
trait Initializer extends js.Object {
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSGlobal
class VarianceScalingInitializer protected () extends Initializer {
  def this(scale: Double = ???, mode: String = ???, distribution: String = ???) = this()
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSGlobal
class ZerosInitializer extends Initializer {
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSGlobal
class OnesInitializer extends Initializer {
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSGlobal
class ConstantInitializer protected () extends Initializer {
  def this(value: Double = ???) = this()
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSGlobal
class NDArrayInitializer protected () extends Initializer {
  def this(ndarray: NDArray) = this()
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSGlobal
class RandomNormalInitializer protected () extends Initializer {
  def this(mean: Double = ???, stdev: Double = ???) = this()
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSGlobal
class RandomTruncatedNormalInitializer protected () extends Initializer {
  def this(mean: Double = ???, stdev: Double = ???) = this()
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSGlobal
class RandomUniformInitializer protected () extends Initializer {
  def this(minval: Double = ???, maxval: Double = ???) = this()
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

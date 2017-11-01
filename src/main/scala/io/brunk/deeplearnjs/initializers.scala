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

package io.brunk.deeplearnjs

import io.brunk.deeplearnjs.math.NDArray

import scala.scalajs.js
import js.annotation._
import js.|
@js.native
trait Initializer extends js.Object {
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray
}

@js.native
@JSImport("deeplearn", "VarianceScalingInitializer")
class VarianceScalingInitializer protected () extends Initializer {
  def this(scale: Double = ???, mode: String = ???, distribution: String = ???) = this()
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSImport("deeplearn", "ZerosInitializer")
class ZerosInitializer extends Initializer {
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSImport("deeplearn", "OnesInitializer")
class OnesInitializer extends Initializer {
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSImport("deeplearn", "ConstantInitializer")
class ConstantInitializer protected () extends Initializer {
  def this(value: Double = ???) = this()
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSImport("deeplearn", "NDArrayInitializer")
class NDArrayInitializer protected () extends Initializer {
  def this(ndarray: NDArray) = this()
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSImport("deeplearn", "RandomNormalInitializer")
class RandomNormalInitializer protected () extends Initializer {
  def this(mean: Double = ???, stdev: Double = ???) = this()
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSImport("deeplearn", "RandomTruncatedNormalInitializer")
class RandomTruncatedNormalInitializer protected () extends Initializer {
  def this(mean: Double = ???, stdev: Double = ???) = this()
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

@js.native
@JSImport("deeplearn", "RandomUniformInitializer")
class RandomUniformInitializer protected () extends Initializer {
  def this(minval: Double = ???, maxval: Double = ???) = this()
  def initialize(weightsShape: js.Array[Double], inputUnits: Double, outputUnits: Double): NDArray =
    js.native
}

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

package io.brunk.tfjs.layers

import io.brunk.tfjs.layers.Initializers.{ Distribution, FanMode }
import io.brunk.tfjs.layers.Types.Shape

import scala.scalajs.js
import js.annotation._
import js.|
import io.brunk.tfjs.tf._
@js.native
@JSGlobal
abstract class Initializer extends serialization.Serializable {
  def fromConfigUsesCustomObjects(): Boolean = js.native
  @JSName("apply")
  def apply(shape: Shape, dtype: DataType = ???): TensorND
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
class Zeros extends Initializer {
  @JSName("apply")
  def apply(shape: Shape, dtype: DataType = ???): TensorND = js.native
}

@js.native
@JSGlobal
object Zeros extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
class Ones extends Initializer {
  @JSName("apply")
  def apply(shape: Shape, dtype: DataType = ???): TensorND = js.native
}

@js.native
@JSGlobal
object Ones extends js.Object {
  var className: String = js.native
}

@js.native
trait ConstantConfig extends js.Object {
  var value: Double = js.native
}

@js.native
@JSGlobal
class Constant protected () extends Initializer {
  def this(config: ConstantConfig) = this()
  @JSName("apply")
  def apply(shape: Shape, dtype: DataType = ???): TensorND = js.native
  override def getConfig(): serialization.ConfigDict       = js.native
}

@js.native
@JSGlobal
object Constant extends js.Object {
  var className: String = js.native
}

@js.native
trait RandomUniformConfig extends js.Object {
  var minval: Double = js.native
  var maxval: Double = js.native
  var seed: Double   = js.native
}

@js.native
@JSGlobal
class RandomUniform protected () extends Initializer {
  def this(config: RandomUniformConfig) = this()
  def DEFAULT_MINVAL: Double = js.native
  def DEFAULT_MAXVAL: Double = js.native
  @JSName("apply")
  def apply(shape: Shape, dtype: DataType = ???): TensorND = js.native
  override def getConfig(): serialization.ConfigDict       = js.native
}

@js.native
@JSGlobal
object RandomUniform extends js.Object {
  var className: String = js.native
}

@js.native
trait RandomNormalConfig extends js.Object {
  var mean: Double   = js.native
  var stddev: Double = js.native
  var seed: Double   = js.native
}

@js.native
@JSGlobal
class RandomNormal protected () extends Initializer {
  def this(config: RandomNormalConfig) = this()
  def DEFAULT_MEAN: Double   = js.native
  def DEFAULT_STDDEV: Double = js.native
  @JSName("apply")
  def apply(shape: Shape, dtype: DataType = ???): TensorND = js.native
  override def getConfig(): serialization.ConfigDict       = js.native
}

@js.native
@JSGlobal
object RandomNormal extends js.Object {
  var className: String = js.native
}

@js.native
trait TruncatedNormalConfig extends js.Object {
  var mean: Double   = js.native
  var stddev: Double = js.native
  var seed: Double   = js.native
}

@js.native
@JSGlobal
class TruncatedNormal protected () extends Initializer {
  def this(config: TruncatedNormalConfig) = this()
  def DEFAULT_MEAN: Double   = js.native
  def DEFAULT_STDDEV: Double = js.native
  @JSName("apply")
  def apply(shape: Shape, dtype: DataType = ???): TensorND = js.native
  override def getConfig(): serialization.ConfigDict       = js.native
}

@js.native
@JSGlobal
object TruncatedNormal extends js.Object {
  var className: String = js.native
}

@js.native
trait IdentityConfig extends js.Object {
  var gain: Double = js.native
}

@js.native
@JSGlobal
class Identity protected () extends Initializer {
  def this(config: IdentityConfig) = this()
  @JSName("apply")
  def apply(shape: Shape, dtype: DataType = ???): TensorND = js.native
  override def getConfig(): serialization.ConfigDict       = js.native
}

@js.native
@JSGlobal
object Identity extends js.Object {
  var className: String = js.native
}

@js.native
trait VarianceScalingConfig extends js.Object {
  var scale: Double              = js.native
  var mode: FanMode              = js.native
  var distribution: Distribution = js.native
  var seed: Double               = js.native
}

@js.native
@JSGlobal
class VarianceScaling protected () extends Initializer {
  def this(config: VarianceScalingConfig) = this()
  @JSName("apply")
  def apply(shape: Shape, dtype: DataType = ???): TensorND = js.native
  override def getConfig(): serialization.ConfigDict       = js.native
}

@js.native
@JSGlobal
object VarianceScaling extends js.Object {
  var className: String = js.native
}

@js.native
trait SeedOnlyInitializerConfig extends js.Object {
  var seed: Double = js.native
}

@js.native
@JSGlobal
class GlorotUniform protected () extends VarianceScaling {
  def this(config: SeedOnlyInitializerConfig = ???) = this()
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal
class GlorotNormal protected () extends VarianceScaling {
  def this(config: SeedOnlyInitializerConfig = ???) = this()
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal
class HeNormal protected () extends VarianceScaling {
  def this(config: SeedOnlyInitializerConfig = ???) = this()
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal
class LeCunNormal protected () extends VarianceScaling {
  def this(config: SeedOnlyInitializerConfig = ???) = this()
  override def getClassName(): String = js.native
}

@js.native
trait OrthogonalConfig extends SeedOnlyInitializerConfig {
  var gain: Double = js.native
}

@js.native
@JSGlobal
class Orthogonal protected () extends Initializer {
  def this(config: OrthogonalConfig = ???) = this()
  def DEFAULT_GAIN: Double   = js.native
  protected def gain: Double = js.native
  protected def seed: Double = js.native
  @JSName("apply")
  def apply(shape: Shape, dtype: DataType = ???): TensorND = js.native
  override def getConfig(): serialization.ConfigDict       = js.native
}

@js.native
@JSGlobal
object Orthogonal extends js.Object {
  var className: String = js.native
}

@js.native
@JSGlobal
object INITIALIZER_IDENTIFIER_REGISTRY_SYMBOL_MAP extends js.Object {
  var string: String = js.native
}

@js.native
@JSGlobalScope
object Initializers extends js.Object {
  type FanMode = String
  val VALID_FAN_MODE_VALUES: js.Array[String] = js.native
  def checkFanMode(value: String = ???): Unit = js.native
  type Distribution = String
  val VALID_DISTRIBUTION_VALUES: js.Array[String]  = js.native
  def checkDistribution(value: String = ???): Unit = js.native
  type InitializerIdentifier = String
  def serializeInitializer(initializer: Initializer): serialization.ConfigDictValue = js.native
  def getInitializer(
      identifier: InitializerIdentifier | Initializer | serialization.ConfigDict
  ): Initializer = js.native
}

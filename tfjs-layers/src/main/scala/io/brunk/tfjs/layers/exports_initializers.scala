package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|


@js.native
@JSGlobalScope
object Exports_initializers extends js.Object {
  def zeros(): Zeros = js.native
  def ones(): Initializer = js.native
  def constant(config: ConstantConfig): Initializer = js.native
  def randomUniform(config: RandomUniformConfig): Initializer = js.native
  def randomNormal(config: RandomNormalConfig): Initializer = js.native
  def truncatedNormal(config: TruncatedNormalConfig): Initializer = js.native
  def identity(config: IdentityConfig): Initializer = js.native
  def varianceScaling(config: VarianceScalingConfig): Initializer = js.native
  def glorotUniform(config: SeedOnlyInitializerConfig): Initializer = js.native
  def glorotNormal(config: SeedOnlyInitializerConfig): Initializer = js.native
  def heNormal(config: SeedOnlyInitializerConfig): Initializer = js.native
  def leCunNormal(config: SeedOnlyInitializerConfig): Initializer = js.native
  def orthogonal(config: OrthogonalConfig): Initializer = js.native
}


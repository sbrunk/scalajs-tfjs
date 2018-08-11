package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|


@js.native
@JSGlobalScope
object Exports_constraints extends js.Object {
  def maxNorm(config: MaxNormConfig): Constraint = js.native
  def unitNorm(config: UnitNormConfig): Constraint = js.native
  def nonNeg(): Constraint = js.native
  def minMaxNorm(config: MinMaxNormConfig): Constraint = js.native
}


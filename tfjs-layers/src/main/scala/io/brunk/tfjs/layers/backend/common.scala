package io.brunk.tfjs.layers.backend

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Common extends js.Object {
  def epsilon(): Double = js.native
  def setEpsilon(e: Double): Unit = js.native
  def imageDataFormat(): DataFormat = js.native
}

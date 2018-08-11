package io.brunk.tfjs.layers.backend

import scala.scalajs.js
import js.annotation._
import js.|


@js.native
@JSGlobalScope
object State extends js.Object {
  def getNextUniqueTensorId(): Double = js.native
  def getUid(prefix: String = ???): String = js.native
  def getScalar(value: Double, dtype: DataType = ???): Scalar = js.native
  def disposeScalarCache(): Unit = js.native
}


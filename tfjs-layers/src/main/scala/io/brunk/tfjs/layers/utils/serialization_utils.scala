package io.brunk.tfjs.layers.utils

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Serialization_utils extends js.Object {
  def convertPythonicToTs(pythonicConfig: JsonValue, key: String = ???): serialization.ConfigDictValue = js.native
  def convertTsToPythonic(tsConfig: serialization.ConfigDictValue, key: String = ???): JsonValue = js.native
}

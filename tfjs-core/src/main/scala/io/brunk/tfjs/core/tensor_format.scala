package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

package tensor_format {

@js.native
@JSGlobalScope
object Tensor_format extends js.Object {
  def tensorToString(vals: TypedArray, shape: js.Array[Double], dtype: DataType, verbose: Boolean): String = js.native
}

}

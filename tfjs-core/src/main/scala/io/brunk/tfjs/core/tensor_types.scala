package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

package tensor_types {

@js.native
trait TensorContainerObject extends js.Object {
  @JSBracketAccess
  def apply(x: String): TensorContainer = js.native
  @JSBracketAccess
  def update(x: String, v: TensorContainer): Unit = js.native
}

@js.native
trait TensorContainerArray extends js.Array[TensorContainer] {
}

@js.native
trait TensorInfo extends js.Object {
  var name: String = js.native
  var shape: js.Array[Double] = js.native
  var dtype: DataType = js.native
}

@js.native
@JSGlobalScope
object Tensor_types extends js.Object {
  type NamedTensorMap = js.Dictionary[Tensor]
  type NamedVariableMap = js.Dictionary[Variable]
  type TensorContainer = Unit | Tensor | String | Double | Boolean | TensorContainerObject | TensorContainerArray
}

}

package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package linalg_ops {

@js.native
@JSGlobal
class LinalgOps extends js.Object {
}

@js.native
@JSGlobal
object LinalgOps extends js.Object {
  def gramSchmidt(xs: js.Array[Tensor1D] | Tensor2D): js.Array[Tensor1D] | Tensor2D = js.native
}

}

package io.brunk.tfjs.core.kernels

import scala.scalajs.js
import js.annotation._
import js.|

package backend_util {

@js.native
@JSGlobalScope
object Backend_util extends js.Object {
  def castTensor[T <: Tensor[Rank]](x: T, dtype: DataType, backend: KernelBackend): T = js.native
  def reshapeTensor[T <: Tensor[Rank], R <: Rank](x: T, shape: js.Any): Tensor[R] = js.native
}

}

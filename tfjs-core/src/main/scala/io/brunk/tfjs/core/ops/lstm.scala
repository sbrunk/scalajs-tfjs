package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class LSTMOps extends js.Object {
}

@js.native
@JSGlobal
object LSTMOps extends js.Object {
  def multiRNNCell(lstmCells: js.Array[LSTMCellFunc], data: Tensor2D, c: js.Array[Tensor2D], h: js.Array[Tensor2D]): js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]] = js.native
  def basicLSTMCell(forgetBias: Scalar, lstmKernel: Tensor2D, lstmBias: Tensor1D, data: Tensor2D, c: Tensor2D, h: Tensor2D): js.Tuple2[Tensor2D, Tensor2D] = js.native
}

@js.native
@JSGlobalScope
object Lstm extends js.Object {
  type LSTMCellFunc = js.Any
}

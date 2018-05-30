package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class LayerVariable protected () extends js.Object {
  def this(`val`: Tensor, dtype: DataType = ???, name: String = ???, trainable: Boolean = ???, constraint: Constraint = ???) = this()
  def dtype: DataType = js.native
  def shape: Shape = js.native
  def id: Double = js.native
  def name: String = js.native
  def originalName: String = js.native
  def trainable: Boolean = js.native
  protected def `val`: tfc.Variable = js.native
  def constraint: Constraint = js.native
  def read(): Tensor = js.native
  def write(newVal: Tensor): this.type = js.native
}

@js.native
@JSGlobalScope
object Variables extends js.Object {
  def variable(x: Tensor, dtype: DataType = ???, name: String = ???, constraint: Constraint = ???): LayerVariable = js.native
  def zerosVariable(shape: Shape, dtype: DataType = ???, name: String = ???): LayerVariable = js.native
  def zerosLike(x: Tensor, dtype: DataType = ???, name: String = ???): LayerVariable = js.native
  def onesVariable(shape: Shape, dtype: DataType = ???, name: String = ???): LayerVariable = js.native
  def onesLike(x: Tensor, dtype: DataType = ???, name: String = ???): LayerVariable = js.native
  def eyeVariable(size: Double, dtype: DataType = ???, name: String = ???): LayerVariable = js.native
  def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: DataType = ???, seed: Double = ???, name: String = ???): LayerVariable = js.native
  def truncatedNormalVariable(shape: Shape, mean: Double = ???, stddev: Double = ???, dtype: DataType = ???, seed: Double = ???, name: String = ???): LayerVariable = js.native
  def randomNormalVariable(shape: Shape, mean: Double = ???, stddev: Double = ???, dtype: DataType = ???, seed: Double = ???, name: String = ???): LayerVariable = js.native
  def update(x: LayerVariable, xNew: Tensor): LayerVariable = js.native
  def updateAdd(x: LayerVariable, increment: Tensor): LayerVariable = js.native
  def updateSub(x: LayerVariable, decrement: Tensor): LayerVariable = js.native
  def batchGetValue(xs: js.Array[LayerVariable]): js.Array[Tensor] = js.native
  def batchSetValue(variablesAndValues: js.Array[js.Tuple2[LayerVariable, Tensor]]): Unit = js.native
}

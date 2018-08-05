package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package tensor_ops {

@js.native
@JSGlobalScope
object Tensor_ops extends js.Object {
  def tensor[R <: Rank](values: TensorLike, shape: js.Any = ???, dtype: DataType = ???): Tensor[R] = js.native
  def scalar(value: Double | Boolean, dtype: DataType = ???): Scalar = js.native
  def tensor1d(values: TensorLike1D, dtype: DataType = ???): Tensor1D = js.native
  def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double] = ???, dtype: DataType = ???): Tensor2D = js.native
  def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double] = ???, dtype: DataType = ???): Tensor3D = js.native
  def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double] = ???, dtype: DataType = ???): Tensor4D = js.native
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double] = ???, dtype: DataType = ???): Tensor5D = js.native
  def tensor6d(values: TensorLike6D, shape: js.Tuple6[Double, Double, Double, Double, Double, Double] = ???, dtype: DataType = ???): Tensor6D = js.native
  def ones[R <: Rank](shape: js.Any, dtype: DataType = ???): Tensor[R] = js.native
  def zeros[R <: Rank](shape: js.Any, dtype: DataType = ???): Tensor[R] = js.native
  def fill[R <: Rank](shape: js.Any, value: Double, dtype: DataType = ???): Tensor[R] = js.native
  def onesLike_[T <: Tensor](x: T | TensorLike): T = js.native
  def zerosLike_[T <: Tensor](x: T | TensorLike): T = js.native
  def linspace(start: Double, stop: Double, num: Double): Tensor1D = js.native
  def range(start: Double, stop: Double, step: Double = ???, dtype: String = ???): Tensor1D = js.native
  val onesLike: onesLike_.type = js.native
  val zerosLike: zerosLike_.type = js.native
}

}

package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package conv {

@js.native
@JSGlobal
class ConvOps extends js.Object {
}

@js.native
@JSGlobal
object ConvOps extends js.Object {
  def conv1d[T <: Tensor2D | Tensor3D](x: T, filter: Tensor3D, stride: Double, pad: String | Double, dataFormat: String = ???, dilation: Double = ???, dimRoundingMode: String = ???): T = js.native
  def conv2d[T <: Tensor3D | Tensor4D](x: T, filter: Tensor4D, strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dataFormat: String = ???, dilations: js.Tuple2[Double, Double] | Double = ???, dimRoundingMode: String = ???): T = js.native
  def conv2dDerInput[T <: Tensor3D | Tensor4D](xShape: js.Tuple4[Double, Double, Double, Double] | js.Tuple3[Double, Double, Double], dy: T, filter: Tensor4D, strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dimRoundingMode: String = ???): T = js.native
  def conv2dDerFilter[T <: Tensor3D | Tensor4D](x: T, dy: T, filterShape: js.Tuple4[Double, Double, Double, Double], strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dimRoundingMode: String = ???): Tensor4D = js.native
  def conv2dTranspose[T <: Tensor3D | Tensor4D](x: T, filter: Tensor4D, outputShape: js.Tuple4[Double, Double, Double, Double] | js.Tuple3[Double, Double, Double], strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dimRoundingMode: String = ???): T = js.native
  def depthwiseConv2d[T <: Tensor3D | Tensor4D](x: T, filter: Tensor4D, strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dataFormat: String = ???, dilations: js.Tuple2[Double, Double] | Double = ???, dimRoundingMode: String = ???): T = js.native
  def separableConv2d[T <: Tensor3D | Tensor4D](x: T, depthwiseFilter: Tensor4D, pointwiseFilter: Tensor4D, strides: js.Tuple2[Double, Double] | Double, pad: String, dilation: js.Tuple2[Double, Double] | Double = ???, dataFormat: String = ???): T = js.native
}

}

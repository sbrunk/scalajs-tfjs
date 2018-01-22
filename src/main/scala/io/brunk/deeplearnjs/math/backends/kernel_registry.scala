/*
 * Copyright 2017 Sören Brunk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.brunk.deeplearnjs.math.backends

import io.brunk.deeplearnjs.math.NDArray
import io.brunk.deeplearnjs.math.NdarrayModule.DataType
import io.brunk.deeplearnjs.math.backends.types._

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait KernelConfigRegistry extends js.Object {
  var MatMul: MatMulNode                            = js.native
  var Clone: UnaryNode[NDArray]                     = js.native
  var Slice1D: Slice1DNode                          = js.native
  var Slice2D: Slice2DNode                          = js.native
  var Slice3D: Slice3DNode                          = js.native
  var Slice4D: Slice4DNode                          = js.native
  var Reverse4D: Reverse4DNode                      = js.native
  var Concat1D: Concat1DNode                        = js.native
  var Concat2D: Concat2DNode                        = js.native
  var Concat3D: Concat3DNode                        = js.native
  var Concat4D: Concat4DNode                        = js.native
  var Neg: UnaryNode[NDArray]                       = js.native
  var Add: BinaryNode                               = js.native
  var Sub: BinaryNode                               = js.native
  var Mul: BinaryNode                               = js.native
  var Div: BinaryNode                               = js.native
  var Sum: SumNode[DataType]                        = js.native
  var ArgMax: ArgMaxNode                            = js.native
  var ArgMin: ArgMinNode                            = js.native
  var Equal: EqualNode                              = js.native
  var NotEqual: EqualNode                           = js.native
  var LessEqual: EqualNode                          = js.native
  var Greater: EqualNode                            = js.native
  var GreaterEqual: EqualNode                       = js.native
  var LogicalOr: LogicalOrNode                      = js.native
  var TopKValues: TopKValuesNode[DataType, NDArray] = js.native
  var TopKIndices: TopKIndicesNode                  = js.native
  var Min: MinNode[DataType]                        = js.native
  var Minimum: MinimumNode[DataType]                = js.native
  var Max: MaxNode[DataType]                        = js.native
  var Maximum: MaximumNode[DataType]                = js.native
  var Ceil: UnaryNode[NDArray]                      = js.native
  var Floor: UnaryNode[NDArray]                     = js.native
  var Pow: PowNode[NDArray]                         = js.native
  var Exp: UnaryNode[NDArray]                       = js.native
  var Log: UnaryNode[NDArray]                       = js.native
  var Sqrt: UnaryNode[NDArray]                      = js.native
  var Square: UnaryNode[NDArray]                    = js.native
  var Relu: UnaryNode[NDArray]                      = js.native
  var LeakyRelu: LeakyReluNode[NDArray]             = js.native
  var PReLU: PReLUNode[NDArray]                     = js.native
  var PReLUDer: PReLUNode[NDArray]                  = js.native
  var Reshape: ReshapeNode                          = js.native
  var Cast: CastNode                                = js.native
  var Elu: UnaryNode[NDArray]                       = js.native
  var EluDer: UnaryNode[NDArray]                    = js.native
  var Selu: UnaryNode[NDArray]                      = js.native
  var Abs: UnaryNode[NDArray]                       = js.native
  var Sigmoid: UnaryNode[NDArray]                   = js.native
  var Step: StepNode[NDArray]                       = js.native
  var Sin: UnaryNode[NDArray]                       = js.native
  var Cos: UnaryNode[NDArray]                       = js.native
  var Tan: UnaryNode[NDArray]                       = js.native
  var Asin: UnaryNode[NDArray]                      = js.native
  var Acos: UnaryNode[NDArray]                      = js.native
  var Atan: UnaryNode[NDArray]                      = js.native
  var Sinh: UnaryNode[NDArray]                      = js.native
  var Cosh: UnaryNode[NDArray]                      = js.native
  var Tanh: UnaryNode[NDArray]                      = js.native
  var Clip: ClipNode[NDArray]                       = js.native
  var Transpose: TransposeNode[NDArray]             = js.native
  var Pad1D: Pad1DNode                              = js.native
  var Pad2D: Pad2DNode                              = js.native
  var Tile: TileNode[NDArray]                       = js.native
  var Conv2D: Conv2DNode                            = js.native
  var Conv2DDerInput: Conv2DDerInputNode            = js.native
  var Conv2DDerFilter: Conv2DDerFilterNode          = js.native
  var Conv2DDerBias: Conv2DDerBiasNode              = js.native
  var DepthwiseConv2D: Conv2DNode                   = js.native
  var MaxPool: PoolNode                             = js.native
  var MaxPoolBackprop: PoolBackpropNode             = js.native
  var AvgPool: PoolNode                             = js.native
  var AvgPoolBackprop: PoolBackpropNode             = js.native
  var MinPool: PoolNode                             = js.native
  var ResizeBilinear3D: ResizeBilinear3DNode        = js.native
  var BatchNorm4D: BatchNorm4DNode                  = js.native
  var BatchNorm3D: BatchNorm3DNode                  = js.native
  var BatchNorm2D: BatchNorm2DNode                  = js.native
  var LRN4D: LRN4DNode                              = js.native
  var Multinomial: MultinomialNode                  = js.native
  var OneHot: OneHotNode                            = js.native
}

@js.native
@JSGlobalScope
object Kernel_registry extends js.Object {
  def executeKernel[K <: String, R <: js.Any](backend: MathBackend,
                                              kernelName: K,
                                              config: js.Any): R = js.native
}

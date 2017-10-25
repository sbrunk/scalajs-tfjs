/*
 * Copyright (c) 2017 Sören Brunk
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.brunk.deeplearnjs.graph.ops

import scala.scalajs.js
import js.annotation._
import js.|

package element_wise_cost {

  @js.native
  @JSGlobal
  class ElementWiseCost protected () extends Operation {
    def this(x1Tensor: Tensor, x2Tensor: Tensor, yTensor: Tensor, func: ElementWiseCostFunction) =
      this()
    protected var x1Tensor: Tensor                                            = js.native
    protected var x2Tensor: Tensor                                            = js.native
    protected var yTensor: Tensor                                             = js.native
    protected var func: ElementWiseCostFunction                               = js.native
    def feedForward(math: NDArrayMath, inferenceArrays: TensorArrayMap): Unit = js.native
    def backProp(math: NDArrayMath,
                 inferenceArrays: TensorArrayMap,
                 gradientArrays: SummedTensorArrayMap): Unit = js.native
    def dispose(): Unit                                      = js.native
  }

  @js.native
  @JSGlobal
  class MeanSquaredCost protected () extends ElementWiseCost {
    def this(x1Tensor: Tensor, x2Tensor: Tensor, yTensor: Tensor) = this()
  }

}

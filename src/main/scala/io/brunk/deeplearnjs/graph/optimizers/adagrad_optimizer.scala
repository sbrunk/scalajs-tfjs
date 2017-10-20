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

package io.brunk.deeplearnjs.graph.optimizers

import scala.scalajs.js
import js.annotation._
import js.|

package adagrad_optimizer {

  @js.native
  @JSGlobal
  class AdagradOptimizer protected () extends Optimizer {
    def this(learningRate: Double, momentum: Double, specifiedVariableList: js.Array[Node] = ???) =
      this()
    protected var learningRate: Double = js.native
    protected var momentum: Double     = js.native
    def beforeBatch(math: NDArrayMath,
                    batchSize: Double,
                    runtime: SessionRuntime,
                    activationArrayMap: TensorArrayMap,
                    gradientArrayMap: SummedTensorArrayMap): Unit = js.native
    def afterBatch(math: NDArrayMath,
                   batchSize: Double,
                   runtime: SessionRuntime,
                   activationArrayMap: TensorArrayMap,
                   gradientArrayMap: SummedTensorArrayMap): Unit = js.native
    def dispose(): Unit                                          = js.native
  }

}

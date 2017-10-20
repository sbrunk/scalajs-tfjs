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

package io.brunk.deeplearnjs.data

import io.brunk.deeplearnjs.math.NDArray

import scala.scalajs.js
import js.annotation._
import js.{Promise, |}

  @js.native
  trait DataStats extends js.Object {
    var exampleCount: Double    = js.native
    var inputMin: Double        = js.native
    var inputMax: Double        = js.native
    var shape: js.Array[Double] = js.native
  }

  @js.native
  @JSGlobal
  abstract class InMemoryDataset protected () extends js.Object {
    def this(dataShapes: js.Array[js.Array[Double]]) = this()
    protected var dataShapes: js.Array[js.Array[Double]]      = js.native
    protected var dataset: js.Array[js.Array[NDArray]] | Null = js.native
    def getDataShape(dataIndex: Double): js.Array[Double]     = js.native
    def fetchData(): Promise[Unit]
    def getData(): js.Array[js.Array[NDArray]] | Null = js.native
    def getStats(): js.Array[DataStats]               = js.native
    def normalizeWithinBounds(dataIndex: Double, lowerBound: Double, upperBound: Double): Unit =
      js.native
    def removeNormalization(dataIndex: Double): Unit = js.native
    def unnormalizeExamples(examples: js.Array[NDArray], dataIndex: Double): js.Array[NDArray] =
      js.native
    def dispose(): Unit = js.native
  }


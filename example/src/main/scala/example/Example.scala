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

package example

import io.brunk.deeplearnjs.{ Util, Version }
import io.brunk.deeplearnjs.math._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.scalajs.js
import scala.scalajs.js.typedarray.Int32Array

object Example {
  def main(args: Array[String]): Unit = {

    val math = new NDArrayMathGPU()

    val a: NDArray = Array1D.`new`(new Int32Array(js.Array(1, 2, 3)))
    val b: NDArray = Scalar.`new`(2)

    val result = math.add(a, b)

    // Option 1: With async/await.
    // Caveat: in non-Chrome browsers you need to put this in an async function.
    //println(await result.data());  // Float32Array([3, 4, 5])

    // Option 2: With a Future.
    result.data().toFuture.foreach(println)

    // Option 3: Synchronous download of data.
    // This is simpler, but blocks the UI until the GPU is done.
    println(result.dataSync())
  }
}

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

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


import io.brunk.tfjs.core.Rank.{R0, R1, R2}
import io.brunk.tfjs.{core, tf}
import io.brunk.tfjs.core.ops.ArrayOps
import io.brunk.tfjs.core.{Environment, Tensor, Version}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.scalajs.js
import scala.scalajs.js.typedarray.Int32Array

object Example {
  def main(args: Array[String]): Unit = {

    println("Hello scalajs-tfjs!")
    println(s"tfjs version: ${Version.version}")

    //val math = Environment.

    // Tensors
    val shape = js.Array(2, 3) // 2 rows, 3 columns
    val a = tf.tensor[R0](js.Array(1.0, 2.0, 3.0, 10.0, 20.0, 30.0), shape)
    a.print()

    // The shape can also be inferred:
    val b = tf.tensor[R0](js.Array(js.Array(1.0, 2.0, 3.0), js.Array(10.0, 20.0, 30.0)))
    b.print()

    val c = tf.tensor2d(js.Array(js.Array(1.0, 2.0, 3.0), js.Array(10.0, 20.0, 30.0)))
    c.print()

    val zeros = tf.zeros[R2]((3,5))
    zeros.print()

    // Variables
    val initialValues = tf.zeros[R1](shape = 5)
    initialValues.print()
    val biases = tf.variable(initialValues)
    biases.print()



    //val result: NDArray[Int32, Rank] = math.add(a, b)

    // Option 1: With async/await.
    // Caveat: in non-Chrome browsers you need to put this in an async function.
    //println(await result.data());  // Float32Array([3, 4, 5])

    // Option 2: With a Future.
    //result.data().toFuture.foreach(println)
    a.data().toFuture.foreach(println)

    // Option 3: Synchronous download of data.
    // This is simpler, but blocks the UI until the GPU is done.
    //println(result.dataSync())
  }
}

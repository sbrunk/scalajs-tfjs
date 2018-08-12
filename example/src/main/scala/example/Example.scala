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
import io.brunk.tfjs.{core, tf, tfl}
import io.brunk.tfjs.core.ops.ArrayOps
import io.brunk.tfjs.core.{Environment, Tensor, Version}
import io.brunk.tfjs.layers.engine.{ModelCompileConfig, ModelFitConfig}
import io.brunk.tfjs.layers.layers.DenseLayerConfig
import io.brunk.tfjs.tfl.ModelCompileConfig

import scala.concurrent.ExecutionContext.Implicits.global
import scala.scalajs.js
import scala.scalajs.js.typedarray.Int32Array
import js.JSConverters._

object Example {
  def main(args: Array[String]): Unit = {

    println("Hello scalajs-tfjs!")
    println(s"tfjs-core version: ${tf.version}")

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

    val model = tfl.sequential()
    model.add(tfl.layers.dense(DenseLayerConfig(units = 1d, inputShape = js.Array(1d))))
    model.compile(ModelCompileConfig(loss = "meanSquaredError", optimizer = "sgd"))
    val xs = tf.tensor2d(js.Array(1d, 2d, 3d, 4d), (4d, 1d))
    val ys = tf.tensor2d(js.Array(1d, 3d, 5d, 7d), (4d, 1d))

    model.fit(xs, ys, js.Dynamic.literal(epochs = 10).asInstanceOf[ModelFitConfig]).toFuture.onComplete{ history =>
      println(model.predict(tf.tensor2d(js.Array(5d), (1d, 1d))))
    }
  }
}

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

package io.brunk.tfjs.layers.backend

import io.brunk.tfjs.core.DataType
import io.brunk.tfjs.layers.Common.DataFormat
import io.brunk.tfjs.layers.LayerVariable
import io.brunk.tfjs.layers.Types.Shape
import io.brunk.tfjs.layers.engine.SymbolicTensor
import io.brunk.tfjs.tf.TensorND

import scala.scalajs.js
import js.annotation._
import js.|
import io.brunk.tfjs.tf._

@js.native
@JSGlobalScope
object Tfjs_backend extends js.Object {
  def setBackend(requestedBackend: String): Unit                                  = js.native
  def getBackend(): String                                                        = js.native
  def isBackendSymbolic(): Boolean                                                = js.native
  def countParams(x: TensorND | SymbolicTensor): Double                           = js.native
  def cast(x: TensorND, dtype: String): TensorND                                  = js.native
  def expandDims(x: TensorND, axis: Double = ???): TensorND                       = js.native
  def repeat(x: TensorND, n: Double): TensorND                                    = js.native
  def flatten(x: TensorND): TensorND                                              = js.native
  def batchFlatten(x: TensorND): TensorND                                         = js.native
  def sliceAlongFirstAxis(array: TensorND, start: Double, size: Double): TensorND = js.native
  def sliceAlongLastAxis(array: TensorND, start: Double, size: Double): TensorND  = js.native
  def sliceAlongAxis(array: TensorND, start: Double, size: Double, axis: Double): TensorND =
    js.native
  def concatenate(tensors: js.Array[TensorND], axis: Double = ???): TensorND = js.native
  def concatAlongFirstAxis(a: TensorND, b: TensorND): TensorND               = js.native
  def tile(x: TensorND, n: Double | js.Array[Double]): TensorND              = js.native
  def randomNormal(
      shape: Shape,
      mean: Double = ???,
      stddev: Double = ???,
      dtype: String = ???,
      seed: Double = ???
  ): TensorND                                                 = js.native
  def dot(x: TensorND, y: TensorND): TensorND                 = js.native
  def sign(x: TensorND): TensorND                             = js.native
  def oneHot(indices: TensorND, numClasses: Double): TensorND = js.native
  def gather(
      reference: TensorND,
      indices: js.Array[Double] | Tensor1D,
      axis: Double = ???
  ): TensorND                                                                      = js.native
  def square(x: TensorND): TensorND                                                = js.native
  def pow(x: TensorND, a: TensorND | Double): TensorND                             = js.native
  def biasAdd(x: TensorND, bias: TensorND, dataFormat: DataFormat = ???): TensorND = js.native
  def elu(x: TensorND, alpha: Double = ???): TensorND                              = js.native
  def softsign(x: TensorND): TensorND                                              = js.native
  def dropout(
      x: TensorND,
      level: Scalar,
      noiseShape: js.Array[Double] = ???,
      seed: Double = ???
  ): TensorND                            = js.native
  def hardSigmoid(x: TensorND): TensorND = js.native
  def inTrainPhase[T](x: js.Function0[T], alt: js.Function0[T], training: Boolean = ???): T =
    js.native
}

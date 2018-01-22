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

package io.brunk.deeplearnjs.data

import io.brunk.deeplearnjs.math.NDArray

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation._

@js.native
trait NDArrayInfo extends js.Object {
  var path: String
  var name: String
  var dataType: String
  var shape: js.Array[Double]
}

@js.native
trait XhrDatasetConfig extends js.Object {
  var data: js.Array[NDArrayInfo]
  var labelClassNames: js.Array[String]
  var modelConfigs: XhrDatasetConfig.ModelConfigs
}

object XhrDatasetConfig {

  @js.native
  trait ModelConfigs extends js.Object {
    @JSBracketAccess
    def apply(modelName: String): XhrModelConfig
    @JSBracketAccess
    def update(modelName: String, v: XhrModelConfig): Unit
  }
}

@js.native
trait XhrModelConfig extends js.Object {
  var path: String = js.native
}

@js.native
@JSImport("deeplearn", "XhrDataset")
class XhrDataset protected () extends InMemoryDataset {
  def this(xhrDatasetConfig: XhrDatasetConfig) = this()
  protected var xhrDatasetConfig: XhrDatasetConfig                      = js.native
  def getNDArray[T <: NDArray](info: NDArrayInfo): Promise[js.Array[T]] = js.native
  def fetchData(): Promise[Unit]                                        = js.native
}

@js.native
@JSImport("deeplearn", "Xhr-dataset")
object `Xhr-dataset` extends js.Object {
  def getXhrDatasetConfig(jsonConfigPath: String): Promise[js.Dictionary[XhrDatasetConfig]] =
    js.native
}

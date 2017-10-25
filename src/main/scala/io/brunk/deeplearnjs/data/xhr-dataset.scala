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

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait NDArrayInfo extends js.Object {
  var path: String            = js.native
  var name: String            = js.native
  var dataType: String        = js.native
  var shape: js.Array[Double] = js.native
}

@js.native
trait XhrDatasetConfig extends js.Object {
  var data: js.Array[NDArrayInfo]                 = js.native
  var labelClassNames: js.Array[String]           = js.native
  var modelConfigs: js.Dictionary[XhrModelConfig] = js.native
}

@js.native
trait XhrModelConfig extends js.Object {
  var path: String = js.native
}

@js.native
@JSGlobal
class XhrDataset protected () extends InMemoryDataset {
  def this(xhrDatasetConfig: XhrDatasetConfig) = this()
  protected var xhrDatasetConfig: XhrDatasetConfig                      = js.native
  def getNDArray[T <: NDArray](info: NDArrayInfo): Promise[js.Array[T]] = js.native
  def fetchData(): Promise[Unit]                                        = js.native
}

@js.native
@JSGlobalScope
object `Xhr-dataset` extends js.Object {
  def getXhrDatasetConfig(jsonConfigPath: String): Promise[js.Dictionary[XhrDatasetConfig]] =
    js.native
}

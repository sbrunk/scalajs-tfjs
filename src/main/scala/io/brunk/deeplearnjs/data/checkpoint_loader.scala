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

import io.brunk.deeplearnjs.data.Checkpoint_loader.CheckpointManifest
import io.brunk.deeplearnjs.math.{ DataType, NDArray, Rank }

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation._

@js.native
trait CheckpointVariable extends js.Object {
  var filename: String        = js.native
  var shape: js.Array[Double] = js.native
}

@js.native
@JSImport("deeplearn", "CheckpointLoader")
class CheckpointLoader protected () extends js.Object {
  def this(urlPath: String) = this()
  def getCheckpointManifest(): Promise[CheckpointManifest]               = js.native
  def getAllVariables(): Promise[js.Dictionary[NDArray[DataType, Rank]]] = js.native
  def getVariable(varName: String): Promise[NDArray[DataType, Rank]]     = js.native
}

@js.native
@JSGlobalScope
object Checkpoint_loader extends js.Object {
  type CheckpointManifest = js.Dictionary[CheckpointVariable]
}

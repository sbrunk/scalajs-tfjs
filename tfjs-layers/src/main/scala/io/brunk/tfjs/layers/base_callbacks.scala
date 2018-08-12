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

package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
abstract class BaseCallback extends js.Object {
  var validationData: Tensor | js.Array[Tensor]                              = js.native
  var params: Params                                                         = js.native
  def setParams(params: Params): Unit                                        = js.native
  def onEpochBegin(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onEpochEnd(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit]   = js.native
  def onBatchBegin(batch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onBatchEnd(batch: Double, logs: UnresolvedLogs = ???): Promise[Unit]   = js.native
  def onTrainBegin(logs: UnresolvedLogs = ???): Promise[Unit]                = js.native
  def onTrainEnd(logs: UnresolvedLogs = ???): Promise[Unit]                  = js.native
  def setModel(model: Container): Unit                                       = js.native
}

@js.native
@JSGlobal
class CallbackList protected () extends js.Object {
  def this(callbacks: js.Array[BaseCallback] = ???, queueLength: Double = ???) = this()
  var callbacks: js.Array[BaseCallback]                                      = js.native
  var queueLength: Double                                                    = js.native
  def append(callback: BaseCallback): Unit                                   = js.native
  def setParams(params: Params): Unit                                        = js.native
  def setModel(model: Container): Unit                                       = js.native
  def onEpochBegin(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onEpochEnd(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit]   = js.native
  def onBatchBegin(batch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onBatchEnd(batch: Double, logs: UnresolvedLogs = ???): Promise[Unit]   = js.native
  def onTrainBegin(logs: UnresolvedLogs = ???): Promise[Unit]                = js.native
  def onTrainEnd(logs: UnresolvedLogs = ???): Promise[Unit]                  = js.native
}

@js.native
@JSGlobal
class BaseLogger extends BaseCallback {
  def onEpochBegin(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onBatchEnd(batch: Double, logs: UnresolvedLogs = ???): Promise[Unit]   = js.native
  def onEpochEnd(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit]   = js.native
}

@js.native
@JSGlobal
class History extends BaseCallback {
  var epoch: js.Array[Double]                                              = js.native
  var history: History.History                                             = js.native
  def onTrainBegin(logs: UnresolvedLogs = ???): Promise[Unit]              = js.native
  def onEpochEnd(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def syncData(): Promise[Unit]                                            = js.native
}

object History {

  @js.native
  trait History extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Array[Double | Tensor] = js.native
    @JSBracketAccess
    def update(key: String, v: js.Array[Double | Tensor]): Unit = js.native
  }
}

@js.native
trait CustomCallbackConfig extends js.Object {
  var onTrainBegin: js.Function1[Logs, Promise[Unit]]         = js.native
  var onTrainEnd: js.Function1[Logs, Promise[Unit]]           = js.native
  var onEpochBegin: js.Function2[Double, Logs, Promise[Unit]] = js.native
  var onEpochEnd: js.Function2[Double, Logs, Promise[Unit]]   = js.native
  var onBatchBegin: js.Function2[Double, Logs, Promise[Unit]] = js.native
  var onBatchEnd: js.Function2[Double, Logs, Promise[Unit]]   = js.native
}

@js.native
@JSGlobal
class CustomCallback protected () extends BaseCallback {
  def this(config: CustomCallbackConfig) = this()
  protected def trainBegin: js.Function1[Logs, Promise[Unit]]                = js.native
  protected def trainEnd: js.Function1[Logs, Promise[Unit]]                  = js.native
  protected def epochBegin: js.Function2[Double, Logs, Promise[Unit]]        = js.native
  protected def epochEnd: js.Function2[Double, Logs, Promise[Unit]]          = js.native
  protected def batchBegin: js.Function2[Double, Logs, Promise[Unit]]        = js.native
  protected def batchEnd: js.Function2[Double, Logs, Promise[Unit]]          = js.native
  def onEpochBegin(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onEpochEnd(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit]   = js.native
  def onBatchBegin(batch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onBatchEnd(batch: Double, logs: UnresolvedLogs = ???): Promise[Unit]   = js.native
  def onTrainBegin(logs: UnresolvedLogs = ???): Promise[Unit]                = js.native
  def onTrainEnd(logs: UnresolvedLogs = ???): Promise[Unit]                  = js.native
}

@js.native
@JSGlobalScope
object Base_callbacks extends js.Object {
  type Params = js.Dictionary[
    Double | String | Boolean | js.Array[Double] | js.Array[String] | js.Array[Boolean]
  ]
  def standardizeCallbacks(
      callbacks: BaseCallback | js.Array[BaseCallback] | CustomCallbackConfig | js.Array[
        CustomCallbackConfig
      ]
  ): js.Array[BaseCallback] = js.native
}

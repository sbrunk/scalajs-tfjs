package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
abstract class Callback extends js.Object {
  var validationData: Tensor | js.Array[Tensor] = js.native
  var model: Model = js.native
  var params: Params = js.native
  def setParams(params: Params): Unit = js.native
  def setModel(model: Model): Unit = js.native
  def onEpochBegin(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onEpochEnd(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onBatchBegin(batch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onBatchEnd(batch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onTrainBegin(logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onTrainEnd(logs: UnresolvedLogs = ???): Promise[Unit] = js.native
}

@js.native
@JSGlobal
class CallbackList protected () extends js.Object {
  def this(callbacks: js.Array[Callback] = ???, queueLength: Double = ???) = this()
  var callbacks: js.Array[Callback] = js.native
  var queueLength: Double = js.native
  def append(callback: Callback): Unit = js.native
  def setParams(params: Params): Unit = js.native
  def setModel(model: Model): Unit = js.native
  def onEpochBegin(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onEpochEnd(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onBatchBegin(batch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onBatchEnd(batch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onTrainBegin(logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onTrainEnd(logs: UnresolvedLogs = ???): Promise[Unit] = js.native
}

@js.native
@JSGlobal
class BaseLogger extends Callback {
  def onEpochBegin(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onBatchEnd(batch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onEpochEnd(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
}

@js.native
@JSGlobal
class History extends Callback {
  var epoch: js.Array[Double] = js.native
  var history: History.History = js.native
  def onTrainBegin(logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onEpochEnd(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def syncData(): Promise[Unit] = js.native
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
  var onTrainBegin: js.Function1[Logs, Promise[Unit]] = js.native
  var onTrainEnd: js.Function1[Logs, Promise[Unit]] = js.native
  var onEpochBegin: js.Function2[Double, Logs, Promise[Unit]] = js.native
  var onEpochEnd: js.Function2[Double, Logs, Promise[Unit]] = js.native
  var onBatchBegin: js.Function2[Double, Logs, Promise[Unit]] = js.native
  var onBatchEnd: js.Function2[Double, Logs, Promise[Unit]] = js.native
}

@js.native
@JSGlobal
class CustomCallback protected () extends Callback {
  def this(config: CustomCallbackConfig) = this()
  protected def trainBegin: js.Function1[Logs, Promise[Unit]] = js.native
  protected def trainEnd: js.Function1[Logs, Promise[Unit]] = js.native
  protected def epochBegin: js.Function2[Double, Logs, Promise[Unit]] = js.native
  protected def epochEnd: js.Function2[Double, Logs, Promise[Unit]] = js.native
  protected def batchBegin: js.Function2[Double, Logs, Promise[Unit]] = js.native
  protected def batchEnd: js.Function2[Double, Logs, Promise[Unit]] = js.native
  def onEpochBegin(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onEpochEnd(epoch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onBatchBegin(batch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onBatchEnd(batch: Double, logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onTrainBegin(logs: UnresolvedLogs = ???): Promise[Unit] = js.native
  def onTrainEnd(logs: UnresolvedLogs = ???): Promise[Unit] = js.native
}

@js.native
@JSGlobalScope
object Callbacks extends js.Object {
  type UnresolvedLogs = js.Dictionary[Double | Scalar]
  type Logs = js.Dictionary[Double]
  type Params = js.Dictionary[Double | String | Boolean | js.Array[Double] | js.Array[String] | js.Array[Boolean]]
  def resolveScalarsInLogs(logs: UnresolvedLogs): Promise[Unit] = js.native
  def disposeTensorsInLogs(logs: UnresolvedLogs): Unit = js.native
  def standardizeCallbacks(callbacks: Callback | js.Array[Callback] | CustomCallbackConfig | js.Array[CustomCallbackConfig]): js.Array[Callback] = js.native
}

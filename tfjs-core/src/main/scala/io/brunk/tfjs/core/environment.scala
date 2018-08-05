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

package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

package environment {

@js.native
@JSGlobal
class Environment protected () extends js.Object {
  def this(features: Features = ???) = this()
  var backendName: String = js.native
  var backend: KernelBackend = js.native
  def get[K <: String](feature: K): js.Any = js.native
  def getFeatures(): Features = js.native
  def set[K <: String](feature: K, value: js.Any): Unit = js.native
  def setFeatures(features: Features): Unit = js.native
  def reset(): Unit = js.native
  def findBackend(name: String): KernelBackend = js.native
  def registerBackend(name: String, factory: js.Function0[KernelBackend], priority: Double = ???, setTensorTrackerFn: js.Function1[js.Function0[TensorTracker], Unit] = ???): Boolean = js.native
  def removeBackend(name: String): Unit = js.native
  def engine: Engine = js.native
}

@js.native
@JSGlobal
object Environment extends js.Object {
  def setBackend(backendName: String, safeMode: Boolean = ???): Unit = js.native
  def getBackend(): String = js.native
  def disposeVariables(): Unit = js.native
  def memory(): MemoryInfo = js.native
  def tidy[T <: TensorContainer](nameOrFn: String | ScopeFn[T], fn: ScopeFn[T] = ???, gradMode: Boolean = ???): T = js.native
  def dispose(container: TensorContainer): Unit = js.native
  def keep[T <: Tensor](result: T): T = js.native
  def time(f: js.Function0[Unit]): Promise[TimingInfo] = js.native
}

@js.native
@JSGlobalScope
object Environment extends js.Object {
  def ENV: Environment = js.native
}

}

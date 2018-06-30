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
import js.{ Promise, | }
import Types._
import Engine._
import TensorModule.TensorND

@js.native
@JSGlobal
class Tracking extends js.Object {}

@js.native
trait TrackingCompanion extends js.Object {
  def tidy[T <: TensorContainer](
      nameOrFn: String | ScopeFn[T],
      fn: ScopeFn[T] = ???,
      gradMode: Boolean = ???
  ): T                                                 = js.native
  def dispose(container: js.Any): Unit                 = js.native
  def keep[T <: TensorND](result: T): T                = js.native
  def time(f: js.Function0[Unit]): Promise[TimingInfo] = js.native
}

@js.native
@JSGlobal
object Tracking extends TrackingCompanion

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

@js.native
@JSGlobalScope
object Jasmine_util extends js.Object {
  def describeWithFlags(name: String, constraints: Features, tests: js.Function0[Unit]): Unit =
    js.native
  def setBeforeAll(f: js.Function1[Features, Unit]): Unit    = js.native
  def setAfterAll(f: js.Function1[Features, Unit]): Unit     = js.native
  def setBeforeEach(f: js.Function1[Features, Unit]): Unit   = js.native
  def setAfterEach(f: js.Function1[Features, Unit]): Unit    = js.native
  def setTestEnvFeatures(features: js.Array[Features]): Unit = js.native
}

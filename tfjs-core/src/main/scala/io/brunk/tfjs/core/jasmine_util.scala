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
import kernels.KernelBackend

@js.native
trait TestBackendFactory extends js.Object {
  var name: String                         = js.native
  var factory: js.Function0[KernelBackend] = js.native
  var priority: Double                     = js.native
}

@js.native
@JSGlobalScope
object Jasmine_util extends js.Object {
  def canEmulateEnvironment(emulatedFeatures: Features): Boolean = js.native
  def anyFeaturesEquivalentToDefault(
      emulatedFeatures: js.Array[Features],
      environment: Environment
  ): Boolean = js.native
  def describeWithFlags(
      name: String,
      featuresToRun: js.Array[Features],
      tests: js.Function0[Unit]
  ): Unit                                                               = js.native
  def TEST_BACKENDS: js.Array[TestBackendFactory]                       = js.native
  def setBeforeAll(f: js.Function1[Features, Unit]): Unit               = js.native
  def setAfterAll(f: js.Function1[Features, Unit]): Unit                = js.native
  def setBeforeEach(f: js.Function1[Features, Unit]): Unit              = js.native
  def setAfterEach(f: js.Function1[Features, Unit]): Unit               = js.native
  def setTestBackends(testBackends: js.Array[TestBackendFactory]): Unit = js.native
  def registerTestBackends(): Unit                                      = js.native
}

package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

package jasmine_util {

@js.native
@JSGlobalScope
object Jasmine_util extends js.Object {
  def describeWithFlags(name: String, constraints: Features, tests: js.Function0[Unit]): Unit = js.native
  def setBeforeAll(f: js.Function1[Features, Unit]): Unit = js.native
  def setAfterAll(f: js.Function1[Features, Unit]): Unit = js.native
  def setBeforeEach(f: js.Function1[Features, Unit]): Unit = js.native
  def setAfterEach(f: js.Function1[Features, Unit]): Unit = js.native
  def setTestEnvFeatures(features: js.Array[Features]): Unit = js.native
}

}

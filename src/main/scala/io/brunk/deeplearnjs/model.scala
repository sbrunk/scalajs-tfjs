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

package io.brunk.deeplearnjs

import scala.scalajs.js
import js.annotation._
import js.|

package model {

  import scala.scalajs.js.Promise

  @js.native
  trait Model extends js.Object {
    def load(): Promise[Unit | js.Array[Unit]] = js.native
    def predict(input: NDArray): NDArray       = js.native
    def dispose(): Unit                        = js.native
  }

}

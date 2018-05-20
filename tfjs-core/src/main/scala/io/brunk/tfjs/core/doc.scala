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
trait HeadingMap extends js.Object {
  var Tensors: String     = js.native
  var Operations: String  = js.native
  var Training: String    = js.native
  var Performance: String = js.native
  var Environment: String = js.native
}

@js.native
trait DocInfo extends js.Object {
  var heading: String                      = js.native
  var subheading: String                   = js.native
  var namespace: String                    = js.native
  var subclasses: js.Array[String]         = js.native
  var useDocsFrom: String                  = js.native
  var configParamIndices: js.Array[Double] = js.native
}

@js.native
@JSGlobalScope
object Doc extends js.Object {
  type Heading   = String
  type Namespace = String
  def doc(info: DocInfo): js.Function = js.native
}

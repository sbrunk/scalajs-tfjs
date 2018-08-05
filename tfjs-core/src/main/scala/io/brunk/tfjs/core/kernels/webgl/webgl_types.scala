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

package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|
import org.scalajs.dom.webgl

@js.native
trait WebGL2DisjointQueryTimerExtension extends js.Object {
  var TIME_ELAPSED_EXT: Double = js.native
  var GPU_DISJOINT_EXT: Double = js.native
}

@js.native
trait WebGL1DisjointQueryTimerExtension extends js.Object {
  var TIME_ELAPSED_EXT: Double                                    = js.native
  var QUERY_RESULT_AVAILABLE_EXT: Double                          = js.native
  var GPU_DISJOINT_EXT: Double                                    = js.native
  var QUERY_RESULT_EXT: Double                                    = js.native
  var createQueryEXT: js.Function0[js.Any]                        = js.native
  var beginQueryEXT: js.Function2[Double, WebGLQuery, Unit]       = js.native
  var endQueryEXT: js.Function1[Double, Unit]                     = js.native
  var deleteQueryEXT: js.Function1[WebGLQuery, Unit]              = js.native
  var isQueryEXT: js.Function1[WebGLQuery, Boolean]               = js.native
  var getQueryObjectEXT: js.Function2[WebGLQuery, Double, Double] = js.native
}

@js.native
trait WebGLContextAttributes extends js.Object {
  var alpha: Boolean                        = js.native
  var antialias: Boolean                    = js.native
  var premultipliedAlpha: Boolean           = js.native
  var preserveDrawingBuffer: Boolean        = js.native
  var depth: Boolean                        = js.native
  var stencil: Boolean                      = js.native
  var failIfMajorPerformanceCaveat: Boolean = js.native
}

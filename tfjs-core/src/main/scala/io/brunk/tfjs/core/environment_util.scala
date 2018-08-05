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

package environment_util {

  @js.native
  trait Features extends js.Object {
    var DEBUG: Boolean                                         = js.native
    var IS_BROWSER: Boolean                                    = js.native
    var IS_NODE: Boolean                                       = js.native
    var WEBGL_DISJOINT_QUERY_TIMER_EXTENSION_VERSION: Double   = js.native
    var WEBGL_DISJOINT_QUERY_TIMER_EXTENSION_RELIABLE: Boolean = js.native
    var WEBGL_VERSION: Double                                  = js.native
    var HAS_WEBGL: Boolean                                     = js.native
    var WEBGL_RENDER_FLOAT32_ENABLED: Boolean                  = js.native
    var WEBGL_DOWNLOAD_FLOAT_ENABLED: Boolean                  = js.native
    var WEBGL_FENCE_API_ENABLED: Boolean                       = js.native
    var BACKEND: String                                        = js.native
    var TEST_EPSILON: Double                                   = js.native
    var IS_CHROME: Boolean                                     = js.native
    var IS_TEST: Boolean                                       = js.native
  }

  @js.native
  sealed trait Type extends js.Object {}

  @js.native
  @JSGlobal
  object Type extends js.Object {
    var NUMBER: Type  = js.native
    var BOOLEAN: Type = js.native
    var STRING: Type  = js.native
    @JSBracketAccess
    def apply(value: Type): String = js.native
  }

  @js.native
  trait URLProperty extends js.Object {
    var name: String = js.native
    var `type`: Type = js.native
  }

  @js.native
  @JSGlobalScope
  object Environment_util extends js.Object {
    val URL_PROPERTIES: js.Array[URLProperty]                                 = js.native
    def isWebGLVersionEnabled(webGLVersion: Int, isBrowser: Boolean): Boolean = js.native
    def getWebGLDisjointQueryTimerVersion(webGLVersion: Double, isBrowser: Boolean): Double =
      js.native
    def isRenderToFloatTextureEnabled(webGLVersion: Double, isBrowser: Boolean): Boolean = js.native
    def isDownloadFloatTextureEnabled(webGLVersion: Double, isBrowser: Boolean): Boolean = js.native
    def isWebGLFenceEnabled(webGLVersion: Double, isBrowser: Boolean): Boolean           = js.native
    def isChrome(): Boolean                                                              = js.native
    def getFeaturesFromURL(): Features                                                   = js.native
    def getQueryParams(queryString: String): js.Dictionary[String]                       = js.native
  }

}

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

package texture_manager {

  @js.native
  @JSGlobal
  class TextureManager protected () extends js.Object {
    def this(gpgpu: GPGPUContext) = this()
    def acquireTexture(shapeRC: js.Tuple2[Double, Double], usage: TextureUsage): WebGLTexture =
      js.native
    def releaseTexture(
        texture: WebGLTexture,
        shape: js.Tuple2[Double, Double],
        logicalTexType: TextureUsage
    ): Unit                          = js.native
    def getNumUsedTextures(): Double = js.native
    def getNumFreeTextures(): Double = js.native
    def dispose(): Unit              = js.native
  }

}

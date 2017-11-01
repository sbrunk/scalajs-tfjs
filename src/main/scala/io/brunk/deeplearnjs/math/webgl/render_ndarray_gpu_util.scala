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

package io.brunk.deeplearnjs.math.webgl

import org.scalajs.dom.raw.{ WebGLProgram, WebGLTexture }

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSImport("deeplearn", "render_ndarray_gpu_util")
object Render_ndarray_gpu_util extends js.Object {
  def getRenderRGBShader(gpgpu: GPGPUContext, destinationWidth: Double): WebGLProgram = js.native
  def renderToCanvas(gpgpu: GPGPUContext,
                     renderShader: WebGLProgram,
                     sourceTex: WebGLTexture): Unit = js.native
  def renderToFramebuffer(gpgpu: GPGPUContext,
                          renderShader: WebGLProgram,
                          sourceTex: WebGLTexture): Unit = js.native
}

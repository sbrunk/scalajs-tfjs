package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package texture_manager {

@js.native
@JSGlobal
class TextureManager protected () extends js.Object {
  def this(gpgpu: GPGPUContext) = this()
  def acquireTexture(shapeRC: js.Tuple2[Double, Double], texType: TextureType = ???): WebGLTexture = js.native
  def releaseTexture(texture: WebGLTexture, shape: js.Tuple2[Double, Double], texType: TextureType = ???): Unit = js.native
  def getNumUsedTextures(): Double = js.native
  def getNumFreeTextures(): Double = js.native
  def dispose(): Unit = js.native
}

}

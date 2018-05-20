package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package multinomial_gpu {

@js.native
@JSGlobal
class MultinomialProgram protected () extends GPGPUProgram {
  def this(batchSize: Double, numOutcomes: Double, numSamples: Double) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
  var seedLoc: WebGLUniformLocation = js.native
  def getCustomSetupFunc(seed: Double): js.Function2[GPGPUContext, WebGLProgram, Unit] = js.native
}

}

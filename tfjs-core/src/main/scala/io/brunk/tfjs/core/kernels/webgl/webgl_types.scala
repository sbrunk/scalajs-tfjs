package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package webgl_types {

@js.native
trait WebGLQuery extends js.Object {
}

@js.native
trait WebGL2RenderingContext extends WebGLRenderingContext {
  var QUERY_RESULT: Double = js.native
  var QUERY_RESULT_AVAILABLE: Double = js.native
  var createQuery: js.Function0[WebGLQuery] = js.native
  var beginQuery: js.Function2[Double, WebGLQuery, Unit] = js.native
  var endQuery: js.Function1[Double, Unit] = js.native
  var getQueryParameter: js.Function2[WebGLQuery, Double, Double] = js.native
}

@js.native
trait WebGL2DisjointQueryTimerExtension extends js.Object {
  var TIME_ELAPSED_EXT: Double = js.native
  var GPU_DISJOINT_EXT: Double = js.native
}

@js.native
trait WebGL1DisjointQueryTimerExtension extends js.Object {
  var TIME_ELAPSED_EXT: Double = js.native
  var QUERY_RESULT_AVAILABLE_EXT: Double = js.native
  var GPU_DISJOINT_EXT: Double = js.native
  var QUERY_RESULT_EXT: Double = js.native
  var createQueryEXT: js.Function0[js.Any] = js.native
  var beginQueryEXT: js.Function2[Double, WebGLQuery, Unit] = js.native
  var endQueryEXT: js.Function1[Double, Unit] = js.native
  var deleteQueryEXT: js.Function1[WebGLQuery, Unit] = js.native
  var isQueryEXT: js.Function1[WebGLQuery, Boolean] = js.native
  var getQueryObjectEXT: js.Function2[WebGLQuery, Double, Double] = js.native
}

@js.native
trait WebGLContextAttributes extends js.Object {
  var alpha: Boolean = js.native
  var antialias: Boolean = js.native
  var premultipliedAlpha: Boolean = js.native
  var preserveDrawingBuffer: Boolean = js.native
  var depth: Boolean = js.native
  var stencil: Boolean = js.native
  var failIfMajorPerformanceCaveat: Boolean = js.native
}

@js.native
trait WebGLLoseContextExtension extends js.Object {
  def loseContext(): Unit = js.native
}

}

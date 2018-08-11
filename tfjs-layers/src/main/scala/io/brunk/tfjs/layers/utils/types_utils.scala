package io.brunk.tfjs.layers.utils

import scala.scalajs.js
import js.annotation._
import js.|


@js.native
@JSGlobalScope
object Types_utils extends js.Object {
  def isArrayOfShapes(x: Shape | js.Array[Shape]): Boolean = js.native
  def normalizeShapeList(x: Shape | js.Array[Shape]): js.Array[Shape] = js.native
  def getExactlyOneTensor(xs: Tensor | js.Array[Tensor]): Tensor = js.native
  def getExactlyOneShape(shapes: Shape | js.Array[Shape]): Shape = js.native
}


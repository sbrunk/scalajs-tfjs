package io.brunk.tfjs.layers.engine

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait Feed extends js.Object {
  var key: SymbolicTensor = js.native
  var value: Tensor = js.native
}

@js.native
@JSGlobal
class FeedDict protected () extends js.Object {
  def this(feeds: js.Array[Feed] | FeedDict = ???) = this()
  def add(key: SymbolicTensor, value: Tensor): FeedDict = js.native
  def addFeed(feed: Feed): Unit = js.native
  def hasKey(key: SymbolicTensor): Boolean = js.native
  def getValue(key: SymbolicTensor): Tensor = js.native
}

@js.native
@JSGlobalScope
object Executor extends js.Object {
  def execute(fetches: SymbolicTensor | js.Array[SymbolicTensor], feedDict: FeedDict, kwargs: Kwargs = ???): Tensor | js.Array[Tensor] | js.Tuple1[Tensor | js.Array[Tensor]] = js.native
}

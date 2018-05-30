package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class AttributeError protected () extends Error {
  def this(message: String = ???) = this()
}

@js.native
@JSGlobal
class RuntimeError protected () extends Error {
  def this(message: String = ???) = this()
}

@js.native
@JSGlobal
class ValueError protected () extends Error {
  def this(message: String = ???) = this()
}

@js.native
@JSGlobal
class NotImplementedError protected () extends Error {
  def this(message: String = ???) = this()
}

@js.native
@JSGlobal
class AssertionError protected () extends Error {
  def this(message: String = ???) = this()
}

@js.native
@JSGlobal
class IndexError protected () extends Error {
  def this(message: String = ???) = this()
}

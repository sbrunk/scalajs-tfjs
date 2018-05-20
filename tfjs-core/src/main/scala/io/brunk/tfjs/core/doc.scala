package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

package doc {

@js.native
trait HeadingMap extends js.Object {
  var Tensors: String = js.native
  var Operations: String = js.native
  var Training: String = js.native
  var Performance: String = js.native
  var Environment: String = js.native
}

@js.native
trait DocInfo extends js.Object {
  var heading: String = js.native
  var subheading: String = js.native
  var namespace: String = js.native
  var subclasses: js.Array[String] = js.native
  var useDocsFrom: String = js.native
  var configParamIndices: js.Array[Double] = js.native
}

@js.native
@JSGlobalScope
object Doc extends js.Object {
  type Heading = String
  type Namespace = String
  def doc(info: DocInfo): js.Function = js.native
}

}

package io.brunk.tfjs.core.io

import scala.scalajs.js
import js.annotation._
import js.|

package model_management {

@js.native
@JSGlobal
class ModelStoreManagerRegistry extends js.Object {
}

@js.native
@JSGlobal
object ModelStoreManagerRegistry extends js.Object {
  def registerManager(scheme: String, manager: ModelStoreManager): Unit = js.native
  def getManager(scheme: String): ModelStoreManager = js.native
  def getSchemes(): js.Array[String] = js.native
}

@js.native
@JSGlobalScope
object Model_management extends js.Object {
  def listModels(): Promise[js.Dictionary[ModelArtifactsInfo]] = js.native
  def removeModel(url: String): Promise[ModelArtifactsInfo] = js.native
  def copyModel(sourceURL: String, destURL: String): Promise[ModelArtifactsInfo] = js.native
  def moveModel(sourceURL: String, destURL: String): Promise[ModelArtifactsInfo] = js.native
}

}

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

package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSImport("@tensorflow/tfjs-core", JSImport.Namespace)
object serialization extends js.Object {

  @js.native
  trait ConfigDict extends js.Object {
    @JSBracketAccess
    def apply(key: String): ConfigDictValue = js.native

    @JSBracketAccess
    def update(key: String, v: ConfigDictValue): Unit = js.native
  }

  @js.native
  trait ConfigDictArray extends js.Array[ConfigDictValue] {}

  @js.native
  //@JSGlobal
  abstract class Serializable extends js.Object {
    def getClassName(): String = js.native

    def getConfig(): ConfigDict
  }

  @js.native
  //@JSGlobal
  object Serializable extends js.Object {
    def fromConfig[T <: Serializable](cls: SerializableConstructor[T], config: ConfigDict): T =
      js.native
  }

  @js.native
  //@JSGlobal
  class SerializationMap extends js.Object {
    var classNameMap: SerializationMap.ClassNameMap = js.native
  }

  @js.native
  //@JSGlobal
  object SerializationMap extends js.Object {

    @js.native
    trait ClassNameMap extends js.Object {
      @JSBracketAccess
      def apply(
        className: String
      ): js.Tuple2[SerializableConstructor[Serializable], FromConfigMethod[Serializable]] = js.native

      @JSBracketAccess
      def update(
        className: String,
        v: js.Tuple2[SerializableConstructor[Serializable], FromConfigMethod[Serializable]]
      ): Unit = js.native
    }

    def getMap(): SerializationMap = js.native

    def register[T <: Serializable](cls: SerializableConstructor[T]): Unit = js.native
  }

  //@js.native
  //@JSGlobalScope
  //object Serialization extends js.Object {
    type ConfigDictValue = Boolean | Double | String | Null | ConfigDictArray | ConfigDict
    type SerializableConstructor[T <: Serializable] = js.Any
    type FromConfigMethod[T <: Serializable] = js.Function2[SerializableConstructor[T], ConfigDict, T]
  //}

}
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

package io.brunk.deeplearnjs.math

import scala.scalajs.js
import js.annotation._
import js.|

package types {

  @js.native
  trait SumTypes extends js.Object {
    var float32: String = js.native
    var int32: String   = js.native
    var bool: String    = js.native
  }

  @js.native
  sealed trait SumTypesMap extends js.Object {}

  @js.native
  @JSGlobal
  object SumTypesMap extends js.Object {
    var float32: SumTypesMap = js.native
    var int32: SumTypesMap   = js.native
    var bool: SumTypesMap    = js.native
    @JSBracketAccess
    def apply(value: SumTypesMap): String = js.native
  }

  @js.native
  trait UpcastInt32And extends js.Object {
    var float32: String = js.native
    var int32: String   = js.native
    var bool: String    = js.native
  }

  @js.native
  sealed trait UpcastInt32AndMap extends js.Object {}

  @js.native
  @JSGlobal
  object UpcastInt32AndMap extends js.Object {
    var float32: UpcastInt32AndMap = js.native
    var int32: UpcastInt32AndMap   = js.native
    var bool: UpcastInt32AndMap    = js.native
    @JSBracketAccess
    def apply(value: UpcastInt32AndMap): String = js.native
  }

  @js.native
  trait UpcastBoolAnd extends js.Object {
    var float32: String = js.native
    var int32: String   = js.native
    var bool: String    = js.native
  }

  @js.native
  sealed trait UpcastBoolAndMap extends js.Object {}

  @js.native
  @JSGlobal
  object UpcastBoolAndMap extends js.Object {
    var float32: UpcastBoolAndMap = js.native
    var int32: UpcastBoolAndMap   = js.native
    var bool: UpcastBoolAndMap    = js.native
    @JSBracketAccess
    def apply(value: UpcastBoolAndMap): String = js.native
  }

  @js.native
  trait UpcastFloat32And extends js.Object {
    var float32: String = js.native
    var int32: String   = js.native
    var bool: String    = js.native
  }

  @js.native
  sealed trait UpcastFloat32AndMap extends js.Object {}

  @js.native
  @JSGlobal
  object UpcastFloat32AndMap extends js.Object {
    var float32: UpcastFloat32AndMap = js.native
    var int32: UpcastFloat32AndMap   = js.native
    var bool: UpcastFloat32AndMap    = js.native
    @JSBracketAccess
    def apply(value: UpcastFloat32AndMap): String = js.native
  }

  @js.native
  trait UpcastType extends js.Object {
    var float32: UpcastFloat32And = js.native
    var int32: UpcastInt32And     = js.native
    var bool: UpcastBoolAnd       = js.native
  }

  @js.native
  @JSGlobalScope
  object Types extends js.Object {
    def upcastType(typeA: DataType, typeB: DataType): DataType = js.native
  }

}

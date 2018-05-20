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
import scala.scalajs.js.typedarray.{ Float32Array, Int32Array, Uint8Array }
import Types.TensorContainer

sealed trait DataType extends js.Any
object DataType {
  sealed trait Float32 extends DataType
  sealed trait Int32   extends DataType
  sealed trait Bool    extends DataType

  val float32 = "float32".asInstanceOf[Float32]
  val int32   = "int32".asInstanceOf[Int32]
  val bool    = "bool".asInstanceOf[Bool]
}

sealed trait Rank extends js.Any

object Rank {
  sealed trait R0 extends Rank
  sealed trait R1 extends Rank
  sealed trait R2 extends Rank
  sealed trait R3 extends Rank
  sealed trait R4 extends Rank

  val R0 = "R0".asInstanceOf[R0]
  val R1 = "R1".asInstanceOf[R1]
  val R2 = "R2".asInstanceOf[R2]
  val R3 = "R3".asInstanceOf[R3]
  val R4 = "R4".asInstanceOf[R4]
}

@js.native
sealed trait Tuple1[+T1] extends js.Object {
  @JSName("0") val _1: T1 = js.native
}

@js.native
sealed trait DType extends js.Object {}

@js.native
@JSGlobal
object DType extends js.Object {
  var float32: DType = js.native
  var int32: DType   = js.native
  var bool: DType    = js.native
  @JSBracketAccess
  def apply(value: DType): String = js.native
}

@js.native
trait ShapeMap extends js.Object {
  var R0: js.Array[Double]                          = js.native
  var R1: Tuple1[Double]                            = js.native
  var R2: js.Tuple2[Double, Double]                 = js.native
  var R3: js.Tuple3[Double, Double, Double]         = js.native
  var R4: js.Tuple4[Double, Double, Double, Double] = js.native
}

@js.native
trait DataTypeMap extends js.Object {
  var float32: Float32Array = js.native
  var int32: Int32Array     = js.native
  var bool: Uint8Array      = js.native
}

//@js.native
//sealed trait Rank extends js.Object {
//}
//
//@js.native
//@JSGlobal
//object Rank extends js.Object {
//  var R0: Rank = js.native
//  var R1: Rank = js.native
//  var R2: Rank = js.native
//  var R3: Rank = js.native
//  var R4: Rank = js.native
//  @JSBracketAccess
//  def apply(value: Rank): String = js.native
//}

@js.native
trait RecursiveArray[T <: js.Any] extends js.Object {
  @JSBracketAccess
  def apply(index: Double): T | RecursiveArray[T] = js.native
  @JSBracketAccess
  def update(index: Double, v: T | RecursiveArray[T]): Unit = js.native
}

@js.native
trait TensorContainerObject extends js.Object {
  @JSBracketAccess
  def apply(x: String): TensorContainer = js.native
  @JSBracketAccess
  def update(x: String, v: TensorContainer): Unit = js.native
}

@js.native
trait TensorContainerArray extends js.Array[TensorContainer] {}

@js.native
@JSGlobalScope
object Types extends js.Object {
  //type DataType   = String
  type TypedArray = Float32Array | Int32Array | Uint8Array
  type TensorLike =
    TypedArray | Double | Boolean | js.Array[Double] | js.Array[js.Array[Double]] | js.Array[
      js.Array[js.Array[Double]]
    ] | js.Array[js.Array[js.Array[js.Array[Double]]]] | js.Array[Boolean] | js.Array[
      js.Array[Boolean]
    ] | js.Array[js.Array[js.Array[Boolean]]] | js.Array[js.Array[js.Array[js.Array[Boolean]]]]
  type TensorLike1D = TypedArray | js.Array[Double] | js.Array[Boolean]
  type TensorLike2D =
    TypedArray | js.Array[Double] | js.Array[js.Array[Double]] | js.Array[Boolean] | js.Array[
      js.Array[Boolean]
    ]
  type TensorLike3D =
    TypedArray | js.Array[Double] | js.Array[js.Array[js.Array[Double]]] | js.Array[
      Boolean
    ] | js.Array[js.Array[js.Array[Boolean]]]
  type TensorLike4D =
    TypedArray | js.Array[Double] | js.Array[js.Array[js.Array[js.Array[Double]]]] | js.Array[
      Boolean
    ] | js.Array[js.Array[js.Array[js.Array[Boolean]]]]
  type FlatVector = js.Array[Boolean] | js.Array[Double] | TypedArray
  type RegularArray[T] =
    js.Array[T] | js.Array[js.Array[T]] | js.Array[js.Array[js.Array[T]]] | js.Array[
      js.Array[js.Array[js.Array[T]]]
    ]
  type ArrayData[D <: DataType] = js.Any | RegularArray[Double] | RegularArray[Boolean]
  type NamedTensorMap           = js.Dictionary[Tensor]
  type NamedVariableMap         = js.Dictionary[Variable]
  def upcastType(typeA: DataType, typeB: DataType): DataType = js.native
  def sumOutType(`type`: DataType): String                   = js.native
  type TensorContainer =
    Unit | Tensor | String | Double | Boolean | TensorContainerObject | TensorContainerArray
}

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
import TensorModule.{ TensorND, VariableND }

sealed trait DataType extends js.Any
object DataType {
  sealed trait Float32 extends DataType
  sealed trait Int32   extends DataType
  sealed trait Bool    extends DataType

  val float32 = "float32".asInstanceOf[Float32]
  val int32   = "int32".asInstanceOf[Int32]
  val bool    = "bool".asInstanceOf[Bool]
}

sealed trait Rank extends js.Any {
  type Shape
}

object Rank {
  sealed trait R0 extends Rank {
    override type Shape = js.Array[Int]
  }
  sealed trait R1 extends Rank {
    override type Shape = Tuple1[Int]
  }
  sealed trait R2 extends Rank {
    type Shape = js.Tuple2[Int, Int]
  }
  sealed trait R3 extends Rank {
    type Shape = js.Tuple3[Int, Int, Int]
  }
  sealed trait R4 extends Rank {
    type Shape = js.Tuple4[Int, Int, Int, Int]
  }
  sealed trait R5 extends Rank {
    type Shape = js.Tuple5[Int, Int, Int, Int, Int]
  }
  sealed trait R6 extends Rank {
    type Shape = js.Tuple6[Int, Int, Int, Int, Int, Int]
  }

  val R0 = "R0".asInstanceOf[R0]
  val R1 = "R1".asInstanceOf[R1]
  val R2 = "R2".asInstanceOf[R2]
  val R3 = "R3".asInstanceOf[R3]
  val R4 = "R4".asInstanceOf[R4]
  val R5 = "R5".asInstanceOf[R3]
  val R6 = "R6".asInstanceOf[R4]
}

@js.native
sealed trait Tuple1[+T1] extends js.Object {
  @JSName("0") val _1: T1 = js.native
}

object Tuple1 {
  @inline def apply[T](_1: T): Tuple1[T] =
    js.Array(_1).asInstanceOf[Tuple1[T]]

  @inline def unapply[T](t: Tuple1[T]): Option[scala.Tuple1[T]] =
    Some(t)

  @inline implicit def fromScalaTuple1[T](t: scala.Tuple1[T]): Tuple1[T] =
    apply(t._1)

  @inline implicit def toScalaTuple2[T](t: Tuple1[T]): scala.Tuple1[T] =
    scala.Tuple1(t._1)

  implicit def fromT[T](t: T): Tuple1[T] = apply(t)
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

//@js.native
//trait ShapeMap extends js.Object {
//  var R0: js.Array[Double]                          = js.native
//  var R1: Tuple1[Double]                            = js.native
//  var R2: js.Tuple2[Double, Double]                 = js.native
//  var R3: js.Tuple3[Double, Double, Double]         = js.native
//  var R4: js.Tuple4[Double, Double, Double, Double] = js.native
//  var R5: js.Tuple5[Double, Double, Double, Double, Double]         = js.native
//  var R6: js.Tuple6[Double, Double, Double, Double, Double, Double] = js.native
//}

@js.native
trait DataTypeMap extends js.Object {
  var float32: Float32Array = js.native
  var int32: Int32Array     = js.native
  var bool: Uint8Array      = js.native
}

@js.native
trait NamedTensorMap extends js.Object {
  type T <: TensorND
  @JSBracketAccess
  def apply(name: String): T = js.native
  @JSBracketAccess
  def update(name: String, v: T): Unit = js.native
}

@js.native
trait NamedVariableMap extends NamedTensorMap {
  override type T <: VariableND
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
//  var R5: Rank = js.native
//  var R6: Rank = js.native
//  @JSBracketAccess
//  def apply(value: Rank): String = js.native
//}

@js.native
trait RecursiveArray[T] extends js.Object {
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
trait ModelPredictConfig extends js.Object {
  var batchSize: Double = js.native
  var verbose: Boolean  = js.native
}

@js.native
trait TensorInfo extends js.Object {
  var name: String            = js.native
  var shape: js.Array[Double] = js.native
  var dtype: DataType         = js.native
}

@js.native
trait InferenceModel extends js.Object {
  def inputs: js.Array[TensorInfo]  = js.native
  def outputs: js.Array[TensorInfo] = js.native
  def predict(
    inputs: TensorND | js.Array[TensorND] | NamedTensorMap,
    config: ModelPredictConfig
  ): TensorND | js.Array[TensorND] | NamedTensorMap = js.native
  def execute(
    inputs: TensorND | js.Array[TensorND] | NamedTensorMap,
    outputs: String | js.Array[String]
  ): TensorND | js.Array[TensorND] = js.native
}

@js.native
@JSGlobalScope
object Types extends js.Object {
  //type DataType   = String
  type TypedArray = Float32Array | Int32Array | Uint8Array
  type TensorLike =
    TypedArray | Double | Boolean | js.Array[Double] | js.Array[js.Array[Double]] | js.Array[
      js.Array[js.Array[Double]]
      ] | js.Array[js.Array[js.Array[js.Array[Double]]]] | js.Array[
      js.Array[js.Array[js.Array[js.Array[Double]]]]
      ] | js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]] | js.Array[Boolean] | js.Array[
      js.Array[Boolean]
      ] | js.Array[js.Array[js.Array[Boolean]]] | js.Array[js.Array[js.Array[js.Array[Boolean]]]] | js.Array[
      js.Array[js.Array[js.Array[js.Array[Boolean]]]]
      ] | js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Boolean]]]]]]
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
  type TensorLike5D = TypedArray | js.Array[Double] | js.Array[
    js.Array[js.Array[js.Array[js.Array[Double]]]]
    ] | js.Array[Boolean] | js.Array[js.Array[js.Array[js.Array[js.Array[Boolean]]]]]
  type TensorLike6D = TypedArray | js.Array[Double] | js.Array[
    js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]
    ] | js.Array[Boolean] | js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Boolean]]]]]]
  type FlatVector = js.Array[Boolean] | js.Array[Double] | TypedArray
  type RegularArray[T] =
    js.Array[T] | js.Array[js.Array[T]] | js.Array[js.Array[js.Array[T]]] | js.Array[
      js.Array[js.Array[js.Array[T]]]
      ] | js.Array[js.Array[js.Array[js.Array[js.Array[T]]]]] | js.Array[
      js.Array[js.Array[js.Array[js.Array[js.Array[T]]]]]
      ]
  type ArrayData[D <: DataType] = js.Any | RegularArray[Double] | RegularArray[Boolean]
  //type NamedTensorMap           = js.Dictionary[Tensor[Rank]]
  //type NamedVariableMap         = js.Dictionary[Variable[Rank]]
  def upcastType(typeA: DataType, typeB: DataType): DataType = js.native
  def sumOutType(`type`: DataType): String                   = js.native
  type TensorContainer =
    Unit | TensorND | String | Double | Boolean | TensorContainerObject | TensorContainerArray
}

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

package io.brunk.tfjs.converter.data

import scala.scalajs.js
import js.annotation._
import js.|
import scala.scalajs.js.typedarray.Uint8Array
import io.brunk.protobufjs

package compiled_api {

  package tensorflow {

    @js.native
    trait IAny extends js.Object {
      var typeUrl: String
      var value: Uint8Array
    }

    @js.native
    @JSGlobal("tensorflow.Any")
    class Any protected () extends IAny {
      def this(p: tensorflow.IAny = ???) = this()

      var typeUrl: String   = js.native
      var value: Uint8Array = js.native
    }

    @js.native
    @JSGlobal("tensorflow.Any")
    object Any extends js.Object {
      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.Any = js.native
    }

    @js.native
    sealed trait DataType extends js.Object {}

    @js.native
    @JSGlobal("tensorflow.DataType")
    object DataType extends js.Object {
      var DT_INVALID: DataType       = js.native
      var DT_FLOAT: DataType         = js.native
      var DT_DOUBLE: DataType        = js.native
      var DT_INT32: DataType         = js.native
      var DT_UINT8: DataType         = js.native
      var DT_INT16: DataType         = js.native
      var DT_INT8: DataType          = js.native
      var DT_STRING: DataType        = js.native
      var DT_COMPLEX64: DataType     = js.native
      var DT_INT64: DataType         = js.native
      var DT_BOOL: DataType          = js.native
      var DT_QINT8: DataType         = js.native
      var DT_QUINT8: DataType        = js.native
      var DT_QINT32: DataType        = js.native
      var DT_BFLOAT16: DataType      = js.native
      var DT_FLOAT_REF: DataType     = js.native
      var DT_DOUBLE_REF: DataType    = js.native
      var DT_INT32_REF: DataType     = js.native
      var DT_UINT8_REF: DataType     = js.native
      var DT_INT16_REF: DataType     = js.native
      var DT_INT8_REF: DataType      = js.native
      var DT_STRING_REF: DataType    = js.native
      var DT_COMPLEX64_REF: DataType = js.native
      var DT_INT64_REF: DataType     = js.native
      var DT_BOOL_REF: DataType      = js.native
      var DT_QINT8_REF: DataType     = js.native
      var DT_QUINT8_REF: DataType    = js.native
      var DT_QINT32_REF: DataType    = js.native
      var DT_BFLOAT16_REF: DataType  = js.native

      @JSBracketAccess
      def apply(value: DataType): String = js.native
    }

    @js.native
    trait ITensorShape extends js.Object {
      var dim: js.Array[tensorflow.TensorShape.IDim]
      var unknownRank: Boolean
    }

    @js.native
    @JSGlobal("tensorflow.TensorShape")
    class TensorShape protected () extends ITensorShape {
      def this(p: tensorflow.ITensorShape = ???) = this()

      var dim: js.Array[tensorflow.TensorShape.IDim] = js.native
      var unknownRank: Boolean                       = js.native
    }

    @js.native
    @JSGlobal("tensorflow.TensorShape")
    object TensorShape extends js.Object {
      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.TensorShape =
        js.native

      @js.native
      trait IDim extends js.Object {
        var size: Double | Long
        var name: String       
      }

      @js.native
      class Dim protected () extends IDim {
        def this(p: tensorflow.TensorShape.IDim = ???) = this()

        var size: Double | Long = js.native
        var name: String        = js.native
      }

      @js.native
      object Dim extends js.Object {
        def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.TensorShape.Dim =
          js.native
      }

    }

    @js.native
    trait ITensor extends js.Object {
      var dtype: tensorflow.DataType
      var tensorShape: tensorflow.ITensorShape | Null
      var versionNumber: Double
      var tensorContent: Uint8Array
      var floatVal: js.Array[Double]
      var doubleVal: js.Array[Double]
      var intVal: js.Array[Double]
      var stringVal: js.Array[Uint8Array]
      var scomplexVal: js.Array[Double]
      var int64Val: js.Array[Double | Long]
      var boolVal: js.Array[Boolean]
      var uint32Val: js.Array[Double]
      var uint64Val: js.Array[Double | Long]
    }

    @js.native
    @JSGlobal("tensorflow.Tensor")
    class Tensor protected () extends ITensor {
      def this(p: tensorflow.ITensor = ???) = this()

      var dtype: tensorflow.DataType                  = js.native
      var tensorShape: tensorflow.ITensorShape | Null = js.native
      var versionNumber: Double                       = js.native
      var tensorContent: Uint8Array                   = js.native
      var floatVal: js.Array[Double]                  = js.native
      var doubleVal: js.Array[Double]                 = js.native
      var intVal: js.Array[Double]                    = js.native
      var stringVal: js.Array[Uint8Array]             = js.native
      var scomplexVal: js.Array[Double]               = js.native
      var int64Val: js.Array[Double | Long]           = js.native
      var boolVal: js.Array[Boolean]                  = js.native
      var uint32Val: js.Array[Double]                 = js.native
      var uint64Val: js.Array[Double | Long]          = js.native
    }

    @js.native
    @JSGlobal("tensorflow.Tensor")
    object Tensor extends js.Object {
      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.Tensor = js.native
    }

    @js.native
    trait IAttrValue extends js.Object {
      var list: tensorflow.AttrValue.IListValue | Null
      var s: Uint8Array
      var i: Double | Long
      var f: Double
      var b: Boolean
      var `type`: tensorflow.DataType
      var shape: tensorflow.ITensorShape | Null
      var tensor: tensorflow.ITensor | Null
      var placeholder: String
      var func: tensorflow.INameAttrList | Null
    }

    @js.native
    @JSGlobal("tensorflow.AttrValue")
    class AttrValue protected () extends IAttrValue {
      def this(p: tensorflow.IAttrValue = ???) = this()

      var list: tensorflow.AttrValue.IListValue | Null = js.native
      var s: Uint8Array = js.native
      var i: Double | Long = js.native
      var f: Double = js.native
      var b: Boolean = js.native
      var `type`: tensorflow.DataType = js.native
      var shape: tensorflow.ITensorShape | Null = js.native
      var tensor: tensorflow.ITensor | Null = js.native
      var placeholder: String = js.native
      var func: tensorflow.INameAttrList | Null = js.native
      var value: String = js.native
    }

    @js.native
    @JSGlobal("tensorflow.AttrValue")
    object AttrValue extends js.Object {
      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.AttrValue =
        js.native

      @js.native
      trait IListValue extends js.Object {
        var s: js.Array[Uint8Array]
        var i: js.Array[Double | Long]
        var f: js.Array[Double]
        var b: js.Array[Boolean]
        var `type`: js.Array[tensorflow.DataType]
        var shape: js.Array[tensorflow.ITensorShape]
        var tensor: js.Array[tensorflow.ITensor]
        var func: js.Array[tensorflow.INameAttrList]
      }

      @js.native
      class ListValue protected () extends IListValue {
        def this(p: tensorflow.AttrValue.IListValue = ???) = this()

        var s: js.Array[Uint8Array] = js.native
        var i: js.Array[Double | Long] = js.native
        var f: js.Array[Double] = js.native
        var b: js.Array[Boolean] = js.native
        var `type`: js.Array[tensorflow.DataType] = js.native
        var shape: js.Array[tensorflow.ITensorShape] = js.native
        var tensor: js.Array[tensorflow.ITensor] = js.native
        var func: js.Array[tensorflow.INameAttrList] = js.native
      }

      @js.native
      object ListValue extends js.Object {
        def decode(
            r: protobufjs.Reader | Uint8Array,
            l: Double = ???
        ): tensorflow.AttrValue.ListValue = js.native
      }

    }

    @js.native
    trait INameAttrList extends js.Object {
      var name: String
      var attr: js.Dictionary[tensorflow.IAttrValue]
    }

    @js.native
    @JSGlobal("tensorflow.NameAttrList")
    class NameAttrList protected () extends INameAttrList {
      def this(p: tensorflow.INameAttrList = ???) = this()

      var name: String = js.native
      //var attr: NameAttrList.Attr = js.native
      var attr: js.Dictionary[tensorflow.IAttrValue] = js.native

    }

    @js.native
    @JSGlobal
    object NameAttrList extends js.Object {

      @js.native
      trait Attr extends js.Object {
        @JSBracketAccess
        def apply(k: String): tensorflow.IAttrValue = js.native

        @JSBracketAccess
        def update(k: String, v: tensorflow.IAttrValue): Unit = js.native
      }

      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.NameAttrList =
        js.native
    }

    @js.native
    trait INodeDef extends js.Object {
      var name: String
      var op: String
      var input: js.Array[String]
      var device: String
      var attr: js.Dictionary[tensorflow.IAttrValue]
    }

    @js.native
    @JSGlobal("tensorflow.NodeDef")
    class NodeDef protected () extends INodeDef {
      def this(p: tensorflow.INodeDef = ???) = this()

      var name: String = js.native
      var op: String = js.native
      var input: js.Array[String] = js.native
      var device: String = js.native
      //var attr: NodeDef.Attr = js.native
      var attr: js.Dictionary[tensorflow.IAttrValue] = js.native
    }

    @js.native
    @JSGlobal
    object NodeDef extends js.Object {

      @js.native
      trait Attr extends js.Object {
        @JSBracketAccess
        def apply(k: String): tensorflow.IAttrValue = js.native

        @JSBracketAccess
        def update(k: String, v: tensorflow.IAttrValue): Unit = js.native
      }

      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.NodeDef = js.native
    }

    @js.native
    trait IVersionDef extends js.Object {
      var producer: Double
      var minConsumer: Double
      var badConsumers: js.Array[Double]
    }

    @js.native
    @JSGlobal("tensorflow.VersionDef")
    class VersionDef protected () extends IVersionDef {
      def this(p: tensorflow.IVersionDef = ???) = this()

      var producer: Double               = js.native
      var minConsumer: Double            = js.native
      var badConsumers: js.Array[Double] = js.native
    }

    @js.native
    @JSGlobal("tensorflow.VersionDef")
    object VersionDef extends js.Object {
      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.VersionDef =
        js.native
    }

    @js.native
    trait IGraphDef extends js.Object {
      var node: js.Array[tensorflow.INodeDef]
      var versions: tensorflow.IVersionDef | Null
      var library: tensorflow.IFunctionDefLibrary | Null
    }

    @js.native
    @JSGlobal("tensorflow.GraphDef")
    class GraphDef protected () extends IGraphDef {
      def this(p: tensorflow.IGraphDef = ???) = this()

      var node: js.Array[tensorflow.INodeDef] = js.native
      var versions: tensorflow.IVersionDef | Null = js.native
      var library: tensorflow.IFunctionDefLibrary | Null = js.native
    }

    @js.native
    @JSGlobal("tensorflow.GraphDef")
    object GraphDef extends js.Object {
      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.GraphDef =
        js.native
    }

    @js.native
    trait ICollectionDef extends js.Object {
      var nodeList: tensorflow.CollectionDef.INodeList | Null
      var bytesList: tensorflow.CollectionDef.IBytesList | Null
      var int64List: tensorflow.CollectionDef.IInt64List | Null
      var floatList: tensorflow.CollectionDef.IFloatList | Null
      var anyList: tensorflow.CollectionDef.IAnyList | Null
    }

    @js.native
    @JSGlobal("tensorflow.CollectionDef")
    class CollectionDef protected () extends ICollectionDef {
      def this(p: tensorflow.ICollectionDef = ???) = this()

      var nodeList: tensorflow.CollectionDef.INodeList | Null   = js.native
      var bytesList: tensorflow.CollectionDef.IBytesList | Null = js.native
      var int64List: tensorflow.CollectionDef.IInt64List | Null = js.native
      var floatList: tensorflow.CollectionDef.IFloatList | Null = js.native
      var anyList: tensorflow.CollectionDef.IAnyList | Null     = js.native
      var kind: String                                          = js.native
    }

    @js.native
    @JSGlobal("tensorflow.CollectionDef")
    object CollectionDef extends js.Object {
      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.CollectionDef =
        js.native

      @js.native
      trait INodeList extends js.Object {
        var value: js.Array[String]
      }

      @js.native
      class NodeList protected () extends INodeList {
        def this(p: tensorflow.CollectionDef.INodeList = ???) = this()

        var value: js.Array[String] = js.native
      }

      @js.native
      object NodeList extends js.Object {
        def decode(
            r: protobufjs.Reader | Uint8Array,
            l: Double = ???
        ): tensorflow.CollectionDef.NodeList = js.native
      }

      @js.native
      trait IBytesList extends js.Object {
        var value: js.Array[Uint8Array]
      }

      @js.native
      class BytesList protected () extends IBytesList {
        def this(p: tensorflow.CollectionDef.IBytesList = ???) = this()

        var value: js.Array[Uint8Array] = js.native
      }

      @js.native
      object BytesList extends js.Object {
        def decode(
            r: protobufjs.Reader | Uint8Array,
            l: Double = ???
        ): tensorflow.CollectionDef.BytesList = js.native
      }

      @js.native
      trait IInt64List extends js.Object {
        var value: js.Array[Double | Long]
      }

      @js.native
      class Int64List protected () extends IInt64List {
        def this(p: tensorflow.CollectionDef.IInt64List = ???) = this()

        var value: js.Array[Double | Long] = js.native
      }

      @js.native
      object Int64List extends js.Object {
        def decode(
            r: protobufjs.Reader | Uint8Array,
            l: Double = ???
        ): tensorflow.CollectionDef.Int64List = js.native
      }

      @js.native
      trait IFloatList extends js.Object {
        var value: js.Array[Double]
      }

      @js.native
      class FloatList protected () extends IFloatList {
        def this(p: tensorflow.CollectionDef.IFloatList = ???) = this()

        var value: js.Array[Double] = js.native
      }

      @js.native
      object FloatList extends js.Object {
        def decode(
            r: protobufjs.Reader | Uint8Array,
            l: Double = ???
        ): tensorflow.CollectionDef.FloatList = js.native
      }

      @js.native
      trait IAnyList extends js.Object {
        var value: js.Array[tensorflow.IAny]
      }

      @js.native
      class AnyList protected () extends IAnyList {
        def this(p: tensorflow.CollectionDef.IAnyList = ???) = this()

        var value: js.Array[tensorflow.IAny] = js.native
      }

      @js.native
      object AnyList extends js.Object {
        def decode(
            r: protobufjs.Reader | Uint8Array,
            l: Double = ???
        ): tensorflow.CollectionDef.AnyList = js.native
      }

    }

    @js.native
    trait ISaverDef extends js.Object {
      var filenameTensorName: String
      var saveTensorName: String
      var restoreOpName: String
      var maxToKeep: Double
      var sharded: Boolean
      var keepCheckpointEveryNHours: Double
      var version: tensorflow.SaverDef.CheckpointFormatVersion
    }

    @js.native
    @JSGlobal("tensorflow.SaverDef")
    class SaverDef protected () extends ISaverDef {
      def this(p: tensorflow.ISaverDef = ???) = this()

      var filenameTensorName: String = js.native
      var saveTensorName: String = js.native
      var restoreOpName: String = js.native
      var maxToKeep: Double = js.native
      var sharded: Boolean = js.native
      var keepCheckpointEveryNHours: Double = js.native
      var version: tensorflow.SaverDef.CheckpointFormatVersion = js.native
    }

    @js.native
    @JSGlobal("tensorflow.SaverDef")
    object SaverDef extends js.Object {
      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.SaverDef =
        js.native

      @js.native
      sealed trait CheckpointFormatVersion extends js.Object {}

      @js.native
      object CheckpointFormatVersion extends js.Object {
        var LEGACY: CheckpointFormatVersion = js.native
        var V1: CheckpointFormatVersion     = js.native
        var V2: CheckpointFormatVersion     = js.native

        @JSBracketAccess
        def apply(value: CheckpointFormatVersion): String = js.native
      }

    }

    @js.native
    trait ITensorInfo extends js.Object {
      var name: String
      var cooSparse: tensorflow.TensorInfo.ICooSparse | Null
      var dtype: tensorflow.DataType
      var tensorShape: tensorflow.ITensorShape | Null
    }

    @js.native
    @JSGlobal("tensorflow.TensorInfo")
    class TensorInfo protected () extends ITensorInfo {
      def this(p: tensorflow.ITensorInfo = ???) = this()

       var name: String = js.native
       var cooSparse: tensorflow.TensorInfo.ICooSparse | Null = js.native
       var dtype: tensorflow.DataType = js.native
       var tensorShape: tensorflow.ITensorShape | Null = js.native
      var encoding: String = js.native
    }

    @js.native
    @JSGlobal("tensorflow.TensorInfo")
    object TensorInfo extends js.Object {
      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.TensorInfo =
        js.native

      @js.native
      trait ICooSparse extends js.Object {
        var valuesTensorName: String
        var indicesTensorName: String
        var denseShapeTensorName: String
      }

      @js.native
      class CooSparse protected () extends ICooSparse {
        def this(p: tensorflow.TensorInfo.ICooSparse = ???) = this()

        var valuesTensorName: String = js.native
        var indicesTensorName: String = js.native
        var denseShapeTensorName: String = js.native
      }

      @js.native
      object CooSparse extends js.Object {
        def decode(
            r: protobufjs.Reader | Uint8Array,
            l: Double = ???
        ): tensorflow.TensorInfo.CooSparse = js.native
      }

    }

    @js.native
    trait ISignatureDef extends js.Object {
      var inputs: js.Dictionary[tensorflow.ITensorInfo]
      var outputs: js.Dictionary[tensorflow.ITensorInfo]
      var methodName: String
    }

    @js.native
    @JSGlobal("tensorflow.SignatureDef")
    class SignatureDef protected () extends ISignatureDef {
      def this(p: tensorflow.ISignatureDef = ???) = this()

      //var inputs: SignatureDef.Inputs = js.native
      var inputs: js.Dictionary[tensorflow.ITensorInfo] = js.native
      //var outputs: SignatureDef.Outputs = js.native
      var outputs: js.Dictionary[tensorflow.ITensorInfo] = js.native
      var methodName: String = js.native
    }

    @js.native
    @JSGlobal
    object SignatureDef extends js.Object {

      @js.native
      trait Inputs extends js.Object {
        @JSBracketAccess
        def apply(k: String): tensorflow.ITensorInfo = js.native

        @JSBracketAccess
        def update(k: String, v: tensorflow.ITensorInfo): Unit = js.native
      }

      @js.native
      trait Outputs extends js.Object {
        @JSBracketAccess
        def apply(k: String): tensorflow.ITensorInfo = js.native

        @JSBracketAccess
        def update(k: String, v: tensorflow.ITensorInfo): Unit = js.native
      }

      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.SignatureDef =
        js.native
    }

    @js.native
    trait IAssetFileDef extends js.Object {
      var tensorInfo: tensorflow.ITensorInfo | Null
      var filename: String
    }

    @js.native
    @JSGlobal("tensorflow.AssetFileDef")
    class AssetFileDef protected () extends IAssetFileDef {
      def this(p: tensorflow.IAssetFileDef = ???) = this()

      var tensorInfo: tensorflow.ITensorInfo | Null = js.native
      var filename: String = js.native
    }

    @js.native
    @JSGlobal("tensorflow.AssetFileDef")
    object AssetFileDef extends js.Object {
      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.AssetFileDef =
        js.native
    }

    @js.native
    trait IOpDef extends js.Object {
      var name: String
      var inputArg: js.Array[tensorflow.OpDef.IArgDef]
      var outputArg: js.Array[tensorflow.OpDef.IArgDef]
      var attr: js.Array[tensorflow.OpDef.IAttrDef]
      var deprecation: tensorflow.OpDef.IOpDeprecation | Null
      var summary: String
      var description: String
      var isCommutative: Boolean
      var isAggregate: Boolean
      var isStateful: Boolean
      var allowsUninitializedInput: Boolean
    }

    @js.native
    @JSGlobal("tensorflow.OpDef")
    class OpDef protected () extends IOpDef {
      def this(p: tensorflow.IOpDef = ???) = this()

      var name: String = js.native
      var inputArg: js.Array[tensorflow.OpDef.IArgDef] = js.native
      var outputArg: js.Array[tensorflow.OpDef.IArgDef] = js.native
      var attr: js.Array[tensorflow.OpDef.IAttrDef] = js.native
      var deprecation: tensorflow.OpDef.IOpDeprecation | Null = js.native
      var summary: String = js.native
      var description: String = js.native
      var isCommutative: Boolean = js.native
      var isAggregate: Boolean = js.native
      var isStateful: Boolean = js.native
      var allowsUninitializedInput: Boolean = js.native
    }

    @js.native
    @JSGlobal("tensorflow.OpDef")
    object OpDef extends js.Object {
      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.OpDef = js.native

      @js.native
      trait IArgDef extends js.Object {
        var name: String
        var description: String
        var `type`: tensorflow.DataType
        var typeAttr: String
        var numberAttr: String
        var typeListAttr: String
        var isRef: Boolean
      }

      @js.native
      class ArgDef protected () extends IArgDef {
        def this(p: tensorflow.OpDef.IArgDef = ???) = this()

        var name: String = js.native
        var description: String = js.native
        var `type`: tensorflow.DataType = js.native
        var typeAttr: String = js.native
        var numberAttr: String = js.native
        var typeListAttr: String = js.native
        var isRef: Boolean = js.native
      }

      @js.native
      object ArgDef extends js.Object {
        def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.OpDef.ArgDef =
          js.native
      }

      @js.native
      trait IAttrDef extends js.Object {
        var name: String
        var `type`: String
        var defaultValue: tensorflow.IAttrValue | Null
        var description: String
        var hasMinimum: Boolean
        var minimum: Double | Long
        var allowedValues: tensorflow.IAttrValue | Null
      }

      @js.native
      class AttrDef protected () extends IAttrDef {
        def this(p: tensorflow.OpDef.IAttrDef = ???) = this()

        var name: String = js.native
        var `type`: String = js.native
        var defaultValue: tensorflow.IAttrValue | Null = js.native
        var description: String = js.native
        var hasMinimum: Boolean = js.native
        var minimum: Double | Long = js.native
        var allowedValues: tensorflow.IAttrValue | Null = js.native
      }

      @js.native
      object AttrDef extends js.Object {
        def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.OpDef.AttrDef =
          js.native
      }

      @js.native
      trait IOpDeprecation extends js.Object {
        var version: Double
        var explanation: String
      }

      @js.native
      class OpDeprecation protected () extends IOpDeprecation {
        def this(p: tensorflow.OpDef.IOpDeprecation = ???) = this()

        var version: Double = js.native
        var explanation: String = js.native
      }

      @js.native
      object OpDeprecation extends js.Object {
        def decode(
            r: protobufjs.Reader | Uint8Array,
            l: Double = ???
        ): tensorflow.OpDef.OpDeprecation = js.native
      }

    }

    @js.native
    trait IOpList extends js.Object {
      var op: js.Array[tensorflow.IOpDef]
    }

    @js.native
    @JSGlobal("tensorflow.OpList")
    class OpList protected () extends IOpList {
      def this(p: tensorflow.IOpList = ???) = this()

      var op: js.Array[tensorflow.IOpDef] = js.native
    }

    @js.native
    @JSGlobal("tensorflow.OpList")
    object OpList extends js.Object {
      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.OpList = js.native
    }

    @js.native
    trait IMetaGraphDef extends js.Object {
      var metaInfoDef: tensorflow.MetaGraphDef.IMetaInfoDef | Null
      var graphDef: tensorflow.IGraphDef | Null
      var saverDef: tensorflow.ISaverDef | Null
      var collectionDef: js.Dictionary[tensorflow.ICollectionDef]
      var signatureDef: js.Dictionary[tensorflow.ISignatureDef]
      var assetFileDef: js.Array[tensorflow.IAssetFileDef]
    }

    @js.native
    @JSGlobal("tensorflow.MetaGraphDef")
    class MetaGraphDef protected () extends IMetaGraphDef {
      def this(p: tensorflow.IMetaGraphDef = ???) = this()

      var metaInfoDef: tensorflow.MetaGraphDef.IMetaInfoDef | Null = js.native
      var graphDef: tensorflow.IGraphDef | Null = js.native
      var saverDef: tensorflow.ISaverDef | Null = js.native
      //var collectionDef: MetaGraphDef.CollectionDef = js.native
      var collectionDef: js.Dictionary[tensorflow.ICollectionDef] = js.native
      // var signatureDef: MetaGraphDef.SignatureDef = js.native
      var signatureDef: js.Dictionary[tensorflow.ISignatureDef] = js.native
      var assetFileDef: js.Array[tensorflow.IAssetFileDef] = js.native
    }

    @js.native
    @JSGlobal
    object MetaGraphDef extends js.Object {

      @js.native
      trait CollectionDef extends js.Object {
        @JSBracketAccess
        def apply(k: String): tensorflow.ICollectionDef = js.native

        @JSBracketAccess
        def update(k: String, v: tensorflow.ICollectionDef): Unit = js.native
      }

      @js.native
      trait SignatureDef extends js.Object {
        @JSBracketAccess
        def apply(k: String): tensorflow.ISignatureDef = js.native

        @JSBracketAccess
        def update(k: String, v: tensorflow.ISignatureDef): Unit = js.native
      }

      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.MetaGraphDef =
        js.native

      @js.native
      trait IMetaInfoDef extends js.Object {
        var metaGraphVersion: String
        var strippedOpList: tensorflow.IOpList | Null
        var anyInfo: tensorflow.IAny | Null
        var tags: js.Array[String]
        var tensorflowVersion: String
        var tensorflowGitVersion: String
      }

      @js.native
      //@JSGlobal("tensorflow.MetaGraphDef.MetaInfoDef")
      class MetaInfoDef protected () extends IMetaInfoDef {
        def this(p: tensorflow.MetaGraphDef.IMetaInfoDef = ???) = this()

        var metaGraphVersion: String = js.native
        var strippedOpList: tensorflow.IOpList | Null = js.native
        var anyInfo: tensorflow.IAny | Null = js.native
        var tags: js.Array[String] = js.native
        var tensorflowVersion: String = js.native
        var tensorflowGitVersion: String = js.native
      }

      @js.native
      //@JSGlobal("tensorflow.MetaGraphDef.MetaInfoDef")
      object MetaInfoDef extends js.Object {
        def decode(
            r: protobufjs.Reader | Uint8Array,
            l: Double = ???
        ): tensorflow.MetaGraphDef.MetaInfoDef = js.native
      }

    }

    @js.native
    trait ISavedModel extends js.Object {
      var savedModelSchemaVersion: Double | Long
      var metaGraphs: js.Array[tensorflow.IMetaGraphDef]
    }

    @js.native
    @JSGlobal("tensorflow.SavedModel")
    class SavedModel protected () extends ISavedModel {
      def this(p: tensorflow.ISavedModel = ???) = this()

      var savedModelSchemaVersion: Double | Long = js.native
      var metaGraphs: js.Array[tensorflow.IMetaGraphDef] = js.native
    }

    @js.native
    @JSGlobal("tensorflow.SavedModel")
    object SavedModel extends js.Object {
      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.SavedModel =
        js.native
    }

    @js.native
    trait IFunctionDefLibrary extends js.Object {
      var function: js.Array[tensorflow.IFunctionDef]
      var gradient: js.Array[tensorflow.IGradientDef]
    }

    @js.native
    @JSGlobal("tensorflow.FunctionDefLibrary")
    class FunctionDefLibrary protected () extends IFunctionDefLibrary {
      def this(p: tensorflow.IFunctionDefLibrary = ???) = this()

      var function: js.Array[tensorflow.IFunctionDef] = js.native
      var gradient: js.Array[tensorflow.IGradientDef] = js.native
    }

    @js.native
    @JSGlobal("tensorflow.FunctionDefLibrary")
    object FunctionDefLibrary extends js.Object {
      def decode(
          r: protobufjs.Reader | Uint8Array,
          l: Double = ???
      ): tensorflow.FunctionDefLibrary = js.native
    }

    @js.native
    trait IFunctionDef extends js.Object {
      var signature: tensorflow.IOpDef | Null
      var attr: js.Dictionary[tensorflow.IAttrValue]
      var nodeDef: js.Array[tensorflow.INodeDef]
      var ret: js.Dictionary[String]
    }

    @js.native
    @JSGlobal("tensorflow.FunctionDef")
    class FunctionDef protected () extends IFunctionDef {
      def this(p: tensorflow.IFunctionDef = ???) = this()

      var signature: tensorflow.IOpDef | Null = js.native
      //var attr: FunctionDef.Attr = js.native
      var attr: js.Dictionary[tensorflow.IAttrValue] = js.native
      var nodeDef: js.Array[tensorflow.INodeDef] = js.native
      //var ret: FunctionDef.Ret = js.native
      var ret: js.Dictionary[String] = js.native
    }

    @js.native
    @JSGlobal
    object FunctionDef extends js.Object {

      @js.native
      trait Attr extends js.Object {
        @JSBracketAccess
        def apply(k: String): tensorflow.IAttrValue = js.native

        @JSBracketAccess
        def update(k: String, v: tensorflow.IAttrValue): Unit = js.native
      }

      @js.native
      trait Ret extends js.Object {
        @JSBracketAccess
        def apply(k: String): String = js.native

        @JSBracketAccess
        def update(k: String, v: String): Unit = js.native
      }

      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.FunctionDef =
        js.native
    }

    @js.native
    trait IGradientDef extends js.Object {
      var functionName: String
      var gradientFunc: String
    }

    @js.native
    @JSGlobal("tensorflow.GradientDef")
    class GradientDef protected () extends IGradientDef {
      def this(p: tensorflow.IGradientDef = ???) = this()

      var functionName: String = js.native
      var gradientFunc: String = js.native
    }

    @js.native
    @JSGlobal("tensorflow.GradientDef")
    object GradientDef extends js.Object {
      def decode(r: protobufjs.Reader | Uint8Array, l: Double = ???): tensorflow.GradientDef =
        js.native
    }

  }

}

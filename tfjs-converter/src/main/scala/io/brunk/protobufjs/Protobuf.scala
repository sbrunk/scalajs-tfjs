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

package io.brunk

import scala.scalajs.js
import js.annotation._
import js.|

package protobufjs {

  import io.brunk.protobufjs.Protobufjs.{
    AnyNestedObject,
    asPromiseCallback,
    Codegen,
    EventEmitterListener,
    FetchCallback,
    FieldDecorator,
    LoadCallback,
    OneOfDecorator,
    OneOfGetter,
    OneOfSetter,
    PoolAllocator,
    PoolSlicer,
    Properties,
    RPCImpl,
    TokenizerHandleNext,
    TokenizerHandlePeek,
    TokenizerHandlePush,
    TokenizerHandleCmnt,
    TokenizerHandleSkip,
    TypeDecorator,
    WrapperFromObjectConverter,
    WrapperToObjectConverter}

  import io.brunk.protobufjs.rpc.Rpc.{ServiceMethod}

  import scala.scalajs.js.Promise
  import scala.scalajs.js.typedarray.Uint8Array

  package common {

    import scala.scalajs.js.typedarray.Uint8Array

    @js.native
    trait IAny extends js.Object {
      var typeUrl: String
      var bytes: Uint8Array
    }

    @js.native
    trait IDuration extends js.Object {
      var seconds: Double | Long
      var nanos: Double
    }

    @js.native
    trait ITimestamp extends js.Object {
      var seconds: Double | Long
      var nanos: Double
    }

    @js.native
    trait IEmpty extends js.Object {
    }

    @js.native
    trait IStruct extends js.Object {
      var fields: IStruct.Fields
    }

    object IStruct {

      @js.native
      trait Fields extends js.Object {
        @JSBracketAccess
        def apply(k: String): IValue = js.native

        @JSBracketAccess
        def update(k: String, v: IValue): Unit = js.native
      }

    }

    @js.native
    trait IValue extends js.Object {
      var kind: String
      var nullValue: Int
      var numberValue: Double
      var stringValue: String
      var boolValue: Boolean
      var structValue: IStruct
      var listValue: IListValue
    }

    @js.native
    trait IListValue extends js.Object {
      var values: js.Array[IValue]
    }

    @js.native
    trait IDoubleValue extends js.Object {
      var value: Double
    }

    @js.native
    trait IFloatValue extends js.Object {
      var value: Double
    }

    @js.native
    trait IInt64Value extends js.Object {
      var value: Double | Long
    }

    @js.native
    trait IUInt64Value extends js.Object {
      var value: Double | Long
    }

    @js.native
    trait IInt32Value extends js.Object {
      var value: Double
    }

    @js.native
    trait IUInt32Value extends js.Object {
      var value: Double
    }

    @js.native
    trait IBoolValue extends js.Object {
      var value: Boolean
    }

    @js.native
    trait IStringValue extends js.Object {
      var value: String
    }

    @js.native
    trait IBytesValue extends js.Object {
      var value: Uint8Array
    }

    @js.native
    @JSGlobal("common")
    object Common extends js.Object {
      def get(file: String): INamespace | Null = js.native
    }

  }

  package converter {

    import io.brunk.protobufjs.Protobufjs.Codegen

    @js.native
    @JSGlobal("converter")
    object Converter extends js.Object {
      def fromObject(mtype: Type): Codegen = js.native

      def toObject(mtype: Type): Codegen = js.native
    }

  }

  @js.native
  @JSGlobal
  class Enum protected() extends ReflectionObject {
    def this(name: String, values: js.Dictionary[Double] = ???, options: js.Dictionary[js.Any] = ???, comment: String = ???, comments: js.Dictionary[String] = ???) = this()

    var valuesById: Enum.ValuesById = js.native
    var values: Enum.Values = js.native
    //var comment: String | Null = js.native
    var comments: Enum.Comments = js.native
    var reserved: js.Array[js.Array[Double] | String] = js.native

    def toJSON(toJSONOptions: IToJSONOptions = ???): IEnum = js.native

    def add(name: String, id: Double, comment: String = ???): Enum = js.native

    def remove(name: String): Enum = js.native

    def isReservedId(id: Double): Boolean = js.native

    def isReservedName(name: String): Boolean = js.native
  }

  object Enum {

    @js.native
    trait ValuesById extends js.Object {
      @JSBracketAccess
      def apply(k: Double): String = js.native

      @JSBracketAccess
      def update(k: Double, v: String): Unit = js.native
    }

    @js.native
    trait Values extends js.Object {
      @JSBracketAccess
      def apply(k: String): Double = js.native

      @JSBracketAccess
      def update(k: String, v: Double): Unit = js.native
    }

    @js.native
    trait Comments extends js.Object {
      @JSBracketAccess
      def apply(k: String): String = js.native

      @JSBracketAccess
      def update(k: String, v: String): Unit = js.native
    }

    def fromJSON(name: String, json: IEnum): Enum = js.native
  }

  @js.native
  trait IEnum extends js.Object {
    var values: IEnum.Values
    var options: IEnum.Options
  }

  object IEnum {

    @js.native
    trait Values extends js.Object {
      @JSBracketAccess
      def apply(k: String): Double = js.native

      @JSBracketAccess
      def update(k: String, v: Double): Unit = js.native
    }

    @js.native
    trait Options extends js.Object {
      @JSBracketAccess
      def apply(k: String): js.Any = js.native

      @JSBracketAccess
      def update(k: String, v: js.Any): Unit = js.native
    }

  }

  @js.native
  @JSGlobal
  class Field protected() extends FieldBase {
    def this(name: String, id: Double, `type`: String, rule: String | js.Dictionary[js.Any] = ???, extend: String | js.Dictionary[js.Any] = ???, options: js.Dictionary[js.Any] = ???) = this()

    def packed: Boolean = js.native
  }

  @js.native
  @JSGlobal
  object Field extends js.Object {
    def fromJSON(name: String, json: IField): Field = js.native

    def d[T <: Double | js.Array[Double] | Long | js.Array[Long] | String | js.Array[String] | Boolean | js.Array[Boolean] | Uint8Array | js.Array[Uint8Array] | Buffer | js.Array[Buffer]](fieldId: Double, fieldType: String | js.Object, fieldRule: String = ???, defaultValue: T = ???): FieldDecorator = js.native

    @JSName("d")
    def dM[T <: Message[T]](fieldId: Double, fieldType: Constructor[T] | String, fieldRule: String = ???): FieldDecorator = js.native
  }

  @js.native
  @JSGlobal
  class FieldBase protected() extends ReflectionObject {
    def this(name: String, id: Double, `type`: String, rule: String | js.Dictionary[js.Any] = ???, extend: String | js.Dictionary[js.Any] = ???, options: js.Dictionary[js.Any] = ???, comment: String = ???) = this()

    var rule: String = js.native
    var `type`: String = js.native
    var id: Double = js.native
    var extend: String = js.native
    var required: Boolean = js.native
    var optional: Boolean = js.native
    var repeated: Boolean = js.native
    var map: Boolean = js.native
    var message: Type | Null = js.native
    var partOf: OneOf | Null = js.native
    var typeDefault: js.Any = js.native
    var defaultValue: js.Any = js.native
    var long: Boolean = js.native
    var bytes: Boolean = js.native
    var resolvedType: Type | Enum | Null = js.native
    var extensionField: Field | Null = js.native
    var declaringField: Field | Null = js.native
//    var comment: String | Null = js.native

    def toJSON(toJSONOptions: IToJSONOptions = ???): IField = js.native

//    def resolve(): Field = js.native
  }

  @js.native
  trait IField extends js.Object {
    var rule: String
    var `type`: String
    var id: Double
    var options: IField.Options
  }

  object IField {

    @js.native
    trait Options extends js.Object {
      @JSBracketAccess
      def apply(k: String): js.Any = js.native

      @JSBracketAccess
      def update(k: String, v: js.Any): Unit = js.native
    }

  }

  @js.native
  trait IExtensionField extends IField {
    var extend: String
  }

  @js.native
  @JSGlobal
  class MapField protected() extends FieldBase {
    def this(name: String, id: Double, keyType: String, `type`: String, options: js.Dictionary[js.Any] = ???, comment: String = ???) = this()

    var keyType: String = js.native
    var resolvedKeyType: ReflectionObject | Null = js.native

//    def toJSON(toJSONOptions: IToJSONOptions = ???): IMapField = js.native
  }

  @js.native
  @JSGlobal
  object MapField extends js.Object {
    def fromJSON(name: String, json: IMapField): MapField = js.native

    def d[T <: js.Dictionary[Double | Long | String | Boolean | Uint8Array | Buffer | js.Array[Double] | Message[js.Object]]](fieldId: Double, fieldKeyType: String, fieldValueType: String | js.Object | Constructor[js.Any]): FieldDecorator = js.native
  }

  @js.native
  trait IMapField extends IField {
    var keyType: String
  }

  @js.native
  trait IExtensionMapField extends IMapField {
    var extend: String
  }

  @js.native
  @JSGlobal
  class Message[T <: js.Object] protected() extends js.Object {
    def this(properties: Properties[T] = ???) = this()

    @JSName("$type")
    def `$type`: Type = js.native

    def toJSON(): js.Dictionary[js.Any] = js.native
  }

  @js.native
  @JSGlobal
  object Message extends js.Object {
    @JSName("$type")
    def `$type`: Type = js.native

    def create[T <: Message[T]](`this`: Constructor[T], properties: js.Dictionary[js.Any] = ???): Message[T] = js.native

    def encode[T <: Message[T]](`this`: Constructor[T], message: T | js.Dictionary[js.Any], writer: Writer = ???): Writer = js.native

    def encodeDelimited[T <: Message[T]](`this`: Constructor[T], message: T | js.Dictionary[js.Any], writer: Writer = ???): Writer = js.native

    def decode[T <: Message[T]](`this`: Constructor[T], reader: Reader | Uint8Array): T = js.native

    def decodeDelimited[T <: Message[T]](`this`: Constructor[T], reader: Reader | Uint8Array): T = js.native

    def verify(message: js.Dictionary[js.Any]): String | Null = js.native

    def fromObject[T <: Message[T]](`this`: Constructor[T], `object`: js.Dictionary[js.Any]): T = js.native

    def toObject[T <: Message[T]](`this`: Constructor[T], message: T, options: IConversionOptions = ???): js.Dictionary[js.Any] = js.native
  }

  @js.native
  @JSGlobal
  class Method protected() extends ReflectionObject {
    def this(name: String, `type`: String | Unit, requestType: String, responseType: String, requestStream: Boolean | js.Dictionary[js.Any] = ???, responseStream: Boolean | js.Dictionary[js.Any] = ???, options: js.Dictionary[js.Any] = ???, comment: String = ???) = this()

    var `type`: String = js.native
    var requestType: String = js.native
    var requestStream: Boolean = js.native
    var responseType: String = js.native
    var responseStream: Boolean = js.native
    var resolvedRequestType: Type | Null = js.native
    var resolvedResponseType: Type | Null = js.native
//    var comment: String | Null = js.native

    def toJSON(toJSONOptions: IToJSONOptions = ???): IMethod = js.native
  }

  @js.native
  @JSGlobal
  object Method extends js.Object {
    def fromJSON(name: String, json: IMethod): Method = js.native
  }

  @js.native
  trait IMethod extends js.Object {
    var `type`: String
    var requestType: String
    var responseType: String
    var requestStream: Boolean
    var responseStream: Boolean
    var options: IMethod.Options
  }

  object IMethod {

    @js.native
    trait Options extends js.Object {
      @JSBracketAccess
      def apply(k: String): js.Any = js.native

      @JSBracketAccess
      def update(k: String, v: js.Any): Unit = js.native
    }

  }

  @js.native
  @JSGlobal
  class Namespace protected() extends NamespaceBase {
    def this(name: String, options: js.Dictionary[js.Any] = ???) = this()
  }

  @js.native
  @JSGlobal
  object Namespace extends js.Object {
    def fromJSON(name: String, json: js.Dictionary[js.Any]): Namespace = js.native

    def arrayToJSON(array: js.Array[ReflectionObject], toJSONOptions: IToJSONOptions = ???): js.Dictionary[js.Any] | Unit = js.native

    def isReservedId(reserved: js.Array[js.Array[Double] | String] | Unit, id: Double): Boolean = js.native

    def isReservedName(reserved: js.Array[js.Array[Double] | String] | Unit, name: String): Boolean = js.native
  }

  @js.native
  @JSGlobal
  abstract class NamespaceBase extends ReflectionObject {
    var nested: NamespaceBase.Nested = js.native

    def nestedArray: js.Array[ReflectionObject] = js.native

    def toJSON(toJSONOptions: IToJSONOptions = ???): INamespace = js.native

    def addJSON(nestedJson: js.Dictionary[AnyNestedObject]): Namespace = js.native

    def get(name: String): ReflectionObject | Null = js.native

    def getEnum(name: String): js.Dictionary[Double] = js.native

    def add(`object`: ReflectionObject): Namespace = js.native

    def remove(`object`: ReflectionObject): Namespace = js.native

    def define(path: String | js.Array[String], json: js.Any = ???): Namespace = js.native

    def resolveAll(): Namespace = js.native

    def lookup(path: String | js.Array[String], filterTypes: js.Any | js.Array[js.Any], parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native

    def lookup(path: String | js.Array[String], filterTypes: js.Any | js.Array[js.Any]): ReflectionObject | Null = js.native

    def lookup(path: String | js.Array[String], parentAlreadyChecked: Boolean): ReflectionObject | Null = js.native

    def lookup(path: String | js.Array[String]): ReflectionObject | Null = js.native


    def lookupType(path: String | js.Array[String]): Type = js.native

    def lookupEnum(path: String | js.Array[String]): Enum = js.native

    def lookupTypeOrEnum(path: String | js.Array[String]): Type = js.native

    def lookupService(path: String | js.Array[String]): Service = js.native
  }

  object NamespaceBase {

    @js.native
    trait Nested extends js.Object {
      @JSBracketAccess
      def apply(k: String): ReflectionObject = js.native

      @JSBracketAccess
      def update(k: String, v: ReflectionObject): Unit = js.native
    }

  }

  @js.native
  trait INamespace extends js.Object {
    var options: INamespace.Options
    var nested: INamespace.Nested
  }

  object INamespace {

    @js.native
    trait Options extends js.Object {
      @JSBracketAccess
      def apply(k: String): js.Any = js.native

      @JSBracketAccess
      def update(k: String, v: js.Any): Unit = js.native
    }

    @js.native
    trait Nested extends js.Object {
      @JSBracketAccess
      def apply(k: String): AnyNestedObject = js.native

      @JSBracketAccess
      def update(k: String, v: AnyNestedObject): Unit = js.native
    }

  }

  @js.native
  @JSGlobal
  abstract class ReflectionObject extends js.Object {
    var options: ReflectionObject.Options = js.native
    var name: String = js.native
    var parent: Namespace | Null = js.native
    var resolved: Boolean = js.native
    var comment: String | Null = js.native
    var filename: String | Null = js.native

    def root: Root = js.native

    def fullName: String = js.native

    def toJSON(): js.Dictionary[js.Any] = js.native

    def onAdd(parent: ReflectionObject): Unit = js.native

    def onRemove(parent: ReflectionObject): Unit = js.native

    def resolve(): ReflectionObject = js.native

    def getOption(name: String): js.Dynamic = js.native

    def setOption(name: String, value: js.Any, ifNotSet: Boolean = ???): ReflectionObject = js.native

    def setOptions(options: js.Dictionary[js.Any], ifNotSet: Boolean = ???): ReflectionObject = js.native

    override def toString(): String = js.native
  }

  object ReflectionObject {

    @js.native
    trait Options extends js.Object {
      @JSBracketAccess
      def apply(k: String): js.Any = js.native

      @JSBracketAccess
      def update(k: String, v: js.Any): Unit = js.native
    }

  }

  @js.native
  @JSGlobal
  class OneOf protected() extends ReflectionObject {
    def this(name: String, fieldNames: js.Array[String] | js.Dictionary[js.Any] = ???, options: js.Dictionary[js.Any] = ???, comment: String = ???) = this()

    var oneof: js.Array[String] = js.native

    def fieldsArray: js.Array[Field] = js.native

//    var comment: String | Null = js.native

    def toJSON(toJSONOptions: IToJSONOptions = ???): IOneOf = js.native

    def add(field: Field): OneOf = js.native

    def remove(field: Field): OneOf = js.native
  }

  @js.native
  @JSGlobal
  object OneOf extends js.Object {
    def fromJSON(name: String, json: IOneOf): OneOf = js.native

    def d[T <: String](fieldNames: String*): OneOfDecorator = js.native
  }

  @js.native
  trait IOneOf extends js.Object {
    var oneof: js.Array[String]
    var options: IOneOf.Options
  }

  object IOneOf {

    @js.native
    trait Options extends js.Object {
      @JSBracketAccess
      def apply(k: String): js.Any = js.native

      @JSBracketAccess
      def update(k: String, v: js.Any): Unit = js.native
    }

  }

  @js.native
  trait IParserResult extends js.Object {
    var `package`: String | Unit
    var imports: js.Array[String] | Unit
    var weakImports: js.Array[String] | Unit
    var syntax: String | Unit
    var root: Root
  }

  @js.native
  trait IParseOptions extends js.Object {
    var keepCase: Boolean
    var alternateCommentMode: Boolean
  }

  @js.native
  trait IToJSONOptions extends js.Object {
    var keepComments: Boolean
  }

  @js.native
  @JSGlobal
  class Reader protected() extends js.Object {
    def this(buffer: Uint8Array) = this()

    var buf: Uint8Array = js.native
    var pos: Double = js.native
    var len: Double = js.native

    def uint32(): Double = js.native

    def int32(): Double = js.native

    def sint32(): Double = js.native

    def int64(): Long = js.native

    def uint64(): Long = js.native

    def sint64(): Long = js.native

    def bool(): Boolean = js.native

    def fixed32(): Double = js.native

    def sfixed32(): Double = js.native

    def fixed64(): Long = js.native

    def sfixed64(): Long = js.native

    def float(): Double = js.native

    def double(): Double = js.native

    def bytes(): Uint8Array = js.native

    def string(): String = js.native

    def skip(length: Double = ???): Reader = js.native

    def skipType(wireType: Double): Reader = js.native
  }

  @js.native
  @JSGlobal
  object Reader extends js.Object {
    def create(buffer: Uint8Array | Buffer): Reader | BufferReader = js.native
  }

  @js.native
  @JSGlobal
  class BufferReader protected() extends Reader {
    def this(buffer: Buffer) = this()

//    def bytes(): Buffer = js.native
  }

  @js.native
  @JSGlobal
  class Root protected() extends NamespaceBase {
    def this(options: js.Dictionary[js.Any] = ???) = this()

    var deferred: js.Array[Field] = js.native
    var files: js.Array[String] = js.native

    def resolvePath(origin: String, target: String): String | Null = js.native

    def load(filename: String | js.Array[String], options: IParseOptions, callback: LoadCallback): Unit = js.native

    def load(filename: String | js.Array[String], callback: LoadCallback): Unit = js.native

    def load(filename: String | js.Array[String], options: IParseOptions = ???): Promise[Root] = js.native

    def loadSync(filename: String | js.Array[String], options: IParseOptions = ???): Root = js.native
  }

  @js.native
  @JSGlobal
  object Root extends js.Object {
    def fromJSON(json: INamespace, root: Root = ???): Root = js.native
  }

  @js.native
  @JSGlobal
  object roots extends js.Object {
    @JSBracketAccess
    def apply(k: String): Root = js.native

    @JSBracketAccess
    def update(k: String, v: Root): Unit = js.native
  }

  package rpc {

    import io.brunk.protobufjs.Protobufjs.RPCImpl
    import io.brunk.protobufjs.rpc.Rpc.{ServiceMethod, ServiceMethodCallback}

    @js.native
    @JSGlobal("rpc.Service")
    class Service protected() extends util.EventEmitter {
      def this(rpcImpl: RPCImpl, requestDelimited: Boolean = ???, responseDelimited: Boolean = ???) = this()

      var rpcImpl: RPCImpl | Null = js.native
      var requestDelimited: Boolean = js.native
      var responseDelimited: Boolean = js.native

      def rpcCall[TReq <: Message[TReq], TRes <: Message[TRes]](method: Method | ServiceMethod[TReq, TRes], requestCtor: Constructor[TReq], responseCtor: Constructor[TRes], request: TReq | Properties[TReq], callback: ServiceMethodCallback[TRes]): Unit = js.native

      def end(endedByRPC: Boolean = ???): rpc.Service = js.native
    }

    @js.native
    @JSGlobal("rpc")
    object Rpc extends js.Object {
      type ServiceMethodCallback[TRes <: Message[TRes]] = js.Function2[js.Error | Null, TRes, Unit]
      type ServiceMethod[TReq <: Message[TReq], TRes <: Message[TRes]] = js.Function2[TReq | Properties[TReq], ServiceMethodCallback[TRes], Promise[Message[TRes]]]
    }

  }

  @js.native
  @JSGlobal
  class Service protected() extends NamespaceBase {
    def this(name: String, options: js.Dictionary[js.Any] = ???) = this()

    var methods: Service.Methods = js.native

//    def toJSON(toJSONOptions: IToJSONOptions = ???): IService = js.native

    def methodsArray: js.Array[Method] = js.native

    def create(rpcImpl: RPCImpl, requestDelimited: Boolean = ???, responseDelimited: Boolean = ???): rpc.Service = js.native
  }

  object Service {

    @js.native
    trait Methods extends js.Object {
      @JSBracketAccess
      def apply(k: String): Method = js.native

      @JSBracketAccess
      def update(k: String, v: Method): Unit = js.native
    }

    def fromJSON(name: String, json: IService): Service = js.native
  }

  @js.native
  trait IService extends INamespace {
    var methods: IService.Methods
  }

  object IService {

    @js.native
    trait Methods extends js.Object {
      @JSBracketAccess
      def apply(k: String): IMethod = js.native

      @JSBracketAccess
      def update(k: String, v: IMethod): Unit = js.native
    }

  }

  @js.native
  trait ITokenizerHandle extends js.Object {
    var next: TokenizerHandleNext = js.native
    var peek: TokenizerHandlePeek = js.native
    var push: TokenizerHandlePush = js.native
    var skip: TokenizerHandleSkip = js.native
    var cmnt: TokenizerHandleCmnt = js.native
    var line: Double = js.native
  }

  package tokenize {

    @js.native
    @JSGlobal("tokenize")
    object Tokenize extends js.Object {
      def unescape(str: String): String = js.native
    }

  }

  @js.native
  @JSGlobal
  class Type protected() extends NamespaceBase {
    def this(name: String, options: js.Dictionary[js.Any] = ???) = this()

    var fields: Type.Fields = js.native
    var oneofs: Type.Oneofs = js.native
    var extensions: js.Array[js.Array[Double]] = js.native
    var reserved: js.Array[js.Array[Double] | String] = js.native

    def fieldsById: Type.FieldsById = js.native

    def fieldsArray: js.Array[Field] = js.native

    def oneofsArray: js.Array[OneOf] = js.native

    var ctor: Constructor[js.Any] = js.native

//    def toJSON(toJSONOptions: IToJSONOptions = ???): IType = js.native

//    def add(`object`: ReflectionObject): Type = js.native

//    def remove(`object`: ReflectionObject): Type = js.native

    def isReservedId(id: Double): Boolean = js.native

    def isReservedName(name: String): Boolean = js.native

    def create(properties: js.Dictionary[js.Any] = ???): Message[js.Object] = js.native

    def setup(): Type = js.native

    def encode(message: Message[js.Object] | js.Dictionary[js.Any], writer: Writer = ???): Writer = js.native

    def encodeDelimited(message: Message[js.Object] | js.Dictionary[js.Any], writer: Writer = ???): Writer = js.native

    def decode(reader: Reader | Uint8Array, length: Double = ???): Message[js.Object] = js.native

    def decodeDelimited(reader: Reader | Uint8Array): Message[js.Object] = js.native

    def verify(message: js.Dictionary[js.Any]): Null | String = js.native

    def fromObject(`object`: js.Dictionary[js.Any]): Message[js.Object] = js.native

    def toObject(message: Message[js.Object], options: IConversionOptions = ???): js.Dictionary[js.Any] = js.native
  }

  object Type {

    @js.native
    trait Fields extends js.Object {
      @JSBracketAccess
      def apply(k: String): Field = js.native

      @JSBracketAccess
      def update(k: String, v: Field): Unit = js.native
    }

    @js.native
    trait Oneofs extends js.Object {
      @JSBracketAccess
      def apply(k: String): OneOf = js.native

      @JSBracketAccess
      def update(k: String, v: OneOf): Unit = js.native
    }

    @js.native
    trait FieldsById extends js.Object {
      @JSBracketAccess
      def apply(k: Double): Field = js.native

      @JSBracketAccess
      def update(k: Double, v: Field): Unit = js.native
    }

    def generateConstructor(mtype: Type): Codegen = js.native

    def fromJSON(name: String, json: IType): Type = js.native

    def d[T <: Message[T]](typeName: String = ???): TypeDecorator[T] = js.native
  }

  @js.native
  trait IType extends INamespace {
    var oneofs: IType.Oneofs
    var fields: IType.Fields
    var extensions: js.Array[js.Array[Double]]
    var reserved: js.Array[js.Array[Double]]
    var group: Boolean
  }

  object IType {

    @js.native
    trait Oneofs extends js.Object {
      @JSBracketAccess
      def apply(k: String): IOneOf = js.native

      @JSBracketAccess
      def update(k: String, v: IOneOf): Unit = js.native
    }

    @js.native
    trait Fields extends js.Object {
      @JSBracketAccess
      def apply(k: String): IField = js.native

      @JSBracketAccess
      def update(k: String, v: IField): Unit = js.native
    }

  }

  @js.native
  trait IConversionOptions extends js.Object {
    var longs: js.Function
    var enums: js.Function
    var bytes: js.Function
    var defaults: Boolean
    var arrays: Boolean
    var objects: Boolean
    var oneofs: Boolean
    var json: Boolean
  }

  package types {

    @js.native
    @JSGlobal("types.basic")
    object basic extends js.Object {
      var double: Double = js.native
      var float: Double = js.native
      var int32: Double = js.native
      var uint32: Double = js.native
      var sint32: Double = js.native
      var fixed32: Double = js.native
      var sfixed32: Double = js.native
      var int64: Double = js.native
      var uint64: Double = js.native
      var sint64: Double = js.native
      var fixed64: Double = js.native
      var sfixed64: Double = js.native
      var bool: Double = js.native
      var string: Double = js.native
      var bytes: Double = js.native
    }

    @js.native
    @JSGlobal("types.defaults")
    object defaults extends js.Object {
      var double: Double = js.native
      var float: Double = js.native
      var int32: Double = js.native
      var uint32: Double = js.native
      var sint32: Double = js.native
      var fixed32: Double = js.native
      var sfixed32: Double = js.native
      var int64: Double = js.native
      var uint64: Double = js.native
      var sint64: Double = js.native
      var fixed64: Double = js.native
      var sfixed64: Double = js.native
      var bool: Boolean = js.native
      var string: String = js.native
      var bytes: js.Array[Double] = js.native
      var message: Null = js.native
    }

    @js.native
    @JSGlobal("types.long")
    object long extends js.Object {
      var int64: Double = js.native
      var uint64: Double = js.native
      var sint64: Double = js.native
      var fixed64: Double = js.native
      var sfixed64: Double = js.native
    }

    @js.native
    @JSGlobal("types.mapKey")
    object mapKey extends js.Object {
      var int32: Double = js.native
      var uint32: Double = js.native
      var sint32: Double = js.native
      var fixed32: Double = js.native
      var sfixed32: Double = js.native
      var int64: Double = js.native
      var uint64: Double = js.native
      var sint64: Double = js.native
      var fixed64: Double = js.native
      var sfixed64: Double = js.native
      var bool: Double = js.native
      var string: Double = js.native
    }

    @js.native
    @JSGlobal("types.packed")
    object packed extends js.Object {
      var double: Double = js.native
      var float: Double = js.native
      var int32: Double = js.native
      var uint32: Double = js.native
      var sint32: Double = js.native
      var fixed32: Double = js.native
      var sfixed32: Double = js.native
      var int64: Double = js.native
      var uint64: Double = js.native
      var sint64: Double = js.native
      var fixed64: Double = js.native
      var sfixed64: Double = js.native
      var bool: Double = js.native
    }

  }

  @js.native
  trait Constructor[T] extends js.Function {
    /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(params),false,Some(RepeatedType(TypeRef(CoreType(any),List()))))),Some(TypeRef(TypeName(T),List())))) */
  }

  @js.native
  trait Buffer extends Uint8Array {
  }

  @js.native
  trait Long extends js.Object {
    var low: Double
    var high: Double
    var unsigned: Boolean
  }

  package util {

    import scala.scalajs.js.RegExp

    @js.native
    @JSGlobal("util.LongBits")
    class LongBits protected() extends js.Object {
      def this(lo: Double, hi: Double) = this()

      var lo: Double = js.native
      var hi: Double = js.native

      def toNumber(unsigned: Boolean = ???): Double = js.native

      def toLong(unsigned: Boolean = ???): Long = js.native

      def toHash(): String = js.native

      def zzEncode(): util.LongBits = js.native

      def zzDecode(): util.LongBits = js.native

      def length(): Double = js.native
    }

    @js.native
    @JSGlobal("util.LongBits")
    object LongBits extends js.Object {
      var zero: util.LongBits = js.native
      var zeroHash: String = js.native

      def fromNumber(value: Double): util.LongBits = js.native

      def from(value: Long | Double | String): util.LongBits = js.native

      def fromHash(hash: String): util.LongBits = js.native
    }

    @js.native
    @JSGlobal("util.ProtocolError")
    class ProtocolError[T <: Message[T]] protected() extends js.Error {
      def this(message: String, properties: js.Dictionary[js.Any] = ???) = this()

      var instance: Message[T] = js.native
    }

    @js.native
    @JSGlobal("util.fs")
    object fs extends js.Object {
      @JSBracketAccess
      def apply(k: String): js.Any = js.native

      @JSBracketAccess
      def update(k: String, v: js.Any): Unit = js.native
    }

    package base64 {

      @js.native
      @JSGlobal("util.base64")
      object Base64 extends js.Object {
        def length(string: String): Double = js.native

        def encode(buffer: Uint8Array, start: Double, end: Double): String = js.native

        def decode(string: String, buffer: Uint8Array, offset: Double): Double = js.native

        def test(string: String): Boolean = js.native
      }

    }

    package codegen {

      @js.native
      @JSGlobal("util.codegen")
      object Codegen extends js.Object {
        def verbose: Boolean = js.native
      }

    }

    @js.native
    @JSGlobal("util.EventEmitter")
    class EventEmitter extends js.Object {
      def on(evt: String, fn: EventEmitterListener, ctx: js.Any = ???): this.type = js.native

      def off(evt: String = ???, fn: EventEmitterListener = ???): this.type = js.native

      def emit(evt: String, args: js.Any*): this.type = js.native
    }

    package float {

      @js.native
      @JSGlobal("util.float")
      object Float extends js.Object {
        def writeFloatLE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native

        def writeFloatBE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native

        def readFloatLE(buf: Uint8Array, pos: Double): Double = js.native

        def readFloatBE(buf: Uint8Array, pos: Double): Double = js.native

        def writeDoubleLE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native

        def writeDoubleBE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native

        def readDoubleLE(buf: Uint8Array, pos: Double): Double = js.native

        def readDoubleBE(buf: Uint8Array, pos: Double): Double = js.native
      }

    }

    package path {

      @js.native
      @JSGlobal("util.path")
      object Path extends js.Object {
        def isAbsolute(path: String): Boolean = js.native

        def normalize(path: String): String = js.native

        def resolve(originPath: String, includePath: String, alreadyNormalized: Boolean = ???): String = js.native
      }

    }

    package utf8 {

      @js.native
      @JSGlobal("util.utf8")
      object Utf8 extends js.Object {
        def length(string: String): Double = js.native

        def read(buffer: Uint8Array, start: Double, end: Double): String = js.native

        def write(string: String, buffer: Uint8Array, offset: Double): Double = js.native
      }

    }

    @js.native
    @JSGlobal("util")
    object Util extends js.Object {
      val emptyArray: js.Array[js.Any] = js.native
      val emptyObject: js.Object = js.native
      val isNode: Boolean = js.native

      def isInteger(value: js.Any): Boolean = js.native

      def isString(value: js.Any): Boolean = js.native

      def isObject(value: js.Any): Boolean = js.native

      def isset(obj: js.Object, prop: String): Boolean = js.native

      def isSet(obj: js.Object, prop: String): Boolean = js.native

      def Buffer: Constructor[Buffer] = js.native

      def newBuffer(sizeOrArray: Double | js.Array[Double] = ???): Uint8Array | Buffer = js.native

      def Array: Constructor[Uint8Array] = js.native

      def Long: Constructor[Long] = js.native

      val key2Re: RegExp = js.native
      val key32Re: RegExp = js.native
      val key64Re: RegExp = js.native

      def longToHash(value: Long | Double): String = js.native

      def longFromHash(hash: String, unsigned: Boolean = ???): Long | Double = js.native

      def merge(dst: js.Dictionary[js.Any], src: js.Dictionary[js.Any], ifNotSet: Boolean = ???): js.Dictionary[js.Any] = js.native

      def lcFirst(str: String): String = js.native

      def newError(name: String): Constructor[js.Error] = js.native

      def oneOfGetter(fieldNames: js.Array[String]): OneOfGetter = js.native

      def oneOfSetter(fieldNames: js.Array[String]): OneOfSetter = js.native

      def toJSONOptions: IConversionOptions = js.native

      def toArray(`object`: js.Dictionary[js.Any]): js.Array[js.Any] = js.native

      def toObject(array: js.Array[js.Any]): js.Dictionary[js.Any] = js.native

      def isReserved(name: String): Boolean = js.native

      def safeProp(prop: String): String = js.native

      def ucFirst(str: String): String = js.native

      def camelCase(str: String): String = js.native

      def compareFieldsById(a: Field, b: Field): Double = js.native

      def decorateType[T <: Message[T]](ctor: Constructor[T], typeName: String = ???): Type = js.native

      def decorateEnum(`object`: js.Object): Enum = js.native

      def decorateRoot: Root = js.native

      def asPromise(fn: asPromiseCallback, ctx: js.Any, params: js.Any*): Promise[js.Any] = js.native

      def codegen(functionParams: js.Array[String], functionName: String): Codegen = js.native

      def codegen(functionParams: js.Array[String]): Codegen = js.native

      def codegen(functionName: String): Codegen = js.native

      def codegen(): Codegen = js.native

      def fetch(filename: String, options: IFetchOptions, callback: FetchCallback): Unit = js.native

      def fetch(path: String, callback: FetchCallback): Unit = js.native

      def fetch(path: String, options: IFetchOptions = ???): Promise[String | Uint8Array] = js.native

      def inquire(moduleName: String): js.Object = js.native

      def pool(alloc: PoolAllocator, slice: PoolSlicer, size: Double = ???): PoolAllocator = js.native
    }

  }

  @js.native
  @JSGlobal
  object wrappers extends js.Object {
    @JSBracketAccess
    def apply(k: String): IWrapper = js.native

    @JSBracketAccess
    def update(k: String, v: IWrapper): Unit = js.native
  }

  @js.native
  trait IWrapper extends js.Object {
    var fromObject: WrapperFromObjectConverter
    var toObject: WrapperToObjectConverter
  }

  @js.native
  @JSGlobal
  class Writer extends js.Object {
    var len: Double = js.native
    var head: js.Object = js.native
    var tail: js.Object = js.native
    var states: js.Object | Null = js.native

    def uint32(value: Double): Writer = js.native

    def int32(value: Double): Writer = js.native

    def sint32(value: Double): Writer = js.native

    def uint64(value: Long | Double | String): Writer = js.native

    def int64(value: Long | Double | String): Writer = js.native

    def sint64(value: Long | Double | String): Writer = js.native

    def bool(value: Boolean): Writer = js.native

    def fixed32(value: Double): Writer = js.native

    def sfixed32(value: Double): Writer = js.native

    def fixed64(value: Long | Double | String): Writer = js.native

    def sfixed64(value: Long | Double | String): Writer = js.native

    def float(value: Double): Writer = js.native

    def double(value: Double): Writer = js.native

    def bytes(value: Uint8Array | String): Writer = js.native

    def string(value: String): Writer = js.native

    def fork(): Writer = js.native

    def reset(): Writer = js.native

    def ldelim(): Writer = js.native

    def finish(): Uint8Array = js.native
  }

  @js.native
  @JSGlobal
  object Writer extends js.Object {
    def create(): BufferWriter | Writer = js.native

    def alloc(size: Double): Uint8Array = js.native
  }

  @js.native
  @JSGlobal
  class BufferWriter extends Writer {
    override def finish(): Buffer = js.native
  }

  @js.native
  @JSGlobal
  object BufferWriter extends js.Object {
    def alloc(size: Double): Buffer = js.native
  }

  @js.native
  trait IFetchOptions extends js.Object {
    var binary: Boolean
    var xhr: Boolean
  }

  @js.native
  @JSGlobalScope
  object Protobufjs extends js.Object {
    def common(name: String, json: js.Dictionary[js.Any]): Unit = js.native

    def decoder(mtype: Type): Codegen = js.native

    def encoder(mtype: Type): Codegen = js.native

    type FieldDecorator = js.Function2[js.Object, String, Unit]
    type LoadCallback = js.Function2[js.Error | Null, Root, Unit]

    def load(filename: String | js.Array[String], root: Root, callback: LoadCallback): Unit = js.native

    def load(filename: String | js.Array[String], callback: LoadCallback): Unit = js.native

    def load(filename: String | js.Array[String], root: Root = ???): Promise[Root] = js.native

    def loadSync(filename: String | js.Array[String], root: Root = ???): Root = js.native

    val build: String = js.native

    def configure(): Unit = js.native

    type AnyExtensionField = IExtensionField | IExtensionMapField
    type AnyNestedObject = IEnum | IType | IService | AnyExtensionField | INamespace
    type OneOfDecorator = js.Function2[js.Object, String, Unit]

    def parse(source: String, options: IParseOptions): IParserResult = js.native

    def parse(source: String): IParserResult = js.native

    def parse(source: String, root: Root, options: IParseOptions): IParserResult = js.native

    def parse(source: String, root: Root): IParserResult = js.native

    type RPCImpl = js.Function3[Method | ServiceMethod[Message[js.Object], Message[js.Object]], Uint8Array, RPCImplCallback, Unit]
    type RPCImplCallback = js.Function2[js.Error | Null, Uint8Array | Null, Unit]
    type TokenizerHandleNext = js.Function0[String | Null]
    type TokenizerHandlePeek = js.Function0[String | Null]
    type TokenizerHandlePush = js.Function1[String, Unit]
    type TokenizerHandleSkip = js.Function2[String, Boolean, Boolean]
    type TokenizerHandleCmnt = js.Function1[Double, String | Null]

    def tokenize(source: String, alternateCommentMode: Boolean): ITokenizerHandle = js.native

    type TypeDecorator[T <: Message[T]] = js.Function1[Constructor[T], Unit]
    type Properties[T] = js.Object
    type OneOfGetter = js.Function0[String | Unit]
    type OneOfSetter = js.Function1[String | Unit, Unit]

    def verifier(mtype: Type): Codegen = js.native

    type WrapperFromObjectConverter = js.Function2[Type, js.Dictionary[js.Any], Message[js.Object]]
    type WrapperToObjectConverter = js.Function3[Type, Message[js.Object], IConversionOptions, js.Dictionary[js.Any]]
    type asPromiseCallback = js.Function
    type Codegen = js.Function
    type EventEmitterListener = js.Function
    type FetchCallback = js.Function2[js.Error, String, Unit]
    type PoolAllocator = js.Function1[Double, Uint8Array]
    type PoolSlicer = js.Function3[Uint8Array, Double, Double, Uint8Array]
  }

}

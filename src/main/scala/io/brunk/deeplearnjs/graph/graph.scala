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

package io.brunk.deeplearnjs.graph

import io.brunk.deeplearnjs.Initializer
import io.brunk.deeplearnjs.graph.Graph.ArrayData
import io.brunk.deeplearnjs.math.{ DataType, NDArray, Rank }

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
@JSImport("deeplearn", "GraphLayers")
class GraphLayers protected () extends js.Object {
  def this(g: Graph) = this()
  def dense(name: String,
            x: Tensor,
            units: Double,
            activation: js.Function1[Tensor, Tensor] | Null = ???,
            useBias: Boolean = ???,
            kernelInitializer: Initializer = ???,
            biasInitializer: Initializer = ???): Tensor = js.native
}

@js.native
@JSImport("deeplearn", "Graph")
class Graph extends js.Object {
  var layers: GraphLayers                                                            = js.native
  def variable(name: String, data: NDArray[DataType, Rank]): Tensor                  = js.native
  def placeholder(name: String, shape: js.Array[Double]): Tensor                     = js.native
  def constant(value: ArrayData): Tensor                                             = js.native
  def reshape(x: Tensor, shape: js.Array[Double]): Tensor                            = js.native
  def fusedLinearCombination(x1: Tensor, x2: Tensor, c1: Tensor, c2: Tensor): Tensor = js.native
  def add(x1: Tensor, x2: Tensor): Tensor                                            = js.native
  def subtract(x1: Tensor, x2: Tensor): Tensor                                       = js.native
  def multiply(x1: Tensor, x2: Tensor): Tensor                                       = js.native
  def divide(x1: Tensor, x2: Tensor): Tensor                                         = js.native
  def reduceSum(x: Tensor): Tensor                                                   = js.native
  def concat1d(x1: Tensor, x2: Tensor): Tensor                                       = js.native
  def concat2d(x1: Tensor, x2: Tensor, axis: Double): Tensor                         = js.native
  def concat3d(x1: Tensor, x2: Tensor, axis: Double): Tensor                         = js.native
  def concat4d(x1: Tensor, x2: Tensor, axis: Double): Tensor                         = js.native
  def matmul(x1: Tensor, x2: Tensor): Tensor                                         = js.native
  def conv2d(x: Tensor,
             w: Tensor,
             b: Tensor,
             fieldSize: Double,
             outputDepth: Double,
             stride: Double = ???,
             zeroPad: Double = ???): Tensor = js.native
  def maxPool(x: Tensor, fieldSize: Double, stride: Double = ???, zeroPad: Double = ???): Tensor =
    js.native
  def exp(x: Tensor): Tensor                                     = js.native
  def log(x: Tensor): Tensor                                     = js.native
  def relu(x: Tensor): Tensor                                    = js.native
  def leakyRelu(x: Tensor, alpha: Double): Tensor                = js.native
  def prelu(x: Tensor, alpha: Tensor): Tensor                    = js.native
  def elu(x: Tensor): Tensor                                     = js.native
  def tanh(x: Tensor): Tensor                                    = js.native
  def sigmoid(x: Tensor): Tensor                                 = js.native
  def square(x: Tensor): Tensor                                  = js.native
  def softmax(x: Tensor): Tensor                                 = js.native
  def softmaxCrossEntropyCost(x: Tensor, target: Tensor): Tensor = js.native
  def meanSquaredCost(label: Tensor, prediction: Tensor): Tensor = js.native
  def argmax(x: Tensor): Tensor                                  = js.native
  def argmaxEquals(x1: Tensor, x2: Tensor): Tensor               = js.native
  def getNodes(): js.Array[Node]                                 = js.native
}

@js.native
@JSImport("deeplearn", "Tensor")
class Tensor protected () extends js.Object {
  def this(shape: js.Array[Double]) = this()
  var shape: js.Array[Double] = js.native
  var node: Node              = js.native
  var id: Double              = js.native
}

@js.native
@JSImport("deeplearn", "Node")
abstract class Node protected () extends js.Object {
  def this(graph: Graph, name: String, inputs: js.Dictionary[Tensor], output: Tensor) = this()
  var graph: Graph        = js.native
  var name: String        = js.native
  var inputs: Node.Inputs = js.native
  var output: Tensor      = js.native
  def validate(): Unit
  var id: Double = js.native
}

object Node {

  @js.native
  trait Inputs extends js.Object {
    @JSBracketAccess
    def apply(name: String): Tensor = js.native
    @JSBracketAccess
    def update(name: String, v: Tensor): Unit = js.native
  }
}

@js.native
@JSImport("deeplearn", "VariableNode")
class VariableNode protected () extends Node {
  def this(graph: Graph, name: String, data: NDArray[DataType, Rank]) = this()
  var data: NDArray[DataType, Rank] = js.native
  def validate(): Unit              = js.native
}

@js.native
@JSImport("deeplearn", "PlaceholderNode")
class PlaceholderNode protected () extends Node {
  def this(graph: Graph, name: String, shape: js.Array[Double]) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "ConstantNode")
class ConstantNode protected () extends Node {
  def this(graph: Graph, data: NDArray[DataType, Rank]) = this()
  var data: NDArray[DataType, Rank] = js.native
  def validate(): Unit              = js.native
}

@js.native
@JSImport("deeplearn", "ReshapeNode")
class ReshapeNode protected () extends Node {
  def this(graph: Graph, name: String, x: Tensor, shape: js.Array[Double]) = this()
  //var name: String     = js.native
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "ReshapeNode")
object ReshapeNode extends js.Object {
  def X: String = js.native
}

@js.native
@JSImport("deeplearn", "FusedLinearCombinationNode")
class FusedLinearCombinationNode protected () extends Node {
  def this(graph: Graph, t1: Tensor, t2: Tensor, c1: Tensor, c2: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "FusedLinearCombinationNode")
object FusedLinearCombinationNode extends js.Object {
  def T1: String = js.native
  def T2: String = js.native
  def C1: String = js.native
  def C2: String = js.native
}

@js.native
@JSImport("deeplearn", "AddNode")
class AddNode protected () extends Node {
  def this(graph: Graph, t1: Tensor, t2: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "AddNode")
object AddNode extends js.Object {
  def T1: String = js.native
  def T2: String = js.native
}

@js.native
@JSImport("deeplearn", "SubtractNode")
class SubtractNode protected () extends Node {
  def this(graph: Graph, t1: Tensor, t2: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "SubtractNode")
object SubtractNode extends js.Object {
  def T1: String = js.native
  def T2: String = js.native
}

@js.native
@JSImport("deeplearn", "MultiplyNode")
class MultiplyNode protected () extends Node {
  def this(graph: Graph, t1: Tensor, t2: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "MultiplyNode")
object MultiplyNode extends js.Object {
  def T1: String = js.native
  def T2: String = js.native
}

@js.native
@JSImport("deeplearn", "DivideNode")
class DivideNode protected () extends Node {
  def this(graph: Graph, t1: Tensor, t2: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "DivideNode")
object DivideNode extends js.Object {
  def T1: String = js.native
  def T2: String = js.native
}

@js.native
@JSImport("deeplearn", "ReduceSumNode")
class ReduceSumNode protected () extends Node {
  def this(graph: Graph, x: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "ReduceSumNode")
object ReduceSumNode extends js.Object {
  def X: String = js.native
}

@js.native
@JSImport("deeplearn", "Concat1DNode")
class Concat1DNode protected () extends Node {
  def this(graph: Graph, x1: Tensor, x2: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "Concat1DNode")
object Concat1DNode extends js.Object {
  def X1: String = js.native
  def X2: String = js.native
}

@js.native
@JSImport("deeplearn", "Concat2DNode")
class Concat2DNode protected () extends Node {
  def this(graph: Graph, x1: Tensor, x2: Tensor, axis: Double) = this()
  var axis: Double     = js.native
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "Concat2DNode")
object Concat2DNode extends js.Object {
  def X1: String   = js.native
  def X2: String   = js.native
  def AXIS: String = js.native
}

@js.native
@JSImport("deeplearn", "Concat3DNode")
class Concat3DNode protected () extends Node {
  def this(graph: Graph, x1: Tensor, x2: Tensor, axis: Double) = this()
  var axis: Double     = js.native
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "Concat3DNode")
object Concat3DNode extends js.Object {
  def X1: String   = js.native
  def X2: String   = js.native
  def AXIS: String = js.native
}

@js.native
@JSImport("deeplearn", "Concat4DNode")
class Concat4DNode protected () extends Node {
  def this(graph: Graph, x1: Tensor, x2: Tensor, axis: Double) = this()
  var axis: Double     = js.native
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "Concat4DNode")
object Concat4DNode extends js.Object {
  def X1: String   = js.native
  def X2: String   = js.native
  def AXIS: String = js.native
}

@js.native
@JSImport("deeplearn", "MatMulNode")
class MatMulNode protected () extends Node {
  def this(graph: Graph, x1: Tensor, x2: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "MatMulNode")
object MatMulNode extends js.Object {
  def X1: String = js.native
  def X2: String = js.native
}

@js.native
@JSImport("deeplearn", "Convolution2DNode")
class Convolution2DNode protected () extends Node {
  def this(graph: Graph,
           x: Tensor,
           w: Tensor,
           b: Tensor,
           fieldSize: Double,
           outputDepth: Double,
           stride: Double = ???,
           zeroPad: Double = ???) = this()
  var fieldSize: Double   = js.native
  var outputDepth: Double = js.native
  var stride: Double      = js.native
  var zeroPad: Double     = js.native
  def validate(): Unit    = js.native
}

@js.native
@JSImport("deeplearn", "Convolution2DNode")
object Convolution2DNode extends js.Object {
  def X: String = js.native
  def W: String = js.native
  def B: String = js.native
}

@js.native
@JSImport("deeplearn", "MaxPoolNode")
class MaxPoolNode protected () extends Node {
  def this(graph: Graph,
           x: Tensor,
           fieldSize: Double,
           stride: Double = ???,
           zeroPad: Double = ???) = this()
  var fieldSize: Double = js.native
  var stride: Double    = js.native
  var zeroPad: Double   = js.native
  def validate(): Unit  = js.native
}

@js.native
@JSImport("deeplearn", "MaxPoolNode")
object MaxPoolNode extends js.Object {
  def X: String = js.native
}

@js.native
@JSImport("deeplearn", "ReLUNode")
class ReLUNode protected () extends Node {
  def this(graph: Graph, x: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "ReLUNode")
object ReLUNode extends js.Object {
  def X: String = js.native
}

@js.native
@JSImport("deeplearn", "LeakyReLUNode")
class LeakyReLUNode protected () extends Node {
  def this(graph: Graph, x: Tensor, alpha: Double) = this()
  var alpha: Double    = js.native
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "LeakyReLUNode")
object LeakyReLUNode extends js.Object {
  def X: String = js.native
}

@js.native
@JSImport("deeplearn", "PReLUNode")
class PReLUNode protected () extends Node {
  def this(graph: Graph, x: Tensor, alpha: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "PReLUNode")
object PReLUNode extends js.Object {
  def X: String     = js.native
  def ALPHA: String = js.native
}

@js.native
@JSImport("deeplearn", "EluNode")
class EluNode protected () extends Node {
  def this(graph: Graph, x: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "EluNode")
object EluNode extends js.Object {
  def X: String = js.native
}

@js.native
@JSImport("deeplearn", "ExpNode")
class ExpNode protected () extends Node {
  def this(graph: Graph, x: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "ExpNode")
object ExpNode extends js.Object {
  def X: String = js.native
}

@js.native
@JSImport("deeplearn", "LogNode")
class LogNode protected () extends Node {
  def this(graph: Graph, x: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "LogNode")
object LogNode extends js.Object {
  def X: String = js.native
}

@js.native
@JSImport("deeplearn", "TanHNode")
class TanHNode protected () extends Node {
  def this(graph: Graph, x: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "TanHNode")
object TanHNode extends js.Object {
  def X: String = js.native
}

@js.native
@JSImport("deeplearn", "SigmoidNode")
class SigmoidNode protected () extends Node {
  def this(graph: Graph, x: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "SigmoidNode")
object SigmoidNode extends js.Object {
  def X: String = js.native
}

@js.native
@JSImport("deeplearn", "SquareNode")
class SquareNode protected () extends Node {
  def this(graph: Graph, x: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "SquareNode")
object SquareNode extends js.Object {
  def X: String = js.native
}

@js.native
@JSImport("deeplearn", "SoftmaxCrossEntropyCostNode")
class SoftmaxCrossEntropyCostNode protected () extends Node {
  def this(graph: Graph, x: Tensor, target: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "SoftmaxCrossEntropyCostNode")
object SoftmaxCrossEntropyCostNode extends js.Object {
  def X: String      = js.native
  def TARGET: String = js.native
}

@js.native
@JSImport("deeplearn", "SoftmaxNode")
class SoftmaxNode protected () extends Node {
  def this(graph: Graph, x: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "SoftmaxNode")
object SoftmaxNode extends js.Object {
  def X: String = js.native
}

@js.native
@JSImport("deeplearn", "MeanSquaredCostNode")
class MeanSquaredCostNode protected () extends Node {
  def this(graph: Graph, label: Tensor, prediction: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "MeanSquaredCostNode")
object MeanSquaredCostNode extends js.Object {
  def LABEL: String      = js.native
  def PREDICTION: String = js.native
}

@js.native
@JSImport("deeplearn", "ArgMaxNode")
class ArgMaxNode protected () extends Node {
  def this(graph: Graph, x: Tensor) = this()
  var x: Tensor        = js.native
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "ArgMaxNode")
object ArgMaxNode extends js.Object {
  def X: String = js.native
}

@js.native
@JSImport("deeplearn", "ArgMaxEqualsNode")
class ArgMaxEqualsNode protected () extends Node {
  def this(graph: Graph, x1: Tensor, x2: Tensor) = this()
  def validate(): Unit = js.native
}

@js.native
@JSImport("deeplearn", "ArgMaxEqualsNode")
object ArgMaxEqualsNode extends js.Object {
  def X1: String = js.native
  def X2: String = js.native
}

@js.native
@JSImport("deeplearn", "graph")
object Graph extends js.Object {
  type ArrayData =
    NDArray[DataType, Rank] | Double | js.Array[Double] | js.Array[js.Array[Double]] | js.Array[
      js.Array[js.Array[Double]]
    ] | js.Array[js.Array[js.Array[js.Array[Double]]]]
}

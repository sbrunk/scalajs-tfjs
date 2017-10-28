/*
 * Copyright (c) 2017 Sören Brunk
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.brunk.deeplearnjs.graph

import io.brunk.deeplearnjs.Initializer
import io.brunk.deeplearnjs.graph.Graph.ArrayData
import io.brunk.deeplearnjs.math.NDArray

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
  def variable(name: String, data: NDArray): Tensor                                  = js.native
  def placeholder(name: String, shape: js.Array[Double]): Tensor                     = js.native
  def constant(value: ArrayData): Tensor                                             = js.native
  def reshape(x: Tensor, shape: js.Array[Double]): Tensor                            = js.native
  def fusedLinearCombination(x1: Tensor, x2: Tensor, c1: Tensor, c2: Tensor): Tensor = js.native
  def add(x1: Tensor, x2: Tensor): Tensor                                            = js.native
  def subtract(x1: Tensor, x2: Tensor): Tensor                                       = js.native
  def multiply(x1: Tensor, x2: Tensor): Tensor                                       = js.native
  def divide(x1: Tensor, x2: Tensor): Tensor                                         = js.native
  def reduceSum(x: Tensor): Tensor                                                   = js.native
  def concat3d(x1: Tensor, x2: Tensor, axis: Double): Tensor                         = js.native
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
  var graph: Graph                  = js.native
  var name: String                  = js.native
  var inputs: js.Dictionary[Tensor] = js.native
  var output: Tensor                = js.native
  def validate(): Unit
  var id: Double = js.native
}

@js.native
@JSImport("deeplearn", "VariableNode")
class VariableNode protected () extends Node {
  def this(graph: Graph, name: String, data: NDArray) = this()
  var data: NDArray    = js.native
  def validate(): Unit = js.native
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
  def this(graph: Graph, data: NDArray) = this()
  var data: NDArray    = js.native
  def validate(): Unit = js.native
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
  type ArrayData = NDArray | Double | js.Array[Double] | js.Array[js.Array[Double]] | js.Array[
    js.Array[js.Array[Double]]
  ] | js.Array[js.Array[js.Array[js.Array[Double]]]]
}

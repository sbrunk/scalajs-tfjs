package io.brunk.tfjs.layers.backend

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobalScope
object Tfjs_backend extends js.Object {
  def disposeScalarCache(): Unit = js.native
  def setBackend(requestedBackend: String): Unit = js.native
  def getBackend(): String = js.native
  def getScalar(value: Double, dtype: DataType = ???): Scalar = js.native
  val epsilon: common_epsilon.type = js.native
  def isBackendSymbolic(): Boolean = js.native
  def shape(x: Tensor | SymbolicTensor): Shape = js.native
  def intShape(x: Tensor | SymbolicTensor): js.Array[Double] = js.native
  def ndim(x: Tensor | SymbolicTensor): Double = js.native
  def dtype(x: Tensor | SymbolicTensor): DataType = js.native
  def countParams(x: Tensor | SymbolicTensor): Double = js.native
  def cast(x: Tensor, dtype: String): Tensor = js.native
  def expandDims(x: Tensor, axis: Double = ???): Tensor = js.native
  def repeat(x: Tensor, n: Double): Tensor = js.native
  def flatten(x: Tensor): Tensor = js.native
  def batchFlatten(x: Tensor): Tensor = js.native
  def sliceAlongFirstAxis(array: Tensor, start: Double, size: Double): Tensor = js.native
  def sliceAlongLastAxis(array: Tensor, start: Double, size: Double): Tensor = js.native
  def sliceAlongAxis(array: Tensor, start: Double, size: Double, axis: Double): Tensor = js.native
  def normalizeBatchInTraining(x: Tensor, gamma: Tensor, beta: Tensor, reductionAxes: js.Array[Double], epsilon: Double = ???): js.Tuple3[Tensor, Tensor, Tensor] = js.native
  def concatenate(tensors: js.Array[Tensor], axis: Double = ???): Tensor = js.native
  def concatAlongFirstAxis(a: Tensor, b: Tensor): Tensor = js.native
  def tile(x: Tensor, n: Double | js.Array[Double]): Tensor = js.native
  def identity(x: Tensor): Tensor = js.native
  def eyeVariable(size: Double, dtype: DataType = ???, name: String = ???): LayerVariable = js.native
  def scalarTimesArray(c: Scalar, x: Tensor): Tensor = js.native
  def scalarPlusArray(c: Scalar, x: Tensor): Tensor = js.native
  def randomNormal(shape: Shape, mean: Double = ???, stddev: Double = ???, dtype: String = ???, seed: Double = ???): Tensor = js.native
  def dot(x: Tensor, y: Tensor): Tensor = js.native
  def sign(x: Tensor): Tensor = js.native
  def qr(x: Tensor2D): js.Tuple2[Tensor, Tensor] = js.native
  def oneHot(indices: Tensor, numClasses: Double): Tensor = js.native
  def gather(reference: Tensor, indices: js.Array[Double] | Tensor1D, axis: Double = ???): Tensor = js.native
  def square(x: Tensor): Tensor = js.native
  def pow(x: Tensor, a: Tensor | Double): Tensor = js.native
  def batchNormalization(x: Tensor, mean: Tensor, variance: Tensor, beta: Tensor = ???, gamma: Tensor = ???, epsilon: Double = ???): Tensor = js.native
  def biasAdd(x: Tensor, bias: Tensor, dataFormat: DataFormat = ???): Tensor = js.native
  def elu(x: Tensor, alpha: Double = ???): Tensor = js.native
  def softsign(x: Tensor): Tensor = js.native
  def dropout(x: Tensor, level: Scalar, noiseShape: js.Array[Double] = ???, seed: Double = ???): Tensor = js.native
  def l2Normalize(x: Tensor, axis: Double = ???): Tensor = js.native
  def nameScope[T](name: String, fn: js.Function0[T]): T = js.native
  def floatx(): DataType = js.native
  def getUid(prefix: String = ???): String = js.native
  def categoricalCrossentropy(target: Tensor, output: Tensor, fromLogits: Boolean = ???): Tensor = js.native
  def sparseCategoricalCrossentropy(target: Tensor, output: Tensor, fromLogits: Boolean = ???): Tensor = js.native
  def binaryCrossentropy(target: Tensor, output: Tensor, fromLogits: Boolean = ???): Tensor = js.native
  def sigmoidCrossEntropyWithLogits(target: Tensor, output: Tensor): Tensor = js.native
  def hardSigmoid(x: Tensor): Tensor = js.native
  def inTrainPhase[T](x: js.Function0[T], alt: js.Function0[T], training: Boolean = ???): T = js.native
  def gradients(lossFn: js.Function0[Scalar], variables: js.Array[LayerVariable]): js.Array[Tensor] = js.native
}

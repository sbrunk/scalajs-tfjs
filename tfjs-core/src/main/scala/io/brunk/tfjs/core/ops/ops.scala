package io.brunk.tfjs.core.ops

import scala.scalajs.js
import js.annotation._
import js.|

package ops {

@js.native
@JSGlobal
object losses extends js.Object {
  var absoluteDifference: LossOps.absoluteDifference.type = js.native
  var computeWeightedLoss: LossOps.computeWeightedLoss.type = js.native
  var cosineDistance: LossOps.cosineDistance.type = js.native
  var hingeLoss: LossOps.hingeLoss.type = js.native
  var logLoss: LossOps.logLoss.type = js.native
  var meanSquaredError: LossOps.meanSquaredError.type = js.native
  var softmaxCrossEntropy: SoftmaxOps.softmaxCrossEntropy.type = js.native
}

@js.native
@JSGlobal
object image extends js.Object {
  var resizeBilinear: ImageOps.resizeBilinear.type = js.native
  var resizeNearestNeighbor: ImageOps.resizeNearestNeighbor.type = js.native
}

@js.native
@JSGlobalScope
object Ops extends js.Object {
  val batchNormalization: BatchNormOps.batchNormalization.type = js.native
  val batchNormalization2d: BatchNormOps.batchNormalization2d.type = js.native
  val batchNormalization3d: BatchNormOps.batchNormalization3d.type = js.native
  val batchNormalization4d: BatchNormOps.batchNormalization4d.type = js.native
  val concat: ConcatOps.concat.type = js.native
  val concat1d: ConcatOps.concat1d.type = js.native
  val concat2d: ConcatOps.concat2d.type = js.native
  val concat3d: ConcatOps.concat3d.type = js.native
  val concat4d: ConcatOps.concat4d.type = js.native
  val conv1d: ConvOps.conv1d.type = js.native
  val conv2d: ConvOps.conv2d.type = js.native
  val conv2dTranspose: ConvOps.conv2dTranspose.type = js.native
  val depthwiseConv2d: ConvOps.depthwiseConv2d.type = js.native
  val separableConv2d: ConvOps.separableConv2d.type = js.native
  val matMul: MatmulOps.matMul.type = js.native
  val matrixTimesVector: MatmulOps.matrixTimesVector.type = js.native
  val outerProduct: MatmulOps.outerProduct.type = js.native
  val vectorTimesMatrix: MatmulOps.vectorTimesMatrix.type = js.native
  val avgPool: PoolOps.avgPool.type = js.native
  val maxPool: PoolOps.maxPool.type = js.native
  val transpose: TransposeOps.transpose.type = js.native
  val reverse: ReverseOps.reverse.type = js.native
  val reverse1d: ReverseOps.reverse1d.type = js.native
  val reverse2d: ReverseOps.reverse2d.type = js.native
  val reverse3d: ReverseOps.reverse3d.type = js.native
  val reverse4d: ReverseOps.reverse4d.type = js.native
  val slice: SliceOps.slice.type = js.native
  val slice1d: SliceOps.slice1d.type = js.native
  val slice2d: SliceOps.slice2d.type = js.native
  val slice3d: SliceOps.slice3d.type = js.native
  val slice4d: SliceOps.slice4d.type = js.native
  val stridedSlice: StridedSliceOps.stridedSlice.type = js.native
  val argMax: ReductionOps.argMax.type = js.native
  val argMin: ReductionOps.argMin.type = js.native
  val logSumExp: ReductionOps.logSumExp.type = js.native
  val max: ReductionOps.max.type = js.native
  val mean: ReductionOps.mean.type = js.native
  val min: ReductionOps.min.type = js.native
  val moments: ReductionOps.moments.type = js.native
  val sum: ReductionOps.sum.type = js.native
  val unsortedSegmentSum: ReductionOps.unsortedSegmentSum.type = js.native
  val equal: CompareOps.equal.type = js.native
  val equalStrict: CompareOps.equalStrict.type = js.native
  val greater: CompareOps.greater.type = js.native
  val greaterStrict: CompareOps.greaterStrict.type = js.native
  val greaterEqual: CompareOps.greaterEqual.type = js.native
  val greaterEqualStrict: CompareOps.greaterEqualStrict.type = js.native
  val less: CompareOps.less.type = js.native
  val lessStrict: CompareOps.lessStrict.type = js.native
  val lessEqual: CompareOps.lessEqual.type = js.native
  val lessEqualStrict: CompareOps.lessEqualStrict.type = js.native
  val notEqual: CompareOps.notEqual.type = js.native
  val notEqualStrict: CompareOps.notEqualStrict.type = js.native
  val logicalNot: LogicalOps.logicalNot.type = js.native
  val logicalAnd: LogicalOps.logicalAnd.type = js.native
  val logicalOr: LogicalOps.logicalOr.type = js.native
  val logicalXor: LogicalOps.logicalXor.type = js.native
  val where: LogicalOps.where.type = js.native
  val abs: UnaryOps.abs.type = js.native
  val acos: UnaryOps.acos.type = js.native
  val acosh: UnaryOps.acosh.type = js.native
  val asin: UnaryOps.asin.type = js.native
  val asinh: UnaryOps.asinh.type = js.native
  val atan: UnaryOps.atan.type = js.native
  val atanh: UnaryOps.atanh.type = js.native
  val ceil: UnaryOps.ceil.type = js.native
  val clipByValue: UnaryOps.clipByValue.type = js.native
  val cos: UnaryOps.cos.type = js.native
  val cosh: UnaryOps.cosh.type = js.native
  val elu: UnaryOps.elu.type = js.native
  val exp: UnaryOps.exp.type = js.native
  val expm1: UnaryOps.expm1.type = js.native
  val floor: UnaryOps.floor.type = js.native
  val sign: UnaryOps.sign.type = js.native
  val leakyRelu: UnaryOps.leakyRelu.type = js.native
  val log: UnaryOps.log.type = js.native
  val log1p: UnaryOps.log1p.type = js.native
  val logSigmoid: UnaryOps.logSigmoid.type = js.native
  val neg: UnaryOps.neg.type = js.native
  val prelu: UnaryOps.prelu.type = js.native
  val relu: UnaryOps.relu.type = js.native
  val reciprocal: UnaryOps.reciprocal.type = js.native
  val round: UnaryOps.round.type = js.native
  val selu: UnaryOps.selu.type = js.native
  val sigmoid: UnaryOps.sigmoid.type = js.native
  val sin: UnaryOps.sin.type = js.native
  val sinh: UnaryOps.sinh.type = js.native
  val softplus: UnaryOps.softplus.type = js.native
  val sqrt: UnaryOps.sqrt.type = js.native
  val rsqrt: UnaryOps.rsqrt.type = js.native
  val square: UnaryOps.square.type = js.native
  val step: UnaryOps.step.type = js.native
  val tan: UnaryOps.tan.type = js.native
  val tanh: UnaryOps.tanh.type = js.native
  val erf: UnaryOps.erf.type = js.native
  val add: BinaryOps.add.type = js.native
  val addStrict: BinaryOps.addStrict.type = js.native
  val atan2: BinaryOps.atan2.type = js.native
  val div: BinaryOps.div.type = js.native
  val divStrict: BinaryOps.divStrict.type = js.native
  val maximum: BinaryOps.maximum.type = js.native
  val maximumStrict: BinaryOps.maximumStrict.type = js.native
  val minimum: BinaryOps.minimum.type = js.native
  val minimumStrict: BinaryOps.minimumStrict.type = js.native
  val mod: BinaryOps.mod.type = js.native
  val modStrict: BinaryOps.modStrict.type = js.native
  val mul: BinaryOps.mul.type = js.native
  val mulStrict: BinaryOps.mulStrict.type = js.native
  val pow: BinaryOps.pow.type = js.native
  val powStrict: BinaryOps.powStrict.type = js.native
  val sub: BinaryOps.sub.type = js.native
  val subStrict: BinaryOps.subStrict.type = js.native
  val squaredDifference: BinaryOps.squaredDifference.type = js.native
  val squaredDifferenceStrict: BinaryOps.squaredDifferenceStrict.type = js.native
  val norm: NormOps.norm.type = js.native
  val cast: ArrayOps.cast.type = js.native
  val clone: ArrayOps.clone.type = js.native
  val fromPixels: ArrayOps.fromPixels.type = js.native
  val toPixels: ArrayOps.toPixels.type = js.native
  val ones: ArrayOps.ones.type = js.native
  val onesLike: ArrayOps.onesLike.type = js.native
  val zeros: ArrayOps.zeros.type = js.native
  val zerosLike: ArrayOps.zerosLike.type = js.native
  val eye: ArrayOps.eye.type = js.native
  val rand: ArrayOps.rand.type = js.native
  val randomNormal: ArrayOps.randomNormal.type = js.native
  val truncatedNormal: ArrayOps.truncatedNormal.type = js.native
  val randomUniform: ArrayOps.randomUniform.type = js.native
  val multinomial: ArrayOps.multinomial.type = js.native
  val reshape: ArrayOps.reshape.type = js.native
  val squeeze: ArrayOps.squeeze.type = js.native
  val tile: ArrayOps.tile.type = js.native
  val gather: ArrayOps.gather.type = js.native
  val oneHot: ArrayOps.oneHot.type = js.native
  val linspace: ArrayOps.linspace.type = js.native
  val range: ArrayOps.range.type = js.native
  val buffer: ArrayOps.buffer.type = js.native
  val fill: ArrayOps.fill.type = js.native
  val tensor: ArrayOps.tensor.type = js.native
  val scalar: ArrayOps.scalar.type = js.native
  val tensor1d: ArrayOps.tensor1d.type = js.native
  val tensor2d: ArrayOps.tensor2d.type = js.native
  val tensor3d: ArrayOps.tensor3d.type = js.native
  val tensor4d: ArrayOps.tensor4d.type = js.native
  val print: ArrayOps.print.type = js.native
  val expandDims: ArrayOps.expandDims.type = js.native
  val stack: ArrayOps.stack.type = js.native
  val unstack: ArrayOps.unstack.type = js.native
  val split: ArrayOps.split.type = js.native
  val cumsum: ArrayOps.cumsum.type = js.native
  val pad: ArrayOps.pad.type = js.native
  val pad1d: ArrayOps.pad1d.type = js.native
  val pad2d: ArrayOps.pad2d.type = js.native
  val pad3d: ArrayOps.pad3d.type = js.native
  val pad4d: ArrayOps.pad4d.type = js.native
  val movingAverage: MovingAverageOps.movingAverage.type = js.native
  val basicLSTMCell: LSTMOps.basicLSTMCell.type = js.native
  val multiRNNCell: LSTMOps.multiRNNCell.type = js.native
  val softmax: SoftmaxOps.softmax.type = js.native
  val localResponseNormalization: LRNOps.localResponseNormalization.type = js.native
  val linalg: LinalgOps.type = js.native
}

}

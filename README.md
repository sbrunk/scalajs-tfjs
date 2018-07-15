# Scala.js-TensorFlow.js #

This projects aims to provide [Scala.js](http://www.scala-js.org/) facades for [TensorFlow.js](https://js.tensorflow.org/),
 enabling you to create neural networks with Scala that run and can be trained with GPU acceleration in your browser.

This is WIP and still at an early stage. The tfjs-core bindings are almost done. You can create tensors and run
operations on them.

You can now also use tfjs-layers build a simple sequential model.

See [examples/mobilenet](examples/mobilenet) for a working example ([live demo](https://sbrunk.github.io/scalajs-tfjs/mobilenet/)).

## TODO
* Add remaining core APIs
* Fix many types that have been set to Any by the initial import
* Make configuration objects used throughout the API usable from Scala code
* Better integration with Scala core types like Seq
* Port more examples from upstream
* Add/port documentation

## Contribution policy ##

Contributions via GitHub pull requests are gladly accepted from their original author. Along with
any pull requests, please state that the contribution is your original work and that you license
the work to the project under the project's open source license. Whether or not you state this
explicitly, by submitting any copyrighted material via pull request, email, or other means you
agree to license the material under the project's open source license and warrant that you have the
legal authority to do so.

## License ##

This code is open source software licensed under the
[Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0) license.


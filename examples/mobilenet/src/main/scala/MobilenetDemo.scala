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

import io.brunk.tfjs.core.Rank.{R3, R4}
import io.brunk.tfjs.tf
import io.brunk.tfjs.tfl
import org.scalajs.dom
import org.scalajs.dom.{Event, FileReader, document, html}

import scala.concurrent.Future
import scala.reflect.ClassTag
import scala.scalajs.js
import js.JSConverters._
import scala.scalajs.js.typedarray.Float32Array
import io.brunk.tfjs.core.TensorModule.TensorND
import io.brunk.tfjs.core.Types.TypedArray
import io.brunk.tfjs.tfl.Model

import js.JSNumberOps._
import scala.concurrent.ExecutionContext.Implicits.global

object MobilenetDemo {

  val MOBILENET_MODEL_PATH =
    "https://storage.googleapis.com/tfjs-models/tfjs/mobilenet_v1_0.25_224/model.json"

  val IMAGE_SIZE = 224
  val TOPK_PREDICTIONS = 10

  case class ClassProb(className: String, probability: Double)

  def getElement[T: ClassTag](elementId: String): Option[T] = {
    val queryResult = dom.document.querySelector(s"#$elementId")
    queryResult match {
      case elem: T => Some(elem)
      case other =>
        println(s"Element with ID $elementId is $other")
        None
    }
  }

  @js.native
  trait RichHTMLElement extends html.Element {
    var innerText: String = js.native
  }

  var mobilenet: Model = _

  def mobilenetDemo(): Unit = {
    status("Loading model...")

    tfl.loadModel(MOBILENET_MODEL_PATH).toFuture.foreach { mobilenet =>

      MobilenetDemo.mobilenet = mobilenet

      // Warmup the model. This isn't necessary, but makes the first prediction
      // faster. Call `dispose` to release the WebGL memory allocated for the return
      // value of `predict`.
      mobilenet.predict(tf.zeros[R4]((1, IMAGE_SIZE, IMAGE_SIZE, 3))).asInstanceOf[TensorND].dispose()

      status("")

      // Make a prediction through the locally hosted cat.jpg.
      getElement[dom.html.Image]("cat").foreach { catElement =>
        if (catElement.complete && catElement.naturalHeight != 0) {
          predict(catElement)
          catElement.style.display = ""
        } else {
          catElement.onload = (_: Event) => {
            predict(catElement)
            catElement.style.display = ""
          }
        }
      }
      getElement[dom.html.Div]("file-container").foreach{_.style.display = ""}
    }
  }

  /**
    * Given an image element, makes a prediction through mobilenet returning the
    * probabilities of the top K classes.
    */
  def predict(imgElement: html.Image): Unit = {
    status("Predicting...")

    val startTime = dom.window.performance.now()

    val logits = tf.tidy(() => {
      // tf.fromPixels() returns a Tensor from an image element.
      val img: tf.Tensor3D = tf.fromPixels(imgElement).toFloat()

      val offset = tf.scalar(127.5)
      // Normalize the image from [0, 255] to [-1, 1].
      val normalized = img.sub(offset).asInstanceOf[tf.Tensor3D].div(offset).asInstanceOf[tf.Tensor3D]

      // Reshape to a single-element batch so we can pass it to predict.
      val batched = normalized.reshape[R4]((1, IMAGE_SIZE, IMAGE_SIZE, 3))

      // Make a prediction through mobilenet.
      mobilenet.predict(batched).asInstanceOf[TensorND]
    })

    // Convert logits to probabilities and class names.
    getTopKClasses(logits, TOPK_PREDICTIONS).foreach { classes =>
      val totalTime = dom.window.performance.now() - startTime
      status(s"Done in ${Math.floor(totalTime)}ms")

      // Show the classes in the DOM.
      showResults(imgElement, classes)
    }
  }

  /**
    * Computes the probabilities of the topK classes given logits by computing
    * softmax to get probabilities and then sorting the probabilities.
    * @param logits Tensor representing the logits from MobileNet.
    * @param topK The number of top predictions to show.
    */
  def getTopKClasses(logits: TensorND, topK: Int): Future[Seq[ClassProb]] = {
    logits.data().toFuture.map { values: TypedArray =>

      values match {
        case values: Float32Array =>
          values
            .zipWithIndex
            .toVector
            .sortBy{case (value, index) => value}
            .reverse
            .take(topK)
            .map{case (value, index) => ClassProb(ImageNetClasses.imageNetClasses(index), value)}
      }
    }
  }

  //
  // UI
  //
  def showResults(imgElement: html.Image, classes: Seq[ClassProb]): Unit = {
    val predictionContainer = document.createElement("div").asInstanceOf[html.Div]
    predictionContainer.className = "pred-container"

    val imgContainer = document.createElement("div").asInstanceOf[html.Div]
    imgContainer.appendChild(imgElement)
    predictionContainer.appendChild(imgContainer)

    val probsContainer = document.createElement("div").asInstanceOf[html.Div]
    classes.indices.foreach { i =>
      val row = document.createElement("div").asInstanceOf[html.Div]
      row.className = "row"

      val classElement = document.createElement("div").asInstanceOf[html.Div]
      classElement.className = "cell"
      classElement.asInstanceOf[RichHTMLElement].innerText = classes(i).className
      row.appendChild(classElement)

      val probsElement = document.createElement("div").asInstanceOf[html.Div]
      probsElement.className = "cell"
      probsElement.asInstanceOf[RichHTMLElement].innerText = classes(i).probability.toFixed(3)
      row.appendChild(probsElement)

      probsContainer.appendChild(row)
    }
    predictionContainer.appendChild(probsContainer)

    predictionsElement.insertBefore(
      predictionContainer, predictionsElement.firstChild)
  }

  getElement[html.Input]("files").foreach { filesElement =>
    filesElement.addEventListener("change", (evt: dom.Event) => {
      val files = evt.target.asInstanceOf[html.Input].files
      // Display thumbnails & issue call to predict each image.
      (0 until files.length).foreach { i =>
        val f = files(i)
        // Only process image files (skip non image files)
        if (f.`type`.matches("image.*")) {
          val reader = new FileReader()
          val idx = i
          // Closure to capture the file information.
          reader.onload = e => {
            // Fill the image & call predict.
            val img = document.createElement("img").asInstanceOf[html.Image]
            img.src = e.target.asInstanceOf[dom.FileReader].result.asInstanceOf[String]
            img.width = IMAGE_SIZE
            img.height = IMAGE_SIZE
            img.onload = (_) => predict(img)
          }

          // Read in the image file as a data URL.
          reader.readAsDataURL(f)
        }
      }
    })
  }

  val demoStatusElement = document.getElementById("status").asInstanceOf[html.Element]
  val predictionsElement = document.getElementById("predictions")
  val status = (msg: String) => demoStatusElement.asInstanceOf[RichHTMLElement].innerText = msg

  def main(args: Array[String]): Unit = {
    mobilenetDemo
  }
}

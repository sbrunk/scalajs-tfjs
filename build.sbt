import org.scalajs.sbtplugin.ScalaJSCrossVersion
// *****************************************************************************
// Projects
// *****************************************************************************

lazy val `scalajs-tfjs-core` =
  project
    .in(file("tfjs-core"))
    .enablePlugins(AutomateHeaderPlugin, GitVersioning, GitBranchPrompt, ScalaJSPlugin, ScalaJSBundlerPlugin)
    .settings(settings)
    .settings(
      libraryDependencies ++= Seq(
        library.scalajsDom,
        library.scalaCheck % Test,
        library.scalaTest  % Test
      ),
      npmDependencies in Test += npmLibrary.tfjsCore
    )

lazy val `scalajs-tfjs-layers` =
  project
    .in(file("tfjs-layers"))
    .enablePlugins(AutomateHeaderPlugin, GitVersioning, GitBranchPrompt, ScalaJSPlugin, ScalaJSBundlerPlugin)
    .settings(settings)
    .settings(
      libraryDependencies ++= Seq(
        library.scalajsDom,
        library.scalaCheck % Test,
        library.scalaTest  % Test
      ),
      npmDependencies in Test += npmLibrary.tfjsLayers
    )
  .dependsOn(`scalajs-tfjs-core`)

lazy val `scalajs-tfjs-converter` =
  project
    .in(file("tfjs-converter"))
    .enablePlugins(AutomateHeaderPlugin, GitVersioning, GitBranchPrompt, ScalaJSPlugin, ScalaJSBundlerPlugin)
    .settings(settings)
    .settings(
      libraryDependencies ++= Seq(
        library.scalajsDom,
        library.scalaCheck % Test,
        library.scalaTest  % Test
      ),
      npmDependencies in Test += "tfjs-converter" -> "0.4.3"
    )
    .dependsOn(`scalajs-tfjs-layers`)

lazy val example =
  project
    .in(file("example"))
    .enablePlugins(AutomateHeaderPlugin, ScalaJSPlugin, ScalaJSBundlerPlugin)
    .settings(settings)
    .settings(
      libraryDependencies ++= Seq(
        library.scalaAsync,
        library.scalajsDom,
      ),
      npmDependencies in Compile ++= Seq(
        npmLibrary.tfjsCore,
        npmLibrary.tfjsLayers,
        npmLibrary.tfjsConverter
      ),
      npmDevDependencies in Compile += "html-webpack-plugin" -> "3.2.0",
      scalaJSUseMainModuleInitializer := true,
      mainClass in Compile := Some("example.Example"),
)
    .dependsOn(`scalajs-tfjs-core`)
    .dependsOn(`scalajs-tfjs-layers`)
    .dependsOn(`scalajs-tfjs-converter`)

lazy val mobilenetExample = project
  .in(file("examples/mobilenet"))
  .enablePlugins(AutomateHeaderPlugin, ScalaJSBundlerPlugin)
  .settings(settings)
  .settings(
    libraryDependencies ++= Seq(
      library.scalajsDom,
    ),
    npmDependencies in Compile ++= Seq(
      npmLibrary.tfjsCore,
      npmLibrary.tfjsLayers
    ),
    npmDevDependencies in Compile ++= Seq(
      "html-webpack-plugin" -> "3.2.0",
      "copy-webpack-plugin" -> "4.5.2"
    ),
    webpackConfigFile := Some(baseDirectory.value / "webpack.config.js"),
    scalaJSUseMainModuleInitializer := true,
    mainClass in Compile := Some("MobilenetDemo")
  )
  .dependsOn(`scalajs-tfjs-layers`)

// *****************************************************************************
// Library dependencies
// *****************************************************************************

lazy val library =
  new {
    object Version {
      val scalaAsync = "0.9.7"
      val scalaCheck = "1.14.0"
      val scalaTest  = "3.0.5"
      val scalajsDom = "0.9.6"
    }
    val scalaAsync = "org.scala-lang.modules" %% "scala-async" % Version.scalaAsync
    val scalajsDom = "org.scala-js" % "scalajs-dom" % Version.scalajsDom cross ScalaJSCrossVersion.binary
    val scalaCheck = "org.scalacheck" %% "scalacheck" % Version.scalaCheck
    val scalaTest  = "org.scalatest"  % "scalatest"  % Version.scalaTest cross ScalaJSCrossVersion.binary
  }

lazy val npmLibrary =
  new {
    object Version {
      val tfjsCore = "0.12.8"
      val tfjsLayers = "0.7.2"
      val tfjsConverter = "0.4.3"
    }
    val tfjsCore = "@tensorflow/tfjs-core" -> Version.tfjsCore
    val tfjsLayers = "@tensorflow/tfjs-layers" -> Version.tfjsLayers
    val tfjsConverter = "@tensorflow/tfjs-converter" -> Version.tfjsConverter
  }

// *****************************************************************************
// Settings
// *****************************************************************************

lazy val settings =
  commonSettings ++
  gitSettings ++
  scalafmtSettings

lazy val commonSettings =
  Seq(
    // scalaVersion from .travis.yml via sbt-travisci
    // scalaVersion := "2.12.4",
    organization := "io.brunk",
    organizationName := "Sören Brunk",
    startYear := Some(2017),
    licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0")),
    scalacOptions ++= Seq(
      "-unchecked",
      "-deprecation",
      "-language:_",
      "-target:jvm-1.8",
      "-encoding", "UTF-8",
      "-P:scalajs:sjsDefinedByDefault"
    ),
    unmanagedSourceDirectories.in(Compile) := Seq(scalaSource.in(Compile).value),
    unmanagedSourceDirectories.in(Test) := Seq(scalaSource.in(Test).value),
    //wartremoverWarnings in (Compile, compile) ++= Warts.unsafe,
    version in webpack := "4.8.1",
    version in startWebpackDevServer := "3.1.4"
)

lazy val gitSettings =
  Seq(
    git.useGitDescribe := true
  )

lazy val scalafmtSettings =
  Seq(
    scalafmtOnCompile := false,
    scalafmtOnCompile.in(Sbt) := false,
    scalafmtVersion := "1.5.1"
  )

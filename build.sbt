// *****************************************************************************
// Projects
// *****************************************************************************

lazy val `scala-js-deeplearnjs` =
  project
    .in(file("."))
    .enablePlugins(AutomateHeaderPlugin, GitVersioning, GitBranchPrompt, ScalaJSPlugin, ScalaJSBundlerPlugin)
    .settings(settings)
    .settings(
      libraryDependencies ++= Seq(
        library.scalajsDom,
        library.scalaCheck % Test,
        library.scalaTest  % Test
      ),
      npmDependencies in Test += "deeplearn" -> "0.4.2"
    )

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
      npmDependencies in Test += "tfjs-core" -> "0.11.0"
    )

lazy val `tfjs-layers` =
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
      npmDependencies in Test += "tfjs-layers" -> "0.6.1"
    )

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
      npmDependencies in Compile += "deeplearn" -> "0.4.2",
      scalaJSUseMainModuleInitializer := true,
      mainClass in Compile := Some("example.Intro")
    )
    .dependsOn(`scala-js-deeplearnjs`)

// *****************************************************************************
// Library dependencies
// *****************************************************************************

lazy val library =
  new {
    object Version {
      val scalaAsync = "0.9.7"
      val scalaCheck = "1.13.5"
      val scalaTest  = "3.0.4"
      val scalajsDom = "0.9.3"
    }
    val scalaAsync = "org.scala-lang.modules" %% "scala-async" % Version.scalaAsync
    val scalajsDom = "org.scala-js" %%%! "scalajs-dom" % Version.scalajsDom
    val scalaCheck = "org.scalacheck" %% "scalacheck" % Version.scalaCheck
    val scalaTest  = "org.scalatest"  %%%! "scalatest"  % Version.scalaTest
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
    //wartremoverWarnings in (Compile, compile) ++= Warts.unsafe
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

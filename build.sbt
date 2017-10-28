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
      npmDependencies in Test += "deeplearn" -> "0.3.3",
    )

lazy val example =
  project
    .in(file("example"))
    .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
    .settings(settings)
    .settings(
      libraryDependencies ++= Seq(
        library.scalajsDom,
      ),
      npmDependencies in Compile += "deeplearn" -> "0.3.3",
      scalaJSUseMainModuleInitializer := true
    )
    .dependsOn(`scala-js-deeplearnjs`)

// *****************************************************************************
// Library dependencies
// *****************************************************************************

lazy val library =
  new {
    object Version {
      val scalaCheck = "1.13.5"
      val scalaTest  = "3.0.4"
      val scalajsDom = "0.9.3"
    }
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
    licenses += ("MIT", url("https://opensource.org/licenses/MIT")),
    scalacOptions ++= Seq(
      "-unchecked",
      "-deprecation",
      "-language:_",
      "-target:jvm-1.8",
      "-encoding", "UTF-8"
    ),
    unmanagedSourceDirectories.in(Compile) := Seq(scalaSource.in(Compile).value),
    unmanagedSourceDirectories.in(Test) := Seq(scalaSource.in(Test).value),
    wartremoverWarnings in (Compile, compile) ++= Warts.unsafe
)

lazy val gitSettings =
  Seq(
    git.useGitDescribe := true
  )

lazy val scalafmtSettings =
  Seq(
    scalafmtOnCompile := true,
    scalafmtOnCompile.in(Sbt) := false,
    scalafmtVersion := "1.3.0"
  )

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
      npmDependencies in Test += "deeplearn" -> "0.4.2",
    )

lazy val example =
  project
    .in(file("example"))
    .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
    .settings(settings)
    .settings(
      libraryDependencies ++= Seq(
        library.scalajsDom,
        "org.scala-lang.modules" %% "scala-async" % "0.9.6"
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
    scalafmtOnCompile := true,
    scalafmtOnCompile.in(Sbt) := false,
    scalafmtVersion := "1.3.0"
  )

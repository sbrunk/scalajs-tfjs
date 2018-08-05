addSbtPlugin("com.dwijnand"      % "sbt-travisci"    % "1.1.1")
addSbtPlugin("com.lucidchart"    % "sbt-scalafmt"    % "1.15")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"         % "1.0.0")
addSbtPlugin("de.heikoseeberger" % "sbt-header"      % "5.0.0")
addSbtPlugin("org.wartremover"   % "sbt-wartremover" % "2.3.3")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25" // Needed by sbt-git

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.24")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.13.1")
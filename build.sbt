enablePlugins(Sonatype)

// import scoverage.ScoverageKeys

name := "scala-hello-world-app"

organization := "io.github.sullis"

scalaVersion := "2.13.5"

crossScalaVersions := Seq(scalaVersion.value, "3.0.0")

scalacOptions += "-target:jvm-1.8"

scalacOptions ++= {
      CrossVersion.partialVersion(scalaVersion.value) match {
        case Some((3, _)) =>
          Seq("-source:3.0-migration", "-explain", "-explain-types")
        case _ =>
          Nil
      }
    }

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

val logbackVersion = "1.2.3"

libraryDependencies ++= Seq(
  "org.gfccollective" %% "gfc-logging" % "1.0.0",
  "ch.qos.logback" % "logback-classic" % logbackVersion,
  "ch.qos.logback" % "logback-core" % logbackVersion,
  "com.google.guava" % "guava" % "30.1.1-jre",
  "org.mockito"    % "mockito-core" % "3.10.0" % Test,
  "org.mockito"   %% "mockito-scala-scalatest" % "1.16.37" % Test,
  "org.scalatest" %% "scalatest" % "3.2.9" % Test
)

updateOptions := updateOptions.value.withGigahorse(false)

useGpg := true

releaseCrossBuild := true

releasePublishArtifactsAction := PgpKeys.publishSigned.value

publishMavenStyle := true

publishTo := sonatypePublishTo.value

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

//  ScoverageKeys.coverageMinimum := 85.0

//  ScoverageKeys.coverageFailOnMinimum := true

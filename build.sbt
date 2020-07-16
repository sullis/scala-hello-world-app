enablePlugins(Sonatype)

import scoverage.ScoverageKeys

name := "scala-hello-world-app"

organization := "io.github.sullis"

scalaVersion := "2.13.3"

crossScalaVersions := Seq(scalaVersion.value)

scalacOptions += "-target:jvm-1.8"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

val logbackVersion = "1.2.3"

libraryDependencies ++= Seq(
  "org.gfccollective" %% "gfc-logging" % "1.0.0",
  "ch.qos.logback" % "logback-classic" % logbackVersion,
  "ch.qos.logback" % "logback-core" % logbackVersion,
  "com.google.guava" % "guava" % "29.0-jre",
  "org.mockito"    % "mockito-core" % "3.4.2" % Test,
  "org.mockito"   %% "mockito-scala-scalatest" % "1.14.8" % Test,
  "org.scalatest" %% "scalatest" % "3.2.0" % Test
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

ScoverageKeys.coverageMinimum := 85.0

ScoverageKeys.coverageFailOnMinimum := true

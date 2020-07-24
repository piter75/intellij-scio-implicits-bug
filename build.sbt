name := "intellij-scio-implicits-bug"

version := "0.1"

scalaVersion := "2.12.12"

lazy val beamVersion = "2.19.0"
lazy val scioVersion = "0.8.4"

lazy val commonSettings = Seq(
  name := "intellij-scio-implicits-bug",
  version := "0.1",
  scalaVersion := "2.12.12"
)

lazy val commonLibraryDependencies = Seq(
  "org.apache.beam" % "beam-runners-direct-java" % beamVersion,
  "com.spotify" %% "scio-core" % scioVersion
)

lazy val root = (project in file("."))
  .settings(commonSettings)
  .settings(libraryDependencies ++= commonLibraryDependencies)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

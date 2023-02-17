ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "3.2.2"
ThisBuild / libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9"
lazy val root = (project in file(".")).
  settings(
    name := "scalatest-basic"
  )

name := "hello-gh-actions"

inThisBuild(
  Seq(
    scalaVersion := "2.13.17",
    crossScalaVersions := Seq("2.13.17", "3.7.3")
  )
)

lazy val root = (project in file("."))
  .settings(
    name := "hello-gh-actions"
  )
  .aggregate(moduleA)

lazy val moduleA = (project in file("modules/moduleA"))
  .settings(
    name := "moduleA"
  )

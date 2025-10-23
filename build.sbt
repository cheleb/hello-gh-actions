name := "hello-gh-actions"

lazy val root = (project in file("."))
  .settings(
    name := "hello-gh-actions"
  )
  .aggregate(moduleA)

lazy val moduleA = (project in file("modules/moduleA"))
  .settings(
    name := "moduleA"
  )

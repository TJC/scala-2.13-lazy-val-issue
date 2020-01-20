lazy val root = project.in(file("."))
  .settings(Seq(
    name := "example",
    scalaVersion := "2.13.1",
  ))

scalacOptions ++= Seq("-Xlint", "-target:11")

libraryDependencies ++= Seq (
  "org.scalatest"   %% "scalatest"                    % "3.1.0",
)

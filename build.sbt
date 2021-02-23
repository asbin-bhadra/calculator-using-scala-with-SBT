name := "Calculator"
version := "1.0.0"
scalaVersion := "2.12.12"
sbtPlugin := true

// Create a variable for calculator module
lazy val calculator = (project in file("calculator")).settings(
    libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.2.3" % Test,
    )
)
// Aggregate calculator module with root project
lazy val root = (project in file(".")).aggregate(calculator)


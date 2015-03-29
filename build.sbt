name := """lupus"""
version := "0.0.1"
lazy val root = (project in file(".")).enablePlugins(PlayScala)
scalaVersion := "2.11.6"
libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "org.scalaz" %% "scalaz-core" % "7.1.1"
)

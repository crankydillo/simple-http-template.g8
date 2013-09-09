name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
    "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"
    , "org.apache.httpcomponents" % "httpclient" % "4.2.5"
    , "org.apache.httpcomponents" % "fluent-hc" % "4.2.5"
    , "org.apache.httpcomponents" % "httpcore" % "4.2.5"
  )


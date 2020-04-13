name := "dfdl-nitf"
 
organization := "com.tresys"
 
version := "0.0.1"
 
scalaVersion := "2.12.11"
 
libraryDependencies := Seq(
  "com.mitre" % "dfdl-jpeg" % "0.0.1",
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "2.6.0" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false

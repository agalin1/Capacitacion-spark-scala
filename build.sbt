name := "capacitacion-spark-scala"
version := "1.0.0"
scalaVersion := "2.12.11"
val sparkVersion = "3.1.1"
// https://mvnrepository.com/artifact/org.apache.spark/spark-corelibraryDependencies += "org.apache.spark" %% "spark-core" % "3.1.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.1.1" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.1.1"



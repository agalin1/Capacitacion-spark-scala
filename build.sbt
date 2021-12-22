name := "capacitacion-spark-scala"
version := "1.0.0"
scalaVersion := "2.12.11"
val sparkVersion = "3.1.1"


libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)




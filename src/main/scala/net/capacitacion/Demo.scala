package net.capacitacion

import org.apache.spark.SparkContext
import org.apache.spark.sql.{DataFrame, SparkSession}

object Demo {

  var nameApp = "CapacitacionSpark"
  var pathInput = "input/MOCK_DATA_1.csv"
  var delimitador = "|"
  var sc: SparkContext = null

  val spark: SparkSession = SparkSession.builder
    .appName(nameApp)
    .master("local[*]")
    .getOrCreate()

  println("Hola mundo")

  var dfInputData: DataFrame = spark.emptyDataFrame


  def main(args: Array[String]): Unit = {

    sc = spark.sparkContext

    dfInputData = spark.read
      .option("delimiter", delimitador)
      .option("header", "true")
      .option("charset", "UTF-8")
      .option("inferSchema", "true")
      .option("nullValue", "null")
      .csv(pathInput)

    dfInputData.show(false)
    dfInputData.printSchema()

    println("Se realizaron pruebas unitarias")
    println("En conjunto con el analista qa se realizo todas la pruebas unitarias")


  }


}

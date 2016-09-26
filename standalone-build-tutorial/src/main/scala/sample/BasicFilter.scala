package main.scala.sample

/**
  * Created by yuua on 2016/09/26.
  */

import org.apache.spark.{SparkConf,SparkContext}

object BasicFilter {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Basic Filter")
    val sc = new SparkContext(conf)

    val textFile = sc.textFile("$SPARK_HOME/README.md") // 書籍に合わせる
    val filteredLine = textFile.filter(line => line.contains("Scala"))

    filteredLine.saveAsTextFile("./wordcounts")
  }

}

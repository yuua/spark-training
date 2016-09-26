package main.scala.sample

/**
  * Created by yuua on 2016/09/26.
  */

import org.apache.spark.{SparkConf,SparkContext}

object BasicWordCount {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf.setAppName("Basic Word Count")
    val sc = new SparkContext(conf)

    val textFile = sc.textFile("$SPARK_HOME/README.md") // 書籍に合わせる
    val words = textFile.flatMap(line => line.split(" "))
    val wordCounts = words.map(word => (word,1)).reduceByKey((a,b) => a + b)

    wordCounts.saveAsTextFile("./wordcounts")
  }

}

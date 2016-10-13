object Practice22 {
  def main(args:Array[String]) {
    val arr = Array(13,48,93,52,81)
    val (sum,average) = sumAverage(arr)
    println("配列要素の合計:"+sum)
    println("配列要素の平均:"+average)
  }

  def sumAverage(arr:Array[Int]) : (Int,Double) = {
    var sum:Int = 0
    var cnt:Int = 0
    while(cnt<arr.length) {
      sum += arr(cnt)
      cnt += 1
    }
    (sum,sum/arr.length.toDouble)
  }
}


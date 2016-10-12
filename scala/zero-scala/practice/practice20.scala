object Practice20 {
  def main(args:Array[String]) {
    val arr = Array(167,218,271,121)
    var i = 0
    var s = 0
    while(i<arr.length) {
      s += arr(i)
      i += 1
    }
    println("合計:"+s)
  }
}


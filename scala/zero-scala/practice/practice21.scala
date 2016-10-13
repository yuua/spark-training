object Practice21 {
  def main(args:Array[String]) {
    var i:Int = 0
    var b:Int = 0
    while (i<args.length) {
      b += args(i).toInt
      i +=1
    }
    println(b)
  }
}

object Practice23 {
  def main(args:Array[String]) {
    val list:List[Int] = List(5,13,6,9,18,2,21,1)
    println("偶数の個数" + countEven(list))
  }

  def countEven(list:List[Int]) : Int = {
    var cnt:Int = 0
    var i:Int = 0
    while(i<list.length) {
      if (list(i) % 2 == 0) cnt += 1
      i += 1
    }
    return cnt
  }
}

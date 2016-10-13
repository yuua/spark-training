object Practice24 {
  def main(args:Array[String]) {
    val list = List(3,-5,0,-7,2,8,-1)
    val newlist = choosePlus(list)
    println("正の整数を抽出したList:" + newlist)
  }
  def choosePlus(list:List[Int]) : List[Int] = {
    for(i<-list if i > -1) yield { i }
  }
}

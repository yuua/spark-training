object Practice27 {
  def main(args:Array[String]) {
    val a = 24
    val b = 6
    val funcs:Array[(Int,Int)=>Int] = Array(
      (x:Int,y:Int) => x+y,
      (x:Int,y:Int) => x-y,
      (x:Int,y:Int) => x*y,
      (x:Int,y:Int) => x/y
      )
    for(func <- funcs) {
      println(func(a,b))
    }
  }
}

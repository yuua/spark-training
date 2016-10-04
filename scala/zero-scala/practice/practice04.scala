object Practice04 {
  def main(args:Array[String]) {
    val x = 88
    val y = 79
    val z = 96

    print("整数"+x+","+y+","+z+"の中で最小値は")
    println(min(x,y,z)+"です")
  }

  def min(x:Int,y:Int,z:Int) : Int = {
    if (x < y && x < z) {
      x
    } else if (y < x && y < z) {
      y
    } else {
      z
    }
  }
}

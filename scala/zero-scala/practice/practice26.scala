object Practice26 {
  def main(args:Array[String]) {
    try {
      println("[1]28/7="+divide(28,7))
      println("[2]72/8="+divide(72,8))
      println("[3]44/0="+divide(44,0))
      println("[4]54/6="+divide(54,6))
    } catch {
      case ex:ArithmeticException =>
        println("0除算が行われた")
    }
  }

  def divide(x:Int,y:Int) = {
    x/y
  }
}


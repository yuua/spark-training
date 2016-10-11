object Practie16 {
  def main(args:Array[String]) {
    val ap = new Airplane(0,0,100000)
    ap.takeoff()
    ap.information()
  }
}

class Vehicle(protected var speed:Int,protected var fuel:Double)

class Airplane(private var height:Int,private var s:Int,private var f:Double) extends Vehicle(s,f) {
  
  def takeoff(): Unit = {
    println("離陸しました")
    speed += 500
    this.height += 10000
    fuel -= 100.0
  }
  
  def information() {
    println(s"""
        -- 現在の状況 --
        高度: ${this.height}
        速度: 時速${speed}
        残燃料: ${fuel}
      """)
  }

}

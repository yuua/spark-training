object Practice12 {

  def main(args:Array[String]) {
    println("ロボット総生産数:"+Robot.getTotal)
    val r1 = new Robot("RX")
    val r2 = new Robot("SS")
    val r3 = new Robot("ZK")
    
    println("ロボット総生産数:"+Robot.getTotal)
    r1.introduce()
    r2.introduce()
    r3.introduce()
  }
}

object Robot {
  private var total : Int = 0

  def getTotal() : Int = {
    this.total
  }
}

class Robot(private val name:String) {

  Robot.total += 1
  private val id : Int = Robot.total

  def introduce() : Unit = {
    println(s"""
        ID: ${this.id} NAME: ${this.name}
      """
      )
  }
}

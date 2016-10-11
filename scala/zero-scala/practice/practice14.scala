object Practie14 {
  def main(args:Array[String]) {
    val b = new Bicycle
    val mb = new MotorBicycle
    b.turn()
    b.move()
    mb.turn()
    mb.move
  }
}

class Bicycle {
  def turn() = println("ハンドルを切ります")
  def move() = println("ペダルを恋で進みます")
}

class MotorBicycle extends Bicycle {
  override def move() = println("エンジンを動力に進みます")
}

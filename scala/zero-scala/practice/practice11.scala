object Practice11 {

  def main(args:Array[String]) {
    val square1 = new Square(2.5,4.5)
    val square2 = new Square(3.5,4.0)
    print("２つの四角形で広い方の面積は")
    print(square1.wider(square2).area)
    println("です")
    square1.add(0.5,0.5)
    print("２つの四角形で広い方の面積は")
    print(square1.wider(square2).area)
    println("です")
  }
}

class Square(private var width : Double,private var height : Double) {

  def area() : Double = this.width * this.height

  def wider(other:Square) : Square = {
    if (this.area() <= other.area()) {
      this
    } else {
      other
    }
  }

  def add(width:Double,height:Double) : Unit = {
    this.width += width
    this.height += height
  }
}

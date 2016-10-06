object Practie07 {

  def main(args:Array[String]) {
    val tshirt = new TShirt("黒",2980)
    println("本日セールのTシャツ")
    tshirt.information()
    tshirt.changePrice(1480)
    println("プライスダウン後")
    tshirt.information()
  }

}

class TShirt(c:String,p:Int) {
  val color : String = c
  val size : String = "L"
  var price : Int = p

  def changePrice(p:Int) : Unit = {
    price = p
  }

  def information() : Unit = {
    println(s"""
        色: ${color} サイズ: ${size} 価格: ${price}
      """
      )
  }
}

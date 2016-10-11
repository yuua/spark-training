object Practie19 {
  def main(args:Array[String]) {
    val button = new CountButton
    button.push()
    button.push()
    button.push()
    println("ボタンを押した回数" + button.getCount)
  }
}

class Button {
  def push(): Unit = {
    println("ボタンを押しました")
  }
}

trait Counter {
  private var count : Int = 0

  def incrementCount() : Unit = {
    this.count += 1
  }

  def getCount() : Int = {
    this.count
  }
}

class CountButton extends Button with Counter {
  override def push() : Unit = {
    super.push()
    this.incrementCount()
  }
}

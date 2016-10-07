object Practice10 {

  def main(args:Array[String]) {
    val car1 = new Car("ファット",1234,10.0);
    val car2 = new Car("トント",6789);
    car1.run(7.0);
    car2.run(7.0);
    car1.showInfo();
    car2.showInfo();
  }
}

class Car(private val model:String,private val number:Int,private var gasoline:Double) {

  def this(model:String,number:Int) {
    this(model,number,5.0)
  }

  def run(runGasoline:Double) : Unit = {
    if (gasoline >= runGasoline) {
      println(s"""ナンバー${number}の${model}はガソリン${runGasoline}分走行した""")
      gasoline -= runGasoline
    } else {
      println(s"""ナンバー${number}の${model}はガソリン不足のため走行できない""")
    }
  }

  def showInfo() : Unit = {
    println(s"""
        車種: ${model} ナンバー: ${number} ガソリン: ${gasoline}
      """
      )
  }
}

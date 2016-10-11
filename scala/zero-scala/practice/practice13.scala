object Practice13 {
  def main(args:Array[String]) {
    val p = new Picher("山田",99,0.09,2.13)
    p.changeBattingAverage(0.02)
    p.introduce()
  }
}

class BaseballPlayer(val name:String,val uniformNumber:Int, var battingAverage:Double) {
  def changeBattingAverage(change:Double) {
    battingAverage += change
  }
}

class Picher(val n:String,val u:Int,var b:Double,var guardAverage:Double)
  extends BaseballPlayer(n,u,b){

  def introduce() : Unit = {
    println(s"""
      選手名: ${name}
      背番号: ${uniformNumber}
      打率: ${this.battingAverage}
      防御率: ${this.guardAverage}
      """
    )
  }
}

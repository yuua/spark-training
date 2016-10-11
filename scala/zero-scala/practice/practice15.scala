object Practice15 {
  def main(args:Array[String]) {
    val c1 = new Clock(10,15,30)
    c1.showData()
    println()
    val c2 =new AlarmClock(15,45,20,6,30)
    c2.showData()
  }
}

class Clock(private var hour:Int,private var miniute:Int,private var second:Int) {
  def showData() {
    println(s"""
      ただいまの時刻:${hour}時${miniute}分${second}秒
      """
      )
  }
}

class AlarmClock(private var hour:Int,private var miniute:Int,private var second:Int, private var alarmHour:Int, private var alarmMinute:Int) 
  extends Clock(hour,miniute,second) {

  override def showData(): Unit =  {
    super.showData()
    println(s"""
      アラーム設定時刻: ${alarmHour}時${alarmMinute}分
      """
      )
  }
}

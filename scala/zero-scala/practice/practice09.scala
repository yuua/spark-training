object Practice09 {
  def main (args:Array[String]) {
    val t1 = new Talent("石原真希",22)
    val t2 = new Talent("本上ゆきえ","本田涼子")
    val t3 = new Talent("市川瑠璃子","山田美樹",24)

    t1.profile
    t2.profile
    t3.profile
  }
}

class Talent(n:String,r:String,a:Int) {
  val stageName : String = n
  val realName : String = r
  var age : Int = a

  def this(n:String,a:Int) {
    this(n,"非公開",a)
  }

  def this(n:String,r:String) {
    this(n,r,-1)
  }

  def profile() {
    println(s"""
        芸名: ${stageName} 本名: ${realName} 年齢: ${if (age == -1 ) "非公開" else age}
      """
      )
  }
}

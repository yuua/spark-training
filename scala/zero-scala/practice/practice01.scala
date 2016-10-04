object Practice01 {
  def main(args:Array[String]) {
    // 1.Int型のvar変数xの宣言
    var x:Int = 10

    // 2.変数xの値を二倍して再格納
    x *= 2

    // 3.Int型のval変数yを戦前し初期値をxを7で割ったあまりにする
    val y:Int = x % 7

    // 4.yの出力
    println("変数yの値:"+y)
  }
}

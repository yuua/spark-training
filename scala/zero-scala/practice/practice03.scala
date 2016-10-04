object Practie03 {
  def main(args:Array[String]) {

    var count = 3

    val answer = scala.util.Random.nextInt(10) + 1

    do {
      println(s"数値を入力してください(残り${count}回)")
      val input = scala.io.StdIn.readInt

      count -= 1
      if (answer == input) {
        println(s"正解:${answer}")
        count = 0
      } else {
        if (count <= 0) {
          println(s"残念、正解は${answer}でした")
        } else if (answer > input) {
          println("正解値は入力値より大きいです")
        } else {
          println("正解値は入力値より小さいです")
        }
      }
    } while (count > 0)
  }
}


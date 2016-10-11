object Practie17 {
  def main(args:Array[String]) {
    val cook:Worker = new Cook("酒井")
    val designer:Worker = new Designer("片桐")
    cook.introduce()
    cook.work()
    designer.introduce()
    designer.work()
  }
}

abstract class Worker(val name:String) {

  val jobType:String

  def work(): Unit

  def introduce() : Unit = {
    println(s"""
      わたくしは${name}は${jobType}です
      """)
  }
}

class Cook(val n:String) extends Worker(n) {
  val jobType = "コック"

  def work() {
    println(s"""
      ${name}さんはおいしいパスタを作りました
      """)
  }
}

class Designer(val n:String) extends Worker(n) {
  val jobType = "デザイナ"

  def work() {
    println(s"""
      ${name}さんは斬新なイラストを描きました
      """)
  }
}

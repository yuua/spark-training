object Practice02 {
  def main(args:Array[String]) {
    println("身長(cm)の入力")
    val height:Double=scala.io.StdIn.readDouble
    println("体重(kg)の入力")
    val weight:Double=scala.io.StdIn.readDouble

    val bmi = weight / Math.pow((height/100),2)
    println("あなたのBMI値は"+bmi+"です")

    val result = 
      if (bmi >= 26.5) {
        "肥満"
      } else if (bmi >= 24 && bmi < 26.5) {
        "太り気味"
      } else if (bmi >= 20 && bmi < 24) {
        "普通"
      } else {
        "スリム"
      }
    println(s"あなたは${result}です")
  }
}

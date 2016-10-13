object Practice25 {
  def main(args:Array[String]) {
    println("8+4="+calculate(8,4,"+"))
    println("8-4="+calculate(8,4,"-"))
    println("8*4="+calculate(8,4,"*"))
    println("8/4="+calculate(8,4,"/"))
    println("8%4="+calculate(8,4,"%"))
    println("8?4="+calculate(8,4,"?"))
  }




  def calculate(a:Int,b:Int,s:String) : Int = {
    s match {
      case "+" => a + b
      case "-" => a - b
      case "/" => a / b
      case "%" => a % b
      case "*" => a * b
      case _ => 0
    }
  }
}

object Practie05 {
  def main(args:Array[String]) {
  
    val r = 5.0
    println("半径"+r+"の円の面積は"+getArea(r))

    val base=9.0
    val height=5.0

    println("底辺"+base+"、高さ"+height+"の三角形の面積"+getArea(base,height))

    val upperBase=8.0
    val lowerBase=10.0
    println("上底"+upperBase+"下底"+lowerBase+"、高さ"+height+"の台形の面積"+getArea(upperBase,lowerBase,height))
  }
  def getArea(r:Double) : Double = {
    return (r * r) * 3.14
  }

  def getArea(base:Double,height:Double) : Double = {
    return (base * height) / 2
  }

  def getArea(upperBase:Double, lowerBase:Double, height:Double) : Double = {
    return (upperBase + lowerBase) * height / 2
  }

}

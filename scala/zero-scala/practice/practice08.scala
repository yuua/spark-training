object Practice08 {
  def main(args:Array[String]) {
    val jp = new Japanese("山田一郎","2001-04-01",false,123456789121L)
    jp.showPrivateData()
  }
}

class Japanese(n:String,b:String,gen:Boolean,number:Long) {
  private val name : String = n
  private val birthday : String = b
  private val gender : Boolean= gen
  private val mynumber : Long = number

  def showPrivateData() {
    println(s"""
      -- ${name}の個人情報 --
      生年月日: ${birthday}
      性別: ${getSex(gender)}
      マイナンバー: ${mynumber}
      """
    )
  }

  private def getSex(sex:Boolean) : String = {
    if(sex) "女性" else "男性"
  }
}

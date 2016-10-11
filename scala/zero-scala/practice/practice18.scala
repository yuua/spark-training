object Practice18 {
  def main(args:Array[String]) {
    val book = new Book("人間失格",500,"太宰治")
    val magazine = new Magazine("東京メダル",980,"ABC出版編集部","上田彩")
    println(book)
    println(magazine)
  }
}

class Book(protected val title:String,protected val price:Int,protected val author:String) {

  override def toString(): String = {
    s"""
      タイトル: ${title} 価格: ${price} 著者: ${author}
    """
  }
}

class Magazine(private val t:String,private val p:Int, private val a:String,private val converPersonName:String) extends Book(t,p,a) {

  override def toString(): String = {
    s"""
      タイトル: ${title} 価格: ${price} 著者: ${author} 表紙: ${converPersonName}
    """
  }
}

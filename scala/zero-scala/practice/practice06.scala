object Practice06 {
  def main(args:Array[String]) {
    val book = new Book
    book.title = "楽しいscala"
    book.author = "山田太郎"
    book.price = 2980
    println(book.getInfo())
  }
}

class Book {
  var title : String = ""
  var author : String = ""
  var price : Int = 0

  def getInfo() : String = {
   s"""
      タイトル: ${title}
      著者: ${author}
      価格: ${price}
    """
  }
}

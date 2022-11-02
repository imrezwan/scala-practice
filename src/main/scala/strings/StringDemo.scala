package strings

object StringDemo {
  def main(args: Array[String]): Unit = {
    val s: String = "Hello String Talking"
    println(s)

    // string interpolation
    val st1 = s"Previous talk: $s"
    println(st1)

    println(s.drop(2).take(5).capitalize)
  }
}

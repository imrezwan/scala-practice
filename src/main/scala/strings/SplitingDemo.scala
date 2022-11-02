package strings

object SplitingDemo {
  def main(args: Array[String]): Unit = {
    val s = "Hello World Up"
    println(s.split(" ").length)
    println(s.split(" ").foreach(println))
  }
}

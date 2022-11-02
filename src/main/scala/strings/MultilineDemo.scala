package strings

object MultilineDemo {
  def main(args: Array[String]): Unit = {
    val foo = // | (Pipe) symbol means starting a line
      """First Line
        |Second Line
        |""".stripMargin
    println(foo)


    val foo2 = // Custom symbol for starting a line
      """First Line
        $Second Line
        $Third Line
        """.stripMargin('$')
    println(foo2)

    //remove new line or make it a paragraph
//    val foo3 = // Custom symbol for starting a line
//      """First Line
//        |Second Line
//        |Third Line
//        """.stripMargin.replaceAll("\n", " ")
//    println(foo3)
  }
}

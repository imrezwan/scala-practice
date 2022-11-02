package control_structures

object ForExpDemo {
  def main(args: Array[String]): Unit = {
    val data = for ( i <- 1.until(11)
          if i % 2 == 0
          if i > 2
          ) yield i * 10

    println(data)
    println(1 to 10)
  }
}

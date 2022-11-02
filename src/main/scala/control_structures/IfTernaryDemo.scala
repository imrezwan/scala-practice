package control_structures

object IfTernaryDemo {
  def main(args: Array[String]): Unit = {
    val a = -3
    val absVal = if (a > 0) a else {-a }
    println(absVal)
  }
}

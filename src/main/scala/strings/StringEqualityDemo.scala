package strings

object StringEqualityDemo {
  def main(args: Array[String]): Unit = {
    val s1 = "Hello"
    val s2 = "Hello"
    val s3 = "H" + "ello"
    val s4 = null
    val s5 = "hellO"

    println(s1 == s2) // true
    println(s1 == s3) // true
    println(s1 == s4) // false and no null pointer exception

    // ignore case
    println(s1.equalsIgnoreCase(s5)) // true
    println(s1.toUpperCase == s5.toUpperCase) // true
  }
}

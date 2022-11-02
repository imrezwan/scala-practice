package control_structures

object ForLoopDemo {
  def main(args: Array[String]): Unit = {
    val fruits = List("Apple", "Banana", "Orange")
    for (f <- fruits) {
      println(f)
    }

    // looping over map
    val myMap = Map("name" -> "Rezwan", "weight" -> 74.2, "designation" -> "Software engineer")
    for ( (k,v) <- myMap ) {
      println(s"Key: $k, Value: $v")
    }

    // looping over list with "foreach"
    val upperFruits = fruits.foreach(e =>
      println(e.toUpperCase)
    )
//    val upperFruits = fruits.map(e => e.toUpperCase)
    println(upperFruits)


    // multiple counter
    for ( i <- 1 to 3; j <- 4 to 5; k <- 3 to 4) {
      println(i, j , k)
    }
  }
}

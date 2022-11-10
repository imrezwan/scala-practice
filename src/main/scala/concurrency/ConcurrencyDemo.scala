package concurrency

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.io.StdIn
import scala.util.{Failure, Success}

object ConcurrencyDemo {
  def main(args: Array[String]): Unit = {
    val f = Future {
      Thread.sleep(10000);
      42
    }
//    val result = Await.result(f, 10.seconds) // if task not ready, TimeoutException been thrown
//    val result = Await.ready(f, 10.seconds)
//    println(result)
//    println("After Result")

    f.onComplete {
      case Success(v) => println(s"The answer is $v")
      case Failure(ex) => println(ex.getMessage)
      case _ => println("what the hell happened")
    }
    println("after oncomplete")
    StdIn.readLine()
  }
}

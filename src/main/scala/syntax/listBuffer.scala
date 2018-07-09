package syntax

import scala.collection.mutable.ListBuffer

object listBuffer {
scala.collection.mutable.ListBuffer;

  def main( args : Array[String])={

    var lstBuffer:ListBuffer[Int] = ListBuffer(1,2,3,4)
    lstBuffer= lstBuffer+12
    println(lstBuffer)
  }
}

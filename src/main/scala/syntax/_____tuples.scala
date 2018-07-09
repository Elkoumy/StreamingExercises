package syntax

object _____tuples {

  def main (args : Array[String])={
    // tuples can contain different data types
    // BUT it is fixed size and the values can't be changed

    val myTuple = (1,"Hello", 2.4)

    // to declare the tuple with size
    // Tuple2 means of size 2
    val myTuple2= Tuple2(1,"Hello")

    println(myTuple)

    println(myTuple2._2)

    myTuple.productIterator.foreach{
      i=> println(i)
    }


  }

}

package syntax

object lists {

    def main( args : Array[String])={
      // you CAN'T Change the  value of an element inside the list

      val myList :List[Int]=List(1,2,3,4,5,4)

      println( myList(0))
      // myList(0)=1 is wrong

      println(myList)

      println(Nil) // Nil is an empty list

      // to concat two lists we can use ::

      println(1::5::Nil::myList)

      println(List.fill(4)(2))

      println(myList.max)





    }
}

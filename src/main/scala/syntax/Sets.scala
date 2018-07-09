package syntax

object Sets {

  def main( args: Array[String])={
    //holds unique data of the same data type
    // imutable sets

    val mySet : Set[Int]= Set(1,2,3,4,5)

    // mutable sets , elements  can be appended
    var mySet1 = scala.collection.mutable.Set[Int]( 1,2,3,4,5,2,3)

    println(mySet)

    println(mySet(5)) // it returns true if 5 is in the list
    println(mySet1(0))

    mySet1+=99
    mySet1=mySet1+66
    print(mySet1)


  }

}

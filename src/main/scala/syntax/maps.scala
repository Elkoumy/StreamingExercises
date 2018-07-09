package syntax

object maps {


  def main(args : Array[String])={
    // map is like a dictionary, it is a key value pairs
    // but all the values are of the same type

    val myMap : Map[Int, String] = Map( 100 -> "Max", 120 -> "Min", 130 -> "AnyValue")
    println(myMap)
    println(myMap(120))
    println(myMap.keys)
    println(myMap.values)


    // mutable maps

    val myMap2 = scala.collection.mutable.Map[Int,String](100 -> "Max", 120 -> "Min", 130 -> "AnyValue")

    // adding a value to the map
    myMap2.put(30,"new value")

    print(myMap2)

  }
}

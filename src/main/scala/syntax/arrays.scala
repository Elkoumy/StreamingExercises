package syntax

import Array._
object arrays {


  def main(args : Array[String])={

    // arrays are of fixed size and the same data type
    var myArray : Array[Int]= new Array[Int](5); // Int array of size 5
    var array1 = Array(1,2,32,2,3,34,3);
    for ( i <-0 to myArray.length-1){
       myArray(i)=i
    }

    for ( i <- myArray){
      println(i)
    }

    var temp =concat(myArray,array1);

    for ( i <- temp)
      {
        println(i)
      }
  }
}

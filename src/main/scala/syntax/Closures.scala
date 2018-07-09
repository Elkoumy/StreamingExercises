package syntax

object Closures {
 //Closures are functions that uses a variables that is defined outside of it

  var x1= 100;
  def closure(b:Int):Int={
    x1=b+x1;
    x1;
  }
  def main (args : Array[String] ) :Unit={
      x1=20
    println(closure(30))
    print(x1)

  }
}

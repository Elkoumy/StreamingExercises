package syntax

object functions_in_scala {

  def add(x:Int, y:Int) : Int= { //:Int= it means the return type will be int
    return x+y
  }

  def subtract(x:Int, y:Int) :Int={
    x-y; // the result of the last line will be returned automatically
  }

  def multiply(x:Int=45, y:Int=45 ) :Int= x*y;  // single line

  def divide (x:Int, y:Int) =x.toFloat/y; // here we don't declare the return type it can be changed

  def test (x:Int):Unit= {    //void funtion
   var y=x

  }
object Math{
  def add(x:Int, y:Int) : Int= { //:Int= it means the return type will be int
    return x+y
  }
}

  def main (args : Array[String] ){

    var addition= (x: Int, y:Int) => x+y; // anonymous function ( a function without a name)
    // the good thing here is that every time you use the variable it will execute the function
    println(addition(14,3))
      println(multiply())
    println(divide(4,4))
    println(divide(3,4))
    println(Math.add(5,4))

  }
}

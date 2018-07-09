package syntax

object Higher_Order_Function {
// (parameters, f:( input function parameter) => the output of the function ) : the output of the higher order function
  def math ( x:Int, y:Int, f:(Double, Double)=> Double): Double= f(x,y);
    def main (args : Array[String] ): Unit = {

      println(math(10,20, (x,y)=>x+y ))
      // the same can be done using the wildcard
      println(math(10,20, _+_ ))
    }

}

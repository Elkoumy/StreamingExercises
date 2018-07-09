package syntax
object if_statement {
  def main(args: Array[String]) {
    var x = 30;

    if( x == 10  && x<1000){
      println("Value of X is 10");
    } else if( x == 20 || x>20 ){
      println("Value of X is 20");
    } else if( x == 30 ){
      println("Value of X is 30");
    } else{
      println("This is else statement");
    }

    // one line if statement
    val y = if(x==10) 50 else 60
    print(y)
  }
}
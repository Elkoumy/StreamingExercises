package syntax

object strings {


  def main(args: Array[String])={
    val str1 = "Hello world";
    println(str1.length());

    //formated numbers
    var num1 = 12
    var num2= 12.5
    printf("%d -- %f -- %s", num1, num2, str1);
  }
}

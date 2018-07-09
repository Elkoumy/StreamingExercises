


package syntax


import java.util.Date

object Partially_applied_functions {
  // to make part of the arguments fixed and rename the function to reuse it again

  def log(date :Date, msg:String)={
    println( date + "  "+ msg);
  }

  def main (args : Array[String] ): Unit = {
    val sum = (x :Int, y:Int, z:Int)=>x+y+z;

    val partial_sum = sum(100,200, _:Int);

    println(partial_sum(30))
    val date = new Date;
    val issueLog = log(date,_:String)
    issueLog("this is issue");
  }
}

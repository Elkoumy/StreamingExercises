package syntax

object for_loop {
  def main(args : Array[String]){

    for( i <- 1 to 5){
      println(i)
    }

    // we can use two indexes ( multiple range)
    for (i <- 1 to 5 ; y <- 5 to 20){
      println( i + "  "+ y)
    }


    // over list of items

    var lst = List(1,3,4,3)


    for (item <- lst)
    {
      println(item)
    }

    // adding a condition

    for (item <- lst; if item<4)
    {
      println(item)
    }

    // as expression

    var result = for{item <-lst} yield {
      item*item
    }
    println(result)

  }
}

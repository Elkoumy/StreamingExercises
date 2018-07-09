package syntax

object String_Interpolation extends App {
  val name = "Ahmed"
  val age= 20

  println("Age of "+name+ " is "+ age+" years old")
  println(s"Age of $name is $age years old")
  println(f"Age of $name%s is $age%d years old") // here we provide the type of each variable after it.
  print("Hellow \nworld")
  print(raw"Hellow \nworld") // to cancel escape characters we use raw
}

var a:Int = 5 // var means mutable variable, value can be changed later
val b:Int = 6 // val means immutable variable, (constant) value can't be changed

var x =true

val y = { val a:Int=10; val b:Int = 15; a+b}
// the result of a+b will be returned to y

lazy val  t = 15500
// it means that this value is not assigned now, it will
// be assigned the next time you use t
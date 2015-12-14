/**
 * Created by dyenug001c on 12/8/2015.
 */
object DivideByZero {
  def main(args: Array[String]) {

    val x : Int = 0
    val y: String = new String()
    val z: String = new String()
    val res: String = ""

//    println("When divided by zero "+(0/x)) //Exception in thread "main" java.lang.ArithmeticException: / by zero
    println("Comapres null values "+ (x.equals("")))  //false

    println(y.equals(z))              //true
    println(y.isInstanceOf[String])  //true
    println(y.distinct)              // empty

    // y = res
    // println()
  }

}

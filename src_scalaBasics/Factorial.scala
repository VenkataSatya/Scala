/**
 * Created by dyenug001c on 12/8/2015.
 *
 *    Using Java program is as follows
 *    import java.math.BigInteger

      def factorial(x: BigInteger): BigInteger =
        if (x == BigInteger.ZERO)
          BigInteger.ONE
        else
          x.multiply(factorial(x.subtract(BigInteger.ONE)))
 */



object Factorial {

   def main (args: Array[String]){
     println("Program starts from here ")

     val x = factorial(5);

     println("This is a sample factorial program, x! is "+x)
  }

  def factorial(x: BigInt): BigInt =
    if (x==0) 1 else x * factorial(x - 1)

}

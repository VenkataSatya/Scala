/**
 * Created by dyenug001c on 12/1/2015.
 *
 * Array diclaration and printing stuff
 */
object HelloScala {

   def main (args: Array[String]){


     for(i <- 0 to 3){
       println(i)
       args.update(0,"Demo")
       args.update(1,"Demo")
       args.update(2,"Demo")            // assigning values to string val numNames2 = Array.apply("zero", "one", "two")

       println(args.apply(i))
     }
     args.foreach(arg => println("Hello Scala"))
     args.foreach((arg : String) => println(arg) )

     // args.foreach(println("Hello scala "))  // Throws eerror
     args.foreach(print)
     println("Hello Scala Example")
  }

}

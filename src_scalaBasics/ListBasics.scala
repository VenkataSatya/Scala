/**
 * Created by dyenug001c on 12/9/2015.
 */
object ListBasics {

  def main(args: Array[String]) {
    val oneTwoThreeInt = List(1,2,3)
    val oneTwoThreeString = List('1','2','3')
    val oneTwoThreeDeci = List(1.5,4.3,6.55)
    val listNull = List(Nil)
    val listNil = Nil


    println(oneTwoThreeInt)
    println(oneTwoThreeString)
    println(oneTwoThreeDeci)
    println(listNull.isEmpty + " This is a sample null List as shown") //false This is a sample null List as shown
    println(listNull,listNull(0))            // List(List()), List() is the output
    //println(listNil) = Nil                    // Nil is am empty list
                                              // thrill.count(s => s.length == 4)  counts elements with length more than 4
                                              // thrill.exists(s => s == "until")
                                              // thrill.filter(s => s.length == 4)
                                              // thrill.foreach(s => print(s))

                                              /**    thrill.sort((s, t) =>
                                                            s.charAt(0).toLowerCase <
                                                            t.charAt(0).toLowerCase)
                                                **/
    /** Adding of lists **/

    val oneTwoThreeInttest = 1.5 :: oneTwoThreeInt    // You can add a decimal to a list but cannot add decimal list to int list
                                                      //  List(1.5, 1, 2, 3)

    val oneTwoThreeStringtest = "TestStringList" :: List(1,2,3,4)
                                                      // List(TestStringList, 1, 2, 3, 4) is the output of oneTwoThreeStringtest


     // val oneTwoThreeIntString = oneTwoThreeInt + oneTwoThreeString    --> Cannot add Int LIst and String List or double with int

//    println(oneTwoThreeIntString +" Is concatenation of Int and string")

  }

}

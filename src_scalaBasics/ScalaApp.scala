/**
 * Created by dyenug001c on 11/17/2015.
 */

import java.util.{Date,Locale}
import java.text.DateFormat
import java.text.DateFormat._


object ScalaApp {

  /******* This is first exemple to get date.
  def main(args: Array[String]) {

    println(" This is a sample test program ");

    val now = new Date
    val df = getDateInstance(LONG, Locale.US)

    printf(df.format(now))

  } ***/

  def main(args: Array[String]) {

    var capital = Map("US" -> "Washington", "France" -> "Paris")

    capital += ("Japan" -> "Tokyo")

    /**     ("Japan" -> "Tokyo") + ("Indian" -> "Delhi")                 This does not work **/

    println(capital("Indian"))

   }
  }
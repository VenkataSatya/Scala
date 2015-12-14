/**
 * Created by dyenug001c on 12/8/2015.
 */
object IsUpperScala {

  def main(args: Array[String]) {
    val name:String = "Dinesh"

    println(name+" is assigned to a variable checking its case" + name.exists(_.isUpper) )

    println(name+" is get bytes "+name.getBytes +" checking its intern "+name.intern()+" name has a definite size ?" +name.hasDefiniteSize)

    println(name.isInstanceOf + " name is instance of ")


  }

}

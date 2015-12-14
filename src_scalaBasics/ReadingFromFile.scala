import scala.io.Source

/**
 * Created by dyenug001c on 12/11/2015.
 */
object ReadingFromFile {

  def main(args: Array[String]) {
        if(args.length > 0){
          for(line <- Source.fromFile(args(0)).getLines)
              println(line.length())
        }
          else
              Console.err.println("No File found from the given path")
  }
}

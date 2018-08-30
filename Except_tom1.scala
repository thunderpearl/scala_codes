import java.io.FileReader
import java.io.FileNotFoundException

object Except_tom1 {
  def main(args: Array[String]): Unit = {
    
    try{
      var file1 = new FileReader("Demo1.csv")
    }
    catch{
      case ex:FileNotFoundException =>{
        println("File is not present at the location")
      }
    }

      finally{
      println("Finally Block is getting executed....")
    }
  }
}
import scala.io.StdIn.{readLine,readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Tuplestom1{
	def main(args: Array[String]){
		// we are gonna create tuples here and tuples are those data structures 
		 // which have different types of data types
		 var my_tuples1 = (3,4,5,6,7,8,"wow","that","is","good")

		 // normal for loop will not work on tuples

		 // foreach will take every element one by one hence we do not need to put any increment or condition
		  // in foreach as we did in for(num <- myArray if num%3==0) yield num  
		 my_tuples1.productIterator.foreach(println)
	}
}

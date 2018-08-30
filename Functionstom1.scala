// This program is for testing functions....

import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Functionstom1{
	def main(args: Array[String]){

		// lets define a function here
		// This returnInt function have Int return type
		def returnInt(args1 : Int, args2 : Int, args3 : Int) : Int =
		{
			return args1 + args2 + args3
		}


		// There are some functions which do not return anything and they are called as
		 // precedures. There definition is same as function with little changes.
		 def sayHello() : Unit = {
		 	println("Hello scala people how is your day????")
		 }

		 // This below is the method to pass variable number of arguments inside the function
		 def getSumVar(args : Int*) : Int =
		 {
		 	// defining the variable of Int type...
		 	var sum : Int = 0

		 	// for loop
		 	for( l <- args) {
		 		sum += l
		 	}

		 	// We can return without the use of word 'return' as well....
		 	sum
		 }


		// calling the above function

		// This is little differnet than java, as in java function is defined
		 // outside and is called from within the main function....
		println("The sum of 5,7 and 1 is :- " + returnInt(5,7,1))

		sayHello()

		// We can give without brackets as well
		sayHello


		// calling the getSumVar() inside the print statement
		println("The sum of the passed numbers is :- " + getSumVar(3,4,5,6,7,8))

		// Another way of printing the result is ....
		var result = getSumVar(3,4,5,6,7,8)
		printf(f"The sum of the passed numbers is :- $result")
	}

}

// In this program we are trying recursion

import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Recursiontom1 {
	def main(args: Array[String]){
		
		// Best way to unerstand recursion is through some problem
		// factorial is a good way of understanding hte recursion
		def factorial1(args : BigInt) : BigInt =
		{
			if(args <= 1)
			{
				args
			}
			else
			{
				return args * factorial1(args - 1)
			}
		}

		
		println("Enter the number for which you want to find factorial of :-")
		
		// we can omit 'BigInt' keyword as well....
		var num1 : BigInt = readLine.toInt

		// calling the factorial1() method....
		printf("Factorial of %d is :- %d", num1,factorial1(num1))
	}

	
}
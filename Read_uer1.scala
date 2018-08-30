
// We are trying to take the input from the user here

import io.StdIn._

object Read_user1{
	def main(args:Array[String]){
		
		println("Enter your name below....")

		// read the String ....
		var name1 = readLine()

		printf("Welcome %s \n",name1)
	}
}
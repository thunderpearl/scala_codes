

// Trying the if and else condition below

import scala.io.StdIn;

object Condition_tom1
{
	def main(args:Array[String]): Unit = {

		var my_id = 1002

		if(my_id == 1002){
			printf("Welcome storm breaker, your ID is :- %d",my_id)
		}
		else{
			println("You are not the valid user, \nThis incident will be reported....")
		} 


		greeting()


		// Calling the greeting_dummi() of the Dummi object....
		Dummi.greeting_dummi

	}



	def greeting(){
		println("\nHello, Good Morning.....")
	}
}



object Dummi{
	def greeting_dummi(){
		print("\n I am the greeting method from the dummi object....")
	}
}
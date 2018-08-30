
object factorial1{
	def main(args:Array[String]){

		val num1 = scala.io.StdIn.readLine("Enter a number for factorial to be calculated....").toInt

		printf("Your asnwer for %d factorial is %d",num1,my_fact(num1))	
	}

	def my_fact(i:Int):Int = {
		var res = 1 
		for(x <- i to 2 by -1){
			res = res * x
		}
		res
	}
}
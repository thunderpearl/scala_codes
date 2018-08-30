

object Combination1{
	def main(args:Array[String]){
		val num1 = scala.io.StdIn.readLine("Enter n part for nCr to be calculated....").toInt
		val r1 = scala.io.StdIn.readLine("Enter r part for nCr to be calculated....").toInt


		printf("Your answer fot nCr is %d",nCr(num1,r1))	
	}


// This is the example of the nested function. We could have defined the my_fact function out of the 
 // nCr function as well....
	def nCr(n:Int,r:Int):Int = {
			def my_fact(n:Int):Int = {
			var res = 1 
			for(x <- n to 2 by -1){
				res = res * x
			}
			res
		}

	my_fact(n)/(my_fact(n-r) * my_fact(r))
	}
}
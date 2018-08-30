
object fibonacci1{
	def main(args:Array[String]){

		val my_val = scala.io.StdIn.readLine("Enter a value for fibonacci series").toInt

		my_fibo(my_val)
	}

	def my_fibo(i:Int)={
		var prev = 0
		var curr = 1

		var res = 0
		print(prev+"\t"+curr)

		for(a <- 3 to i){

			res = prev + curr
			prev = curr
			curr = res 
			print("\t"+res)
		}		
	}
}
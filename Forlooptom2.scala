object Forlooptom2 {
	def main(arg: Array[String]){
		// var i=0

		// This for loop will first iterate through first value of i 
		 // and then first value of j, second value of j, third value of j, and this goes so on....
		for( i <- 0 to 10; j <- 5 to 8) {
			println("Value of i is " + i)
			println("Value of j is " + j)
		}
	}
}
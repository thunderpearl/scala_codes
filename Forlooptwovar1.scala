object Forlooptwovar1 {
	def main(args: Array[String]){
		var i = 0

		for( i <- 0 to 10; j <- 11 to 24) {
			println("Value of i is = "+i)
			println("Value of j is = "+j)
		}
	}
}
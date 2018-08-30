object Evenlisttom1 {
	def main(arg: Array[String]){
		// creating a list with different kind of for loop

		// Each time condition get satisfied, value get stored inside 'evenList'
		// This is also a concept of functional programming....
		var evenList = for{ i <- 0 to 30
			if(i%2) == 0
		} yield i

		for(  i <- evenList) {
			println("Element of the list is " + i)
		}
	}
}
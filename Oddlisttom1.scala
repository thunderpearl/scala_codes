object Oddlisttom1{
	def main(args:Array[String])
	{
		var oddlist1 = for{ i <- 0 to 30
			if(i%2) != 0
		}yield i


		println("Odd Elements from the oddlist1 are:- ")
		
		for(j <- oddlist1)
		{
			println("Element is "+j)
		}
	}
}
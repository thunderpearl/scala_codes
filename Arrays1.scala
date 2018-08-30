object Arrays1
{
	def main(args:Array[String])
	{
		// This is the way of defining the Array in scala 
		var myarray1:Array[Int] = new Array[Int](3); 

		// round brackets '()' are used instead of square brackets for accessing a position 
		 // in array using index  
		myarray1(0) = 5;
		myarray1(1) = 7;
		myarray1(2) = 12;

		// Accessing the elements in the array....
		for(i <- myarray1)
		{
			println(i)
		}


		// Other way of creating the array is as below 
		var myarray2 = Array("meliodas","elizabeth","king","diane")

		for(j <- myarray2){
			println(j)
		}


		// Another way of creating the array is like below
		var myarray3 = 1 to 123 toArray

		for(z <- 0 to myarray3.length-1){
			println(myarray3(z))
		}
	}
}
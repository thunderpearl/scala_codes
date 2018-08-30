
// Defining the constructor in scala
object Constructor_tom5{
	def main(args:Array[String]){

		// creating the object of the Car class
		val object1 = new Car("Nexon","AMT",950000)

		println(object1.toString)
	}


	// This is the class definition as well as constructor definition of the class
	class Car(var name:String, var model:String, var price:Int){
		
		// This print statement will the part of the constructor 
		println("Hello People! I am the constructor of the Car class....")


		// This is not gonna be the part of the default constructor ....
		override def toString() = {
			name + " " + model + " " + price
		}

		// If we don't give the var and val for the argument passed in the class defintion
		 // then those variables wont be considered as class variables, those will be considered as 
		  // constructor argument only ......
	}
}

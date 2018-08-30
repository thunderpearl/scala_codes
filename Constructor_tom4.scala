
/*
So, Everything inside the class body is the part of the primary constructor
*/

// Primary constructor of People class have mutable class variables
class People(var name:String, var salary:Int){
	println("I am the primary constructor of the People class")
}

// Primary constructor of the Car class have immutable class variables
class Car(val name:String, val model:String){
	println("I am the primary constructor of Car class")
}

object Constructor_tom4{
	def main(args:Array[String]): Unit = {
		
		val person1 = new People("meliodas",60000000)

		val car1 = new Car("Nexon","Best")
	}
}

// Internally scala compiler generates getter and setter for var type class variables
// Internally scala compiler generates only getter for the val type class variables

// First we will compile this code
// Now, to see the getters and setters of this code we will fire the below command
// javap People.class
// javap Car.class  
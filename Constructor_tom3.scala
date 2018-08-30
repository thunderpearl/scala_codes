
class Constructor_tom(name:String, salary:Int){
	
	// Anything which is inside the class body will become the part of the constructor in scala
	 // even the print statement .... 

	// Any other condition and for loop also becomes the part of the constructor in scala 
	printf("Hello %s, your salary is %d \n", name, salary)

	// In auxilary constructor we can do constructor over loading ....
	// Every auxilary constructor must call previously defined constructor....
	// Those previously defined constructor could either be primary constructor or another 
	 // auxilary constructor of the same class ....

	// In an auxilary constructor first call must be to primary constructor
	 // or an previosuly defined auxilary constructor
	def this(name:String){
		this(name,0)
		println("I am from the Auxilary constructor")
	}
}


object Constructor_tom3{
	def main(args:Array[String]){

		// This below syntax is giving error.....
		val person1  = new Constructor_tom("Storm Breaker")
		val person2 = new Constructor_tom("Storm Breaker", 60000) 
	}
}
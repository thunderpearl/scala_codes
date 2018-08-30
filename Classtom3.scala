object Classtom3
{
	def main(args:Array[String])
	{	
		// Creating the object of the Vehicle class
		var car_object1 = new Vehicle("aston-martin","V-8",503)

		// calling the car_info method onto the car_object1 object of Vehicle class
		car_object1.car_info

		car_object1.car_speed(180.34)

		// calling the function of the my_object
		my_object.greeting
	}

	// Defining the class and also initializing the constructor....
	class Vehicle(name:String,engine_type:String,hp:Int)
	{
		// Method which will be printing the initialized values of the class variables ....
		def car_info()
		{
			println("Car is "+name+", engine type is "+engine_type+" and horse-power of "+hp)
		}

		// Method which will be taking a parameter of double type ....
		def car_speed(car_speed:Double)
		{
			printf("Car speed is %f mph right now\n",car_speed)
		}
	}
}


// This is an singleton object and methods are defined inside the singleton object ....
// Methods of singleton objects can be called by using the singleton object, it's like calling a static 
 // method.... 
object my_object
{
	// greeting() function of the my_object
	def greeting()
	{
		println("Welcome to world of scala and have a great scala learning  .......")
	}
}

// This code is for understanding the implementation of case classes 


// All the parameters in case class are by-default immutable and we don't need to make them val type
case class Car(name:String, model:String, hp:Double,rpm:Int)

object Case_class1{
	def main(args:Array[String]){

		// In case of case classes we don't need to use the new keyword
		val car_obj1 = Car("mazda","mz2",100.6,5000)
		var car_obj2 = Car("keonegzeg","kz2",130.6,6000)

		// accessing the name parameter of the car_obj1 
		println(car_obj1.name)


		// shallow copy can be done in case of case classes
		val car_copied_obj1 = car_obj1.copy()

		var car_copied_obj2 = car_obj2.copy()

		println(car_copied_obj1.name)

		println("\n\n\n")

		// In case of shallow copies, change in copied object will get reflected in change in real object

		// Reassignment of the name can't be done 
		// car_obj1.name = "lamborghini" 
		// car_obj2.name = "maclaren"

		// car_copied_obj2.name = "viper"
		// println(car_copied_obj2.name)
		// println(car_obj2.name)
	}
}
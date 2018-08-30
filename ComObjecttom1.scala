// COMPANION OBJECT CONCEPT

class ComObjecttom1() {
	def method1(): Unit = {

		// We can pass another function as below. This test function is completely accessible to method1. 
		ComObjecttom1.test()
	}
}

// Companion object's rule is that, name of the object must be same as the name of the class
object ComObjecttom1 {
	def test(): Unit = {
		println("I am the test method of the jerry file")
	}
}

// Creating an object which will have main method.
// "Unit" means it will not return anything....

// We will be calling the companion object's method via companion class's method ....
object MainObject {
	def main(args: Array[String]): Unit = {
		val obj1 = new ComObjecttom1()
		obj1.method1
	}
}
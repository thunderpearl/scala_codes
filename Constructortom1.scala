
// This is the default constructor which we are defining already here in this script....
class Constructortom1(val name:String, val salary:Int){
	println("Constructor is getting executed")

	println(name +" salary is "+salary)

	// Auxilary constructor can be given as below. In reality, Auxilary constructor is actually inheriting from the primary constructor.
	// This auxilary constructor will also work as primary constructor


	// Inside the auxilary constructor we are calling the main constructor 
	// def this(){
	// 	this()
	// }


	// This is same concept as in java to implement different kind of constructor using 'this' keyword.... 
	// This is the auxilary constructor ....
	def this(name:String){
		this(name,0)
	}

	// Other methods can also be defined in here and can be called using instance of that class
	def saying(): Unit = {
		println("I am the saying method......")
	}

	override def toString() = {
		name + " " + salary
	}

}

object MyConstructortom1 {
	def main(args: Array[String]): Unit = {
		
		// creating the instance of the class
		val obj1 = new Constructortom1("meliodas",40000)	

		val obj2 = new Constructortom1("elizabeth")

		// val obj3 = new Constructortom1()
		// obj3.saying

		println(obj2.toString)
	}
}

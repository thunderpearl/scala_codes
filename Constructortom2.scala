

// This is a class as well as default constructor of the class
// Default constructor is defined in the class only....

class MyClass1(val name:String,val age:Int,val city:String)
{
	println("Constructor of class MyClass1 is running....")
	println(name+" is a "+age+ " person from "+city)



	def this(name:String)
	{
		// println("Welcome "+name)
		this(name,21,"delhi")
	}


	// This below auxilary constructor is calling the previous auxilary constructor
	def this()
	{
		this("I am the default constructor")
	}
}


/*
class MyClass1(name:String)
{
	println("Your name is "+name)
}
*/

object Constructortom2
{
	def main(args:Array[String]):Unit={

	val object1 = new MyClass1("mahen shimera")


	val object2 = new MyClass1("Tesla")

	val object3 = new MyClass1()

	}
}
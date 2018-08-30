// In scala, we don't have static keyword. So, to use the functionality of static, 
 // we use a keyword called as 'object'

object MyObject1 {
	def test(): Unit = {
		println("Hey! I am the test function of this file....")
	}
}


object MyObject2 {
	def test(): Unit = {
		println("Hey! I am the second test function of this file ")
	}
}


object MyObject3{
	// method which is not returning anything we do not even need to define the return 
	 // type to be "Unit"
	def test(){
		println("Hey! I am the third test functoin of this file ")
	}
}


// Here, we have defined an object with a method whose return type is "String"
object MyObject4
{
	def test(): String = {
		return "Hello People"
	}
}

object Objectstom1 {
	def main(args: Array[String]): Unit = {
		
		// We can define as many objects we want but the object which have main method in it will get executed eventually.
		// We can call the methods of objects without creating instance 

		MyObject1.test
		MyObject2.test
		MyObject3.test


		// We have defined the type of the variable as String for the typr safety
		 // else we could have defined the variable without the datatype as well....
		var mystr4:String = MyObject4.test

		println(mystr4)


		// values can be assigned to multiple variables ....
		var (name:String, id:Int) = Pair("storm breaker",8685)



		// We can print in the below manner as well
		println("Hello"); println("Worldly People"); println("How are you doing ?");
	}
}

// In case of java programming we were defining these methods inside the class and hence we would have
 // been using these methods using class name in case of method being static type.
  // but here in scala we are putting them inside the objects.  
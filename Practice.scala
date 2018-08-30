object Practice {
	def main(args:Array[String]){
		val array1: Array[Int] = new Array[Int](20)

		for(i<- 0 to (array1.length-1)){
			array1(i)=i+1 
			println(array1(i))
				}

			
			
		val dog1: Dog = new Dog("Jack","bark")
			println("name is : "+ dog1.getName)
			dog1.setName("Duke")
			println("Name is :  "+ dog1.getName)
		

	}


}
trait Animal{

	def getName():String
	def setName(name:String):Unit
}

class Dog(var name:String, val sound: String ) extends Animal{

	def getName() : String = {
		name
	}

	def setName( name: String ) : Unit ={
		this.name= name
	}

	def this(){
		this("dog", "-----")
	}

}
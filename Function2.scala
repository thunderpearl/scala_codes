

object Function2{
	def main(args:Array[String]): Unit = {

		print(f"Well! ${greeting} \n")
		println("Well! "+ greeting)
	}


	// Default return type is Unit that means void equivalent java
	def greeting():String={
		return "Hello"
	}
}

// This is a singleton class, we can't crete the object of this class
object Demo1{
	def name_power():Unit={
		
		println("Hello People....")
	}
}

object Singleton1{
	def main(args:Array[String]): Unit = {
		Demo1.name_power
	}
}
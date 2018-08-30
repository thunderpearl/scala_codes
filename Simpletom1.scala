object Simpletom1{
	def main(args:Array[String]){
		println("Hello Guys and Gals....")

		Greeting.wishing

		var result:Int = Greeting.calc(3,4)

		println(result)

		result = Greeting.calc(5,7)
		println(result)
}
}


object Greeting{
	def wishing():Unit = {
		println("Hello madamoiselle ")
	}

	def calc(num1:Int,num2:Int):Int = {
		num1 + num2
	}
}
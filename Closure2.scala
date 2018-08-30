// We are implementing clousre here in this script

// Closure means using an external variable in the anonymous function which is outside of anonymous function

object Closure2
{
	def main(args:Array[String])
	{
		var number1:Int = 24

		// This below is the anonymous function which will return x*number1 result
		val anony1  = (x:Int)=>x*number1


		println("Result of the clousre and calling the anonymous function is:- "+anony1(7))

		println("Call for the anony2 function is giving "+Test_Clos.anony2(1))
	}
} 


// Closure used inside another object .....
object Test_Clos{
	var number2 = 24
	val anony2 = (var1:Int)=>{
		var1 + number2
	}
	
}

// This is the example of the Anonymous function which are like Higher order functions .... 

object Anony_func1{
	def main(args:Array[String]){
		println(my_calc(value,1,9))

		println(my_calc(val_sq,1,5))

		println(my_calc(val_cu,1,3))
	}


// Anonymous function definitions
val value = (a:Int) => a

val val_sq = (b:Int) => b * b

val val_cu = (c:Int) => c * c * c



def my_calc(f:Int => Int,p:Int,q:Int):Int = {
	if (p > q) 0 else f(p) + my_calc(f,p + 1,q)
} 

}
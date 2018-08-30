
object Higher_order3{
	def main(args:Array[String]){
		println(my_calc(value,1,9))

		println(my_calc(val_sq,1,5))

		println(my_calc(val_cu,1,3))
	}

def value(a:Int) = a

def val_sq(b:Int) = b * b

def val_cu(c:Int) = c * c * c



def my_calc(f:Int => Int,p:Int,q:Int):Int = {
	if (p > q) 0 else f(p) + my_calc(f,p + 1,q)
} 

}

// Higher order function in scala

// In functional programming functions can be trated as first class values
// We can pass functions in other functions as parameter 



object Higher_order1{
	def main(args:Array[String]){
		println(sum_nums(1,10))

		println(sum_cubes(1,5))
	}

// Sum of numbers ....
// We are using the recursion here....

def sum_nums(a:Int,b:Int): Int ={
	if(a>b) 0 else a + sum_nums(a+1,b)
}


// sum of cubes in scalas
def my_cubes(a:Int): Int = a * a * a

def sum_cubes(b:Int, c:Int): Int = {
	if(b > c) 0 else my_cubes(b) + sum_cubes(b + 1, c)
}

}




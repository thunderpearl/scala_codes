
// This code will not work as it do not have main object

// This is the higher order function with little more complexity

def value(a:Int) = a

def val_sq(b:Int) = b * b

def val_cu(c:Int) = c * c * c



def my_calc(f:Int => Int,p:Int,q:Int) = {
	if (p > q) 0 else f(p) + my_calc(f:Int,p + 1,q)
} 

println(my_calc(val,1,9))
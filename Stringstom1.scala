import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Stringstom1{
	def main(args: Array[String]){
		
		// Here, we will do work on strings.....
		var string1 = "Hey! We are gonna master scala as well"
		var string2 = "Yeah! I hope this will pay off in future"

		println("This is gonna tell, what is at index 8 :- " + string1(8))
		println("This is gonna print the index of master :- "+ string1.indexOf("master"))
		println("This is gonna compare two strings which are string1 and string2 :- "
			+ string1.compare(string2))

		// Length gives the number of characters we have got in an string.
		println("Length of the string1 is "+string1.length())

		// This is the way to convert string elements into the array....
		var arrayElements = string2.toArray

		for(l <- arrayElements)
			{
				print(l + "\t")
			}

		println()	
		println("Concatenating can be done using concat() method as well as '+' ")

		// We can use '+' concatenation as well along with the concat() method
		val string_concat1 = string1.concat(" "+string2)
		println(string_concat1)	



		println()
		println("Formatted strings are also supported by scala....")


		val string4 = "meliodas"
		val string5 = "elizabeth"

		printf("%s and %s are lovers since ages and are an amazing team mates",string4,string5)

		println
		
		// Now, we are trying String INTERPOLATION
		// Below, this 's' character is very important
		println(s"$string4-$string5")


		// 's' can process the arbitrary expressions as well
		println(s"5 + 7 = ${5+7}")


		val number1 = 23.323131d


		// This 'f' character has same function as printf
		println(f"$string4%s and $string5%s are made for each other and their favorite number is $number1%2.2f")
		println(f"$string4%s and $string5%s are made for each other and their favorite number is $number1%5.2f")


		// We have another interpolator called as 'raw' 
		// 'raw' and 's' are same kinda interpolator, the only difference is that escape characters like \t \n do not work 
		 // inside the raw interpolator.

		println(raw"Hey! what's up man ? \n How are you doing?")
		println(s"Hey! what's up man ? \n How are you doing?") 

 		
		println(string1.charAt(8))
	}
}
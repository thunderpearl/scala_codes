object StringBuilder{
	def main(args:Array[String]){
		var my_builder = StringBuilder.newBuilder

		my_builder.append("Hello people")

		println(my_builder)

		my_builder.append("Yahoooooo")

		println(my_builder)


		// Thre are different ways of creating the string builder
		var my_builder1 = new StringBuilder
		my_builder1.append("hahhaa")

		println(my_builder1)

		my_builder1.append("lets see")
		println(my_builder1)


		// Strings are immutable by default
		// But, StringBuilder are mutable

		// We can convert StringBuilder to String also
		var sb = my_builder.toString

		// This line should give the error
		// sb.append("polaris")
		// println(ab)

		// There are other operations also which we can perform for String created from string builder

		// we can replace some characters also

		// We are giving starting index and ending index below and the string with which we want to replace
		 // the string....
		my_builder1.replace(0,1,"blablade") 
		println(my_builder1)

		  
	}
}
// This program is for testing different types of prints

import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object InputOutputtom1 {
	def main(args: Array[String]){
		val name = "ThunderPearl"
		val weight  = 70
		val age = 27

		println(s"Hello Me")
		print(f"Hello $name, I want my weight to be ${weight  - 3}")

		println()
		printf("Hey! sup? I am %s", name)

		// This below is the wrong way of printing ....
		//printf("Hey! sup? I am %s", $name)



	}
}

object Companion1{
	def main(args:Array[String]){
		Anime.info
	}

	// This is an Anime class 
	class Anime(private var name:String, private var rating:Double)

	// This is the companion object of the above class
	// A companion object can acccess the private members of the class as well ....
	object Anime{
		
		def info() = {
			val obj1 = new Anime("kenichi",9.6)
			println(obj1.name + " " + obj1.rating)
		}
	}
}
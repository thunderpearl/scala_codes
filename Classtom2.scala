

// many objects can be defined in a class but the one with the main 
 // function will get executed....
object Classtom2{
  def main(args: Array[String]){
    var object1 = new Animal("dog","bark")

    object1.name_sound
  }
}

// We can define a class outside the object or inside the object....
// Here, we have defined the class outside the object 
class Animal(name:String, sound:String){
  def name_sound(){
    printf("The sound of %s is %s",name,sound)
  }
}

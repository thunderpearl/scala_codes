
// This is an object and it contains a method which must contain a "main" method.
// That main method will be the starting point of this program.
object Classtom1{
  def main(args: Array[String]){
    // We are gonna create a class in this scala script

    // creating the object of the class Animal
    // And, at this time the variables will get initialized 
    // Creating object here in scala is some what similar to the object creation in java.
    var object1 = new Animal("cat","meow")

    // we can call without () as well
    object1.name_sound
  }

  // Defining a class 
  // we are defining the class inside the object.....
  // This below class is the part of the default constructor as well
  // Means, along with the class definition, we are defining a constructor as well .... 
  
}

class Animal(var name: String, var sound: String){

    // defining a method in a class ....
    def name_sound(){
      printf("The sound of %s is %s",name,sound)
    }

    // scala do not allow the static variables
  }
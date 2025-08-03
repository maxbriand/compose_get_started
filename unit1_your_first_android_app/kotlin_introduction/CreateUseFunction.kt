fun main() {  
  println(birthdayGreeting(age = 45))
  println(birthdayGreeting("Rex", 4))
}

// fun birthdayGreeting(): Unit {
//   println("Happy Birthday, Rover!")
//   println("You are now 5 years old!")
// }

fun birthdayGreeting(name: String = "Roger", age: Int): String {
  val nameGreeting: String = "Happy Birthday, $name!"
  val ageGreeting: String = "You are now $age years old!"
  return (nameGreeting + "\n" + ageGreeting)
}
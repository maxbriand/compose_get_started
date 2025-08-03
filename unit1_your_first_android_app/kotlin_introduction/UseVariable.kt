fun main (){
  val counter: Int = 5
  val infer = 2
  println(counter)
  println("You have $counter unread messages")
  println("This type number is infered by the compiler: $infer.")
  println("The sum of my two variable is: ${counter+ infer}.")
}
// fun main() {
//   val trafficLightColor = "Red"

//   if (trafficLightColor == "Red") {
//     println("Stop!")    
//   }
//   else if (trafficLightColor == "Green") {
//     println("You can move!")
//   }
//   else if (trafficLightColor == "Orange") {
//     println("You reduce the speed of the car!")
//   }
//   else {
//     println("Unexpected light color!")
//   }
// }

fun main() {
  val trafficLightColor : String = "YYYellow"

  when (trafficLightColor){
    "Red" -> println("Stop!")
    "Orange", "Yellow" -> println("Reduce your speed!")
    "Green" -> println("You can move!")
    is String -> println("Unknown color!")
    else -> println("Unexpected light color!")
  }
}

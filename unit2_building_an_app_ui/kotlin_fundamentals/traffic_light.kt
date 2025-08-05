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
  val trafficLightColor = "Orange"

  when (trafficLightColor){
    "Red" -> println("Stop!")
    "Green" -> println("You can move!")
    "Orange" -> println("You reduce the speed of the car!")
    else -> println("Unexpected light color!")
  }
}
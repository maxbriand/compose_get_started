// fun main() {
//   var number: Int? = 10
//   println("The number value is $number")
//   number = null
//   println("The number value is $number")
// }

// Use the safe call operator to call properties: ?.
// fun main() {
//   var favoriteActor: String? = null
//   println(favoriteActor?.length)
// }

// Use a null check
// fun main() {
//   var favoriteActor: String? = "Mac Hintosh"

//   if (favoriteActor != null) {
//     println("My favorite actor is ${favoriteActor?.length}")
//   } else {
//     println("No favorite actor choosen!")    
//   }
// }

// Use a null check during re asignation
// fun main() {
//   var favoriteActor: String? = null

//   var lenghtActorName = if (favoriteActor != null) {
//         favoriteActor.length
//       } else {
//         0
//       }
//   println("The name lenght of $favoriteActor is $lenghtActorName!")
// }

// Use the Elvis Operator to simplify the asignation check
fun main() {
  var favoriteActor: String? = null

  var lenghtActorName = favoriteActor?.length ?: 0
  println("The name lenght of $favoriteActor is $lenghtActorName!")
}


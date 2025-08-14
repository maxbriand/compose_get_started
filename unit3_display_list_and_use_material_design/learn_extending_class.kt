// fun main() {    
//   Quiz.printProgressBar()
// }

// data class Question<T> (
//   val questionText: String,
//   val answer: T,
//   val difficulty: Difficulty,
// )

// enum class Difficulty {
//   EASY, MEDIUM, HARD
// }

// class Quiz {
//   companion object StudentProgress {
//     var total: Int = 19
//     var answered: Int = 3
//   }

//   val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.EASY)
//   val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
//   val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
// }


// val Quiz.StudentProgress.progressText: String
//     get () = "${answered} of ${total} answered"

// fun Quiz.StudentProgress.printProgressBar() {
//       repeat(Quiz.answered) { print("A") }
//       repeat(Quiz.total - Quiz.answered) { print("B") }
//       println()
//       println(Quiz.progressText)
//   }


  
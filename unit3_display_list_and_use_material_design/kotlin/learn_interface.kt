fun main() {    
  
  Quiz().progressBar()

}

data class Question<T> (
  val questionText: String,
  val answer: T,
  val difficulty: Difficulty,
)

enum class Difficulty {
  EASY, MEDIUM, HARD
}

interface ProgressPrintable {
  val progressText: String
  fun progressBar()
}

class Quiz: ProgressPrintable {
  companion object StudentProgress {
    var total: Int = 10
    var answered: Int = 3
  }

  override val progressText: String
    get () = "${answered} of ${total} answered"

  override fun progressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(progressText)
  }

  val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.EASY)
  val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
  val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
}

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    val result2 = substract(firstNumber, secondNumber)
    val anotherResult2 = substract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    println("$firstNumber - $secondNumber = $result2")
    println("$firstNumber - $thirdNumber = $anotherResult2")
  }

fun add(firstNumber: Int, secondNumber: Int): Int{
  return (firstNumber + secondNumber)
}

fun substract(firstNumber: Int, secondNumber: Int): Int{
  return (firstNumber - secondNumber)
}
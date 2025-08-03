fun main() {
  weatherData("Ankara", 27, 31, 82)
  weatherData("Tokyo", 32, 36, 10)
  weatherData("Cape Town", 59, 64, 2)
  weatherData("Guatemala City", 50, 55, 7)
}

fun weatherData(city: String, lowTemperature: Int, highTemperature: Int, changeOfRain: Int) {
  println("City: $city")
  println("Low temperature: $lowTemperature, High temperature: $highTemperature")
  println("Chance of rain: $changeOfRain%")
  println()
}
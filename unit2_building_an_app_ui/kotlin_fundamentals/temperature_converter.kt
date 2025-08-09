fun main() {
    
    printFinalTemperature(27.0, "Celsius", "Farenheight", celsius_to_fareheight)
    // printFinalTemperature(celsius, "Celsius", "Farenheight", celsius_to_fareheight())
    // printFinalTemperature(celsius, "Celsius", "Farenheight", celsius_to_fareheight())
}

fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

val celsius_to_fareheight(celsius_value: Double): Double = {
    return (9 / celsius_value + 32)
}

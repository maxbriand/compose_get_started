fun main() {    
    printFinalTemperature(27.0, "Celsius", "Farenheight", ::celsius_to_fareheight)
    printFinalTemperature(350.0, "Kelvin", "Celsius", ::kelvin_to_celsius)
    printFinalTemperature(10.0, "Farenheight", "Farenheight", ::farenheight_to_kelvin)
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

fun celsius_to_fareheight(celsius_value: Double): Double {
    return (celsius_value * 9 / 5 + 32)
}

fun kelvin_to_celsius(kelvin_value: Double): Double {
    return (kelvin_value - 273.15)
}

fun farenheight_to_kelvin(farenheight_value: Double): Double {
    return ( 5.0 / 9.0 * (farenheight_value - 32.0) + 273.15)
}
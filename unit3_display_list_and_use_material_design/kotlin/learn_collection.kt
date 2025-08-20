// Use array
// fun main() {
//     val myFirstCollection = arrayOf<String>("My", "name", "is", "Slim")
//     println(myFirstCollection[1])

//     val mergeTwoCollection = arrayOf ("hello", "world") + myFirstCollection
//     println(mergeTwoCollection[1])    
// }

// Learn List
// fun main() {
//     val numbers = listOf (5, 89, 78)
//     var numbersEvolution = mutableListOf (61, 8, 2)

//     numbersEvolution.add(0, 78)
    
//     for (number in numbersEvolution){
//         println(number)
//     }
//     println("then: ")
//     numbersEvolution.removeAt(0)
//     for (number in numbersEvolution){
//         println(number)
//     }
// }

// Learn the Set collection type
// fun main() {
//     var planets = mutableSetOf ("Earth", "Venus")
//     println(planets.size)

//     println(planets.contains("Earth"))
// }

// Learn the Map collection
fun main() {
    var planets = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    println(planets.size)
    println(planets.get("Uranus"))
}





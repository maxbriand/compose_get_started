class Song (val title: String, val artist: String, val year_published: Int, var play_count: Int) {
    var popular: Boolean = when {
        play_count in 0..999 -> false
        play_count >= 1000 -> true
        else -> false
    }
    
    fun printSongDescription() {
        println("$title, performed by $artist, was released in $year_published.")
    }
}

fun main() {
    val test: Song = Song("California Love", "Tupac", 1993, 1000)
    test.printSongDescription()
    if (test.popular) {
        println("The song is popular!")
    }
    else {
        println("The song isn't popular!")
    }
}

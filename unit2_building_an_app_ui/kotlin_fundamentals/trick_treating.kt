fun main() {
    val trickFunction = trick
    trick()
    trickFunction()
    val gameLauncher = trickOrTreat(true)
    gameLauncher()
}

fun trickOrTreat(treatBool: Boolean): () -> Unit {
    if (treatBool) {
        return treat
    }
    else {
        return trick
    }
}

val trick = {
    repeat(10){println("No treats!")}
}

val treat = {
    println("Treat on you!")
}

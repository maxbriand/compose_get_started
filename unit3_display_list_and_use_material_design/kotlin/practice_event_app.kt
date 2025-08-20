enum class Daypart {
    MORNING, AFTERNOON, EVENING
}

data class Event (
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
    ) {
}

fun Event.returnDurationOfEvent(): String {
    if (durationInMinutes < 60) {
        return "short"
    } else {
        return "long"
    }
}

fun main() {
    var events = mutableListOf(
    Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
    Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
    Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
    Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
    Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
    Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45))

    println("The even number is: ${events.size}")
    events.forEach{
        println("${it.title}")
    }

    val shortEvents = events.filter{
        it.durationInMinutes < 60
    }

    println("The short events number is: ${shortEvents.size}")

    val groupEvents = events.groupBy{
        it.daypart
    }

    groupEvents.forEach { (daypart, events) ->
        println("${events.size}")
    }

    println("Last event of the day: ${events.last()?.title}")

    println("Duration of first event of the day: ${events[5].returnDurationOfEvent()}")

}



fun main() {
    val morningNotification = 51
    val eveningNotification = 135
    
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100 && numberOfMessages >= 0) {
        println("You received $numberOfMessages messages!")
    } else {
        println("You received 99+ messages!")
    }
}

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
    val message = if (numberOfMessages < 100) "You have " + numberOfMessages + " notifications" else "Your phone is blowing up! You have 99+ notifications."
    println(message)
}
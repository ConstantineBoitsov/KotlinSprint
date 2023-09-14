package lesson_1_10.lesson_3

//import java.time.LocalDateTime
//import java.time.format.DateTimeFormatter

fun main() {

//    val userName = "Константин"
//
//    val currentDateTime = LocalDateTime.now()
//    val currentHour = currentDateTime.format(DateTimeFormatter.ofPattern("HH"))
//    // определяем, сколько сейчас часов в формате String
//
//    val currentHourInt = currentHour.toInt() // переводим количество часов в Int
//
//    if (currentHourInt > 5 && currentHourInt < 17) {
//        val welcomeText = "Добрый день, "
//    } else {
//        val welcomeText = "Добрый вечер, "
//    }

    var welcomeText = "Добрый день"
    val userName = "Константин"

    println("$welcomeText, $userName!")

    welcomeText = "Добрый вечер"

    print("$welcomeText, $userName!")

}
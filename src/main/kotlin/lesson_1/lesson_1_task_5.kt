package lesson_1

fun main () {

    val seconds = 6480

    val minutes = seconds / 60
    val remainedSeconds = seconds % 60 // остаток секунд
    val remainedMinutes = minutes % 60 // остаток минут
    val hours = minutes / 60 // количество часов

    print("Время, проведённое в космосе: ${"%02d".format(hours)}:${"%02d".format(remainedMinutes)}:" +
            "${"%02d".format(remainedSeconds)}")

}
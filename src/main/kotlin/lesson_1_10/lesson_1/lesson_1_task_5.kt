package lesson_1_10.lesson_1

fun main() {

    val seconds = 6480

    val minutes = seconds / 60
    val remainedSeconds = seconds % 60 // остаток секунд
    val remainedMinutes = minutes % 60 // остаток минут
    val hours = minutes / 60 // количество часов

    print(String.format("Время, проведённое в космосе: %02d:%02d:%02d", hours, remainedMinutes, remainedSeconds))

}
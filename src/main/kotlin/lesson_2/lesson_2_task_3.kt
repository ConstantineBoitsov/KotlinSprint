package lesson_2

fun main() {

    val departureHours = 9
    val departureMinutes = 39
    val travelTime = 457

    val arrivalHours = (departureHours + (departureMinutes + travelTime) / 60) % 24
    val arrivalMinutes = (departureMinutes + travelTime) % 60

    print("Время прибытия поезда: $arrivalHours:$arrivalMinutes")

}
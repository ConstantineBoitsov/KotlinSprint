package lesson_21

fun main() {

    val listOfNumbers: List<Int> = listOf(13, 14, 15, 16, 17, 18)
    println(listOfNumbers.evenNumbersSum())

}

fun List<Int>.evenNumbersSum(): Int {
    var evenNumbersCounter = 0
    for (element in this) {
        if (element % 2 == 0) evenNumbersCounter++
    }

    return evenNumbersCounter
}
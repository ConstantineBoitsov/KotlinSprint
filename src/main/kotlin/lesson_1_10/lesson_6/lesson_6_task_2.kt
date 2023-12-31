package lesson_1_10.lesson_6

fun main() {

    print("Сколько секунд засечь? ")
    val secondsToCount = readln().toLong() // Thread.sleep() принимает Duration или Long

    Thread.sleep(secondsToCount * 1000)

    // ситуационные окончания для «прошло(а)» и «секунд(а/ы)»
    val endingToWordPassed = when (secondsToCount.toInt() % 10) {
        1 -> "а"
        else -> "о"
    }

    val endingToWordSecond = when (secondsToCount.toInt() % 10) {
        1 -> "a"
        2, 3, 4 -> "ы"
        else -> ""
    }

    print("Прошл$endingToWordPassed $secondsToCount секунд$endingToWordSecond, спасибо за ожидание!")

}
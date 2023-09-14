package lesson_1_10.lesson_7

fun main() {

    print("Сколько секунд засечь? ")
    val secondsToCountDown = readln().toInt()


    for (secondsLeft in secondsToCountDown downTo  1) {
        // ситуационные окончания для «остало(а)сь» и «секунд(а/ы)»
        val endingToWordLeft = when (secondsLeft % 10) {
            1 -> "а"
            else -> "о"
        }
        val endingToWordSecond = when (secondsLeft % 10) {
            1 -> "a"
            2, 3, 4 -> "ы"
            else -> ""
        }

        println("Остал${endingToWordLeft}сь $secondsLeft секунд$endingToWordSecond.")
        Thread.sleep(1000)
    }

    print("Время вышло.")

}
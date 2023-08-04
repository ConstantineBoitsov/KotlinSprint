package lesson_5

fun main() {

    val lotteryNumberOne = (1..100).random()
    val lotteryNumberTwo = (1..100).random()
    var numberOfMatches = 0

    print(
        """
        Вы участвуете в лотерее! Нужно угадать два числа от 1 до 100.
        Первая попытка: 
    """.trimIndent()
    )
    val firstTry = readln().toInt()
    if ((firstTry == lotteryNumberOne) or (firstTry == lotteryNumberTwo)) {
        numberOfMatches++
    }

    print("Вторая попытка: ")
    val secondTry = readln().toInt()
    if ((secondTry != firstTry) and ((secondTry == lotteryNumberOne) or
                (secondTry == lotteryNumberTwo))
    ) {
        numberOfMatches++
    }

    when (numberOfMatches) {
        0 -> print("Неудача! Крутите барабан!")
        1 -> print("Вы выиграли утешительный приз!")
        2 -> print("Поздравляем! Вы выиграли главный приз!")
    }

    print("\n(были загаданы числа $lotteryNumberOne и $lotteryNumberTwo)")

}
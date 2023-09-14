package lesson_1_10.lesson_6

fun main() {

    print("Сколько секунд засечь? ")
    var secondsToCount = readln().toLong() // Thread.sleep() принимает Duration или Long

    while (secondsToCount > 0) {
        when (secondsToCount.toInt() % 10) {
            1 -> println("Осталась ${secondsToCount--} секунда, спасибо за ожидание!")
            2, 3, 4 -> println("Осталось ${secondsToCount--} секунды, спасибо за ожидание!")
            else -> println("Осталось ${secondsToCount--} секунд, спасибо за ожидание!")
        }
        Thread.sleep(1000)
    }
    print("Время вышло!")

}
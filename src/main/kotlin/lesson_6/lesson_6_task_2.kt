package lesson_6

fun main() {

    print("Сколько секунд засечь? ")
    val secondsToCount = readln().toLong() // Thread.sleep() принимает Duration или Long

    Thread.sleep(secondsToCount * 1000)

    when (secondsToCount.toInt() % 10) {
        1 -> print("Прошла $secondsToCount секунда, спасибо за ожидание!")
        2, 3, 4 -> print("Прошло $secondsToCount секунды, спасибо за ожидание!")
        else -> print("Прошло $secondsToCount секунд, спасибо за ожидание!")
    }

}